import java.util.Scanner;

public class Ex10_Statment {

	public static void main(String[] args) {
		//�ݺ��� (while, do~while)
		int i = 10;
		while(i >= 10){ //������ true ���
			System.out.println(i);
			//�ݵ�� ���ǿ� �������� ����  true / false ���ϸ� ���ѷ���
			i--;
			
		}
		
		
		
		//while(1~100) ������ �� 
		//������ : ��������
		int sum = 0;
		int j = 1;
		while(j <=100){
			//sum+=j; //sum = sum+j
			//j++; //1~100������ �� : 5050
			
			//���� �սô� (*�������� ����*)
			j++;
			sum+=j; //1~100������ �� : 5150
		}
		System.out.println("1~100������ �� : " + sum);
		
		//while ������ ����ϼ���
		//while(){while()}
		
		int k = 2;
		int p= 1;

		while(k <=9 ){
			p=1; //p�� �ٽ� 1�� �ʱ�ȭ
			while (p <=9){
				System.out.printf("[%d]*[%d]=[%d]\t",k,p,k*p);
				p++; //������ 10
			}
			System.out.println();
			k++;
		}
		int k1 = 2;
		while(k1 <=9 ){
			int p1= 1; //p�� �ٽ� 1�� �ʱ�ȭ
			while (p1 <=9){
				System.out.printf("[%d]*[%d]=[%d]\t",k1,p1,k1*p1);
				p1++; //������ 10
			}
			System.out.println();
			k1++;
		}
		//while (true){if(true) {break;}}
		
		
		//do ~while : ������ ���� ������ �ѹ��� ����ǰ� �ϰڴ�
		//do { ���๮  } while { ����  }
		//�޴� ����
		//1.�λ�
		//2.�޿�
		//����� ���ϴ� ���� ��ȣ�� �Է��ϼ��� ? do {} ������ 
		//�Է°� : 3 while(����) ���� �Ǵ� 
		
		Scanner sc = new Scanner(System.in);
		int inputdata = 0;
		do{
			System.out.println("���� �Է��� (0~9)");
			inputdata = Integer.parseInt(sc.nextLine());
		}while(inputdata >= 10); //������ true �̸� do���� ��� ����
			//while ���� ���� true �� ���´ٸ� do{}���� ��� �ݺ��ض�
			//inputdata ���� 0~9 �´ٸ� ���� false  ��ȯ .. Ż��	
		System.out.println("����� �Է��� ���ڴ�  : " + inputdata);

	
	
		


	}

}