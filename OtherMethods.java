class OtherMethods {
	/**
	 * This method supports both +ve and -ve array traversal
	 */
	public arrayIndexOf( String[] array, int from, int to, String element ) {
		if ( from < to )
			for ( int i = from; i < to ; i++ ) {
				if ( array[i].equals( element ) ) {
					return i;
		else
			for ( int i = from; i > to ; i-- ) {
				if ( array[i].equals( element ) ) {
					return i;
		return -1;
	}
}