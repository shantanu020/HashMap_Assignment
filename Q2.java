import java.util.*;

public class Q2{
    public static void main(String[] args) {
        // Create a TreeMap with integer keys and string values
        TreeMap<Integer, String> tm = new TreeMap<>();
        // Adding entries to the TreeMap
        tm.put(5, "Rahul");
        tm.put(7, "Lakshman");
        tm.put(1, "Ram");
        tm.put(4, "Krrish");
        tm.put(2, "Lakshay");

        // Create a list from the entry set of the TreeMap
        List<Map.Entry<Integer, String>> list = new ArrayList<>(tm.entrySet());

        // Sort the list based on values (ascending order)
        list.sort(Map.Entry.comparingByValue());

        // Print the sorted list based on values
        System.out.println("Entries sorted by values:");
        for (Map.Entry<Integer, String> entry : list) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
