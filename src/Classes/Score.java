package Classes;

public class Score extends Joueur {
private int score;
private int po;

public int getScore() {
	return score;
}

public void setScore(int score) {
	this.score = score;
}
/**
 * 
 * @param nbreerreur est le nombre d'erreur commise par le joueur.
 */
public void inpoint(int nbreerreur){
	switch ( nbreerreur){
	case 0:
		this.setPo(this.getPo() + 50);
		
	}
}

public int getPo() {
	return po;
}

public void setPo(int po) {
	this.po = po;
}


}
