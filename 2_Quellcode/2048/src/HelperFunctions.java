public class HelperFunctions {
	
	public static int[] drawDigitsFromString(String strValue){
		String str = strValue;
        String digits="";
        int highscore[] = {0,0,0};
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            char chrs = str.charAt(i);
            if(chrs == '\n') {
            	if(digits != "")
            	{
	            	digits.trim();
	            	highscore[index] = Integer.parseInt(digits); 
	            	index++;
	            	digits = "";
            	}
            }
            if (Character.isDigit(chrs))
                digits = digits+chrs;
        }
        return highscore;
    }
	public static String[] getNamesFromHighscore(String strValue){
		String str = strValue;
        String letters="";
        String names[] = {"","",""};
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            char chrs = str.charAt(i);
            if(chrs == '\n') {
            	names[index] = letters;
            	index++;
            	letters = "";
            }
            if (!Character.isDigit(chrs))
            	if(chrs != '\r' && chrs != '\n')
            		letters = letters+chrs;
        }
        return names;
    }
}

