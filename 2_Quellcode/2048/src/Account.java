import java.io.*;

public class Account {

	/*
	 * Anmeldung: Neuen Account erstellen oder anmelden? Name und Passwort abfragen
	 * 
	 * if(anmelden==true) { player.anmelden(Name,Passwort) } if(register==true) {
	 */

	private static void printTetx(String text) {
		try {
			PrintWriter list = new PrintWriter(new FileOutputStream("player.txt"));
			list.println(text);
			list.close(); // wichtig !!
			}
			catch (IOException ex) {
			System.out.println("IOException!");
			}
	}

	

	public static void main(String args[]) {
		printTetx("Huhu");

	}

}
