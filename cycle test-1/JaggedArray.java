public class JaggedArray {
    public static void main(String[] args) {
        // In Java, a jagged array is an array of arrays where each element of the main array
        // can be an array of different lengths. This means that while all the elements of
        // the main array are arrays themselves, these nested arrays can have different lengths,
        // resulting in a "ragged" or "jagged" appearance.

        // Example of a jagged array:
        int[][] jaggedArray = new int[3][]; // Main array with 3 elements

        jaggedArray[0] = new int[]{1, 2, 3}; // Array1 with 3 elements
        jaggedArray[1] = new int[]{4, 5};    // Array2 with 2 elements
        jaggedArray[2] = new int[]{6, 7, 8, 9}; // Array3 with 4 elements
    }
}
