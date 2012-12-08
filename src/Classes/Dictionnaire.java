//Test comm
package Classes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dictionnaire {
private int compteur;
private int nbligne;

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
/*try{
	InputStream flux=new FileInputStream("../bin/dictionnaire.txt"); 
	InputStreamReader lecture=new InputStreamReader(flux);
	BufferedReader buff=new BufferedReader(lecture);
	String ligne;
	while ((ligne=buff.readLine())!=null){
		System.out.println(ligne);
	}
	// on lit le nombre de ligne du tableau a faire trouvé sur http://www.infos-du-net.com/forum/268172-21-resolu-classer-fichier-tableau-java
	nbligne=1;
	while(buff.ready()){

		buff.readLine();
		}

		nbligne++;
		// on écrit dans le fichier trouvé sur http://www.infos-du-net.com/forum/268172-21-resolu-classer-fichier-tableau-java
		int nbDonnees = 0;
		nbDonnees++;
		String[][] dico = new String[nbligne][nbDonnees];
		 while(buff.ready()){

	    		String line = buff.readLine();

				StringTokenizer tok = new StringTokenizer(line, ";");

				for(int i = 0; i<nbligne; i++){

					for(int j=0; j<nbDonnees; j++){

						if(tok.hasMoreTokens()){

							dico[i][j]=tok.nextToken();

						}

					}

				}
		 }
	
	buff.close(); 
	}		
	catch (Exception e){
	System.out.println(e.toString());
	}	*/



}
public int getNbligne() {
	return nbligne;
}
public void setNbligne(int nbligne) {
	this.nbligne = nbligne;
}
}

