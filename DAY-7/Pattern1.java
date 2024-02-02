import java.util.Scanner;

public class Pattern1
{
    public static void main(String[] args)
    {
        Scanner n= new Scanner(System.in);
        System.out.println("enter the no of rows");
        int num=n.nextInt();
        n.close();
        for(int i=0;i<=num;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println("");
        }
        for(int i=num-1;i>=1;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
}
