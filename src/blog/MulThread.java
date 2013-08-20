/**
 * 
 */
package blog;

public class MulThread {
	public static void main(String[] args) {
		MulThread pMulThread = new MulThread();
		Thread a = pMulThread.new ThreadA();// 创建线程类
		Thread b = new Thread(pMulThread.new ThreadB());//创建线程类
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
	 *子类方式
	 */
	public class ThreadA extends Thread{
		public void run() {
			System.out.println("ThreadA I'm running");
		}
	}
	
	/**
	 *实现runnable接口
	 */
	public class ThreadB implements Runnable{
		public void run() {
			System.out.println("ThreadB I'm running");
		}
	}

}
