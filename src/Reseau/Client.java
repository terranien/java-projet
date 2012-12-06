package Reseau;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketImpl;
import java.net.UnknownHostException;


public class Client extends Socket {
private int numport;

	public Client() {
		// TODO Auto-generated constructor stub
	}

	public Client(Proxy arg0) {
		super(arg0);
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int getNumport() {
		return numport;
	}

	public void setNumport(int numport) {
		this.numport = numport;
	}

}
