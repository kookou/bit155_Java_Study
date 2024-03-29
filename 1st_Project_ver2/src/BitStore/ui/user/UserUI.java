package BitStore.ui.user;

import java.util.Scanner;

public class UserUI {
	private Scanner sc = new Scanner(System.in);

	public void service() {
		while (true) {
			switch (menu()) {
			case 1:
				// BitStroe의 join메소드 출력
				break;
			case 2:
				// BitStroe의 login메소드 출력
				break;
			case 3:
				// BitStroe의 findID()출력
				break;
			case 4:
				// BitStroe의 findPwd()출력
				break;
			case 0:
				quit();
			default:
				System.out.println("번호를 잘못 입력하셨습니다.");
			}
		}
	}

	private void quit() {
		System.out.println("안녕히 가세요^^!");
		System.exit(0);
	}

	private int menu() {
		System.out.println("-----------------");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 아이디 찾기");
		System.out.println("4. 비밀번호 찾기");
		System.out.println("0. 종료");
		System.out.println("-----------------");
		System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");
		return Integer.parseInt(sc.nextLine());
	}
}
