import java.nio.file.Files;

public class Account {
    /**
     * 
     * Anmeldung: Neuen Account erstellen oder anmelden?
     *  Name und Passwort abfragen 
     * 
     * if(anmelden==true) {
     *      player.anmelden(Name,Passwort)
     * }
     * if(register==true) {
     * }
     * 
     *  */
        String username = "Moritz";

        public void registrieren(username,passwort) {
            String filename = player.txt;
            Files.writeString(Path.of(player.txt), username);

        }

}
