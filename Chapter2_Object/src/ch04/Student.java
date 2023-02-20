package ch04;

public class Student {
	
	
	
	public int studentId;
	public String studentName;
	public String address;
	
	//클래스 안에 있는 함수가 매서드다.객체를 위해 존재하는 것.
	//아래가 매서드.
	//1.학생정보를 출력 할 수 있고,
	public void showStudentInfo() {
		System.out.println(studentId + "학번의 이름은 " + studentName + "이고, 주소는 " 
        + address + "입니다.");
	}
    //2. 학생 이름을 얻을 수 있고,
	public String getStudentName() {
		return studentName;
	}
	//3. 학생 이름을 입력할 수 있는 것
	public void setStudentName(String name) {
		studentName = name;
	}
	
}