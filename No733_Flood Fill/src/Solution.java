public class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
    	if (image[sr][sc]==newColor) {
			return image;
		}
        int[][] index = new int[][] {{-1,0},{1,0},{0,-1},{0,1}};
    	int older=image[sr][sc];
    	image[sr][sc]=newColor;
    	for (int i = 0; i < 4; i++) {
    		int r = sr+index[i][0];
    		int c = sc+index[i][1];
            
    		if ((r>=0&&r<image.length)&&(c>=0&&c<image[0].length)&&older==image[r][c]) {
                
				floodFill(image,r,c,newColor);
			}
		}
    	return image;
    }
}