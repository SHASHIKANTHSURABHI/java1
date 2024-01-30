import java.util.Arrays;
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 4};
        int[] result = removeDuplicates(array);
        System.out.println(Arrays.toString(result));
    }
    public static int[] removeDuplicates(int[] array) {
        int length = array.length;
        if (length == 0 || length == 1) {
            return array;
        }
        int newSize = 1;
        for (int i = 1; i < length; i++) {
            int j;
            for (j = 0; j < newSize; j++) {
                if (array[i] == array[j]) {
                    break;
                }
            }
            if (j == newSize) {
                array[newSize] = array[i];
                newSize++;
            }
        }
        return Arrays.copyOf(array, newSize);
    }
}
