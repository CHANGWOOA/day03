package if_;

import java.util.Scanner;

public class Quiz01 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int num;
	System.out.println("커피만 팔아요, 커피는 한 잔당 2000원인데 10잔 넘어가면 그 이상부터는 잔 당 1500원입니다");
	num=input.nextInt();
	if(num<=10)
	{System.out.println(num*2000);}
	else if(num>10) {
		System.out.println(num+"잔 입니다.");
		System.out.println("가격은 총"+(10*2000 + (num-10)*1500)+"원 입니다." );
	}

	System.out.println("---3,4 배수---");
int num1;
System.out.println("수 입력");
num1=input.nextInt();
if(num1%3==0&&num1%4==0) { //num%12==0
	System.out.println("3,4배수");
} else if(num1%3==0) {
	System.out.println("3의 배수");
} else if(num1%4==0) {
	System.out.println("4의 배수");
} else if(num1%3!=0||num1%4!=0) {
	System.out.println("3,4 배수 아님");
}
else {System.out.println("0이다");



}
}}
