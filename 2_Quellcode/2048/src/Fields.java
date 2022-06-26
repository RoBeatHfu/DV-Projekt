
public class Fields {

	int[] field = new int[16]; // Array contains the values of the fields
	int[] oldField = new int[16]; // to check if a move was possible
	int score = 0;
	int fusions = 0;
	boolean hasMoved = false;

	public Fields() {
		System.out.println("Fields");
		clearFields();
		fillFieldAfterMove();
		fillFieldAfterMove();
		System.out.println("This is your field");
		System.out.println();
		printFields();
	}

	/**
	 * Pushes fields to an edge and fusionate two fields with same values together
	 * in the opposite direction after fusion, it is pushed towards the edge again.
	 * Fills a random free field with 2 or 4 if something was movable or fusionable
	 * 
	 * @param direction
	 */
	public void fusion(char direction) {
		hasMoved = false;
		for (int i = 0; i < 16; i++) {
			oldField[i] = field[i];
		}
		moveUp(direction);
		switch (direction) {
		case 't':
			for (int k = 0; k < 4; k++) {
				for (int i = 0 + k; i < 12 + k; i = i + 4) {
					if (isFusionable(i, i + 4)) {
						setValue(i, getValue(i) * 2);
						setValue(i + 4, 0);
					}
				}
			}
			break;
		case 'b':
			for (int k = 0; k < 4; k++) {
				for (int i = 12 + k; i > 0 + k; i = i - 4) {
					if (isFusionable(i, i - 4)) {
						setValue(i, getValue(i) * 2);
						setValue(i - 4, 0);
					}
				}
			}
			break;
		case 'l':
			for (int k = 0; k < 15; k = k + 4) {
				for (int i = 0 + k; i < 3 + k; i++) {
					if (isFusionable(i, i + 1)) {
						setValue(i, getValue(i) * 2);
						setValue(i + 1, 0);
					}
				}
			}
			break;
		case 'r':
			for (int k = 0; k < 15; k = k + 4) {
				for (int i = 3 + k; i > k; i--) {
					if (isFusionable(i, i - 1)) {
						setValue(i, getValue(i) * 2);
						setValue(i - 1, 0);
					}
				}
			}
			break;
		}
		moveUp(direction);
		for (int i = 0; i < 16; i++) {
			if (oldField[i] != field[i]) {
				hasMoved = true;
			}
		}
		if (hasMoved) {
			fillFieldAfterMove();
			printFields();
		} else {
			System.out.println("move not possible");
		}
	}

	/**
	 * moves all fields to the edge in one direction and skips all zeroes in this
	 * direction
	 * 
	 * @param direction 't' 'b' 'l' 'r'
	 * @return whether it was possible to move
	 */
	private void moveUp(char direction) {
		switch (direction) {
		case 't':
			for (int k = 0; k < 4; k++) {
				for (int j = 0; j < 4; j++) {
					for (int i = 0 + k; i < 12 + k; i = i + 4) {
						if (getValue(i) == 0) {
							field[i] = field[i + 4];
							field[i + 4] = 0;
						}
					}
				}
			}
			break;
		case 'b':
			for (int k = 0; k < 4; k++) {
				for (int j = 0; j < 3; j++) {
					for (int i = 12 + k; i > 0 + k; i = i - 4) {
						if (getValue(i) == 0) {
							field[i] = field[i - 4];
							field[i - 4] = 0;
						}
					}
				}
			}
			break;
		case 'l':
			for (int k = 0; k < 15; k = k + 4) {
				for (int j = 0; j < 3; j++) {
					for (int i = 0 + k; i < 3 + k; i++) {
						if (getValue(i) == 0 && i % 4 != 3) {
							field[i] = field[i + 1];
							field[i + 1] = 0;
						}
					}
				}
			}
			break;
		case 'r':
			for (int k = 0; k < 15; k = k + 4) {
				for (int j = 0; j < 3; j++) {
					for (int i = 3 + k; i > k; i--) {
						if (getValue(i) == 0) {
							field[i] = field[i - 1];
							field[i - 1] = 0;
						}
					}
				}
			}
			break;
		}
	}

	/**
	 * checks whether two fields have the same value and are fusionable
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	private boolean isFusionable(int x, int y) {
		if (getValue(x) == getValue(y)) {
			return true;

		} else {
			return false;
		}
	}

	/**
	 * fills a random free field with 2 or 4 use this method after any move
	 * increases the score by one
	 */
	private void fillFieldAfterMove() {
		field[getIndexRandomFreeField()] = generateNr();
	}

	/**
	 * chooses a random free field
	 * 
	 * @return index
	 */
	private int getIndexRandomFreeField() {
		int z = 0;
		do {
			z = (int) (Math.random() * 20);
		} while (z < 0 || z > 15 || fieldFree(z) == false);
		return z;
	}

	/**
	 * checks whether a field is free
	 * 
	 * @param feldIndex
	 * @return
	 */
	private boolean fieldFree(int fieldIndex) {
		if (getValue(fieldIndex) == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * calculates the sum of all fields
	 * 
	 * @return score
	 */
	public int getScore() {
		int score = 0;
		for (int i = 0; i < 16; i++) {
			score = score + getValue(i);
		}
		return score;
	}

	/**
	 * returns the value of a field
	 * 
	 * @param feldIndex
	 * @return value
	 */
	public int getValue(int fieldIndex) {
		int wert = field[fieldIndex];
		return wert;
	}

	/**
	 * sets a value into a field
	 * 
	 * @param fieldIndex
	 * @param value
	 */
	private void setValue(int fieldIndex, int value) {
		field[fieldIndex] = value;
	}

	/**
	 * chooses between 2 and 4
	 * 
	 * @return 2 or 4
	 */
	private int generateNr() {
		int nr = (int) (Math.random() * 10);
		if (nr == 0) {
			return 4;
		} else {
			return 2;
		}
	}

	/**
	 * assigns the value 0 to each field
	 */
	private void clearFields() {
		for (int i = 0; i < 16; i++) {
			field[i] = 0;
		}
	}

	/**
	 * prints the value of every field in the console
	 */
	public void printFields() {
		for (int i = 0; i < 16; i = i + 4) {
			System.out.println(field[i] + "\t" + field[i + 1] + "\t" + field[i + 2] + "\t" + field[i + 3]);
		}
		System.out.println();
	}

	/**
	 * Checks whether the game is over by first searching for a free field.
	 * If that was not successful, the method checks whether another move is possible.
	 * @return true or false
	 */
	public boolean isGameOver() {
		for (int i = 0; i < 16; i++) {				//field free?
			if (getValue(i) == 0) {
				return false;
			}
		}
		for (int k = 0; k < 4; k++) {				//possible fusion in vertical direction?
			for (int i = 0 + k; i < 12 + k; i = i + 4) {
				if (isFusionable(i, i + 4)) {
					return false;
				}
			}
		}
		for (int k = 0; k < 15; k = k + 4) {		//possible fusion in horizontal direction?
			for (int i = 0 + k; i < 3 + k; i++) {
				if (isFusionable(i, i + 1)) {
					return false;
				}
			}
		}		
		return true;
	}
	
	/**
	 * Put the value of each of the 16 fields in one String
	 * @return String with every 16 values, seperated by a space
	 */
	public String toString() {
		String allFields = "";
		for(int i = 0; i < 16; i++) {
			allFields = allFields + field[i] + " ";
		}
		System.out.println("allFields: " + allFields);
		return allFields;
	}
}