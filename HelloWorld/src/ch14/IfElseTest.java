package ch14;

import java.util.Scanner;

public class IfElseTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("나이를 입력해주세요.");
        int age = scanner.nextInt();
		
        if (age >= 8) {
        	System.out.println("학교에 다닙니다.");
        }
        else {
        	System.out.println("노는게 젤 좋아.");
        }
	}
}
