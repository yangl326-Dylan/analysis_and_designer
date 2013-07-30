package other;

import java.util.LinkedList;

public class BTreeHandle {

	/**
	 * 二叉树的相关操作
	 * 递归和非递归实现
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	root根节点树
//		root 
// 		a   b
//     c d   e 
//		
		BTreeHandle fp = new BTreeHandle();
		BinTree e= fp.new BinTree(null, null, "e");
		BinTree d= fp.new BinTree(null, null, "d");
		BinTree c= fp.new BinTree(null, null, "c");
		BinTree b= fp.new BinTree(null, e, "b");
		BinTree a= fp.new BinTree(c, d, "a");
		BinTree root= fp.new BinTree(a, b, "root");
//		fp.rbfs(root);
//		fp.rdfs(root);
//		fp.bdfs(root,1);
//		System.out.print("\n");
//		fp.bdfs(root,0);
		fp.midOrder(root);
		System.out.print(fp.getLength(root));
	}
	
	/**
	 * @param bt
	 */
	public static void ss(BinTree bt) {
		System.out.print(bt.data+"::");
	}
	
	/**
	 * pollLast() => stack去实现深度遍历，pollFirst() => queue去实现广度遍历。
	 * @param root
	 * @param flag 0 广度, 1 深度。
	 */
	public void bdfs(BinTree root, int flag) {
		LinkedList linkedList = new LinkedList();
		linkedList.add(root);
		while (linkedList.size()>0) {
			BinTree bt = (flag==1? (BinTree)linkedList.pollLast():(BinTree)linkedList.pollFirst());
			ss(bt);
			if(bt.rb != null)linkedList.add(bt.rb);
			if(bt.lb != null)linkedList.add(bt.lb);
		}
		
	}
	
	
	/**
	 * 一个树的高度
	 * @param bt
	 * @return
	 */
	public int getLength(BinTree bt){
		if(bt == null) return 0;
		int rlength = getLength(bt.rb);
		int llength = getLength(bt.lb);
		return 1+(llength> rlength?llength:rlength);
	}
	
	public void midOrder(BinTree bt) {
		if(bt == null) return;
		if(bt.lb != null){
			midOrder(bt.lb);
		}
		ss(bt);
		if(bt.rb != null){
			midOrder(bt.rb);
		}
	}
	
	//Recursion 递归深度
	public void rdfs(BinTree bt) {
		if(bt == null) return;
		ss(bt);
		if(bt.lb != null)rdfs(bt.lb);
		if(bt.rb != null)rdfs(bt.rb);
	}
	
	//递归广度
	public void rbfs(BinTree bt) {
		if(bt == null) return;
		if(bt.data.equals("root"))System.out.print("root::");
		if(bt.lb != null && bt.rb != null){
			ss(bt.lb);
			ss(bt.rb);
			rbfs(bt.lb);
			rbfs(bt.rb);
			}
		if(bt.lb != null && bt.rb == null){
			ss(bt.lb);
			rbfs(bt.lb);
		}
		if(bt.rb != null && bt.lb == null){
			ss(bt.rb);
			rbfs(bt.rb);
		}
	}
	
	
	
	
	/**
	 * 树结构
	 * @author Dylan
	 *
	 */
	class BinTree{
		private BinTree lb;
		private BinTree rb;
		private String data;
		public BinTree(BinTree bl, BinTree br, String data) {
			super();
			this.lb = bl;
			this.rb = br;
			this.data = data;
		}
		
	}

}
