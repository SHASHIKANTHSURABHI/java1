import java.util.Scanner;

public class P1
{
    public static void main(String[] args)
    {
        Scanner t=new Scanner(System.in);
        System.out.println("enter the total user count");
        int totalusers=t.nextInt();
        if(totalusers<0)
        {
            System.out.println("invalid input");
            t.close();
        }
        else
        {
            Scanner s = new Scanner(System.in);
            System.out.println("enter the staff count");
            int staff = s.nextInt();
            if (staff > totalusers)
            {
                System.out.println("invalid staff count");
            } else {
                t.close();
                s.close();
                int nontech = staff / 3;
                int students = totalusers - staff - nontech;
                System.out.println("students=" + students);
            }
        }
    }
}
