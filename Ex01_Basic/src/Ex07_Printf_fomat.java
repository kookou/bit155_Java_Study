import java.util.Scanner;

public class Ex07_Printf_fomat {

	public static void main(String[] args) {
		//java : System.out.println();
		//C# : Console. WirteLine();
		
		System.out.println();//줄바꿈
		System.out.print("A");
		System.out.print("B");
		System.out.println("C");
		System.out.println("D");
		
		int num = 100;
		System.out.println(num);
		System.out.println("num 값은 : " + num + "입니다");
		//형식 format
		System.out.printf("num 값은 : %d 입니다 \n", num);
		//format 형식 문자 (약속)
		//%d (10진수 형식의 정수값) >> d라는 자리에 
		//%f (실수가 올수있는 자리)
		//%s (문자열을 넣을수 있는 자리)
		//%c (문자 (char) 를 넣을수 있는 자리)
		//\t > tab , \n > enter (줄바꿈)
		System.out.printf("num 값은[%d] 입니다 그리고[%d]도 있어요 \n", num , 5555);
		
		float f = 3.14f;
		System.out.println(f);
		System.out.printf("f 변수값은 %f 입니다 \n",f);
		
		//반대로 
		//cmd (console) 창에서 데이터 입력 받기
		//java.util.Scanner
		Scanner sc = new Scanner(System.in);
		//단축키 : ctrl shift + o >> import 구문 자동 생성하기
		//System.out.println("값을 입력하세요");
		//String value = sc.nextLine();  //입력하고 엔터 칠때까지 대기 (문자열로 반환)
		//System.out.println(value);
		
		//int number = sc.nextInt();
		//System.out.println("정수값 : " + number);
				
		//float fnumber = sc.nextFloat();
		//System.out.println("실수값 : " + fnumber);
		
		//권장사항 : nextInt , nextFloat 보다는 nextLine() 으로 사용하자
		//Today Point
		//[문자를  -> 숫자로 (정수, 실수)]
		//Interger.parseInt("11") 문자를 정수로
		//Float.parseFloat("3.111") 문자를 실수로
		//Double.parseDouble(s)
		
		System.out.println("숫자 입력하세요");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println("정수값 : " + num2);
		
		//Tip
		//숫자를 ->문자로
		String data = String.valueOf(10000);
		System.out.println(data);
		
		
		
		
		
	}

}
