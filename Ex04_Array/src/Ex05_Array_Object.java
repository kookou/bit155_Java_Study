import kr.or.bit.Emp;

public class Ex05_Array_Object {
	public static void main(String[] args) {
		// 1. 사원 3명을 만드세요 (단 배열을 사용하세요)
		// 1000,홍길동
		// 2000,김유신
		// 3000,유관순
		// 각각의 정보를 출력하세요

		Emp[] emp = new Emp[3];
		emp[0] = new Emp();
		emp[0].setEmpno(1000);
		emp[0].setEname("홍길동");

		emp[1] = new Emp();
		emp[1].setEmpno(2000);
		emp[1].setEname("김유신");

		emp[2] = new Emp();
		emp[2].setEmpno(3000);
		emp[2].setEname("유관순");

		// 2.사원 3명의 사번과, 이름을 출력하세요
		for (int i = 0; i < emp.length; i++) {
			emp[i].empInfoPrint();
		}

		// int[]arr = new int[]{10,20,30}
		// 사원 2명 만드세요
		Emp[] emplist = new Emp[]{new Emp(1,"이씨"),new Emp(2,"박씨")};
		for (int i = 0; i < emplist.length; i++) {
			emplist[i].empInfoPrint();
		}
		
		//int[] arr = {10,20}
		Emp[] emplist2 = {new Emp(3,"김씨"),new Emp(4,"박씨")};
		for (int i = 0; i < emplist2.length; i++) {
			emplist2[i].empInfoPrint();
		}
		
		
		

	}

}
