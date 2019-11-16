import java.util.ArrayList;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws Exception {

		String serverAddress = "localhost";
		int serverPort = 4444;
		try{
			Socket socket = new Socket(serverAddress, serverPort);
			ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
			Object object = new Object();
			outputStream.writeObject(object);
			outputStream.flush();
			socket.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	
	
		
		ObjectCreator obj = new ObjectCreator();
		Serializer ser = new Serializer();

		ArrayList<Object> objList = obj.createObjects();

		ser.serial(objList);
		
		
		
	}

}

