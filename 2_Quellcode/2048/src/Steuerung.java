
public class Steuerung {

	int [] felder = new int [16];							//Array contains the values of the fields
	
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
	public static boolean fieldFree(int feldIndex) {
		for(int i = 1; i < 17; i++) {
			
		}
		return true;										//To-Do
	}
	
	/**returns the value of a field
	 * @param feldIndex
	 * @return
	 */
	public int getValue(int feldIndex) {
		int wert = felder[feldIndex]; 						
		return wert;
	}
	
	
	public static void main(String args[]) {				//Zum Testen während dem entwickeln
		for(int i = 0; i<100; i++) {
			int a = getIndexRandomFreeField();
			System.out.println(a);
		}
	}
}
