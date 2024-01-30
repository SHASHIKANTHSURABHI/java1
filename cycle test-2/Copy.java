public class Copy
{
    public static void main(String[] args)
    {
        int[] array1 = {3, 4, 5, 1, 2};
        int[] array2 = new int[array1.length];
        for (int i = 0; i < array1.length; i++)
        {
            array2[i] = array1[i];
        }
        System.out.println("source array");
        for (int i = 0; i < array1.length; i++)
            {
                System.out.print(" "+array1[i]);
            }
        System.out.println("\ndestination array");
        for (int j = 0; j < array2.length; j++)
            {
                System.out.print(" "+array2[j]);
            }
        }
    }