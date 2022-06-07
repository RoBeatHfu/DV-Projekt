
public class Fields {

	int [] field = new int [16];					//Array contains the values of the fields
	int score = 0;
	
	public Fields() {
		clearFields();
		System.out.println("This is your empty field");
		System.out.println();
		printFields();
	}
	
	/**
	 * fills a random free field with 2 or 4
	 * use this method after any move
	 * increases the score by one 
	 */
	public void fillFieldAfterMove() {
		field[getIndexRandomFreeField()] =  generateNr();
		score++;
	}
	
	/**
	 * chooses a random free field
	 * @return
	 */
	private int getIndexRandomFreeField(){
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
	private boolean fieldFree(int fieldIndex) {
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
	private int getValue(int fieldIndex) {
		int wert = field[fieldIndex]; 						
		return wert;
	}
	
	/**
	 * returns 2 or 4 for the next move
	 * @return
	 */
	private int generateNr() {
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
	private void clearFields() {
		for(int i = 0; i <16; i++) {
			field[i] = 0;
		}
	}
	
	/**
	 * gives the value of every field
	 */
	public void printFields() {
		for(int i = 0; i < 16; i = i + 4) {
			System.out.println(field[i]+"\t"+field[i+1]+"\t"+field[i+2]+"\t"+field[i+3]);
		}
	}
}
