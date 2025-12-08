package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Iteration {
    public static void main(String[] args) {
        // Create a HashMap
        // Key: String (Name), Value: Integer (Roll No/Marks etc)
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("USA", 50);
        hm.put("Indonesia", 6);
        hm.put("Nepal", 5);

        // ---------------------------------------------------------
        // METHOD 1: Iterate using keySet()
        // ---------------------------------------------------------
        // BEST USE: When you ONLY need the Keys.
        // DOWNSIDE: If you need values too, it is slower because hm.get(k)
        //           performs an extra hashing operation for every key.

        System.out.println("--- Method 1: keySet() ---");

        // 1. Get all keys in a Set (because keys are unique)
        Set<String> keys = hm.keySet();

        // 2. Loop through the keys (Order is NOT guaranteed in HashMap)
        for (String k : keys) {
            // hm.get(k) adds time complexity here
            System.out.println("Key = " + k + ", Value = " + hm.get(k));
        }

        // ---------------------------------------------------------
        // METHOD 2: Iterate using entrySet() (Standard Way)
        // ---------------------------------------------------------
        // BEST USE: When you need BOTH Keys and Values.
        // ADVANTAGE: Most efficient. It accesses the Map.Entry object directly,
        //            getting Key and Value in one go without re-hashing.

        System.out.println("\n--- Method 2: entrySet() ---");

        // Map.Entry is the interface for a key-value pair
        for (Map.Entry<String, Integer> e : hm.entrySet()) {
            System.out.println("Key: " + e.getKey() + " | Value: " + e.getValue());
        }

        // ---------------------------------------------------------
        // METHOD 3: Java 8+ forEach (Modern/Interview Way)
        // ---------------------------------------------------------
        // BEST USE: For concise, one-line operations.

        System.out.println("\n--- Method 3: Lambda Expression ---");

        hm.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Val: " + value);
        });
    }
}

/* QUICK REVISION NOTES:
   ---------------------
   1. Time Complexity: Iterating over a HashMap takes O(N), where N is the number of entries.
   2. Order: HashMap does NOT preserve insertion order. (Use LinkedHashMap if order matters).
   3. Syntax: Always import java.util.Map for entrySet().
*/