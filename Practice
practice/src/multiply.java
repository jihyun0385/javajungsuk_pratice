import java. util.Scanner;

public class multiply {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in); 
		
		System.out.print("구구단 몇단?");
	    String input = scanner. nextLine();  // 화면에서 입력한 값 input 값 저장 
	    int m1 = Integer.parseInt(input); // 입력받은 input -> int 로 변환하여 m1 저장 
	  
	  
	  System.out.printf(m1 + " 곱하기 몇?");
	    String input2 = scanner. nextLine(); // 화면에서 입력한 값 두번째 숫자 저장 
	    int m2 = Integer.parseInt(input2); //입력받은 input2 -> int 로 변환하여 m2 저장 

	  
	  System.out.println (m1*m2); // 계산방법 입력 
	}
}
	
		
// 구구단 스캐너로 만들기 
    