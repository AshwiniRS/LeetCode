/*
 * Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard
 *
 * Solution - 
 * public String[] findWords(String[] words) {
    return Stream.of(words).filter(s -> s.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*")).toArray(String[]::new);
}
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeyboardRow {
	
	public static String[] findWords(String[] words) {
        List<String> result = new ArrayList<String>();
        int k=0;
        List<Character> firstrowList = Arrays.asList('q','w','e','r','t','y','u','i','o','p');
        List<Character> secondrowList = Arrays.asList('a','s','d','f','g','h','j','k','l');
        List<Character> thirdrowList = Arrays.asList('z','x','c','v','b','n','m');
        
        for(int i=0; i<words.length; i++){
        	char[] wordArr = words[i].toCharArray();
        	List<Character> listC = new ArrayList<Character>();
            for (char c : wordArr) {
            	if(!listC.contains(c))
            		listC.add(Character.toLowerCase(c));
            }
        	if(firstrowList.containsAll(listC) || secondrowList.containsAll(listC) || thirdrowList.containsAll(listC)){
        		result.add(words[i]);
        		k++;
        	}
        }
        return result.toArray(new String[0]);
    }
	public static void main(String[] args) {
		String[] words = {"Hello", "Alaska", "Dad", "Peace"};
		String[] result = findWords(words);
		for(String str : result) System.out.println(str);
	}

}
