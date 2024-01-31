import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P2
{
    public static void main(String[] args)
    {
        Scanner e=new Scanner(System.in);
        List<Integer>list=new ArrayList<Integer>();
        System.out.println("enter the number of elements");
        int n=e.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the number");
            int number=e.nextInt();
            list.add(number);
        }
        int odd=0;
        int even=0;
        for(int i=0;i<n;i++) {
            if (list.get(i) % 2 == 0) {
                even += list.get(i) * list.get(i);
            }
            else
            {
                odd+=list.get(i) * list.get(i);
            }
        }
        System.out.println("["+even+","+odd+"]");
    }
}
