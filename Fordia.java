
public class Fordia {
    public static void main(String[] args) {
        drawDiamond();
    }   // 메인메소드 생성 

    public static void drawDiamond() {
		for (int i = 1; i <= 10; i++) {
			for (int j = 10; j > i; j--) {
				System.out.print(" "); // 상단공백찍기
			}
			for (int j = 0; j < i * 2 - 1; j++) {
				System.out.print("*"); // 상단다이
			}
			System.out.println();
		}
		for (int i = 9; i >= 1; i--) {
			for (int j = 10; j > i; j--) {
				System.out.print(" "); // 하단 공백찍기
			}
			for (int j = 0; j < i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println(); // 하단 반대
		}
	}
} 

