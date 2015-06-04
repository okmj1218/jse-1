package cmm03.flow;

import java.util.Scanner;

public class No02_IfElseDemo3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요");
		int k = 0;
		k = scanner.nextInt();
		
		
		System.out.println("영어 점수를 입력하세요");
		int e = 0;
		e = scanner.nextInt();
		
		
		System.out.println("수학 점수를 입력하세요");
		int m = 0;
		m = scanner.nextInt();
		
		int sum = k + e + m;
		double avg = 0.0;
		String msg = "massage";
		avg = sum/3;
		//avg =Math.floor(sum/3);  -> 소수점 없에는 방법?
		
		
		if(avg==100){
			msg = "보너스지급";
	    }else if(avg > 70){
	    	msg = "시헙 합격입니다.";
	    }else{
	    	msg = "제 시험을 보세요";
	    }
		
		System.out.println("국어점수 "+k);
		System.out.println("영어점수 "+e);
		System.out.println("수학점수 "+m);
		System.out.println("총점 "+sum);
		System.out.println("평균 "+(int)avg);
		System.out.println("귀하의 시험결과 "+msg+"입니다.");
		
	}
	
}
