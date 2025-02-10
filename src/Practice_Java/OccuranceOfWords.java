package Practice_Java;
import java.util.HashMap;
import java.util.Map;
public class OccuranceOfWords {
	

	
	    public static void main(String[] args) {
	        String s = "welcome to yash welcome";
	        String[] words = s.split("\\s+"); // Split the string into words using whitespace as a delimiter
	        Map<Integer, Integer> wordFrequency = new HashMap<>(); // Hash table to store word hash codes and their frequencies

	        for (String word : words) {
	            int hashCode = word.hashCode();
	            // Update the frequency of the word in the hash table
	            wordFrequency.put(hashCode, wordFrequency.getOrDefault(hashCode, 0) + 1);
	        }

	        // Print the word frequencies
	        for (Map.Entry<Integer, Integer> entry : wordFrequency.entrySet()) {
	            int hashCode = entry.getKey();
	            int frequency = entry.getValue();
	            System.out.println("Word with hash code " + hashCode + " occurs " + frequency + " times.");
	        }
	    }
	

}
