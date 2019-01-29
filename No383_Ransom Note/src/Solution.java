public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        for (int i = 0; i < ransomNote.length(); i++) {
				if (magazine.contains(""+ransomNote.charAt(i))) {
					magazine=magazine.replaceFirst(""+ransomNote.charAt(i), "");
					continue;
				}
				return false;
		}
        return true;
    }
}