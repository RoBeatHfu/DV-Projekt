
public class Steuerung {

	static int [] felder = new int [16];					//Array contains the values of the fields
	
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
		if(felder[fieldIndex] == 0) {
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
		int wert = felder[fieldIndex]; 						
		return wert;
	}
	
	
	public static void main(String args[]) {				//Zum Testen während dem entwickeln
		
	}
}
