import java.util.Scanner;
public class PrimeAndComposite
{
    public static void main(String[] args)
    {
        Scanner e=new Scanner(System.in);
        int[] a=new int[7];
        System.out.println("enter the numbers");
        for(int i=0;i<7;i++)
        {
            a[i]=e.nextInt();
        }
        e.close();
        int comp=0,prime=0;
        for(int i=0;i<a.length;i++)
        {
            if (a[i] <= 1) {
                continue;
            }
            int c=0;
            for(int j=2;j<=a[i];j++)
            {
                if(a[i]%j==0)
                    c++;
            }
            if(c>1)
                comp++;
            else
                prime++;
        }
        System.out.print("Composite Number: "+comp);
        System.out.println("\nPrime number: "+prime);


    }
}
