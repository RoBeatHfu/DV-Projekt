public class Main {

	public static void updateFields(Fields f, GUI_Spiel s) {
		for(int i = 0; i <= 15; i++) {
			s.setValue(i,f.getValue(i));
		}	
	}
	
	
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
