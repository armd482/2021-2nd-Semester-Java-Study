package Section_1;

public class PlayerCharacter extends Character {
	
	public PlayerCharacter(String name, int hp, int atk) {
		super(name, hp, atk); //부모의 기능을 사용하겠다 정의
	}
	
	public void heal() {
		hp += 20;
		System.out.println(name + " Healing");
		System.out.println(name + " HP: " + hp);
	
	}

}
