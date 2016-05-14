
import java.awt.Component;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;



@SuppressWarnings("serial")
public class Window extends Component{
	String file = "";
	BufferedImage img;
	
	public void paint(Graphics g){
		g.drawImage(img, 0, 0, null);
	}

	public Window(String file) {
		this.file = file;
		
		try{
			img = ImageIO.read(new File(file));
		}
		catch (IOException e) {System.out.println("Oops");}
	}
	
	public BufferedImage getImg() {
		return img;
	}
	
}
