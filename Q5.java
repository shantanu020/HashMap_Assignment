
import java.util.HashMap;
import java.util.Map;

public class Q5{
    public static void main(String[] args) {
        // Test cases
        System.out.println(canConstruct("a", "b"));         // false
        System.out.println(canConstruct("aa", "ab"));       // false
        System.out.println(canConstruct("aa", "aab"));      // true
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> charCount = new HashMap<>();

        // Count characters in magazine
        for (char c : magazine.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Check if ransomNote can be constructed
        for (char c : ransomNote.toCharArray()) {
            if (!charCount.containsKey(c) || charCount.get(c) <= 0) {
                return false; // Not enough characters
            }
            charCount.put(c, charCount.get(c) - 1); // Use one occurrence of the character
        }

        return true; // All characters needed are available
    }
}
