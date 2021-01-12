import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.PrintWriter;

class Main {
	public static void main(String[] args) throws Exception {

		// All variable declarartions
		String path;												// Stores path of java source file
		String clss;												// Stores your program's class name
		BufferedReader console;							// For console inputs
		BufferedReader source;							// For file input
		PrintWriter algo;										// For algorithm output
		String line;												// Store a line of the source

		// For input from terminal
		console = new BufferedReader( new InputStreamReader( System.in ) );

		// Input file path
		System.out.print( "Enter java file path: " );
		path = console.readLine();

		// Extract source class name
		clss = path.substring( lastIndexOf( "\\" + 1 ), lastIndexOf( ".java" ) );

		// For source file
		source = new BufferedReader( new FileReader( path ) );

		// For algo file
		algo = new PrintWriter( "Algos/" + class + "_Algo.txt" );

		/* This loop runs till the entire file is covered
		 * The section is meant to be modular with different if blocks for different 
		 * parts of code.
		 * It is recommended that unless two kinds of java statement is exactly same, 
		 * their if blocks should be kept seperate. That is why class and function 
		 * declarations are not handled by a single block
		 */
		while ( line = source.readLine() != null ) {

			// Import declarations
			if ( line.indexOf( "import" ) == 0 ) {
				algo.println( line );
			}

			// Class declarations
			else if ( line.indexOf( "class " + clss ) != -1 ) {
				algo.println( line.replace( "{", ":" ).replace( "extends", "inherits" ) );
			}

			// Function declarations
			else if ( line.indexOf( "void " + clss ) != -1 | 
								line.indexOf( "int " + clss ) != -1  |
								line.indexOf( "float " + clss ) != -1) {
				algo.println( line.replace( "{", ":" ).replace( "extends", "inherits" ) );
			}
			else {
				 algo.println( line );
			}
		}
	}
}