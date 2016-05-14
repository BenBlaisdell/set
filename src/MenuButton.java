
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

@SuppressWarnings("serial")
public class MenuButton extends Component{

	boolean selected = true;
	int x=0, y=0;
	BufferedImage bgimg;
	BufferedImage img;
	String text;
	boolean easy;
	
	static BufferedImage selectedImg;
	static BufferedImage unselectedImg;

	public MenuButton(String text, int x, int y, boolean easy, boolean selected) {
		this.text = text;
		this.selected = selected;
		this.x = x;
		this.y = y;
		this.easy = easy;
		
		try { selectedImg = ImageIO.read(new File("images/selec.png")); }
		catch (IOException e) {}
		
		try { unselectedImg = ImageIO.read(new File("images/unselec.png")); }
		catch (IOException e) {}
		

		
		if (selected)
		{
			bgimg = selectedImg;
		}
		else
		{
			bgimg = unselectedImg;
		}

		Font font = new Font("Mangal", Font.BOLD, 19);
		Graphics2D bgimgcanvas = bgimg.createGraphics();
		bgimgcanvas.setFont(font);
		
		if (selected)
		{
			if (easy)
				bgimgcanvas.setPaint(new Color(114, 198, 58));
			else
				bgimgcanvas.setPaint(new Color(202, 65, 66));
		}
		else
		{
			bgimgcanvas.setPaint(Color.white);
		}
		
		bgimgcanvas.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
		if (text.indexOf(" ") == -1) {
			bgimgcanvas.drawString(text, (42 - (bgimgcanvas.getFontMetrics().stringWidth(text) / 2)), 49);
		}
		else {
			
			bgimgcanvas.drawString(text.substring(0, text.indexOf(" ")), 42 - (bgimgcanvas.getFontMetrics().stringWidth(text.substring(0, text.indexOf(" "))) / 2), 37);
			bgimgcanvas.drawString(text.substring(text.indexOf(" ") + 1), 42 - (bgimgcanvas.getFontMetrics().stringWidth(text.substring(text.indexOf(" ") + 1)) / 2), 61);
		}
		
		img = bgimg;
	}
	
	public void click()
	{
		
	}
	
	public void hover() {
		if (!selected)
		{
			bgimg = selectedImg;
		}
	}
	
	public void paintButton(){
		Set.drawImg(img, x, y);
	}
	
	public BufferedImage getImg() {
		return img;
	}
	
}
