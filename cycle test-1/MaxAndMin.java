public class MaxAndMin
{
    public static void main(String[] args)
    {
        int[] array={32,12,7,3,17,9};
        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i]>array[j])
                {
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println("max value="+array[array.length-1]);
        System.out.println("min value="+array[0]);
    }
}
