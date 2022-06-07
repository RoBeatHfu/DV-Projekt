
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
	 * doubles the value of x and set y to zero
	 * @param x
	 * @param y
	 */
	public void fusion(int x, int y) {
		field[y] = 0;
		field[x] = field[x] * 2;
	}
	
	
	/**
	 * skips all zeroes in one direction
	 * @param direction 't' 'b' 'l' 'r'
	 */
	public void moveUp(char direction) {
		switch (direction) {
		case 't':
			break;
		case 'b':
			break;
		case 'l':
			break;
		case 'r':
			break;
		}
	}
	
	/**
	 * checks whether two fields are fusionable
	 * @param x
	 * @param y
	 * @return
	 */
	public boolean isFusionable(int x, int y) {
		if(getValue(x) == getValue(y)) {
			return true;
		} else {
			return false;
		}
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
	 * @return index
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
		if(getValue(fieldIndex) == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * returns the value of a field
	 * @param feldIndex
	 * @return the value
	 */
	public int getValue(int fieldIndex) {
		int wert = field[fieldIndex]; 						
		return wert;
	}
	
	/**
	 * chooses between 2 and 4
	 * @return 2 or 4
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
