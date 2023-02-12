package ch21;

public class BreakContinueTest {

	public static void main(String[] args) {

		int sum = 0;
		int num;
		
		for(num = 1; ;num += 1 ) {
			
			sum += num;
			if (sum >= 100) break;
		}
		
		System.out.println(sum);
		System.out.println(num);
		
		
	    int NUM;
	    for (NUM = 1; NUM <= 100; NUM++) {
	    	if (NUM % 3 != 0) continue;
	    	System.out.println(NUM);
	    }
	}
}