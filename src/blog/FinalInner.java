package blog;

public class FinalInner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// String aString  = "haha~";// �޷������� ���Ϸ�
		final String aString  = "haha~"; // okay
		Thread a = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(aString);// �����ⲿ����
			}
		});
		a.start();
	}

}
