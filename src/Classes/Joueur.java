package Classes;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Joueur extends Mots implements Runnable{
	private String pseudo;
	private String Mot_choisi;
	private int nummax=5;
	private String lettres;

	public Joueur() {
		// TODO Auto-generated constructor stub
	}

	public Joueur(String joueur1) {
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
	
	public  boolean entrer_mots(){
		
		for (int j = 0; j < nummax; j++) {
			lettres=  JOptionPane.showInputDialog(null, "entrer la lettre que vous avez choisi.");
			if (lettres==Mot_choisi) return isTrouve();
		}
		return false;
		
		
		
		
		
	}
public String choixmots(){
	Mot_choisi= JOptionPane.showInputDialog("entrer le mots que vous voulez voir deviner par l'autre joueur");
	return Mot_choisi;
	
}
public int score(int po){
	System.out.println("le score est :" +po);
	return po;
	
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

	@Override
	public void run() {
		choixmots();
		
	}

	public int getNummax() {
		return nummax;
	}

	public void setNummax(int nummax) {
		this.nummax = nummax;
	}

	public String getLettres() {
		return lettres;
	}

	public void setLettres(String lettres) {
		this.lettres = lettres;
	}

	public void InputMethodListener() {
		pseudo = JOptionPane.showInputDialog("entrer le pseudo du joueur");
	}
		
	

	
/*public static void main(String args[]){
Thread t1= new Thread(new Runnable() {
		
		@Override
		public void run() {
			Joueur joueur= new Joueur();
			 joueur.choixmots();
			 
			Joueur joueur2= new Joueur();
			joueur2.entrer_mots();
			
		}
	});

t1.start();

Thread t2= new Thread(new Runnable() {
	
	@Override
	public void run() {
		Joueur joueur2= new Joueur();
		 joueur2.choixmots();
		 
		Joueur joueur=new Joueur();
		joueur.entrer_mots();
		
	}
});
t2.start();
}*/
	
	

}
