package Section_0;
import java.util.Random;

public class Array_Loop {

	public static void main(String[] args) {
		
		int money = 10000;
		Random random = new Random();
		
		
		while (money > 0) {
			//buy lotto
			money -=1000;
			int number = random.nextInt(99);
			int lottoMoney = buyLotto(number);
			System.out.println("My Number is: " + number + " /Lotto: " + lottoMoney);
			money += lottoMoney;
			System.out.println("My Money is: " + money );
		}
		
		
		System.out.println("Lose");
		
		
		
		
	}
	
	static int buyLotto(int number) {
		int[] lotto = new int[100];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = 0;
		}
		
		
		lotto[2] = 1000;
		lotto[77] = 100;
		lotto[99] = 500;
		
		return lotto[number];
		
	}

}
