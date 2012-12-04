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

	

/*
 * test commit
 */
/*try{
InputStream flux=new FileInputStream("test.txt"); 
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
}*/
}

