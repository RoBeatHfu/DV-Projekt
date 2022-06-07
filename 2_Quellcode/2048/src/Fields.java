
public class Fields {

	int [] field = new int [16];					//Array contains the values of the fields
	int score = 0;
	
	public Fields() {
		clearFields();
		System.out.println("This is your empty field");
		System.out.println();
		printFields();
	}
	
	
	public void fusion(char direction) {

	}
	
	
	/**
	 * moves all fields to the edge in one direction 
	 * and skips all zeroes in this direction
	 * @param direction 't' 'b' 'l' 'r'
	 */
	public void moveUp(char direction) {
		switch (direction) {
		case 't':
			for(int k = 0; k < 15; k = k+4) {
				for(int j = 0; j < 3; j++) {
					for(int i = 0; i < 4+k; i = i+4) {
						if(getValue(i) == 0) {
							field[i] = field[i-4];
							field[i-4] = 0;
						}
					}
				}
			}
			break;
		case 'b':
			for(int k = 0; k < 4; k++) {
				for(int j = 0; j < 3; j++) {
					for(int i = 12+k; i > 0+k; i = i-4) {
						if(getValue(i) == 0) {
							field[i] = field[i-4];
							field[i-4] = 0;
						}
					}
				}
			}
			break;
		case 'l':
			for(int k = 0; k < 15; k = k+4) {
				for(int j = 0; j < 3; j++) {
					for(int i = 0+k; i < 3+k; i++) {
						if(getValue(i) == 0 && i % 4 != 3) {
							field[i] = field[i+1];
							field[i+1] = 0;
						}
					}
				}
			}
			break;
		case 'r':
			for(int k = 0; k < 15; k = k+4) {
				for(int j = 0; j < 3; j++) {
					for(int i = 3+k; i > 0; i--) {
						if(getValue(i) == 0) {
							field[i] = field[i-1];
							field[i-1] = 0;
						}
					}
				}
			}
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
	
	public int getScore() {
		int score = 0;
		for(int i = 0; i < 16; i++) {
			score = score + getValue(i);
		}
		return score;
	}
	
	/**
	 * returns the value of a field
	 * @param feldIndex
	 * @return value
	 */
	public int getValue(int fieldIndex) {
		int wert = field[fieldIndex]; 						
		return wert;
	}
	
	/**
	 * sets a value into a field
	 * @param fieldIndex
	 * @param value
	 */
	private void setValue(int fieldIndex, int value) {
		field[fieldIndex] = value;
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
		System.out.println();
	}
}
