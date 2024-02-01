import java.util.Scanner;

public class BintoOctal
{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        System.out.println("enter the number");
        String bin=n.next();
        n.close();
        int dec=Integer.parseInt(bin,2);
        String octal=Integer.toOctalString(dec);
        System.out.println("octal="+octal);
    }
}
