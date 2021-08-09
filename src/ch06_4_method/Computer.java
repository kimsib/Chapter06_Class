package ch06_4_method;

public class Computer {
	
	int[] intList;
	
	int sum() {
		return	arraySum(this.intList);
			}
	int sum1(int[] arrs) {
		return arraySum(arrs)
		
	}
	
	
	
		int sum1(int[] arrs) {
		return arraySum(arrs);
	}
		int sum2(int...values) {
			return arraySum(arrs);
		}
	int sum2(int...  values  )	{
		int sum = 0;
		for(int i =0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
