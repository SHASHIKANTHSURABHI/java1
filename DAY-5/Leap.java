import java.util.Scanner;

public class Leap
{
    public static void main(String[] args)
    {
        Scanner e=new Scanner(System.in);
        System.out.println("enter the year");
        int year=e.nextInt();
        e.close();
        if(year%4==0)
        {
         System.out.println("leap year");
        }
        else
        {
            System.out.println("not a leap year");
        }
    }
}
