package Section_1;

public class Implement {
	
	/*
	 * ���� ����� �ȵ� -> �������� ����
	 * ���: ���Ǻο�  <-> ����: ���Һο� / ���� ��� �ȹ���
	 */

	public static void main(String[] args) {
		
		Animal dog = new Dog("bodul");
		Animal cat = new Dog("nyong");
		Animal wolf = new Dog("woooo");
		
		dog.Cry();
		cat.Cry();
		wolf.Cry(); //���
		
		Pet pet1 = new Cat("nyoong");
		Pet pet2 = new Dog("boduk");
		
		pet1.FoodCall();
		pet2.FoodCall(); //����
		
		((Cat)pet1).Cry();  //����ȭ�� ���ؼ� class ���� ����
	}

}
