package Section_0;

public class Method {

	public static void main(String[] args) {
		int plusResult = plus(1,2);
		System.out.println(plusResult); //3
		
		printTwice("OO-AH");
		

	}
	
	// void -> return �ʿ� ����
	static void printTwice(String text) {
		System.out.println(text);
		System.out.println(text);
	}
	
	static int plus(int x, int y) {
		return x+y;
	}

}
