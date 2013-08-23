package blog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public abstract class CollectionRemove {
	
	public static void main(String[] args) {
		// remove listA对象中的 所有 c 对象 
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
		}//listA B 装有通tmp数组中的对象
		//listA.remove("c");//仅仅移除第一次出现的c，那么很容易想到去遍历遇到c都remove（索引）
		for (int i = 0; i < listA.size(); i++) {
			if (listA.get(i).equals("c")) {
				listA.remove(i);
			}
		}
		System.out.println(listA);// 结果：[a, b, c, d] 为什么c没有被全部移除掉? 不会出现错误或者异常，见分析
		
		//方法一：倒序移除
		for (int i = listB.size() -1; i>=0; i--) {
			if (listB.get(i).equals("c")) {
				listB.remove(i);
			}
		}
		System.out.println(listB); //结果：[a, b, d] 符合期望
		
		//方法二：使用 removeAll包装起来需要移除的元素
		List<String> tmpDel = new ArrayList<String>();
		tmpDel.add("c");
		listC.removeAll(tmpDel);//移除tmpDel所包含的其 所有元素
		System.out.println(listC); //结果：[a, b, d] 符合期望
		
		//方法三：使用迭代器 注意正确用法见注释部分
		Iterator<String> iterator = listD.iterator();
		while (iterator.hasNext()) {
			if(iterator.next().equals("c")){
				iterator.remove();
				//listD.remove("c"); // error Iterator是工作在一个独立的线程，不允许迭代的对象被改变，否则会并发异常
			};
			
		}
		System.out.println(listD); //结果：[a, b, d] 符合期望
	}
}
