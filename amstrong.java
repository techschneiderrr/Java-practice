import java.util.Scanner;
import java.lang.Math;

public class amstrong {
    // a num whose sum of each digit's cube's sum is equal to the number
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of digits in the num: ");
        int n = sc.nextInt();
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int temp = num;
        while(temp!=0)
        {
            int k=temp%10;
            temp=temp/10;
            sum=sum+(int)(Math.pow(k, n));
        }

        System.out.println("sum : "+sum);

        if(sum==num)
        {
            System.out.println("It is an Amstrong number");
        }
        else
        {
            System.out.println("It is not an Amstrong number");
        }
    }
}
