import java.awt.event.MouseEvent;


public class Mouse implements java.awt.event.MouseListener{
	public Mouse(){
		Set.frame.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		Set.clicked(arg0.getX(), arg0.getY());
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
