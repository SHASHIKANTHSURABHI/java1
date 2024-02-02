import java.util.Arrays;
public class Sort2
{
    public static void main(String[] args)
    {
        int a[] = {16, 18, 20, 9, 3, 11};
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
