import java. util.Scanner;

public class Calculator1 {
	public static void main(String[] args) {
		
		int result = 0; 
		char result2;
		
		Scanner scanner = new Scanner (System.in); 
		
		System.out.print("첫번째 숫자는?");
	    String input = scanner. nextLine();  // 화면에서 입력한 값 input 값 저장 
	    int m1 = Integer.parseInt(input); // 입력받은 input -> int 로 변환하여 m1 저장 
	  
	  
	  System.out.printf("두번째 숫자는?");
	    String input2 = scanner. nextLine(); // 화면에서 입력한 값 두번째 숫자 저장 
	    int m2 = Integer.parseInt(input2); //입력받은 input2 -> int 로 변환하여 m2 저장 

	    System.out.printf("연산자는?");
	    String oper = scanner.next(); // 화면에서 입력한 값 두번째 숫자 저장 
	    
	    switch (oper) {
	    case"+":
	    	System.out.println(m1+m2);
	    	break;
	    case"-":
	    	System.out.println(m1-m2);
	    	break;
	    case "/" :
	         System.out.println(m1/m2);
	         break;
	    case "x":
	    	System.out.println(m1*m2);
	    	break;
	    default: 
	      System.out.println("잘못입력하였습니. +,-,x,/으로 입력하세요");
	    }
	}
}


