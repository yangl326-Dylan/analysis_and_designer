package blog;

public class JVMClassLoader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JVMClassLoader hello = new JVMClassLoader();
		Class helloClass = hello.getClass();
		System.out.println("ClassLoader str: " + "".getClass().getClassLoader());
		System.out.println("ClassLoader a  : " + helloClass.getClassLoader());
		System.out.println("ClassLoader-ap : " + helloClass.getClassLoader().getParent());
		System.out.println("ClassLoader-app: " + helloClass.getClassLoader().getParent().getParent());
	}
	/*
	 * result: 
	 * ClassLoader str: null 
	 * ClassLoader a  : sun.misc.Launcher$AppClassLoader@62f72617 
	 * ClassLoader-ap : sun.misc.Launcher$ExtClassLoader@4fe5e2c3 
	 * ClassLoader-app: null
	 */

}
