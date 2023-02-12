package ch20;

public class NestedLoof {

	public static void main(String[] args) {

//     int dan = 2;
//     
//     for ( ; dan <= 9; dan += 1) {
//    	 for (int count = 1; count <= 9; count += 1) {
//    		 
//    		 System.out.println(dan + " x " + count + " = " + dan * count);
//    	 }
//    	 System.out.println();
//     }
     
      int dan = 2;
      int count = 1;
      while (dan <= 9) {
    	  //While은 초기화 해줘야 함
    	  count = 1;
    	  while (count <= 9) {
    		  System.out.println(dan + " x " + count + " = " + dan * count);
    	      count += 1;
    	  }
    	  System.out.println();
    	  dan += 1;
      }
		
	}

}
