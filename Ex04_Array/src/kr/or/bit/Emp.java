package kr.or.bit;

public class Emp {
	private int empno;
	private String ename;
	
	
	public Emp() {}
	
	public Emp(int empno, String ename){
		this.empno = empno;
		this.ename = ename;
	}
	
	//필요하다면 setter , getter 

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	//기능 (출력)
	public void empInfoPrint(){
		System.out.println(this.empno+ "/"+ this.ename);
	}
	
	
	
	
	

	

}
