import java.util.*;


public class ArraylList1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("계산식을 입력하세요 (+,-,/,*)");
	    String input = scan.nextLine();
	    
//		System.out.println(input);
		
		int StartIndex = input.indexOf("(");
		int EndIndex = input.indexOf(")");

		String first = input.substring(StartIndex + 1, EndIndex);
		System.out.println(first);

		char firtext = first.charAt(0);
		list1.add(firtext);
		
	    char sectext = first.charAt(1);
	    list1.add(sectext);
	    
	    String sec = input.substring(EndIndex);
	    
	    char third =  first.charAt(2);
	    list1.add(third);
	    
//	    Collections.sort(list1);
	    System.out.println(list1);
	}

}
