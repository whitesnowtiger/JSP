package IO_OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("C:\\Users\\John\\eclipse-workspace\\Java_Seoul_Wiz\\bin\\IO_OutputStream\\jaout.txt");
			String str = "The weather is so beautiful today.";
			byte[] bs = str.getBytes();
			
			os.write(bs);
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(os!=null) os.close();
				
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
