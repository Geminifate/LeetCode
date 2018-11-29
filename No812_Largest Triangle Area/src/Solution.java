public class Solution {
    public double largestTriangleArea(int[][] points) {
    	double side_A = 0;
    	double side_B = 0;
    	double side_C = 0;
    	double p=0;
    	double area=0;
        for (int i = 0; i < points.length-2; i++) {
			for (int j = i+1; j < points.length-1; j++) {
				for (int k = j+1; k < points.length; k++) {
					side_A = Math.sqrt(Math.pow(points[i][0]-points[j][0],2)+Math.pow(points[i][1]-points[j][1],2));
					side_B = Math.sqrt(Math.pow(points[j][0]-points[k][0],2)+Math.pow(points[j][1]-points[k][1],2));
					side_C = Math.sqrt(Math.pow(points[k][0]-points[i][0],2)+Math.pow(points[k][1]-points[i][1],2));
					p=(side_A+side_B+side_C)/2;
					double tem=Math.sqrt(p*(p-side_A)*(p-side_B)*(p-side_C));
					if (tem>area) {
						area=tem;
					}
				}
			}
		}
        return area;
    }
}