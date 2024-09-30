package for_;

public class Ex01 {
public static void main(String[] args) {
	
	/* 규칙적으로 동작한다면 반복문 고려 */
	// 변수에 1을 저장 후 출력 시 1씩 증가 된 값으로 출력되게 만드세요
	// 10까지. 결과 : 1,2,3,4,5,6,7,8,9,10
	/*
	for(int i=1; i<=10; i++) {
		//System.out.println(i);
	}
	
	int num=2;
	for( ;num<=10;num=num+2) {
		System.out.println(num);
	}
	*/
	/*
	int num=2;
	
	//1~10까지의 수 중 짝수 출력
	System.out.println(num);
	num=num+2;
	System.out.println(num);
	num=num+2;
	System.out.println(num);
	num=num+2;
	System.out.println(num);
	num=num+2;
	System.out.println(num);
	*/
	
			/*
			System.out.println(i);
			System.out.println(i);
			i=i+1;
			System.out.println(i);
			i++;
			System.out.println(i);
			*/

//1~10까지 수 중 짝, 홀 구분해서 출력
	/*
	for(int f=1; f<=10; f++) {
		if(f%2==0) {
		System.out.println(f + " : 짝");
		}
		else{System.out.println(f + " : 홀");
	}
		
		*/
	
	
	/*
	int sum=0;
	int n=1;
	for( n=1; n<=10; n++) {
		//n++;
		sum=sum+n;
		System.out.println(sum);
	}
	*/
	 // System.out.println(sum);  << 최종 결과만 출력하겠다고 하면 반복문 안이 아닌 밖으로 빼면 된다.
	
	
	/*
	sum=sum+n;
	System.out.println(sum);
	n++;
	sum=sum+n;
	System.out.println(sum);
	n++;
	System.out.println();
*/
	
	//1~10까지의 합 중 짝, 홀 수의 합을 구해서 출력
	//결과 : 짝합 : 30, 홀합 : 25
	
	
	
	int evenSum=0, oddSum=0;
	int n=1;
	for(n=1; n<=10; n++){
	if(n%2==0) {
		evenSum=evenSum+n;
	}
	{oddSum +=n;
	}
	System.out.println("짝합 : " +evenSum);
	System.out.println("홀합 : " +oddSum);
	
	
	
	
}
}
}
