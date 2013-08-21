package blog;

import java.util.ArrayList;
import java.util.List;


public class FinalVariables {

	public static void main(String[] args) {

	}
	public static final double PI = 3.1415926;
	public final String name;// 必须在构造器中初始化
	public final int id;
	//public final int other; // error 不合法

	public FinalVariables(String name,int id) {
		this.id = id;
		this.name = name;
		//这些属性变量 构造器为其赋值，且不能被修改。
		//想要修改这些属性，考虑下包装为obj.name obj.id 声明 obj为final，虽然obj不能被赋值，然而其属性能够被改变
	}
	
	
	public void test(){
		final List<String> list = new ArrayList<String>();
		list.add("str");
		// list = new ArrayList<String>(); // error
	}
}


