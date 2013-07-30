/**
 * 
 */
package other;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * 
 */
public class GenMethodFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 2, 6, -10, 1, 4, 8, 9, 7, -1, 14, 32 };
		int[] m = { -10, 1, 4, 8, 9,};
		int[] n = { -7, -1, 14, 32 };
//		pp(ms(a));
		HeapS(a);
		pp(a);
	}


	/**
	 * 最小堆调整函数
	 * @param a
	 * @param length
	 * @param index
	 */
	public static void minHeap(int[] a,int length,int index){
		int heapSize = length;
		int minIndex = index;
		int lChild = (index << 1) + 1;
		int rChild = (index << 1) + 2;
		if (lChild < heapSize && a[index] > a[lChild]) {
			minIndex = lChild;
		}
		if (rChild < heapSize && a[minIndex] > a[rChild]) {
			minIndex = rChild;
		}
		if(minIndex != index){
			int tmp = a[index];
			a[index] = a[minIndex];
			a[minIndex] = tmp;
			minHeap(a, length,minIndex);
		}
	}
	
	
	/**
	 * 堆排序 （最小堆）
	 * @param a
	 */
	public static void HeapS(int[] a) {
		
		for (int i = a.length - 1; i >= 0; i--) { // 通过调整函数，构建最小堆
			minHeap(a, a.length, i);
		}
		for (int i = a.length - 1; i > 0; i--) { //把根节点和尾部元素（i位置）交换，i~n就为有序数组知道i=0即0~n有序
			int tmp = a[0];
			a[0] = a[i];
			a[i] = tmp;
			minHeap(a, i, 0);
		}
	}

	/**
	 * 找出最大的k个数，原理同使用最小堆。
	 * @param arrayList
	 * @param k
	 */
	public static void findMaxK(ArrayList<Integer> arrayList, int k) {
		ArrayList<Integer> tmpList = new ArrayList<Integer>();
		for (int i = 0; i < arrayList.size(); i++) {
			replaceMin(tmpList, arrayList.get(i), k);
		}
		System.out.println(tmpList.toString());
	}
	
	public static void pp(int[] a){
		for(int i:a){
			System.out.print(i+",");
		}
		System.out.print("\n");
	}
	
	
	private static ArrayList<Integer> replaceMin(ArrayList<Integer> arrayList,
			int m, int k) {
		if (arrayList.size() < k) {
			arrayList.add(m);
			if (arrayList.size() == k) {
				for (int i = 1; i < k; i++) {
					int tmp = arrayList.get(i);
					int j = i;
					for (; j > 0 && tmp < arrayList.get(j - 1); j--) {
						arrayList.set(j, arrayList.get(j - 1));
					}
					arrayList.set(j, tmp);
				}
			}
		} else {

			for (int i = k - 1; i > 0; i--) {
				if (arrayList.get(i) < m) {
					for (int j = 0; j < i; j++) {
						arrayList.set(j, arrayList.get(j + 1));
					}
					arrayList.set(i, m);
					break;
				}
			}

		}
		return arrayList;
	}


	/**
	 * 归并排序
	 * @param a
	 * @return
	 */
	public static int[] ms(int[] a){
		if(a.length ==1)return a;
		int halfArray = a.length/2;
		int[] array0 = new int[halfArray];
		int[] array1 = new int[a.length - halfArray];
//		System.arraycopy(src, srcPos, dest, destPos, length)
		for(int i=0;i<a.length;i++){ // 此循环同arraycopy实现
			if(i<halfArray){
				array0[i] = a[i];
			}else{
				array1[i-halfArray] = a[i];
			}
		}
		array0 = ms(array0);
		array1 = ms(array1);
		return mergeSub(array0, array1);
	}
	
	// merge 2 sorted arrays
	public static int[] mergeSub(int[] a, int[] b) {
		int[] result = new int[a.length+b.length];
		int i = 0,j =0,k = 0;
		while (true) {
			if(a[i]<b[j]){
				result[k] = a[i];
				if(++i>a.length - 1)break;
			}else{
				result[k] = b[j];
				if(++j>b.length - 1)break;
			}
			k++;
		}
		for (; i < a.length; i++)
			result[++k] = a[i];
		for (; j < b.length; j++)
			result[++k] = b[j];
		
		return result;
	}
	
	
	/**
	 * 快排
	 * @param a
	 * @param left
	 * @param right
	 * @return
	 */
	public static int[] qs(int[] a, int left, int right){
		int i = left;
		int j = right;
		if(left<right){
			int pivot = a[left]; //缺省设置数组的left元素为权值。
			while(i<j){
				while(i<j && a[j]>pivot)j--;//找到右边（方向向左）第一个小于权值的元素
				if(i<j){
					a[i] = a[j];			//把它放置到i的位置
				}
				while(i<j && a[i]<pivot)i++;//找到左边（方向向右）第一个大于权值的元素
				if(i<j){
					a[j] = a[i];            //把它放置到上面j的位置
				}
			}
			a[i] = pivot; //把全职放到正确的i位置
			qs(a, left, i);//对左边
			qs(a, i, right);//对右边
		}
		return a;
	}
	
	
	/**
	 * 冒泡
	 * @param a
	 * @return
	 */
	public static int[] popSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			for (int j = i; j > 0; j--) {
				int tmp;
				if (a[j] < a[j - 1]) {
					tmp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = tmp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.print("\n");
		return a;
	}

	
	/**
	 * 插入
	 * @param a
	 */
	public static void insertSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int tmp = a[i];
			int j;
			for (j = i; j > 0 && a[j - 1] > tmp; j--) {
				a[j] = a[j - 1]; //后移动j
			}
			a[j] = tmp;//tmp放置到 最终的j移动到的位置
		}
	}
	
	/**
	 * 最长子序列和
	 * 类似动态规划的备忘录方法
	 * @param a
	 * @return
	 */
	public static int getLongOptmize(int[] a) {
		int m = a.length;
		int nCurrent = a[m - 1];
		int nResult = a[m - 1];
		for (int i = m - 2; i > 0; i--) {
			nCurrent = (a[i] > a[i] + nCurrent ? a[i] : a[i] + nCurrent);
			nResult = (nResult > nCurrent ? nResult : nCurrent);
		}
		System.out.println(nResult);
		return nResult;
	}

	/**
	 * 最长子序列和
	 * @param a
	 * @return
	 */
	public static int getLong(int[] a) {
		int max_result = a[0];

		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = i; j < a.length; j++) {
				sum += a[j];
				if (sum > max_result) {
					max_result = sum;
				}
			}
		}
		System.out.println(max_result);
		return max_result;
	}
}
