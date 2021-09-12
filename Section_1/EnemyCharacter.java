package Section_1;

public class EnemyCharacter extends Character {
	
	public EnemyCharacter(String name, int hp, int atk) {
		super(name, hp, atk); //부모의 기능을 사용하겠다 정의
	}
	
	@Override //어디서 상속받은 메소드임을 표시. 없어도 상관 없음
	public void attack(Character enemy) {
		
		if(hp<=20) {
			System.out.println("Enemy is Angry!");
			this.atk +=15;
		}
		super.attack(enemy);
		
		PlayerCharacter player = (PlayerCharacter)enemy; //enemy에서 player로 입력 변환 -> enemy hp가 아닌 player hp가 회복되게끔
		
		if (player.hp<=30) {
			player.heal();
		}
		
	}

}
