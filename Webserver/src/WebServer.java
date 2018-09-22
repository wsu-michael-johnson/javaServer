
import java.io.*;
import java.net.*;
import java.util.*;
public class WebServer {

	public static void main(String[] args) {
		//set the port
		int port = 8000;
		Socket socket = new Socket();
		
		while(true){
			if(socket.isConnected()){
				Thread request = new Thread();
				request.run();
				try {
					socket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}

final class HttpRequest implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}