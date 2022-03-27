package LiangExcercise10thAll.Exercise_12.Exercise_12_09;

public class BinaryFormatException extends NumberFormatException {
	private String binaryString;

	/** Construct a BinaryFormatException object */
	public BinaryFormatException(String binaryString) {
		super(binaryString + " is not a binary string");
		this.binaryString = binaryString;
	}

	/** Return binaryString */
	public String getBinaryString() {
		return binaryString;
	}
}