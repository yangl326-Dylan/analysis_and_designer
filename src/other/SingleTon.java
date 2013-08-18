package other;

public class SingleTon {

	/**
	 * java µ¥ÀýÄ£Ê½
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleTon pSingleTon = new SingleTon();
		SingleTon pSingleTon2 = new SingleTon();
		SingleTon name = pSingleTon.getInstance();
		SingleTon name2 = pSingleTon2.getInstance();
		System.out.println(name.hashCode());
		System.out.println(name2.hashCode());
	}

	private static SingleTon instanceSingleTon1 = null;

	private SingleTon() {
	}

	public static SingleTon getInstance() {
		if (instanceSingleTon1 == null) {
			instanceSingleTon1 = new SingleTon();
		}
		return instanceSingleTon1;
	}

}
