import java.util.Scanner;

public class strongNum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int temp = num;
        while(temp!=0)
        {
            int k=temp%10;
            temp=temp/10;
            int m = 1 ;
            int fact =1;
            while(m<=k)
            {
                fact = fact*m;
                m++;
            }
            sum = sum+fact;
        }

        System.out.println("sum : "+sum);

        if(sum==num)
        {
            System.out.println("It is a strong number");
        }
        else
        {
            System.out.println("It is not a strong number");
        }
    }
}
