import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Shuffle {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        List<Integer>intlist=Arrays.asList(array);
        Collections.shuffle(intlist);
        intlist.toArray(array);

        System.out.println(Arrays.toString(array));
    }
}
