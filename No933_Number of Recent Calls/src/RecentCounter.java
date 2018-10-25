public class RecentCounter {
	public RecentCounter() {
        
    }
	int[] rds = new int[10000];
    int count=-1;
    int i=0;
    public int ping(int t) {
        count++;
        rds[count]=t;
        //不用每次都遍历，下次的i就是前面最后的i
        for( ;i<=count;++i){
            if(rds[i]>=t-3000) break;
        }
        return count-i+1;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */