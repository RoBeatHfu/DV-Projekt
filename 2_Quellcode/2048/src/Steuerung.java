
public class Steuerung {

	static int [] field = new int [16];					//Array contains the values of the fields
	static int score = 0;
	
	
	
	/**
	 * fills a random free field with 2 or 4
	 * use this method after any move
	 * increases the score by one 
	 */
	public static void fillFieldAfterMove() {
		field[getIndexRandomFreeField()] =  generateNr();
		score++;
	}
	
	/**
	 * chooses a random free field
	 * @return
	 */
	public static int getIndexRandomFreeField(){
		int z = 0;
		do {
			z = (int) (Math.random() * 20);
		} while ( z < 0 || z > 15 || fieldFree(z) == false);
		return z;
	}
	
	/**
	 * checks whether a field is free
	 * @param feldIndex
	 * @return
	 */
	public static boolean fieldFree(int fieldIndex) {
		if(field[fieldIndex] == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * returns the value of a field
	 * @param feldIndex
	 * @return
	 */
	public int getValue(int fieldIndex) {
		int wert = field[fieldIndex]; 						
		return wert;
	}
	
	/**
	 * returns 2 or 4 for the next move
	 * @return
	 */
	public static int generateNr() {
		int nr= (int) (Math.random()*10);
		if(nr == 0) {
			return 4;
		} else {
			return 2;
		}
	}
	
	
	/**
	 * assigns the value 0 to each field
	 */
	public static void clearFields() {
		for(int i = 0; i <16; i++) {
			field[i] = 0;
		}
	}
	
	/**
	 * gives the value of every field
	 */
	public static void printFields() {
		for(int i = 0; i < 16; i = i + 4) {
			System.out.println(field[i]+"\t"+field[i+1]+"\t"+field[i+2]+"\t"+field[i+3]);
		}
	}
		
	public static void main(String args[]) {	
		
		//**************************************************//generate GUI
		GUI_Menue g1m = new GUI_Menue();					
		g1m.setVisible(true);
		//**************************************************
		
		clearFields();
		for(int i = 0; i< 10; i++) {
			fillFieldAfterMove();
		}
		printFields();
	}
}
