
import java.util.*;

public class Any {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        java.util.ArrayList<String> list1 = new java.util.ArrayList<>();

        System.out.print("명령하세요 put(저장), remove(삭제), has(존재여부), list(출력), q(종료하기) 영어로 입력");
        String input = scan.nextLine();
        while (!input.equalsIgnoreCase("q")) {
            if (input.equalsIgnoreCase("put")) {
                System.out.println("어떤 값 저장?");
                String save = scan.nextLine();
                list1.add(save);
                System.out.println("저장이 완료되었습니다.");
            } else if (input.equalsIgnoreCase("remove")) {
                System.out.println("어떤 값 삭제?");
                String del = scan.nextLine();
                if (list1.contains(del)) {
                    list1.remove(del);
                    System.out.println("삭제되었습니다.");
                } else {
                    System.out.println("값이 존재하지 않습니다.");
                }
            } else if (input.equalsIgnoreCase("has")) {
                System.out.print("어떤 값 확인?");
                String has = scan.nextLine();
                if (list1.contains(has)) {
                    System.out.println("값이 존재합니다.");
                } else {
                    System.out.println("값이 존재하지 않습니다.");
                }
            } else if (input.equalsIgnoreCase("list")) {
                System.out.println(list1);
            } else {
                System.out.println("잘못된 명령입니다.");
            }
            
            System.out.print("명령하세요 put(저장), remove(삭제), has(존재여부), list(출력), q(종료하기) 영어로 입력");
            input = scan.nextLine();
        }
        
        System.out.println("종료합니다.");
    }
}
