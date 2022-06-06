
public class Steuerung {

	static int [] field = new int [16];					//Array contains the values of the fields
	int score = 0;
	
	/**
	 * chooses a random field and checks if it is free
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
	
	/**returns the value of a field
	 * @param feldIndex
	 * @return
	 */
	public int getValue(int fieldIndex) {
		int wert = field[fieldIndex]; 						
		return wert;
	}
	
	/**
	 * returns 2 or 4 or the next move
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
		
	public static void main(String args[]) {				//Zum Testen während dem entwickeln
		for(int i = 0; i <16; i++) {
			field[i] = 0;
		}
		for(int i = 0; i <10; i++) {
			field[getIndexRandomFreeField()] = generateNr();
		}
		for(int i = 0; i <16; i++) {
			System.out.println(field[i]);
		}
	}
}
