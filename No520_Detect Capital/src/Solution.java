public class Solution {
	public boolean detectCapitalUse(String word) {
        String lower = word.toLowerCase();
        String Upper = word.toUpperCase();
        String first = lower.replaceFirst(lower.substring(0, 1), lower.substring(0, 1).toUpperCase());
        System.out.println(word+" "+lower+" "+Upper+" "+first);
        if (word.equals(lower)|word.equals(Upper)|word.equals(first)) {
			return true;
		}
        return false;
    }
}
