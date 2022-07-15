package anyName;
import java.net.*;

public class Anyname {

	public static void main(String[] args) {
		try {
			InetAddress name1 = InetAddress.getByName("elearning.kisiiuniversity.ac.ke");
			System.out.println(name1);
			
		} catch (UnknownHostException e) {
			System.out.println(e);
			

		}

	}

}
