import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Account {
    
      
    /*  Anmeldung: Neuen Account erstellen oder anmelden?
       Name und Passwort abfragen 
      
      if(anmelden==true) {
           player.anmelden(Name,Passwort)
      }
      if(register==true) {  */ 
      
      
    
        

       
        public void registrieren() {
            String playername = "Moritz";
            String filename = "player.txt";
            try {
				Files.writeString(Path.of("player.txt"), playername);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

        }

 }
