package ch06_2_field;

class FieldInitValue {
	byte byteField;
	short shortField;
	int intField;
	long longField;

	boolean booleanField;
	char charField;

	float floatField;
	double doubleField;

	int[] arrField;
	String referenceField;

}

public class FieldInitValueExample {
	public static void main(String[] args) {

		FieldInitValue fiv = new FieldInitValue();
		System.out.println("fiv.booleanField = " + fiv.booleanField);
		System.out.println("fiv.charField = " + fiv.charField);
		System.out.println("fiv.charField = " + fiv.arrField);
		System.out.println("fiv.referenceField = " + fiv.referenceField);

	}
}
