package Classes;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Joueur {
	private String pseudo;

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
		pseudo = JOptionPane.showInputDialog("null, entrer le pseudo du joueur");
	}

	public static void setPseudo(JTextField pseudo2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String  toString() {
		return "Joueur [pseudo=" + pseudo + "]";
	}

	

	
	

}
