//Test comm
package Classes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Dictionnaire {
private int compteur;

private String Dico[] [];


public int getCompteur() {
	return compteur;
}
public void setCompteur(int compteur) {
	this.compteur = compteur;
}
public String[][] getDico() {
	return Dico;
}
public void setDico(String dico[][]) {
	Dico = dico;
}

/**
 * extrait de code tiré de http://www.developpez.net/forums/d1214517/java/general-java/debuter/lire-fichier-texte-java/
 * @return un tableau avec les mots récupérés du document texte.
 * 
 */

public void importmots(){
try{
	InputStream flux=new FileInputStream("../bin/dictionnaire.txt"); 
	InputStreamReader lecture=new InputStreamReader(flux);
	BufferedReader buff=new BufferedReader(lecture);
	String ligne;
	while ((ligne=buff.readLine())!=null){
		System.out.println(ligne);
	}
	buff.close(); 
	}		
	catch (Exception e){
	System.out.println(e.toString());
	}	



}
}

