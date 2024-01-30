public class AnonymousArray
{
    public static void main(String[] args)
    {
        printArray(new int[] {1, 2, 3, 4, 5});
        String[] names = new String[] {"Alice", "Bob", "Charlie"};
        System.out.println("Length of anonymous array: " + names.length);
    }
    public static void printArray(int[] arr)
    {
        System.out.print("Array elements: ");
        for (int num : arr)
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
