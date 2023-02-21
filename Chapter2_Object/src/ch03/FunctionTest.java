package ch03;

public class FunctionTest {
	
	//자바스크립트와 다르게 자바에서는 function이라는 함수를 쓰지 않고,
    //별도의 클래스에 기능을 하는 함수들을 직접 만들어 놓음
	//여기서 함수 안에 들어간 변수를 지역변수라고 하는데, 이 지역변수들은 스택메모리를 가짐
	//스택메모리는 함수에 사용할 메모리공간이 스택 내부에 자동으로 하나 생김. 그리고 사용 후에 자동 소멸.

	public static int addNum(int num1, int num2) {
		
		int result;
		//
		result = num1 + num2 ;
		return result;
	}
	
	// return(반환)이 없는 것은 void라고 해준다.
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	public static int calcSum() {
		int sum = 0;
		int i;
		
		for (i = 0; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {

		int n1 = 10;
		int n2 = 20;
		
		
		int total = addNum(n1, n2);
		System.out.println(total);
		
		sayHello("안녕하세요");
		
		total = calcSum();
		System.out.println(total);
	}
}
