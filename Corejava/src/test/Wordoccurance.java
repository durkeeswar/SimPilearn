package test;
import java.util.HashMap;
import java.util.Map;

public class Wordoccurance {
	 public static void main(String[] args) {
			String str1 = "clean world green world happy world";
			 
	        HashMap<String, Integer> wordCountMap = new HashMap<>();

	        String[] words = str1.split(" ");
	        
	        int count;
	        for (String word : words) {
	            
	        	count = wordCountMap.getOrDefault(word, 0);
	        	wordCountMap.put(word, count+1);
	        }
	        
	        // ("clean",1) , count = 0
	        // ("green",1) , count = 0
	        // ("happy",1) , count = 0
	        // ("world",3) , count = 2
	        
	        System.out.println(wordCountMap);



		}

	}
