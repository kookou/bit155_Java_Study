import java.util.Scanner;

public class Ex12_do_while_Static_Menu {
	// 상단 에는 일반적으로 변수(instance)를 만든다 (고유, 상태, 부품,(참조:클래스))
	Scanner sc = new Scanner(System.in); // 부품 (참조:클래스)

	// 기능
	void inputRecord() {
		System.out.println("성적 데이터 입력 : ");
	}

	void deleteRecord() {
		System.out.println("성적데이터 삭제 : ");
	}

	void sortRecord() {
		System.out.println("성적데이터 정렬 : ");
	}

	int displayMenu(){
		System.out.println("****************");
		System.out.println("*****성적관리*****");
		System.out.println("1.학생성적 입력하기");
		System.out.println();
		System.out.println("2.학생성적 삭제하기");
		System.out.println();
		System.out.println("3.학생성적 이름순 정렬하기");
		System.out.println();
		System.out.println("4.프로그램 종료");
		System.out.println();		
		
		
		int menu = 0;
	
		do{
			try{  
				menu = Integer.parseInt(sc.nextLine());
				if(menu >=1 && menu <=4) {
					break;
				}else {
					//1보다 작거나 4보다 큰 값.. 프로그램적 오류 (x)
					//나는 오류로 보겠다(오류사용 강제)
					//System.out.println("잘못입력 하셨습니다.");
					throw new Exception("메뉴 선택 번호가 잘못 되었습니다");
				}
			}catch (Exception e){
				System.out.println(e.getMessage());
				System.out.println("메뉴선택 문제 발생");
				System.out.println("메뉴 1~4번까지 입력");
			
			}
			
		}while(true);
		//실행 : 사용자가 1~4까지 번호중에서 하나를 선택
		
		return menu;
		
	}

	public static void main(String[] args) {
		
		Ex12_do_while_Static_Menu ex11 = new Ex12_do_while_Static_Menu();
		while(true){
			switch(ex11.displayMenu()){
			case 1: ex11.inputRecord();
				break;
			case 2: ex11.deleteRecord();
				break;
			case 3: ex11.sortRecord();
				break;
			case 4: System.out.println("프로그램종료");
			        //return;  //main 함수 종료 
			        System.exit(0); //프로그램 강제종료 (kill)
				
			}
		}
	}

}
