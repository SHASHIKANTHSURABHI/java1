import java.util.Scanner;

public class Armstrong
{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        System.out.println("enter the number");
        int number=n.nextInt();
        n.close();
        int num1=number;
        int arm=0;
        while(num1!=0)
        {
            int rem=num1%10;
            arm=arm+(rem*rem*rem);
            num1=num1/10;
        }
        if(number==arm)
        {
            System.out.println("armstrong");
        }
        else
        {
            System.out.println("not an armstrong");
        }
    }
}
