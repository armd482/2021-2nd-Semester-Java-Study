package Section_1;

public class EnemyCharacter extends Character {
	
	public EnemyCharacter(String name, int hp, int atk) {
		super(name, hp, atk); //�θ��� ����� ����ϰڴ� ����
	}
	
	@Override //��� ��ӹ��� �޼ҵ����� ǥ��. ��� ��� ����
	public void attack(Character enemy) {
		
		if(hp<=20) {
			System.out.println("Enemy is Angry!");
			this.atk +=15;
		}
		super.attack(enemy);
		
		PlayerCharacter player = (PlayerCharacter)enemy; //enemy���� player�� �Է� ��ȯ -> enemy hp�� �ƴ� player hp�� ȸ���ǰԲ�
		
		if (player.hp<=30) {
			player.heal();
		}
		
	}

}
