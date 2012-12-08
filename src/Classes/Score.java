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
 * @param trouve booléen qui permet de mettre 100 point si true sinon 0
 */
public void inpoint(boolean trouve){
	if (trouve= true) po+=100;
	else po+=0;
}

public int getPo() {
	return po;
}

public void setPo(int po) {
	this.po = po;
}


}
