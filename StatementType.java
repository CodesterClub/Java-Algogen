/**
 * This class is used to store function that are used to detect 
 * the type of a java statement. A class returns true if that
 * kind of state is in line.
 */
class StatementType {
	// Instance variables (all static)
	public static String[] datatypes = {		// Note that although String is a class
		"void",																// it is inculed in this list as String 
		"boolean",														// is very popular for handling of data
		"short",
		"char",
		"int",
		"long",
		"float",
		"double",
		"String"
	}

	// Methods (all static)
	public static boolean importDeclaration( String line ) {
		return true;
	}
	public static boolean classDeclaration( String line ) {
		return true;
	}
	public static boolean functionDeclaration( String line ) {
		return true;
	}
	public static boolean variableDeclaration( String line ) {
		return true;
	}
	public static boolean variableInitialisation( String line ) {
		return true;
	}
	// Variable declaration with initialisation
	public static boolean varDecAndInit( String line ) {
		return true;
	}
	public static boolean objectDeclaration( String line ) {
		return true;
	}
	public static boolean objectInitialisation( String line ) {
		return true;
	}
	// Object declaration with initialisation
	public static boolean objDecAndInit( String line ) {
		return true;
	}
	public static boolean arrayDeclaration( String line ) {
		return true;
	}
	public static boolean arrayInitialisation( String line ) {
		return true;
	}
	// Array declaration with initialisation
	public static boolean arrDecAndInit( String line ) {
		return true;
	}
}