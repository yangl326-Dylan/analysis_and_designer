package blog;

public class FinalMethod {

	public static void main(String[] args) {
		FinalMethod aFinalMethod = new FinalMethod();
		B b = aFinalMethod.new B();
		b.foo2(); // ������foo2������һ���ԣ�A������ʹ�õ�����ͬ��foo2 A��ϣ���˷������޸�
	}
	
	class A{
		public void foo1(){}
		public final void foo2(){}
	}
	
	class B extends A{ // �̳�
		public void foo1() {} // okay
		//public void foo2(int a){} //�Ϸ� ��дfoo2����
	}

}
