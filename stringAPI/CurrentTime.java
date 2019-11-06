package stringAPI;

public class CurrentTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(System.currentTimeMillis());
		
		String str = "A";
		long startNum = System.currentTimeMillis();
		
		for(int i = 0; i < 50000; i++) {
			str = str + 'A';
		}
		
		long endNum = System.currentTimeMillis();
		System.out.println("String Duration: " + (endNum - startNum));
	

		StringBuilder stringBuilder = new StringBuilder("A");
		long startNum1 = System.currentTimeMillis();
		
		for(int i = 0; i < 50000; i++) {
			stringBuilder = stringBuilder.append('A');
		}
		
		long endNum1 = System.currentTimeMillis();
		System.out.println("StringBuilder Duration: " + (endNum1 - startNum1));
	
}
}
