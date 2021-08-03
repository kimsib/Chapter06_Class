package ch06_5_instance_static;



	public class Car {
	// 필드
		String model;
		int speed;
	// 생성자	
		Car(String model){
			this.model = model;
		}
		// 매소드
		
		void setSpeed(int speed) {
			this.speed = speed;
		}
		void run() {
			for(int i=0; i<5; i++) {
				
			}
		}
	}

class mathutil {
	static double pi = 3.141592;
	String name; 
}