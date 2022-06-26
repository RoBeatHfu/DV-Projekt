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
      
      
    
        

       
        public static void registrieren(String text) {
            try {
				Files.writeString(Path.of("player.txt"), text);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

        }
        
        public static void main(String args[]) {
        	registrieren("Hallo");
        	registrieren("Zeile 2");
        	
        }

 }
