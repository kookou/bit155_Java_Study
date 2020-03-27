import java.util.Scanner;

public class Ex06_Operation {
	public static void main(String[] args) {
		int sum = 0;
		// ���Կ����� : +=, -=, *=, ...
		// sum = sum + 1;
		sum += 1;
		// sum = sum -1;
		sum -= 1;
		System.out.println("sum: " + sum);

		// ������ ���� ���⸦ ������!
		// ���� : A+, A-, B+, B- ...F
		// ������ ���� : 94��

		// �Ǵܱ��� : 90�� �̻��̸� A
		// �׷��� 95�� �̻��̸� A+
		// �ƴϸ� A-

		int score = 65;
		String grade = ""; // ���ڿ��� �ʱ�ȭ
		System.out.println("����� ������: " + score + " �Դϴ�.");

		// ���� Ǭ ����
		// if(score >= 90) {
		// grade = "A";
		// grade = (score >= 95) ? grade+"+" : grade+"-";
		// }else if(score >= 80) {
		// grade = "B";
		// grade = (score >= 85) ? (grade+="+") : (grade+="-"); //���Կ����ڸ� ������ ��ȣ��
		// �켱������ ǥ��������Ѵ�.
		// }else if(score >= 70){
		// grade = "C";
		// grade = (score >= 75) ? grade+"+" : grade+"-";
		// }else if(score >= 60){
		// grade = "D";
		// grade = (score >= 65) ? grade+"+" : grade+"-";
		// }else{
		// grade = "F";
		// }

		// ������ �Ǽ� ����
		// �������� ���� �ǵ��� ���Կ����ڸ� ���� ���������� ���ֽ� ����
		if (score >= 90) {
			grade = "A";
			if (score >= 95) { // ��ø if��. if�� �ȿ� if���� ����� �� �ִ�.
				grade += "+";
			} else {
				grade += "-";
			}
		} else if (score >= 80) {
			grade = "B";
			if (score >= 85) {
				grade += "+";
			} else {
				grade += "-";
			}
		} else if (score >= 70) {
			grade = "C";
			if (score >= 75) {
				grade += "+";
			} else {
				grade += "-";
			}
		} else if (score >= 60) {
			grade = "D";
			if (score >= 65) {
				grade += "+";
			} else {
				grade += "-";
			}
		} else {
			grade = "F";
		}

		System.out.println("����� �����: " + grade + " �Դϴ�.");

		
		//����Ű
		// syso + Ctrl + Space > System.out.println();
//		Ctrl + Shift + F > �ҽ� �ڵ�����

		
		int data = 95;
		switch(data){
		case 100 : System.out.println("100 �Դϴ�.");
			break; //������ �帧�� ����� switch�� �����
		case 90 :  System.out.println("90 �Դϴ�.");
			break;
		case 80 :  System.out.println("80 �Դϴ�.");
			break;
		default :  System.out.println("default");
		}
//		switch���� ���� �ܿ�� !! ���̽��躸���� �ܿ����Ѵ�.
//		break�� �ʼ���Ұ� �ƴϴ�. �ʿ信 ���� ����ϸ� �ȴ�.
//		break�� �������� ������ ������ �����ϴ� �� ���ĺ��� ��� ����ȴ�.
		
		data = 80;
		switch(data){
		case 100 : System.out.println("100 �Դϴ�.");		
		case 90 :  System.out.println("90 �Դϴ�.");	
		case 80 :  System.out.println("80 �Դϴ�.");
		default :  System.out.println("default");
		}
		
		int month = 2;
		String res = "";
		switch (month){
			case 1 : ;
			case 3 : ;
			case 5 : ;
			case 7 : ;
			case 8 : ;
			case 10 : ;
			case 12 : res = "31";
				break;
		
			case 4 : ;
			case 6 : ;
			case 9 : ;
			case 11 : res = "30";
				break;
		
			case 2 : res = "29";
				break;
			default : res = "�� �����Ͱ� �ƴմϴ�.";
		}
		System.out.println(month + "���� �� ���� " + res +"�� �Դϴ�.");
		
//		���� (������ : ������ ���Ⱚ)
		
//		https://docs.oracle.com/javase/8/docs/api/index.html
//		�˻�
//		java.lang.Math (Math Ŭ����)
//		Math.Random() �Լ� : ȣ�⿡ ���ؼ��� �����	
//		java ���������� default�� ������� ������ �ִ�. (java.lang ����)
//		import java.lang.* �� ������ �����Ǿ��ִ� �Ͱ� ����������.
//		���� �Լ��� ��� �� �� ������ ��Ģ������ �������� �ʾƵ� �ȴ�.
//		kr.or.bit.Emp //��Ģ���� ���ٹ��	
//		Math.random();
//		static : ��ü�� �������� �ʾƵ� ��� ������ �Լ�
//		greater than or equal to 0.0 and less than 1.0.
//		����� doubleŸ���� �Ǽ����� �����ϴµ� 0.0<= random < 1.0
		
//		random�� ����Ͽ� ��÷���α׷��� ���� �� �ִ�.
		System.out.println("Math.random() : " + Math.random());
//		random���� double�� ǥ���� �� �ִ� ���� ������ ���´�.
//		������ ������ ���� ���� �� �� �ִ�.

		System.out.println("Math.random()*10 : " + Math.random() * 10);
//		������ ���� : 0.0���� 10.0�̸��� �Ǽ�
		System.out.println("(int)(Math.random()*10) : " + (int)(Math.random() * 10));
//		������ ���� : 0�̻� 10�̸��� ����
		System.out.println("((int)(Math.random()*10))+1 : " + ((int)(Math.random() * 10)+1));
//		������ ���� : 1�̻� 10������ ����
		
		
		
//		��ȭ�� ��ǰ �ý��� �����
		
//		int dScore = (int)((Math.random() * 10)+1)*100;
//		String gift = "";		
//		switch(dScore) {
//		case 1000 : gift = "TV, ��Ʈ��, �����, �ѿ켼Ʈ, ����";
//			break;
//		case 900 : gift = "��Ʈ��, �����, �ѿ켼Ʈ, ����";
//			break;
//		case 800 : gift = "�����, �ѿ켼Ʈ, ����";
//			break;
//		case 700 : gift = "�ѿ켼Ʈ, ����";
//			break;
//		case 600 : gift = "����";
//			break;
//		default : gift = "ĩ��";
//		}
//		System.out.println("�������� ������ " + dScore + "�� �Դϴ�!\n" + gift + "�� ��÷�Ǽ̽��ϴ�!");
//		
		
//		int dScore = (int)((Math.random() * 10)+1)*100;
//		String gift = "";
//		if (dScore == 1000) {
//			gift = "TV, ��Ʈ��, �����, �ѿ켼Ʈ, ����";
//		} else if (dScore == 900) {
//			gift = "��Ʈ��, �����, �ѿ켼Ʈ, ����";
//		} else if (dScore == 800){
//			gift = "�����, �ѿ켼Ʈ, ����";
//		} else if (dScore == 700) {
//			gift = "�ѿ켼Ʈ, ����";
//		} else if (dScore == 600) {
//			gift = "����";
//		} else {
//			gift = "ĩ��";
//		}
//		System.out.println("�������� ������ " + dScore + "�� �Դϴ�!\n" + gift + "�� ��÷�Ǽ̽��ϴ�!");
//	
//		
		int dScore = (int)((Math.random() * 10)+1)*100;
		String msg = ""; //�ʱ�ȭ
		msg = "�������� ������ " + dScore + "�� �Դϴ�!\n" + "��ǰ : ";
		switch(dScore) {
			case 1000 : msg += "TV "; //���� ��ģ �κ� : break�� ������� �ʾƵ� �ȴ�. ������� �ʴ� ���� �� ȿ�����̴�. ��ǰ�� ��ü ��Ͽ��� �ϳ��� ������ �����̴�.
			case 900 : msg += "��Ʈ�� ";
			case 800 : msg += "����� ";
			case 700 : msg += "�ѿ켼Ʈ ";
			case 600 : msg += "����";
			break;
			default : msg += "ĩ��";
		}
		System.out.println(msg);
		
		
	
	}
}

//			20200220 ������ ���� ����
//			����Ÿ��^, ������(����^, ����^, ����, ��Ʈ���(2����), ���׿�����),
//			���(if^, while^, for^(for�� �ۿ� ������ �����ϰ� for������ �ʱ�ȭ�ϴ� ��� ������ ��°�), 
//			switch, ��������^, ��ȭ�� ��ǰ ��÷��^), ����,
//			�ڹ��� �����Ģ



