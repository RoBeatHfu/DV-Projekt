
public class Main {

	public static void main(String args[]) {
		//*********************************************//generate GUI
		GUI_Menue g1m = new GUI_Menue();
		g1m.setVisible(true);
		//*********************************************//generate Fields
		Fields f1 = new Fields();
		for(int i = 0; i < 5; i++) {
			f1.fillFieldAfterMove();
		}
		f1.printFields();
		f1.moveUp('r');
		f1.printFields();
	}
}
