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
	 * ���淽������ÿ����Ϊ����������
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
	 * tmp[j] = max(a[j],tmp[j-1]+a[j])  ��̬�滮�ĵ���ʽ��
	 * result = max(tmp>0?tmp+a[i]:a[i],result)
	 * tmp:��ǰ�����к�
	 * result:��ʷ��������к�
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
	 * �Ż���� ʱ�临�ӶȺͿռ临�Ӷȶ���С
	 * ���±��������ද̬�滮�� ������
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
