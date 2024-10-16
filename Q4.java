import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        int arr[] = {4, 2, 7, 1, 9};
        Map<Integer, Integer> elementMap = new HashMap<>();

        // Storing elements in the map with their index
        for (int i = 0; i < arr.length; i++) {
            elementMap.put(i, arr[i]);
        }

        // Finding the maximum element using the map
        int maxElement = Integer.MIN_VALUE; // Start with the smallest possible integer

        for (Map.Entry<Integer, Integer> entry : elementMap.entrySet()) {
            if (entry.getValue() > maxElement) {
                maxElement = entry.getValue(); // Update maxElement if a larger element is found
            }
        }

        // Print the maximum element
        System.out.println("The maximum element is: " + maxElement);
    }
}
