package IO_InputOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("C:\\Users\\John\\eclipse-workspace\\Java_Seoul_Wiz\\bin\\IO_InputStream\\jain.txt");
			os = new FileOutputStream("C:\\Users\\John\\eclipse-workspace\\Java_Seoul_Wiz\\bin\\IO_InputOutputStream\\jain_copy.txt");
			
			while(true) {
				int i = is.read();
				if(i==-1) break;
				os.write(i);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(is != null) {
				try {
					is.close();
				} catch(Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
			if(os !=null ) {
				try {
					os.close();
					
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
		}
	}

}
