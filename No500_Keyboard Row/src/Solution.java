import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {
	public String[] findWords(String[] words) {
		if(words==null){
            return new String[]{};
        }
        String[] str={"qwertyuiop","asdfghjkl","zxcvbnm"};
        Map<Character,Integer> map=new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();
        int index;
        for(int i=0;i<str.length;i++){
        	for(char c:str[i].toCharArray()){
        		map.put(c,i);
        		}
        	}
        for (int i = 0; i < words.length; i++) {
        	char[] ch=words[i].toLowerCase().toCharArray();
        	index=map.get(ch[0]);
        	for (int j = 0; j < ch.length; j++) {
        		if (index!=map.get(ch[j])) {
					break;
				}
        		if (index==map.get(ch[j])&&j==(ch.length-1)) {
        			arr.add(words[i]);
				}
			}
        	
		}
        String ss= arr.toString().substring(1,arr.toString().length()-1);
        return ss.trim().split(",");
        
    }
 public static void main (String[] args) {
	 String strq="sdfsg";
     System.out.println(strq.compareTo("s"));
 }
	
	
}
