import java.util.Scanner;
public class Prime
{
    public static void main(String[] args)
    {
        int i, c = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number:");
        int num = scanner.nextInt();
        for (i = 2; i <= num; i++)
        {
            if (num % i == 0)
                c++;
        }
        if (c > 1)
        {
            System.out.println(num + "is not primenumber");
        } else
            System.out.println(num + " is  prime");
    }
}