import java.util.Scanner;

public class Callstar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("모양을 선택하세요(다이아,직각삼각형)");
		String input1 = scanner.nextLine(); // ㅇㅣㅂㄹㅕㄱㅂㅏㄷㅇㅏ

		switch (input1) {
		case "다이아":
			System.out.println();
			Fordia.drawDiamond();
			break;
		case "직각삼각형":
			System.out.println();
			Forhalfdia.drowhalfdia();
			break;
		default:
			System.out.println("출력할 모양이 없습니다.");
		}

	}
}
