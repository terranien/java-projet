package Classes;

import java.io.Console;
import java.util.ArrayList;

public class Mots  {
//private int nbalea;
private String tabmot = null ; //Mot rentré par joueur
private char tableau[]; // tableau pour le mot
private char lettreJoueur; // lettre rentrée par joueur2
private int compte_point; //total des points
private int nbErreur = 8; // nombre d'erreurs possible
private int longueurMot=tabmot.length(); // longueur du mot choisi
private boolean trouve ; // devient vrai si mot trouvé
private boolean correct = false; // vérifié si lettre entrée est correcte
private boolean memeLettre = false; // vérifié si la lettre entrée est déjà rentrée et correcte
private boolean memeLettre2 = false; // vérifié si la lettre entrée est déjà entrée et fausse 

private char tabVerif[];
tabVerif = new char [nbErreur]; // Tableau des lettres entrées par joueur

public void cretab(){
	tableau = tabmot.toCharArray(); 
   // Création du tableau grâce au site: http://www.commentcamarche.net/forum/affich-773735-java-transformation-d-une-string
}


public String getTabmot() {
	return tabmot;
}

public void setTabmot(String tabmot) {
	this.tabmot = tabmot;
}

public int getCompte_point() {
	return compte_point;
}
/**
 * 
 * @return le compte des point totalisés.
 */
public void setCompte_point(int compte_point) {
	this.compte_point = compte_point;
	
}



public boolean isTrouve() {
	return trouve;
}

public void setTrouve(boolean trouve) {
	this.trouve = trouve;
}

/*public int getNbalea() {
	return nbalea;
}*/

/*public void setNbalea(int nbalea) {
	this.nbalea = nbalea;
}*/

/*public int longueurMot(int len){
	int len =tabmot.length;
	return len;
	Variable longueurMot déclarée en haut 
}*/

public boolean isCorrect(boolean memeLettre){
	int i;
	for (i=0;i<longueurMot;i++){
		if (tableau[i]==lettreJoueur){
			memeLettre = true;
		}
	}
	return memeLettre;
}//Boucle pour vérifié si la lettre entrée a déjà été validée dans le mot à trouver

public boolean isCorrect2(boolean memeLettre2){
	int i;
	for (i=0;i<nbErreur;i++){ 
        if (tabVerif[i]==lettreJoueur){ 
            memeLettre2=true;
        }
    }
	return memeLettre2;
}//Boucle pour vérifié si la lettre entrée a déjà été entrée dans le tableau des lettres fausses tabVerif

public void testMot(){
	int i;
	lettreJoueur=Console.readLine("Votre lettre? ").toLowerCase().charAt(0);
		for(i=0;i<longueurMot;i++){
			if (lettreJoueur==tableau.charAt(i)){
			tableau[i]=lettreJoueur;
			correct=true;
		}
	}	
}


}

// Aide pour le code du site: http://www.javafr.com/codes/JEU-PENDU_35803.aspx