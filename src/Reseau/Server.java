package Reseau;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;


public class Server extends ServerSocket {
	private int numport;
	private int adresse;

	public Server() throws IOException {
		// TODO Auto-generated constructor stub
	}

	public Server(int arg0) throws IOException {
		super(arg0);
		// TODO Auto-generated constructor stub
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
		// TODO Auto-generated method stub

	}

	public int getAdresse() {
		return adresse;
	}

	public void setAdresse(int adresse) {
		this.adresse = adresse;
	}

}