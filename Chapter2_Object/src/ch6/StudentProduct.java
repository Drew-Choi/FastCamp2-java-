package ch6;

public class StudentProduct {

    public int studentNumber;
    public String studentName;
    public int grade;
    
    
    //Default생성 - 경우에 따라 사용 됨 -> 생성 후 각 항목에 넣어줌
    public StudentProduct() {}
    
    //아래 것이 생성자
    public StudentProduct(int studentNumber, String studentName, int grade) {
    	
    	this.studentNumber = studentNumber;
    	this.studentName = studentName;
    	this.grade = grade;
    	
    }
    
    public String showStudentInfo() {
    	return studentName + "학생의 학번은" +  studentNumber + "이고, " + 
    grade + "학년 입니다.";
    }
	
}
