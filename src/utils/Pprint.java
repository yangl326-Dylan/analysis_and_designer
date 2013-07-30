package utils;

public class Pprint {
	public static void parray(int[] obj) {
		for(int i : obj){
			System.out.print(""+String.valueOf(i));
		}
		System.out.print("\n");
	}
	
	public static void p(String str_) {
		System.out.print(str_+"\n");
	}

}
