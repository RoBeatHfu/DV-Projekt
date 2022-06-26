import java.io.*;

public class Account {

	/*
	 * Anmeldung: Neuen Account erstellen oder anmelden? Name und Passwort abfragen
	 * 
	 * if(anmelden==true) { player.anmelden(Name,Passwort) } if(register==true) {
	 */

	private static void printTetx(String text) {
		PrintWriter pWriter = null;
		String src = "player.txt";
		try {
			pWriter = new PrintWriter(new FileWriter(src));
			pWriter.println(text);
			System.out.println("fertig");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	

	public static void main(String args[]) {
		printTetx("HALLOOOO");

	}

}
