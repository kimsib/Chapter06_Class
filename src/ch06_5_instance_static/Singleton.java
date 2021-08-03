package ch06_5_instance_static;

public class Singleton {

	
	
	
	private static Singleton ref = new Singleton();
	
	
	private Singleton () {}
	
	static Singleton getInstance() {
		return ref;
	}
	

	
	
}
