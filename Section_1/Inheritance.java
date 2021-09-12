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
	 * B 클래스에서 A 클래스를 상속 받음
	 * 
	 */
	

	public static void main(String[] args) {
		PlayerCharacter player = new PlayerCharacter("Player_name", 70, 12);
		EnemyCharacter enemy = new EnemyCharacter("Enemy_name", 80, 5);
		
		while (player.isLive() && enemy.isLive()) {
			player.attack(enemy);
			if (!enemy.isLive()) //적이 죽으면 적이 공격을 못하게 반복문 실행 중지
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
