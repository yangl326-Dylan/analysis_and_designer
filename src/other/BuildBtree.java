package other;

public class BuildBtree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ç°ÐòABDGCEFH£¬ÖÐÐòDGBAECHF
		String front ="ABDGCEFH";
		String middle ="DGBAECHF";
//		Btree a = new Btree('A', null, null); 
//		Btree b = new Btree('B', null, null); 
//		Btree c = new Btree('C', null, null); 
//		Btree d = new Btree('D', null, null); 
//		Btree e = new Btree('E', null, null); 
//		Btree f = new Btree('F', null, null);
//		Btree g = new Btree('G', null, null);
//		Btree h = new Btree('H', null, null);
		Btree root = getRoot(front,middle);
		root.getClass();
		

	}
	
	/**
	 *  recursion create one node
	 * @param front string queue
	 * @param middle string queue
	 * @return node
	 */
	static Btree getRoot(String front,String middle){
		if(front.length() == 0 || middle.length() == 0 ){
			return null;
		}
		char currentRoot  = front.charAt(0);
		Btree tmp = new Btree(front.charAt(0), null, null);
		String leftPart = getPart(front, middle, 1);
		String rightPart = getPart(front, middle, 0);
		tmp.setLeft(getRoot(leftPart,middle.substring(0, 1+middle.indexOf(currentRoot))));
		tmp.setLeft(getRoot(rightPart,middle.substring(middle.indexOf(currentRoot), middle.length())));
		return tmp;
	}
	
	static String getPart(String front,String middle,int flag){
		char current = front.charAt(0);
		int index = middle.indexOf(current);
		int tmpIndex = 0;
		for(char i: front.toCharArray()){
			if(middle.indexOf(i)>index){
				tmpIndex =front.indexOf(i);
				break;
			}
		}
		if(tmpIndex == 0)return "";
		return flag>0 ? front.substring(1, tmpIndex) :front.substring(tmpIndex,front.length()) ;
	}
	
	static class Btree{
		private char data;
		private Btree left;
		private Btree right;
		public Btree(char data, Btree left, Btree right) {
			super();
			this.data = data;
			this.left = left;
			this.right = right;
		}
		public void setLeft(Btree left) {
			this.left = left;
		}
		public void setRight(Btree right) {
			this.right = right;
		}
		
	}

}
