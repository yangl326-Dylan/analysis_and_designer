package blog;

public class FinalMethod {

	public static void main(String[] args) {
		FinalMethod aFinalMethod = new FinalMethod();
		B b = aFinalMethod.new B();
		b.foo2(); // 保持了foo2方法的一致性，A的子类使用的是相同的foo2 A不希望此方法被修改
	}
	
	class A{
		public void foo1(){}
		public final void foo2(){}
	}
	
	class B extends A{ // 继承
		public void foo1() {} // okay
		//public void foo2(int a){} //合法 重写foo2方法
	}

}
