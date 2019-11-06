package network2;

import java.net.URL;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class URLConnection {
	
	public URLConnection() {


		String code = null;
		System.out.println("Type website address.");
		Scanner scanner = new Scanner(System.in);
		String address = scanner.next();
		
		try {
			URL url = new URL(address);
			java.net.URLConnection con = url.openConnection();
			BufferedReader webData = new BufferedReader(new InputStreamReader(con.getInputStream()));
			FileWriter fw = new FileWriter("C:\\Users\\John\\Desktop\\Program\\HTML_CSS\\html\\ex1.html", false);
			
			while((code=webData.readLine()) !=null) {
				fw.write(code);
			}
			System.out.println("The End");
			
			fw.close();
			webData.close();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	


}
