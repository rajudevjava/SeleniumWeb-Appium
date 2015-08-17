import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Hello {

	public static void main(String[] args) {
	/*	int i =10;
		int j =20;
	    int result;
		
		result = i+j;
		System.out.println(result);
*/
		File file = new File("test.txt");
		
		
		try{

			PrintWriter output = new PrintWriter(file);
			
		
			
			
		    output.println("hiii");
		    output.println("subbu");
			
		
			
			
			output.close();
			
		}catch (IOException ex) {
			System.out.printf("Error %s\n", ex);
		}
	
		
		
		
	}

}
