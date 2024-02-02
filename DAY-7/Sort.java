import java.util.*;
public class Sort
{
    public static void main(String[] args)
    {
        ArrayList<Integer> s = new ArrayList<Integer>();
        int a[]={16,18,10,11,13,17};
        for(int i=0;i<a.length;i++)
        {
            s.add(a[i]);
        }
        Collections.sort(s);
        System.out.println(s);
    }
}
