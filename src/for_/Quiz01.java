package for_;

import java.util.Scanner;

public class Quiz01 { //사용자로부터 수를 입력 받아 받은 수 만큼 hello가 출력되게 만드세요.
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
	System.out.println("숫자 입력");

	
	int num = input.nextInt();
	for(int A=1; A<=num; A++)
	
		System.out.println( A +". hello");

	
}
}
