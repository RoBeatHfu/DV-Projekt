
public class Teil {

	int potenz;
	public boolean fusible= true;
	final int Basis =2;
	Teil(){                                                 /* Erstellt ein festgelegtes Teil*/
		this.potenz = 1;
	}
	Teil(int level){                                        /* Erstellt ein Variables Teil*/
		this.potenz=level;
	}
	public boolean isFusible(Teil a) {                      /* Pr�ft, ob zwei Teile fusionieren k�nnen*/
		if(this.potenz == a.potenz&& this.fusible &&a.fusible)   
			return true;
		return false;
	}
	public Teil fuse() {                          		    /* Fusioniert zwei Teile*/
		this.potenz = this.potenz+1;                        /* Erh�ht die Potenz des neuen Teils um 1*/
		fusible=false;                                      /* Damit pro Zug nur eine Fusion pro Zeile/Spalte m�glich ist*/ 
		return this;                                        /* Gibt Teil a wieder aus*/
	}
	public int get() {                                      /* Gibt den neuen Zahlenwert aus*/
		return (int) Math.pow(Basis,this.potenz);           /* Zahlenwert = Basis ^ Potenz*/
	}
}
