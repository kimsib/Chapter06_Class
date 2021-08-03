package ch06_5_instance_static;

public class SingletonExample {
	public static void main(String[] args) {
		
		
		Singleton single1 = Singleton.getInstance();
		Singleton single2 = Singleton.getInstance();
		
		System.out.println(System.identityHashCode(single1));
		System.out.println(System.identityHashCode(single2));
		
		if(single1 == single2) {
			System.out.println("같은 Singleton 객체입니다.");
		}else {
			System.out.println("다른 Singleton 객체입니다.");
		}
		
		
		
		
		
		
		
	}
}
