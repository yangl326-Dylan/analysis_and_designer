package blog;

import java.util.ArrayList;
import java.util.List;


public class FinalVariables {

	public static void main(String[] args) {

	}
	public static final double PI = 3.1415926;
	public final String name;// �����ڹ������г�ʼ��
	public final int id;
	//public final int other; // error ���Ϸ�

	public FinalVariables(String name,int id) {
		this.id = id;
		this.name = name;
		//��Щ���Ա��� ������Ϊ�丳ֵ���Ҳ��ܱ��޸ġ�
		//��Ҫ�޸���Щ���ԣ������°�װΪobj.name obj.id ���� objΪfinal����Ȼobj���ܱ���ֵ��Ȼ���������ܹ����ı�
	}
	
	
	public void test(){
		final List<String> list = new ArrayList<String>();
		list.add("str");
		// list = new ArrayList<String>(); // error
	}
}


