package ch06_5_instance_static;



	public class Car {
	// �ʵ�
		String model;
		int speed;
	// ������	
		Car(String model){
			this.model = model;
		}
		// �żҵ�
		
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