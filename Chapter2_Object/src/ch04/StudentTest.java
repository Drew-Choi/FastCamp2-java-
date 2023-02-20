package ch04;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student();
		//studentLee는 instance라고 함.
		//각 인스턴스는 각자 메모리 공간을 가지고 있음.(HeapMemory, 동적 메모리)
		
		//이건 맴버변수를 이용
		studentLee.studentId = 12345;
		//이건 매서드를 이용한 것
		studentLee.setStudentName("LEE");
		studentLee.address = "서울 강남구";
		
		studentLee.showStudentInfo();
		
		
		//-------------------------//new라고 하는 것이 생성자
		//생성자를 통해 생성되는 것이 인스턴스
		Student studentKim = new Student();
		
		studentKim.studentId = 678910;
		studentKim.studentName = "Drew Kim";
		studentKim.address = "서울시 은평구 역촌동";
		
		studentKim.showStudentInfo();
		
		//인스턴스가 동적(heap)메모리를 할당 받은 곳을 직접 찍어보자
		
		System.out.println(studentLee);
		System.out.println(studentKim);
	}

}

//용어정리
// 객체 : 객체 지향 프로그램의 대상, 생성된 인스턴스

// 클래스 : 객체를 프로그래밍 하기위해 코드로 정의해 놓은 상태

// 인스턴스 : new 키워드를 사용하여 클래스를 메모리에 생성한 상태

// 멤버 변수 : 클래스의 속성, 특성

// 메서드 : 멤버 변수를 이용하여 클래스의 기능을 구현한 함수

// 참조 변수 : 메모리에 생성된 인스턴스를 가리키는 변수

// 참조 값 : 생성된 인스턴스의 메모리 주소 값
