
import java.util.*;

public class HashMap2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		java.util.HashMap<String, String> map = new java.util.HashMap<>();

		System.out.print("명령하세요 put(저장),remove(삭제),has(존재여부),list(출력),q(종료하기) 영어로 입력");
		String input = scan.nextLine();

		if (input.equalsIgnoreCase("put")) {
			String key = scan.nextLine();
			System.out.print("어떤값을 저장?");
			String value = scan.nextLine();
			map.put(key, value);
			System.out.println("저장이 완료되었습니다.");
		}
		if (input.equalsIgnoreCase("remove")) {
			String key = scan.nextLine();
			map.remove(key);
		}
		if (input.equalsIgnoreCase("has")) {
			System.out.print("어떤값을 확인?");
			String search = scan.nextLine();
			boolean containsValue = map.containsValue(search);
			if (containsValue) {
				System.out.println("값이 존재합니다");
			} else
				System.out.println("값이 존재하지 않습니다.");
		}
		if (input.equalsIgnoreCase("list")) {
			for (String key : map.keySet()) {
                String value = map.get(key);
                System.out.println(key + ": " + value);
            }
		}
		if (input.equalsIgnoreCase("q")) {
			System.out.println("프로그램을 종료합니다.");
		}
	}
}
