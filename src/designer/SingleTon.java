/**
 * 
 */
package designer;

/**
 * @author zhou
 *
 */
public class SingleTon {

	/**
	 * 调用的时候创建实例 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleTon aSingleTon = getInstance();
		SingleTon bSingleTon = getInstance();
		System.out.println(bSingleTon.hashCode());
		System.out.println(aSingleTon.hashCode());
	}
	
	public static SingleTon siTon= null;
	//public static SingleTon siTon= new SingleTon();

	private SingleTon() {
	}
	public static SingleTon getInstance() {
		if (siTon == null) {
			siTon = new SingleTon();
		}
		return siTon;
	}

}
