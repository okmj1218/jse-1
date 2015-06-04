package cmm03.flow;

public class No02_IfElseDemo2 {
	public static void main(String[] args) {
		//지역변수 선언시 디폴트 값을 준다.
		int kor = 90, eng = 85, math = 60, sum = 0;
		double avg = 0.0;
		String msg = "message";
		char c = 'm';
		char e = 'e';
		
		sum = kor + eng + math;
		avg = sum/3;
		
		if(avg==100){
			msg = "보너스지급";
	    }else if(avg > 70){
	    	msg = "시헙 합격입니다.";
	    }else{
	    	msg = "제 시험을 보세요";
	    }
		
		System.out.println("국어 = "+ kor);
		System.out.println("영어 = "+ eng);
		System.out.println("수학 = "+ math);
		System.out.println("평균 = "+ avg);
		System.out.println("귀하의 시험 결과 "+ msg + "입니다");
	}
}
