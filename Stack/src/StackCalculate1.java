import java.util.*;

public class StackCalculate1 {

	public static void main(String[] args) {
		Stack<String> st = new Stack<>();  // 숫자 담기 
		Stack<String> st2 = new Stack<>(); // 연산자 담기 
		String num = "";

		Scanner scan = new Scanner(System.in);

		System.out.print("계산식을 입력하세요 (+,-,/,*)");
		String input = scan.nextLine();
		

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == '*' || ch == '/' || ch == '+' || ch == '-'|| ch == '(' || ch == ')') {
				if (!num.isEmpty()) {
					st.push(num); // 숫자를 st에 넣기 
					num = ""; 
				}
				st2.push(ch + ""); // 연산자 넣어주기 
			} else {
				num = num + ch; 
			}
		}

		System.out.println(st);
		System.out.println(st2);
		}
	}

