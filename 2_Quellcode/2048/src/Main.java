public class Main {

	public static void main(String args[]) {
		//*********************************************//generate GUI
		GUI_Menue g1 = new GUI_Menue();
		g1.setVisible(true);
		//*********************************************//generate Fields
		Fields f1 = new Fields();
		//*********************************************
		
		
		
		for(int i = 0; i < 8; i++) {
			f1.fillFieldAfterMove();
		}
		
		f1.printFields();
		f1.fusion('b');
		f1.fusion('l');
		f1.getScore();
	}
}
