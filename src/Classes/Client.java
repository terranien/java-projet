package Classes;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketImpl;
import java.net.UnknownHostException;



public class Client extends Socket implements Runnable {
private int numport;
ObjectOutputStream oos;
	public Client() {
		// TODO Auto-generated constructor stub
	}

	public Client(Proxy arg0) throws UnknownHostException, IOException {
		super("127.0.0.1",2009);
		// TODO Auto-generated constructor stub
	}

	public Client(SocketImpl arg0) throws SocketException {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public Client(String arg0, int arg1) throws UnknownHostException,
			IOException {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public Client(InetAddress arg0, int arg1) throws IOException {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public Client(String arg0, int arg1, InetAddress arg2, int arg3)
			throws IOException {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

	public Client(InetAddress arg0, int arg1, InetAddress arg2, int arg3)
			throws IOException {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	

	public int getNumport() {
		return numport;
	}

	public void setNumport(int numport) {
		this.numport = numport;
	}

	@Override
	public void run() {
		Joueur joueur= new Joueur();
		 joueur.choixmots();
		 
		Joueur joueur2= new Joueur();
		joueur2.entrer_mots();
	
	}

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
