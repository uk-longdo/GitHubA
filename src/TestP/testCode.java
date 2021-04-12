package TestP;

public class testCode {
	
	public static void sum() {
		int s = 0;
		for(int i=1; i<1000; i++) {
			if(i%3==0) {
				s +=i;
			}
			
		}
		System.out.println("3의 배수 합 ="+s);
		
	}
	public static void sum2() {
		int v = 0;
		for(int i=1; i<1000; i++) {
			if(i%5==0) {
				v +=i;
			}
		}
		System.out.println("5의배수 합 =" +v);
	}
	
	
	public static void main(String[] args) {
		sum();
		sum2();
		//git test
	}
	
	
	
}
