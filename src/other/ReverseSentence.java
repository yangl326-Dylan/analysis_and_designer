package other;

import java.util.Arrays;

public class ReverseSentence {

	/**
	 * 实现反说一句话， 单词的顺序不变
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
	 * 把倒叙的话写入b
	 * @param a
	 * @param b
	 */
	public static void reverseSentence(char[] a,char[] b) {
		int start =0;
		for (int i = a.length-1; i >=0; i--) {
			b[a.length-1-i] = a[i];
			if(a[i]==' ' || a[i]==','){// 按具体条件写入单词分割符号
				reverse(b, start, a.length-1-i-1);//example：当前索引 a.length-1-i，|yob |位置0-3，位置0-2(当前索引-1)放入reverse函数 下一个start为当前索引+1
				start = a.length-1-i+1;
			}
		}
	}
	
	/**
	 * 翻转数组a中i~j的元素位置
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
