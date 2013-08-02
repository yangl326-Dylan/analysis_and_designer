package dynamic;

public class LCS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		  * 1,2,3,7,6,8,9
 		*	
		5   
		1 `
		3       `
		2
		7
		10
		9
		12
		*/
		int[] a= {0,5,1,3,2,7,10,9,12};
		int[] b= {0,1,2,3,7,6,8,9};
		getLCS(a,b);

	}
	
	/**
	 * get longest common subsequence；
	 * 遍历结果矩阵根据顶点 获取结果
	 * @param a
	 * @param b
	 */
	public static void getLCS(int[] a,int[] b) {
		int aLength = a.length;
		int bLength = b.length;
		int[][] result = new int[aLength+1][bLength+1];
		for(int i=0;i<=aLength;i++)result[i][0] = 0;
		for(int i=0;i<=bLength;i++)result[0][i] = 0;
		for(int i=1;i<aLength;i++){
			for (int j = 1; j < bLength; j++) {
				if(a[i] == b[j]){
					result[i][j] = result[i-1][j-1]+1;
				}
				else{
					result[i][j] = max(result[i-1][j],result[i][j-1]);
				}
			}
		}
		for (int i = 0; i < a.length+1; i++) {
			for (int j = 0; j < b.length+1; j++) {
				System.out.print(result[i][j]+",");
			}
			System.out.print("\n");
		}
	}
	
	public static int max(int a,int b) {
		return a>=b?a:b;
	}

}
