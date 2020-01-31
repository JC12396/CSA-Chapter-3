package Card;

import java.util.Random;

public class Card 
{
	public static void main(String[] args) 
	{		
		Random r = new Random();
		CardInfo suit1 = new CardInfo();
		CardInfo num1 = new CardInfo();
		
		
		char [] suit = {'S', 'D', 'H', 'C'};

		for(int i = 0; i < 2; i++)
		{
		int answer1 = r.nextInt(13) + 1;
		char s = suit[((int) (Math.random() * 4))];
		
		num1.setNum(answer1);
		suit1.setForm(s);
		
		
		System.out.println(num1.getNum() + " of " + suit1.getForm());
		}
	}
}
