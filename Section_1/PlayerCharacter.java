package Section_1;

public class PlayerCharacter extends Character {
	
	public PlayerCharacter(String name, int hp, int atk) {
		super(name, hp, atk); //�θ��� ����� ����ϰڴ� ����
	}
	
	public void heal() {
		hp += 20;
		System.out.println(name + " Healing");
		System.out.println(name + " HP: " + hp);
	
	}

}
