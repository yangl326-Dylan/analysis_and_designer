package blog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public abstract class CollectionRemove {
	
	public static void main(String[] args) {
		// remove listA�����е� ���� c ���� 
		String[] tmp = {"a","b","c","c","d"};
		List<String> listA = new ArrayList<String>();
		List<String> listB = new ArrayList<String>();
		List<String> listC = new ArrayList<String>();
		List<String> listD = new ArrayList<String>();
		for(String str:tmp){
			listA.add(str);
			listB.add(str);
			listC.add(str);
			listD.add(str);
		}//listA B װ��ͨtmp�����еĶ���
		//listA.remove("c");//�����Ƴ���һ�γ��ֵ�c����ô�������뵽ȥ��������c��remove��������
		for (int i = 0; i < listA.size(); i++) {
			if (listA.get(i).equals("c")) {
				listA.remove(i);
			}
		}
		System.out.println(listA);// �����[a, b, c, d] Ϊʲôcû�б�ȫ���Ƴ���? ������ִ�������쳣��������
		
		//����һ�������Ƴ�
		for (int i = listB.size() -1; i>=0; i--) {
			if (listB.get(i).equals("c")) {
				listB.remove(i);
			}
		}
		System.out.println(listB); //�����[a, b, d] ��������
		
		//��������ʹ�� removeAll��װ������Ҫ�Ƴ���Ԫ��
		List<String> tmpDel = new ArrayList<String>();
		tmpDel.add("c");
		listC.removeAll(tmpDel);//�Ƴ�tmpDel���������� ����Ԫ��
		System.out.println(listC); //�����[a, b, d] ��������
		
		//��������ʹ�õ����� ע����ȷ�÷���ע�Ͳ���
		Iterator<String> iterator = listD.iterator();
		while (iterator.hasNext()) {
			if(iterator.next().equals("c")){
				iterator.remove();
				//listD.remove("c"); // error Iterator�ǹ�����һ���������̣߳�����������Ķ��󱻸ı䣬����Ტ���쳣
			};
			
		}
		System.out.println(listD); //�����[a, b, d] ��������
	}
}
