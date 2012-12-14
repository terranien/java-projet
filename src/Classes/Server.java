package Classes;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;



public class Server extends ServerSocket implements Runnable {
	private int numport;
	private Socket sock;
	private int adresse;

	public Server() throws IOException {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unused")
	public Server(int arg0) throws IOException {
		super(1234);
		@SuppressWarnings("resource")
		final Server serv= this;
		Thread t = new Thread();
	}
	

	public Server(int arg0, int arg1) throws IOException {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public Server(int arg0, int arg1, InetAddress arg2) throws IOException {
		super(arg0, arg1, arg2);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Joueur j1= new Joueur ;
	}

	public int getAdresse() {
		return adresse;
	}

	public void setAdresse(int adresse) {
		this.adresse = adresse;
	}

	public int getNumport() {
		return numport;
	}

	public void setNumport(int numport) {
		this.numport = numport;
	}

	public Socket getSock() {
		return sock;
	}

	public void setSock(Socket sock) {
		this.sock = sock;
	}

	@Override
	public void run() {
		
		String joueur1 = "terra";
		
		Joueur choixmo = new Joueur(joueur1);
		//((Joueur) choixmo).choixmots();
	}

	
	}
