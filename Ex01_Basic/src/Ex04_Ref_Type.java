// ����Ÿ�� ����

/*
 * Ŭ������ ���赵�̴�. Ŭ������ ���� Ÿ�Ե��� ���� ū Ÿ���̴�.
 * Ŭ���� == ���赵 == Ÿ��
 * Ŭ������ ��üȭ(���� ���� ����)�� ���ؼ� ����Ѵ�.
 * ���α׷� ���迡�� ���� ���� ������ new �����ڸ� ���ؼ� memory�� ���������. >> ��ü(�ν��Ͻ�)
 * 
 * ���赵
 * Ŭ������ 2���� ������ �ִ�.
 * 1. main �Լ��� ������ ���赵 >> ������ ���� ����.
 * 2. main �Լ��� ���� ���赵 >> �����ִ� ����. main �Լ� �ȿ��� �����ؾ��Ѵ�. > ���̺귯��(lib)
 * 
 * 
 */
class Apt2{ //���������� class�ȿ� class�� ������ �ʴ´�. ���� ������ ������ �Ѵ�. ������ ���Ǽ��� ���� �̷��� �ϴ� ��.
//	The type Apt is already defined. ���� ���� ���� ���� Ŭ������ ������ �� ����.
	
//	modifier ����������
//	�ϳ��� �ڹ����Ͽ��� �ϳ��� Ŭ������ �ִ� ���� ��Ģ�̴�.
//	public�� ���� �� �ִ� Ŭ������ �ϳ��� �����ϴ�.
	
	int door = 10;
	int window = 20;
}

public class Ex04_Ref_Type { 

	public static void main(String[] args) {
		// Apt2�� ���赵�̴�. new�����ڸ� ����Ͽ� ��üȭ�� ���� �޸𸮿� �÷���� ��밡���ϴ�.
		Apt2 lgapt = new Apt2();
//		lgapt ����(�������� = ��ü����(�ּҸ� ������ �ִ� ����))
		System.out.println("lgapt : " + lgapt); // lgapt : Apt2@15db9742
		
//		new�� ������� �ʰ� �ּҰ��� ������ ���
		Apt2 ssapt = lgapt; //�Ҵ絵 �ּҸ� ������ ����� �ϳ��̴�.
		ssapt.door = 555;

	}

}