package Section_1;

public class Implement {
	
	/*
	 * 다중 상속은 안됨 -> 구현으로 가능
	 * 상속: 정의부여  <-> 구현: 역할부여 / 변수 상속 안받음
	 */

	public static void main(String[] args) {
		
		Animal dog = new Dog("bodul");
		Animal cat = new Dog("nyong");
		Animal wolf = new Dog("woooo");
		
		dog.Cry();
		cat.Cry();
		wolf.Cry(); //상속
		
		Pet pet1 = new Cat("nyoong");
		Pet pet2 = new Dog("boduk");
		
		pet1.FoodCall();
		pet2.FoodCall(); //구현
		
		((Cat)pet1).Cry();  //형변화를 통해서 class 구현 가능
	}

}
