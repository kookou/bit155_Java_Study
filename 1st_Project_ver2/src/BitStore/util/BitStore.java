package BitStore.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import BitStore.domain.BoardVO;
import BitStore.domain.ProductVO;
import BitStore.domain.UserVO;

public class BitStore {
	public static Map<String, UserVO> userList = new HashMap<>();
	public static Map<Integer, ProductVO> productList = new HashMap<>();
	public static Map<Integer, ProductVO> discardProductList = new HashMap<>();
	public static Map<Integer, BoardVO> boardList = new HashMap<>();
	public static UserVO currentLoginUser;
	private Scanner sc;
	private UserVO user;

	public BitStore() {
		sc = new Scanner(System.in);
	}

	public void join() {
		user = new UserVO();
		checkID();
		checkPwd();
		System.out.println("회원님의 이름을 입력해 주세요.");
		user.setUserName(sc.nextLine().trim());
		checkPhone();
		user.setUserPoint(1000);
		System.out.println("회원님의 잔액을 입력해 주세요.");
		user.setMoney(Integer.parseInt(sc.nextLine().trim()));
		checkPoint();
		user.setOrderList(null);
		userList.put(user.getID(), user);
		writeUserList();

	}

	public void checkID() {
		System.out.println("※ Bit 편의점 회원가입을 환영 합니다※");
		System.out.println("사용할 아이디를 입력해주세요 ");
		System.out.println("(5~15자 사이의 영문 과 숫자를 조합해주세요.)");
		Set<String> keys = userList.keySet();

		while (true) {
			String userID = sc.nextLine().trim();
			Pattern idPattern = Pattern.compile("^(?=.*[a-zA-Z])(?=.*[^!@#$%^*+=-])(?=.*[^가-힣])(?=.*[0-9]).{5,15}$");
			Matcher matcher1 = idPattern.matcher(userID);

			for (String key : keys) {
				if (key.equals(userID)) {
					System.out.println("이미 사용중인 아이디입니다. 다시 입력해 주세요");
					checkID();
				}
			}
			if (!matcher1.matches()) {
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("5~15자 영문과 숫자를 조합하여 다시 입력해 주세요");

			} else {
				user.setID(userID);
				return;
			}
		}
	}

	public void checkPwd() {
		System.out.println("사용할 비밀번호를 입력해주세요.");
		System.out.println("(8~20자 사이의 영문 과 숫자,특수문자를 조합해주세요.)");
		while (true) {
			String userPwd = sc.nextLine().trim();
			Pattern pwPattern = Pattern.compile("^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8,20}$");
			Matcher matcher1 = pwPattern.matcher(userPwd);
			if (!matcher1.matches()) {
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("8~20자 사이의 영문 과 숫자,특수문자를 조합해 다시 입력해 주세요.");
			} else {
				user.setPwd(userPwd);
				return;
			}
		}
	}

	public void checkPhone() {
		System.out.println("회원님의 핸드폰 번호를 입력해 주세요.");
		System.out.println("(010-0000-0000 형식으로 입력해 주세요.)");
		while (true) {
			String userPhone = sc.nextLine().trim();
			Pattern phonePattern = Pattern.compile("^01([0|1|0]?)-?([0-9]{3,4})-?([0-9]{4})$");
			Matcher matcher1 = phonePattern.matcher(userPhone);
			if (!matcher1.matches()) {
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("010-0000-0000 형식으로 입력해 주세요.");
			} else {
				user.setUserPhone(userPhone);
				return;
			}
		}
	}
	public void checkPoint(){
		System.out.println("할인카드를 소지하셨다면 1번을 없다면 2번을 입력해 주세요");
		while (true) {
			if (sc.nextLine().equals("1")) {
				user.setDiscount(true);
				break;
			} else if (sc.nextLine().equals("2")) {
				user.setDiscount(false);
				break;
			} else {
				System.out.println("잘못입력 하셨습니다.");
			}
		}
	}

	public void writeUserList() {
		String filename = "UserList.txt";
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream out = null;

		try {
			fos = new FileOutputStream(filename);
			bos = new BufferedOutputStream(fos);
			out = new ObjectOutputStream(bos);
			out.writeObject(userList);

			out.close();
			fos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void login() {

		while (true) {
			System.out.println("※ Bit 편의점 로그인※");
			System.out.println("아이디를 입력해주세요 : ");
			String userID = sc.nextLine().trim();

			if (!userList.containsKey(userID)) {
				System.out.println("해당하는 ID가 없습니다.");
				login();
			} else if (userList.containsKey(userID)) {
				System.out.println("비밀번호를 입력해주세요 : ");
				String userPwd = sc.nextLine().trim();
				if (userList.get(userID).getPwd().equals(userPwd)) {
					System.out.println("Bit 편의점에 로그인 되었습니다.");
					break;
				} else {
					System.out.println("Password를 확인해 주세요");
				}
			}
		}

	}

	public void logout() {

	}

	public String findID(String userName, String userPhone) {
		return "ID";
	}

	public String findPwd(String ID, String userName) {
		return "pwd";
	}

	public void readUserList() {

	}

	public void readProductList() {

	}

	public void readDiscardProductList() {

	}

	public void readBoardList() {

	}
}
