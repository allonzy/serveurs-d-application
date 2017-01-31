package client;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class ClientHelloWorld {
	public static URL webServiceUrl;
	public static void main(String args[]) throws IOException{
		webServiceUrl = new URL("http://localhost:8080/Archive/HelloWorld.html");
		InputStream inStream = webServiceUrl.openConnection().getInputStream();
		String line ;
		BufferedReader br = new BufferedReader(new InputStreamReader(inStream));
		while( (line = br.readLine()) != null){
			System.out.println(line);
		}
	}
}
