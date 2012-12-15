package Classes;
import java.io.*;


public class Regles {

	public Regles() {



	}
	/**
	 * extrait de code tiré de http://www.developpez.net/forums/d1214517/java/general-java/debuter/lire-fichier-texte-java/
	 */
	public void afficheregle(){
		/*try{
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
		}*/
		System.out.println("Lobjectif du jeu est de découvrir un mot en devinant les lettres qui le composent.");
		System.out.println("Chaque joueur disposera du même mot à découvrir le plus rapidement possible.");
		System.out.println("Si le joueur découvre une lettre qui correspond au mot, celle-ci sera affichée et placée au bon endroit dans le mot.");
		System.out.println("Si la lettre est fausse, un croquis représentant un corps humain pendu sera peu à peu formé. Dès que le corps entier est formé, le joueur perd.");
		

	}
}
