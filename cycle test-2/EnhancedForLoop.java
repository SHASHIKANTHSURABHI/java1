public class EnhancedForLoop
{
    public static void main(String[] args)
    {
        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] destinationArray = new int[sourceArray.length];
        int index = 0;
        for (int element : sourceArray)
        {
            destinationArray[index++] = element;
        }
        System.out.print("Destination Array: ");
        for (int element : destinationArray)
        {
            System.out.print(element + " ");
        }
    }
}
