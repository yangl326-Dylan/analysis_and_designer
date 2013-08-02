/**
 * 
 */
package divide;

import utils.Pprint;

/**
 * full permutation, one kind of recursion method 
 * @author Dylan
 *
 */
public class FullArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};
		perm(a, 0, a.length);
		try{
			
		}finally{
			
		}

	}
	
	/**
	 * full array 主函数
	 * @param a
	 * @param k  
	 * @param n  数组长度
	 */
	public static void perm(int[] a,int k, int n){
		if(k==n){ //
			Pprint.parray(a);
		}
		else{
			Pprint.p("--------------");
			for (int i = k; i < n; i++) {
				Pprint.parray(a);
				swap(a, k, i);
				perm(a, k+1, n);
				swap(a, k, i);
			}
		}
		
	}

	/**
	 * 交换数组中i,j元素值，在perm中仅仅为交换当前子序列的首元素和依次遍历的元素值。
	 * a1~a5的 
	 * @param a
	 * @param i
	 * @param j
	 */
	public static void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;

	}

}
