import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Marks:");
        double result = sc.nextDouble();
        if (result <= 100 && result >= 80)
        {
            System.out.print("Your Result : A+");
        }
        else if(result <=79 && result >= 70)
        {
            System.out.print("Your Result: A");
        }
        else if(result<=69 && result>=60)
        {
            System.out.print("Your Result: A-");
        }
        else if(result<=59 && result >=50)
        {
            System.out.print("Your Result: B");
        }
        else if(result<=49 && result>=40)
        {
            System.out.print("Your Result: C");
        }
        else if(result<=39 && result>=33)
        {
            System.out.print("Your Result: D");
        }
        else if(result<=32 && result>=0)
        {
            System.out.print("Your Result: F");
        }
        else
        {
            System.out.print("Invalid Marks");
        }
    }
}