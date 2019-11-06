package network;

import java.util.Scanner;


public class InetAddress {
	
	Scanner scanner;
	
	public InetAddress() {


		System.out.println("Type host name.");
		
		scanner = new Scanner(System.in);
		
		try {
		
		java.net.InetAddress inetAddress = java.net.InetAddress.getByName(scanner.next());
		
		System.out.println("Computer Name : " +inetAddress.getHostName());
		System.out.println("Computer IP : " + inetAddress.getHostAddress());
		
		
	} catch(Exception e) {
		System.out.println(e.getMessage());
	}

}
}
	