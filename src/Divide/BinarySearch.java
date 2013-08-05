package divide;

import utils.Pprint;

public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {12};
		Pprint.p(String.valueOf(binaryget(a,13)));
	}

	/**
	 * binary get result; find the "search" No.;
	 * 
	 * @param a
	 *            array
	 * @param search
	 *            ,witch be found;
	 * @return -1 not find or the index of this element;
	 */
	public static int binaryget(int[] a,int search) {
		int left = 0;
		int right =a.length;
		while (left < right) {
			int middle = (left + right)/2;
			if(search > a[middle]){
				left = middle+1;
			}else if(search < a[middle]){
				right = middle-1;
			}else{
				return middle;
			}
		}
		return -1;
	}
}
