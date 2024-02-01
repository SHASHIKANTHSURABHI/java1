import java.util.Scanner;

public class BintoDecimal
{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        System.out.println("enter the number");
        String bin=n.next();
        n.close();
        int decimal=Integer.parseInt(bin,2);
        System.out.println("decimal="+decimal);
    }
}
