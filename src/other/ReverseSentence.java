package other;

import java.util.Arrays;

public class ReverseSentence {

	/**
	 * ʵ�ַ�˵һ�仰�� ���ʵ�˳�򲻱�
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a= "Hi,I am a boy".toCharArray();
		System.out.println(Arrays.toString(a));
		char[] b = new char[a.length];
		reverseSentence(a,b);
		System.out.println(Arrays.toString(b));
		
		
	}
	
	/**
	 * �ѵ���Ļ�д��b
	 * @param a
	 * @param b
	 */
	public static void reverseSentence(char[] a,char[] b) {
		int start =0;
		for (int i = a.length-1; i >=0; i--) {
			b[a.length-1-i] = a[i];
			if(a[i]==' ' || a[i]==','){// ����������д�뵥�ʷָ����
				reverse(b, start, a.length-1-i-1);//example����ǰ���� a.length-1-i��|yob |λ��0-3��λ��0-2(��ǰ����-1)����reverse���� ��һ��startΪ��ǰ����+1
				start = a.length-1-i+1;
			}
		}
	}
	
	/**
	 * ��ת����a��i~j��Ԫ��λ��
	 * @param a
	 * @param i
	 * @param j
	 */
	public static void reverse(char[] a, int i, int j) {
		char tmp =0;
		while (i<j) {
			tmp = a[i];
			a[i++] = a[j];
			a[j--] = tmp;
		}
	}
}
