import java.util.Scanner;

public class perfectnum {
    // a num whose sum of factors including the number itself is equal to to the num is called the perfect num
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.print("Factors are : ");
        for (int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                System.out.print(i+" ");
                sum=sum+i;            }
        }

        System.out.println("\nsum : "+sum);

        if(sum==num)
        {
            System.out.println("It is a perfect number");
        }
        else
        {
            System.out.println("It is not a perfect number");
        }
    }
}
