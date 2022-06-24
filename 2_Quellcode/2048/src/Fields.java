
public class Fields {

	int [] field = new int [16];					//Array contains the values of the fields
	int score = 0;
	int fusions = 0;
	boolean isFusible = true;
	
	public Fields() {
		clearFields();
		fillFieldAfterMove();
		fillFieldAfterMove();
		System.out.println("This is your field");
		System.out.println();
		printFields();
	}
	
	/**
	 * pushes fields to an edge and fusionate two fields with same values together in the opposite direction
	 * after fusion, it is pushed towards the edge again. 
	 * Fills a random free field with 2 or 4 
	 * @param direction
	 */
	public void fusion(char direction) {
		moveUp(direction);
		switch (direction) {
		case 't':
			for(int k = 0; k < 4; k++) {
				isFusible = true;
				fusions = 0;
				for(int j = 0; j < 4; j++) {
					if(isFusible && fusions < 2) {
						for(int i = 0+k; i < 12+k; i = i+4) {
							if(isFusionable(i, i+4) && isFusible) {
								setValue(i, getValue(i)*2);
								setValue(i+4, 0);
								fusions++;
								if(fusions == 2) {
									isFusible = false;
								}					
							}
						}
					}
				}
			}
			break;
		case 'b':
			for(int k = 0; k < 4; k++) {
				isFusible = true;
				fusions = 0;
				for(int j = 0; j < 3; j++) {
					if(isFusible && fusions < 2) {
						for(int i = 12+k; i > 0+k; i = i-4) {
							if(isFusionable(i, i-4) && isFusible) {
								setValue(i, getValue(i)*2);
								setValue(i-4, 0);
								fusions++;
								if(fusions == 2) {
									isFusible = false;
								}
							}
						}
					}				
				}
			}
			break;
		case 'l':
			for(int k = 0; k < 15; k = k+4) {
				isFusible = true;
				fusions = 0;
				for(int j = 0; j < 3; j++) {
					if(isFusible && fusions < 2) {
						for(int i = 0+k; i < 3+k; i++) {
							if(isFusionable(i, i+1) && isFusible) {
								setValue(i, getValue(i)*2);
								setValue(i+1, 0);
								fusions++;
								if(fusions == 2) {
									isFusible = false;
								}
							}
						}
					}				
				}
			}
			break;
		case 'r':
			for(int k = 0; k < 15; k = k+4) {
				isFusible = true;
				fusions = 0;
				for(int j = 0; j < 3; j++) {
					if(isFusible && fusions < 2) {
						for(int i = 3+k; i > 0; i--) {
							if(isFusionable(i, i-1) && isFusible) {
								setValue(i, getValue(i)*2);
								setValue(i-1, 0);
								fusions++;
								if(fusions == 2) {
								isFusible = false;
								}
							}
						}
					}		
				}
			}
			break;
		}
		moveUp(direction);
		fillFieldAfterMove();
		printFields();
	}
		
	/**
	 * moves all fields to the edge in one direction 
	 * and skips all zeroes in this direction
	 * @param direction 't' 'b' 'l' 'r'
	 * @return whether it was possible to move
	 */
	private boolean moveUp(char direction) {
		boolean hasMoved = false;
		switch (direction) {
		case 't':
			for(int k = 0; k < 4; k++) {
				for(int j = 0; j < 4; j++) {
					for(int i = 0+k; i < 12+k; i = i+4) {
						if(getValue(i) == 0) {
							field[i] = field[i+4];
							field[i+4] = 0;
							hasMoved = true;
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
							hasMoved = true;
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
							hasMoved = true;
						}
					}
				}
			}
			break;
		case 'r':
			for(int k = 0; k < 15; k = k+4) {
				for(int j = 0; j < 3; j++) {
					for(int i = 3+k; i > k; i--) {
						if(getValue(i) == 0) {
							field[i] = field[i-1];
							field[i-1] = 0;
							hasMoved = true;
						}
					}
				}
			}
			break;
		}
		return hasMoved;
	}
	
	/**
	 * checks whether two fields have the same value and are fusionable
	 * @param x
	 * @param y
	 * @return
	 */
	private boolean isFusionable(int x, int y) {
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
	private void fillFieldAfterMove() {
		field[getIndexRandomFreeField()] =  generateNr();
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
	 * calculates the sum of all fields
	 * @return score
	 */
	public int getScore() {
		int score = 0;
		for(int i = 0; i < 16; i++) {
			score = score + getValue(i);
		}
		System.out.println("Score: " + score);
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
	 * prints the value of every field in the console
	 */
	public void printFields() {
		for(int i = 0; i < 16; i = i + 4) {
			System.out.println(field[i]+"\t"+field[i+1]+"\t"+field[i+2]+"\t"+field[i+3]);
		}
		System.out.println();
	}
	
	private boolean isGameOver() {
		boolean gameOver = true;
		for(int i = 0; i < 16; i++) {
			if(getValue(i) == 0) {
				gameOver = false;
			}
		}
		return gameOver;
	}
}