
public class Solution {
	public boolean judgeCircle(String moves) {
        char[] ch =moves.toCharArray();
        int left_right=0;
        int up_down=0;
        for (int i = 0; i < ch.length; i++) {
			switch (ch[i]) {
			case 'L':
				left_right++;
				continue;
			case 'R':
				left_right--;
				continue;
			case 'U':
				up_down++;
				continue;
			case 'D':
				up_down--;
				continue;	
			}
		}
        if (left_right==0&&up_down==0) {
			return true;
		}
        return false;
    }
}
