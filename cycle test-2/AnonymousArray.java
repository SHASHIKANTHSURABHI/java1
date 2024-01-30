public class AnonymousArray{
    public static void main(String[] args) {
        // In Java, an anonymous array is an array that is created without explicitly
        // declaring a variable name for it. Instead, it is created inline as an argument
        // to a method or as part of an array initialization expression. Anonymous arrays
        // are useful in situations where you need to pass an array to a method or constructor
        // without the need for a separate named array variable.

        // Example 1: Passing an anonymous array as an argument to a method
        printArray(new int[] {1, 2, 3, 4, 5});

        // Example 2: Using an anonymous array for array initialization
        String[] names = new String[] {"Alice", "Bob", "Charlie"};
        System.out.println("Length of anonymous array: " + names.length);
    }

    public static void printArray(int[] arr) {
        System.out.print("Array elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
