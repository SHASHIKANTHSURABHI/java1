import java.util.HashMap;
import java.util.Map;

public class Mode {
    public static void main(String[] args) {
        int[] array = {66, 79, 84, 53, 28, 17, 91};

        int mode = findMode(array);
        System.out.println("Mode: " + mode);
    }
    public static int findMode(int[] array)
    {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array)
        {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int mode = 0;
        int maxFrequency = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mode = entry.getKey();
            }
        }
        return mode;
    }
}
