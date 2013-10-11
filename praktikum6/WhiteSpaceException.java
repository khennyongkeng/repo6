public class WhiteSpaceException extends Exception{
	public WhiteSpaceException() {
		super("terjadi kesalahan : 'tidak boleh ada spasi/whitespace'");
	}
	
	public WhiteSpaceException(String text) {
		super("terjadi kesalahan : 'tidak boleh ada spasi/whitespace', text : " + text);
		}
	}
