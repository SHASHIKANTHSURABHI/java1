public class Evenadd
{
    public static void main(String[] args)
    {
        int[] array={1,2,3,4,5,6,7,8};
        int even=0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]%2==0)
            {
                even+=array[i];
            }
        }
        System.out.println("sum="+even);
    }
}
