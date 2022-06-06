
public class Steuerung {

	int [] felder = new int [16];							//Array für die Werte der Felder
	
	/**
	 * chooses a random field and checks if it is free
	 * @return
	 */
	public static int getIndexZufallsfeld(){
		int z = 0;
		do {
			z = (int) (Math.random() * 20);
		} while ( z < 0 || z > 15 || feldFrei(z) == false);
		return z;
	}
	
	/**
	 * checks whether a field is free
	 * @param feldIndex
	 * @return
	 */
	public static boolean feldFrei(int feldIndex) {
		for(int i = 1; i < 17; i++) {
			
		}
		return true;										//To-Do
	}
	
	/**returns the value of a field
	 * @param feldIndex
	 * @return
	 */
	public int getWert(int feldIndex) {
		int wert = felder[feldIndex]; 						
		return wert;
	}
	
	
	public static void main(String args[]) {				//Zum Testen während dem entwickeln
		for(int i = 0; i<100; i++) {
			int a = getIndexZufallsfeld();
			System.out.println(a);
		}
	}
}
