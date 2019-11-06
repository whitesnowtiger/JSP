package IO_InputStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			InputStream is = new FileInputStream("C:\\Users\\John\\eclipse-workspace\\Java_Seoul_Wiz\\bin\\InputStream\\jain.txt");
			while(true) {
				int i = is.read();
				System.out.println("Data: " + i);
				if(i==-1) break;
				
				
			}
			
			is.close();
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
