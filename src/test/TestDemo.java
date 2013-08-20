/**
 * 
 */
package test;

import other.SingleTon;

/**
 * @author Administrator
 *
 */
public class TestDemo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		placeQueens(0);
		SingleTon pSingleTon = SingleTon.getInstance();
	}
	static int col4row[] = new int[8];
	/**
	 * ��鵱ǰλ���Ƿ�Ϸ�������ͬ�С�ͬб�ߣ�
	 * @param row
	 * @return
	 */
	public static boolean check(int row)
	{
		for(int i=0;i<row;i++)
		{
			int diff=Math.abs(col4row[row]-col4row[i]);
			if(diff==0 || diff==row-i)
			{
				return false;
			}
		}
		return true;
	}
	/**
	 * ÿһ�пɷ��õ�λ��
	 * @param row
	 */
	static int count = 0;
	public static void placeQueens(int row)
	{
		if(row==8)
		{
			for(int i=0;i<8;i++)
			{
				System.out.print(col4row[i]);
			}
			count++;
			System.out.println();
			return;
		}

		for(int i=0;i<8;i++)
		{
			col4row[row]=i;
			if(check(row))
			{
				placeQueens(row+1);
			}
		}
	}
}
