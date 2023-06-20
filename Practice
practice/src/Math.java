import java.util.Scanner;

public class Math {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("계산식을 입력하세요");
		String input = scanner.nextLine();

		int StartIndex = input.indexOf("(");
		int EndIndex = input.indexOf(")");

		String first = input.substring(StartIndex + 1, EndIndex);
//        System.out.println(first);

		char firstChar = first.charAt(0);
		int firstnum = Character.getNumericValue(firstChar);
		char secondchar = first.charAt(1);
		char thirdChar = first.charAt(2);
		int thirdnum = Character.getNumericValue(thirdChar);

		if (secondchar == '*') {
			System.out.println(firstnum * thirdnum);
		} else if (secondchar == '+') {
			System.out.println(firstnum + thirdnum);
		} else if (secondchar == '-') {
			System.out.println(firstChar - thirdnum);
		} else if (secondchar == '/') {
			System.out.println(firstChar / thirdnum);
		} else {
			System.out.println("부호는 +, -, *, x, /에서만 입력이 가능합니다.");
		}
	}
}
