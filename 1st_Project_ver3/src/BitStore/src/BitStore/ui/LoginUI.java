package BitStore.ui;

import java.util.Scanner;

import BitStore.ui.admin.MemberUI;
import BitStore.ui.admin.ProductUI;
import BitStore.ui.user.BitStoreUI;
import BitStore.ui.user.UserUI;

public class LoginUI {
	private Scanner sc;
	private BoardUI boardUI;
	private BitStoreUI bitstoreUI;
	private MemberUI memberUI;
	private ProductUI productUI;
	private UserUI userUI;
	
	public LoginUI() {
		sc = new Scanner(System.in);
		boardUI = new BoardUI(); // 공통 - 게시판
		bitstoreUI = new BitStoreUI(); // 사용자 - 편의점 이용
		memberUI = new MemberUI(); //관리자 - 회원관리
		productUI = new ProductUI(); //관리자 - 상품관리
		userUI = new UserUI(); //공통 - 로그인 
	}

	// 관리자일 경우
	public void admin() {
		while (true) {
			switch (adminMenu()) {
			case 1: // 회원 관리
				memberUI.admin();
				break;
			case 2: // 상품 관리
				productUI.admin();
				break;
			case 3: //게시판
				boardUI.commonBoard();
				break;
			case 4: // 로그아웃
//				userUI.service();
				//로그아웃시 BitStore에 있는 currentLoginUser null로 초기화 추가
			case 0:
				quit();
			default:
				System.out.println("번호를 잘못 입력하셨습니다.");
			}
		}
	}

	// 사용자일 경우
	public void user() {
		UserUI user = new UserUI();
		while (true) {
			switch (userMenu()) {
			case 1: //편의점 이용
				bitstoreUI.useBitStore();
				break;
			case 2:  // 게시판
				boardUI.commonBoard();
				break;
			case 3: // 회원정보 수정
				//User클래스의 updateUser(User) : boolean 호출
				break;
			case 4: // 로그아웃
				userUI.service();
				//로그아웃시 BitStore에 있는 currentLoginUser null로 초기화 추가
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

	private int adminMenu() {
		System.out.println("-----------------");
		System.out.println("1. 회원관리");
		System.out.println("2. 상품관리");
		System.out.println("3. 게시판");
		System.out.println("4. 로그아웃");
		System.out.println("0. 종료");
		System.out.println("-----------------");
		System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");
		return Integer.parseInt(sc.nextLine());
	}

	private int userMenu() {
		System.out.println("-----------------");
		System.out.println("1. 편의점 이용");
		System.out.println("2. 게시판");
		System.out.println("3. 회원정보 수정");
		System.out.println("4. 로그아웃");
		System.out.println("0. 종료");
		System.out.println("-----------------");
		System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");
		return Integer.parseInt(sc.nextLine());
	}
}
