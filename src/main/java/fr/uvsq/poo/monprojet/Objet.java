package fr.uvsq.poo.monprojet;

public class Objet {
	String type;
		
	/* cr�er un objet du type en argument (cl�, arme, essence, croquettes, whatever)*/
	public Objet(String type){
		this.type = type;
	}
	
	public String get_type() {
		return this.type;
	}
	
}
