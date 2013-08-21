package test;


public abstract  class TestAbstract {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final StringBuffer aBuffer = new StringBuffer().append("123");
		aBuffer.append("123");
		System.out.println(aBuffer+"");
	}
	abstract void getSomeThing();
	private String aString = "";
	public void get(){
		class a{
			public void get(){
				aString = "";
			}
		}
	};
	
	class haha{
		public void name() {
			aString ="a";
		}
	}

}
