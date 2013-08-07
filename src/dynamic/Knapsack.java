package dynamic;

public class Knapsack {

	/**
	 * 01
	 * 需要遍历结果集
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c= 10;
		int n = 5;
		int[] w={2,2,6,4,5};
		int[] v={6,3,5,6,4};
		getMaxValue(w, v, n, c+1);

	}
	
	/**
	 * m[i][j] = max(m[i-1][j],m[i-1][j-wi]+vi)
	 * @param w
	 * @param v
	 * @param c
	 */
	public static void getMaxValue(int[] w,int[] v,int n,int c) {
		int[][] m = new int[n][c];
		for (int i = 0; i < n; i++) {
			m[i][0] = 0;
		}
		for (int j = w[0]; j < c; j++) {
			m[0][j] = v[0];
		}
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < c; j++) {
				if(w[i]<j){
					m[i][j]=max(m[i-1][j],m[i-1][j-w[i]]+v[i]);
				}else{
					m[i][j]=m[i-1][j];
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(m[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static int max(int a,int b) {
		return a>=b?a:b;
	}
	
	public static void traceback(int[][] m,int x,int y){
		for (int i = x-1; i >0; i--) {
			for (int j = y-1; j >0; j--) {
				if(m[i][j]==m[i][j-1]){}
			}
		}
	}

}
