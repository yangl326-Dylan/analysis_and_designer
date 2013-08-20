/**
 * 
 */
package blog;

public class MulThread {
	public static void main(String[] args) {
		MulThread pMulThread = new MulThread();
		Thread a = pMulThread.new ThreadA();// �����߳���
		Thread b = new Thread(pMulThread.new ThreadB());//�����߳���
		a.start();
		b.start();
		
		Thread tmp = new Thread(new Runnable(){
			public void run() {
				System.out.println("I'm running");
			}
		});
		tmp.start();
	}
	
	/**
	 *���෽ʽ
	 */
	public class ThreadA extends Thread{
		public void run() {
			System.out.println("ThreadA I'm running");
		}
	}
	
	/**
	 *ʵ��runnable�ӿ�
	 */
	public class ThreadB implements Runnable{
		public void run() {
			System.out.println("ThreadB I'm running");
		}
	}

}
