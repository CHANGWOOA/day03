package for_;

public class Quiz02 {
public static void main(String[] args) {
	//1~100까지의 합 중에서 그 합이 528일 때 i값을 출력 하시오.
	
	
	int sum=0, i=1;
	for( ; i<=100; i++) {
		sum=sum+i;
		if(sum==528)
			System.out.println(i);
	}
	
	//i의 값은 32
	
	
	
	
}
}
