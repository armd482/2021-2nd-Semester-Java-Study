package Section_1;

public class Class {
	
	static class Player{
		String name;
		int hp;
		int atk;
		
		public Player(String name, int hp, int atk) {
			this.name = name;
			this.hp = hp;
			this.atk = atk;  //hp, name, atk�� ��ġ�Ƿ� ������
		}
		
		public void attack(Enemy enemy) {
			System.out.println("Player Attack!");
			enemy.hp -= this.atk;
			System.out.println("Player HP: " + enemy.hp);
		}
		
		public boolean isLive() {
			if (hp <= 0) {
				return false;
			}
			else {
				return true;
			}
		}
	}
	
	static class Enemy{
		String name;
		int hp;
		int atk;
		
		public Enemy(String name, int hp, int atk) {
			this.name = name;
			this.hp = hp;
			this.atk = atk;
		}
		
		public void attack(Player player) {
			System.out.println("Enemy Attack!");
			player.hp -= this.atk;
			System.out.println("Player HP: " + player.hp);
		}
		
		public boolean isLive() {
			if (hp <= 0) {
				return false;
			}
			else {
				return true;
			}
		}
	}

	public static void main(String[] args) {
		Player player = new Player("Player_name", 100, 12);
		Enemy enemy = new Enemy("Enemy_name", 80, 5);
		
		while (player.isLive() && enemy.isLive()) {
			player.attack(enemy);
			if (!enemy.isLive()) //���� ������ ���� ������ ���ϰ� �ݺ��� ���� ����
				break;
			enemy.attack(player);
		}
		
		if (player.isLive()) {
			System.out.println("Player win!");
		}
		
		if (enemy.isLive()) {
			System.out.println("Enemy win!");
		}

	}

}
