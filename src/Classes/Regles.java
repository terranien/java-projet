package Classes;
import java.io.*;


public class Regles {

	public Regles() {
		
		
		
	}
	/**
	 * extrait de code tiré de http://www.developpez.net/forums/d1214517/java/general-java/debuter/lire-fichier-texte-java/
	 */
public void afficheregle(){
	try{
		InputStream flux=new FileInputStream("../bin/regles.txt"); 
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
