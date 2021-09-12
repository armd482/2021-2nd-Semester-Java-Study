package Section_1;

import Section_1.Class.Enemy;
import Section_1.Class.Player;

public class Inheritance {
	
	/* class A {
	 * String 123;
	 * int a;
	 * }
	 * 
	 * class B extends A {
	 * void do1
	 * void do2
	 * }
	 * 
	 * B Ŭ�������� A Ŭ������ ��� ����
	 * 
	 */
	

	public static void main(String[] args) {
		PlayerCharacter player = new PlayerCharacter("Player_name", 70, 12);
		EnemyCharacter enemy = new EnemyCharacter("Enemy_name", 80, 5);
		
		while (player.isLive() && enemy.isLive()) {
			player.attack(enemy);
			if (!enemy.isLive()) //���� ������ ���� ������ ���ϰ� �ݺ��� ���� ����
				break;
			enemy.attack(player);
			System.out.println("__________________________________________");
		}
		
		if (player.isLive()) {
			System.out.println("Player win!");
		}
		
		if (enemy.isLive()) {
			System.out.println("Enemy win!");
		}

	}

}
