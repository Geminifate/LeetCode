public class NumArray {
	private int[] sum;
    public NumArray(int[] nums) {
    	sum=new int[nums.length];
    	int count=0;
    	for (int i = 0; i < nums.length; i++) {
			count+=nums[i];
			sum[i]=count;
		}
    }
    
    public int sumRange(int i, int j) {
    	if (i==0) {
			return sum[j];
		}
		return sum[j]-sum[i-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */