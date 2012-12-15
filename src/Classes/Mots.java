package Classes;

public class Mots  {
private int nbalea;
private String[] tabmot ;
private int compte_point;
 private boolean trouve ;

public String[] getTabmot() {
	return tabmot;
}

public void setTabmot(String[] tabmot) {
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

public int getNbalea() {
	return nbalea;
}

public void setNbalea(int nbalea) {
	this.nbalea = nbalea;
}


}
