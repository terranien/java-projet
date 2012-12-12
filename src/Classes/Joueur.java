package Classes;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Joueur extends Mots {
	private String pseudo;
	private String Mot_choisi;

	public Joueur(Object joueur1) {
		// TODO Auto-generated constructor stub
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
		pseudo = JOptionPane.showInputDialog("entrer le pseudo du joueur");
	}

	public static void setPseudo(JTextField pseudo2) {
		// TODO Auto-generated method stub
		
	}
public String choixmots(){
	Mot_choisi= JOptionPane.showInputDialog("entrer le mots que vous voulez voir deviner par l'autre joueur");
	return Mot_choisi;
	
}
	@Override
	public String  toString() {
		return "Joueur [pseudo=" + pseudo + "]";
	}

	public String getMot_choisi() {
		return Mot_choisi;
	}

	public void setMot_choisi(String mot_choisi) {
		Mot_choisi = mot_choisi;
	}

	

	
	

}
