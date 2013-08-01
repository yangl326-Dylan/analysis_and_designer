package other;

public class BuildBtree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 前序ABDGCEFH，中序DGBAECHF
		/*
		 * A B C D E F G H
		 */
		String front = "ABDGCEFH";
		String middle = "DGBAECHF";
		// String front ="BDG";
		// String middle ="DGB";
		Btree root = getRoot(front, middle);
		System.out.print(root.data);
	}

	/**
	 * 根据前序和中序遍历构造这棵树
	 * recursion create one node
	 * 
	 * @param front
	 *            string queue
	 * @param middle
	 *            string queue
	 * @return node
	 */
	static Btree getRoot(String front, String middle) {
		if (front.length() == 0 || middle.length() == 0) {
			return null;
		}
		char currentRoot = front.charAt(0);
		Btree tmp = new Btree(currentRoot, null, null);
		String leftPart = getPart(front, middle, 1);
		String rightPart = getPart(front, middle, 0);
//		System.out.print(tmp.data);
		tmp.setLeft(getRoot(leftPart,
				middle.substring(0, middle.indexOf(currentRoot))));
		tmp.setRight(getRoot(
				rightPart,
				middle.substring(middle.indexOf(currentRoot) + 1,
						middle.length())));
		return tmp;
	}

	static String getPart(String front, String middle, int flag) {
		char current = front.charAt(0);
		int index = middle.indexOf(current);
		int tmpIndex = 0;
		for (char i : front.toCharArray()) {
			if (middle.indexOf(i) > index) {
				tmpIndex = front.indexOf(i);
				break;
			}
		}
		if (tmpIndex == 0) // 此边界条件，例如 BDG DGB 情况一直到字符串尾部了
			return flag > 0 ? front.substring(1, front.length()) : "";
		// System.out.println(tmpIndex);
		else
			return flag > 0 ? front.substring(1, tmpIndex) : front.substring(
					tmpIndex, front.length());
	}

	static class Btree {
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
