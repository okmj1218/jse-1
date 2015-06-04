package oop01_encapsule;

public class No04_pAverageB {
	/*필드 선언*/
	String name;
	int kor;
	int eng;
	int tot;
	double avg;
	
	/*이름 저장하는 기능*/
	public void setName(String foo){
		this.name = foo;             //instance 변수 = parameter
	}
	/*점수를 저장하는 기능*/
	public void setKor(int kor){
		this.kor = kor;
	}
	public void setEng(int eng){
		this.eng = eng;
	}
	/*합계를 구하는 기능*/
	public void setTot(int kor,int eng){
		this.tot = kor + eng;
		
	}
	/*평균 점수를 구하는 기능*/
	public void setAvg(int tot){
		this.avg = tot/2;
	}
	/*평균 점수를 구하는 기능 2... 국어 영어점수 두개만으로 구하기*/
	/*Overloading : 오버로딩*/
	public void setAvg2(int kor, int eng){
		this.avg = (kor + eng)/2;
	}
	
	public static void main(String[] args) {
		/*학생 객체 생성 및 메모리 할당*/
		No04_pAverageA hulk = new No04_pAverageA();
		No04_pAverageA iron = new No04_pAverageA();
		No04_pAverageA hawk = new No04_pAverageA();
		
		/*이름 저장*/
		hulk.name = "헐크";
		iron.name = "아이언";
		hawk.name = "호크아이";
		
		/*점수 저장*/
		hulk.kor = 100;
		hulk.eng = 80;
		iron.kor = 50;
		iron.eng = 90;
		hawk.kor = 20;
		hawk.eng = 40;
		
		/*총점, 평균 계산*/
		hulk.tot = hulk.kor + hulk.eng;
		hulk.avg = hulk.tot/2;
		iron.tot = iron.kor + iron.eng;
		iron.avg = iron.tot/2;
		hawk.tot = hawk.kor + hawk.eng;
		hawk.avg = hawk.tot/2;
		
		/*출력*/
		System.out.println("==="+iron.name+" 의 성적표===");
		System.out.println("국어: " + iron.kor);
		System.out.println("영어: " + iron.eng);
		System.out.println("합계: " + iron.tot);
		System.out.println("평균: " + iron.avg);
		System.out.println();
		
		System.out.println("==="+hulk.name+" 의 성적표===");
		System.out.println("국어: " + hulk.kor);
		System.out.println("영어: " + hulk.eng);
		System.out.println("합계: " + hulk.tot);
		System.out.println("평균: " + hulk.avg);
		System.out.println();
		
		System.out.println("==="+hawk.name+" 의 성적표===");
		System.out.println("국어: " + hawk.kor);
		System.out.println("영어: " + hawk.eng);
		System.out.println("합계: " + hawk.tot);
		System.out.println("평균: " + hawk.avg);
		System.out.println();
	}
}
