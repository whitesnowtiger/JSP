package IO_InputOutputStream2;

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
			os = new FileOutputStream("C:\\Users\\John\\eclipse-workspace\\Java_Seoul_Wiz\\bin\\IO_InputOutputStream2\\jain_copy2.txt");
			
			byte[] bs = new byte[5];
			
			while(true) {
				int count = is.read(bs);
				if(count == -1) break;
				os.write(bs, 0 , count);
			}
			
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(is != null) {
				try {
					is.close();
				} catch(Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
			if(os != null ) {
				try {
					os.close();
					
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
		}

	}

}
 