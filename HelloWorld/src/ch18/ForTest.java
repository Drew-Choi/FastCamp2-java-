package ch18;

import java.util.Scanner;

public class ForTest {
  public static void main(String[] args) {
	  
	  Scanner scanner = new Scanner(System.in);
	  
	    int count =1;
	    int sum = 0;
	    
	    for(int i = 0; i < 10; i++, count++) {
	    	sum += count;
	  }
	  System.out.println(sum);
	  
//	  while과 비교
	  
	  int num = 1;
	  int total = 0;
	  while (num <= 10) {
		  total += num++;
	  }
	  System.out.println(total);
  }
}
