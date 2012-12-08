package Classes;

public class Mots {
private String tabmot[] [];
private int compte_point;
private int nbreerreur;

public String[][] getTabmot() {
	return tabmot;
}

public void setTabmot(String tabmot[][]) {
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

public int getNbreerreur() {
	return nbreerreur;
}

public void setNbreerreur(int nbreerreur) {
	this.nbreerreur = nbreerreur;
}


}
