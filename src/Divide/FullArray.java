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
	 * full array ������
	 * @param a
	 * @param k  
	 * @param n  ���鳤��
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
	 * ����������i,jԪ��ֵ����perm�н���Ϊ������ǰ�����е���Ԫ�غ����α�����Ԫ��ֵ��
	 * a1~a5�� 
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
