package ch6;

public class StudentTest {

	public static void main(String[] args) {

		//이건 클라이언트코드
		
	  
	  //Default 생성자 사용
	  StudentProduct studentLee = new StudentProduct();
	  studentLee.grade = 1;
	  studentLee.studentName = "Lee";
	  studentLee.studentNumber = 777;
	  
	  System.out.println(studentLee.showStudentInfo());
	  
	  
	  
	 //생성자에서 매개변수로 입력한 것
	  StudentProduct studentKim = new StudentProduct(123456, "Kim", 3);
	  
	  System.out.println(studentKim.showStudentInfo());
	  
	}

}
