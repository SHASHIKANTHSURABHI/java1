public class CheckElement{
    public static void main(String[] args) {
        int[] array = {15,16,17,9,27,48};
        int target = 9;

        boolean exists = containsElement(array, target);
        System.out.println("Does the array contain " + target + "? " + exists);
    }

    public static boolean containsElement(int[] array, int target) {
        for (int num : array) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}
