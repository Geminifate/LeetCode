/*
 * ���ǰѷ����������Ե����� A ����ɽ����
 * A.length >= 3
 * ���� 0 < i < A.length - 1 ʹ��A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
 * ����һ��ȷ��Ϊɽ�������飬�����κ����� A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1] �� i ��ֵ��
 */

import java.util.Arrays;

public class Solution {
    public int peakIndexInMountainArray(int[] A) {
    	int index=0;
    	for (int i=1; i < A.length; i++) {
			if (A[i]<A[i-1]) {
				index=i-1;
				break;
			}
		}
    	return index;     
    }
}