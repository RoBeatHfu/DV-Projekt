public class Main {
	
	public static void main(String args[]) {
		// *********************************************//generate Fields
		Fields fields = new Fields();
		
		// *********************************************//generate GUI
		GUI_Menue guiM1 = new GUI_Menue();
		guiM1.fieldsMenue = fields;
		guiM1.setVisible(true);

		// *********************************************
		//Key_Control.main(f1);
	}
}
