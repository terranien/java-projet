package Classes;
import java.io.*;


public class Regles {

	public Regles() {



	}
	/**
	 * extrait de code tir� de http://www.developpez.net/forums/d1214517/java/general-java/debuter/lire-fichier-texte-java/
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
		System.out.println("Lobjectif du jeu est de d�couvrir un mot en devinant les lettres qui le composent.");
		System.out.println("Chaque joueur disposera du m�me mot � d�couvrir le plus rapidement possible.");
		System.out.println("Si le joueur d�couvre une lettre qui correspond au mot, celle-ci sera affich�e et plac�e au bon endroit dans le mot.");
		System.out.println("Si la lettre est fausse, un croquis repr�sentant un corps humain pendu sera peu � peu form�. D�s que le corps entier est form�, le joueur perd.");
		

	}
}
