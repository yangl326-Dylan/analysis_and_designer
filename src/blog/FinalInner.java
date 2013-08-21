package blog;

public class FinalInner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// String aString  = "haha~";// 无法被调用 不合法
		final String aString  = "haha~"; // okay
		Thread a = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(aString);// 调用外部变量
			}
		});
		a.start();
	}

}
