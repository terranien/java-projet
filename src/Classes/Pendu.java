package Classes;


public class Pendu {
	public static void main(String args[]) throws InterruptedException{
		Thread t1= new Thread(new Runnable() {
				
				@Override
				public void run() {
					Joueur joueur= new Joueur();
					 joueur.choixmots();
					 
					Joueur joueur2= new Joueur();
					joueur2.entrer_mots();
			
				}
			});

		t1.start();

		Thread t2= new Thread(new Runnable() {
			
			@Override
			public void run() {
				Joueur joueur2= new Joueur();
				 joueur2.choixmots();
				 
				Joueur joueur=new Joueur();
				joueur.entrer_mots();
				
			}
		});
		t2.sleep(50);
		t2.start();
		}
}
