import java.util.*;

public class StackCalculate1 {

	public static void main(String[] args) {
//		Stack st = new Stack();
		ArrayList list1 = new ArrayList();
		String num = "";

		Scanner scan = new Scanner(System.in);

		System.out.print("계산식을 입력하세요 (+,-,/,*)");
		String input = scan.nextLine();

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '(' || ch == ')') {
				list1.add(num);
				num = ""; // 변수 초기화
				list1.add(ch + ""); // 연산자를 문자열로 저장
			} else {
				num = num + ch;
			}
		}

		list1.add(num); // 마지막 숫
		list1.remove("");

		System.out.println(list1);

		}

	}
//	while(!st.empty())
//
//	{
//		System.out.println(st.pop());
//	}
//
//}}
