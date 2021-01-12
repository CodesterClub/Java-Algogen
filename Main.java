import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileReader;

class Main {
	public static void main(String[] args) throws Exception {

		// All variable declarartions
		String path;												// Stores path of java source file
		BufferedReader console;							// For console inputs
		BufferedReader file;								// For file input

		// For input from terminal
		console = new BufferedReader( new InputStreamReader( System.in ) );

		System.out.print( "Enter java file path: " );
		path = console.readLine();

		// For source file
		file = new BufferedReader( new FileReader( path ) );

	}
}