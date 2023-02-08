package ch12;

public class LogicalTest {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
//		boolean value = ((num1 = num1 +10) < 10) && ((i = i + 2) < 10);
//		
//		
//		System.out.println(value);
//		System.out.println(num1);
//		System.out.println(i);
//		
//		논리곱은 앞 항에서 Fals가 나서 뒤에 i는 연산처리 하지 않음
//		이미 앞에서 끝나버려서.
		
        boolean value = ((num1 = num1 +10) > 10) || ((i = i + 2) < 10);
		
		
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
//  		논리합도 양측을 비교했을 때, 앞에서 이미 True가 나오면 뒤에를 볼 필요없이 이 전체가 True
//		이므로 뒤에 나오는 i를 연산하지 않는다. 하지만 이 식은 True이다.
	}

}
