
public class Card {

	int num; // 0=1 1=2 2=3
	int shape; // 0=diamond 1=oval 2=squiggle
	int color; // 0=red 1=purple 2=green
	int fill; // 0=solid 1=shaded 2=clear
	
	public Card(int num, int shape, int color, int fill){
		this.num = num;
		this.shape = shape;
		this.color = color;
		this.fill = fill;
	}

}
