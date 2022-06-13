public class Main {

	public static void main(String args[]) {
				// *********************************************//generate Fields
		Fields f1 = new Fields();
		
		// *********************************************//generate GUI
		GUI_Menue g1 = new GUI_Menue();
		g1.tt = f1;
		g1.setVisible(true);

		// *********************************************
		f1.printFields();
		//Key_Control.main(f1);
	}
}
