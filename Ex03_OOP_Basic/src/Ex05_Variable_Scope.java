/*
**instance variable >> class Car {public String color;}
**local variable >> class Car { public void move(){int speed}}
main 함수 안에 있는 모든 변수는 : local variable >> 초기화
static variable > 공유자원 (객체간), 객체 생성 이전에 memory 에 올라 가는 자원

 */

class Variable{
	int iv;
	/*
	 1.member field, instance variable
	 2.Variable v = new Variable();  heap 메모리에 iv 생성
	   Variable v2 = new Variable();  heap 메모리에 iv 생성
	 3.목적 : 정보를 담으려고 한다 (정보에 맞는 Type 을 가져야 한다)
	   - 정보(속성) >> 고유, 상태, 부품 (참조정보)
	   - 정보는 생성되는 객체마다 다른 값을 가질 수 있다.
	   - 그러기 때문에 굳이 초기화를 하지 않는다
	   - 기본적으로 default 값 : int > 0 , float > 0.0 , boolean > false , String > null , 참조타입 : null
	 4. 변수 생성시점 : new 라는 연산자를 통해서 heap 객체가 만들어 지고 바로 변수 생성
	 */
	
	static int cv;
	/*
	 1. class variable (클래스 변수), static variable (공유(객체간) 변수)
	 2. 목적 : 정보를 담는 것 *** ~~~(생성되는 모든 객체가 공유하는 자원 : 객체간 공유자원
	    heap 영역에 생성된 [객체]들의 [공통]자원(공유자원)
	 3. 특징 : 접근방법 > 클래스 이름 .static 변수명 (객체가 만들어 지지 않은 상황에서도 접근 가능)
	    ex) Math.Random() >> 사용하기 위해서 >> Math m = new Math () -> m.Random(x)
	                    접근방법 > 누구의 것도 아니기에 > 참조변수.static 변수명
	    ex) Variable v = new Variable();
	        Variable v2 = new Variable();
	        1.variable.cv   클래스 이름으로
	        2.v.cv          참조 주소로
	        3.v2.cv         참조 주소로
	        
	        class Hello { public static void main(String[] args) { syso..}}
	 4. 생성시첨 : Hello.java > javac Hello.java > Hello.class
	 
	            > java.exe Hello 엔터.. 실행
	            > class loader System 에 의해서
	                           클래스 정보(metadata : 설명) class area (method area)올려요
	            --이 class 는 언제 만들었고 어떤 자원을 import 하고 있고 변수는 몇개고.. 기술하는것
	            --이 class 안에 static variable 또는 static method 가 있으면
	            --이 녀석을 memory (class area) 에 올려 놓는다 
	 */
	void method(){
		int lv = 0;
		/*
		 local variable (함수 안에 있는 지역변수 : (선언은 가능) 반드시 사용전에 초기화 해야한다)
		  생명주기 : 함수가 호출되면 생성되었다가 함수가 끝나면 소멸된다
		        *함수 안에는 제어문
		        for (int i..) >> i 변수는 for 문이 실행되면 생성 되었다가 for 문이 끝나면 소멸
		        --블럭변수   
		 */
	}
}




public class Ex05_Variable_Scope {

	public static void main(String[] args) {
		int num=0;
		System.out.println(num);
		Variable.cv = 100;
		Variable v = new Variable();
		Variable v2 = new Variable();
		v2.cv = 500;
		
	}
}
