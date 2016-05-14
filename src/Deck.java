
public class Deck {

	Card[] cards = new Card[81];
	
	public Deck()
	{
		int count = 0;
		for (int n = 0; n < 3; n++)
		{
			for (int s = 0; s < 3; s++)
			{
				for (int c = 0; c < 3; c++)
				{
					for (int f = 0; f < 3; f++)
					{
						cards[count] = new Card(n, s, c, f);
						count++;
					}
				}
			}
		}
	}
}
