package Section_0;

public class If {

	public static void main(String[] args) {
		System.out.println(isZZaksu(4));
		
		boolean haveCar = true;
		boolean haveHouse = false;
		boolean haveJob = false;
		boolean isGoldSpoon = false;
		int asset = 600000;
		
		
		int grade = myGrade(haveCar,haveHouse,haveJob,isGoldSpoon,asset);
		System.out.println("Your grade is: " + grade);

	}
	
	static boolean isZZaksu (int x) {
		int y = x%2;
		if(y == 0) {
			return true;
		}
		else return false;
	}
	
	static int myGrade(boolean haveCar, boolean haveHouse, boolean haveJob, boolean isGoldSpoon, int asset) {
		if(isGoldSpoon) {
			return 1;
		}
		else if(haveHouse) {
			return 2;
		}
		else if(haveCar) {
			return 3;
		}
		else if(haveJob) {
			return 4;
		}
		
		else {
			if( asset > 1000000) {
				return 5;
			}
			else if(600000 <= asset && asset < 1000000) {
				return 6;
			}
			else if(300000 <= asset && asset < 600000) {
				return 7;
			}
			else if(100000 <= asset && asset < 300000) {
				return 8;
			}
			
			return 9;
		}
		
	}

}
