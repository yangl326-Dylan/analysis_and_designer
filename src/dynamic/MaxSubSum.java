package dynamic;

public class MaxSubSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-3,1,6,-20,5,6,9,0,-1,6};
		System.out.println(String.valueOf(sumMax(a)));
		System.out.println(String.valueOf(sumMaxD(a)));
		System.out.println(String.valueOf(sumMaxNew(a)));
	}
	
	/**
	 * 常规方法，以每个作为起点计算最大和
	 * @param a
	 * @return
	 */
	public static int sumMax(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			int tmp = 0;
			for (int j = i; j < a.length; j++) {
				tmp +=a[j];
				if(tmp>sum){
					sum = tmp;
				}
			}
			
		}
		return sum;
	}
	
	
	
	/**
	 * tmp[j] = max(a[j],tmp[j-1]+a[j])  动态规划的递推式子
	 * result = max(tmp>0?tmp+a[i]:a[i],result)
	 * tmp:当前子数列和
	 * result:历史最大子数列和
	 * @param a
	 * @return
	 */
	public static int sumMaxD(int[] a) {
		int result = 0;
		int tmp = 0;
		for (int i = 1; i < a.length; i++) {
			if (tmp > 0) {
				tmp = tmp + a[i];
			} else {
				tmp = a[i];
			}
			if (tmp > result)
				result = tmp;
		}
		return result;
	}
	
	
	/**
	 * 优化后的 时间复杂度和空间复杂度都较小
	 * 记事本方法（类动态规划） 整理后的
	 * @param a
	 * @return
	 */
	public static int sumMaxNew(int[] a) {
		int nCurrent = a[a.length-1];
		int result = a[a.length-1];
		for (int i = a.length-2; i >=0; i--) {
			nCurrent = nCurrent + a[i] >a[i]? nCurrent + a[i] : a[i];
			result = result > nCurrent ? result : nCurrent;
		}
		return result;
	}

}
