import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] findWords(String[] words) {
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
        return arr.toArray(new String[arr.size()]);
    }
}
	
	
}
