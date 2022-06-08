import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Key_Control implements KeyListener {

	

	// Überschreibt die Tastatureingaben Verarbeitung
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			System.out.println("Moving Right");
			tt.fusion('r');
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			System.out.println("Moving Left");
			tt.fusion('l');
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			System.out.println("Moving Down");
			tt.fusion('b');
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			System.out.println("Moving Up");
			tt.fusion('t');
		}
		System.out.println();
        
	}

	// Die Methode muss auch aufgeführt sein
	@Override
	public void keyReleased(KeyEvent e) {
	}

	// Die Methode muss auch aufgeführt sein
	@Override
	public void keyTyped(KeyEvent e) {
	}

	private static  Fields tt;
	public static void main(Fields obj) {
		tt = obj;
		// Setting the frame and labels
		Frame f = new Frame("Demo");
		f.setLayout(new FlowLayout());
		f.setSize(200, 200);
		Label l = new Label();
		l.setText("This is a Game");
		f.add(l);
		f.setVisible(true);

		//keyListerner wird Aktiviert
		Key_Control k = new Key_Control();
		f.addKeyListener(k);


	}
}