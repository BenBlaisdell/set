import java.awt.AWTEvent;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Set extends JPanel{

	static Deck deck;
	static MenuButton[] buttons;
	
	public static void main(String[] args) {	
		buttons = new MenuButton[4];
		buttons[0] = new MenuButton("EASY", 45, 342, true, true);
		buttons[1] = new MenuButton("HARD", 145, 342, false, false);
		buttons[2] = new MenuButton("ONE DECK", 260, 342, true, false);
		buttons[3] = new MenuButton("MANY DECKS", 360, 342, false, true);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container pane = frame.getContentPane();
		
		for (int i = 0; i < 4; i++){
			drawImg(buttons[i].getImg(), buttons[i].x, buttons[i].y);
		}
		
		frame.add(window);
		
		frame.setVisible(true);
		deck = new Deck();
		
		while(true)
		{
			int mousex = MouseInfo.getPointerInfo().getLocation().x;
			int mousey = MouseInfo.getPointerInfo().getLocation().y;
			if (mousey >= 342 && mousey <= 427)
			{
				for (int i = 0; i < 4; i++)
				{
					if (mousex >= buttons[i].x && mousex <= buttons[i].x + 85)
					{
						System.out.println("fg");
					}
				}
			}
		}
	}
	public void paint(Graphics g){
		
	}
	public void update(Graphics g)
	{
		paint(g);
	}
	public static void clicked(int x, int y)
	{
		if (y >= 342 && y <= 427)
		{
			for (int i = 0; i < 4; i++)
			{
				if (x >= buttons[i].x && x <= buttons[i].x + 85)
				{
					buttons[i].click();
				}
			}
		}
	}
	
	 public static void drawImg(BufferedImage img, int x, int y)
	 {
		 windowimg.drawImage(img, x, y, null);
	 }

}
