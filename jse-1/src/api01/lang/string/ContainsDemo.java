package api01.lang.string;
/*
 java.lang.String 에 있는 메소드
 contain("a") : 문자열 중에 a가 있는지 체크
 */
public class ContainsDemo {
	public static void main(String[] args) {
		String str = "abcde";
		/*
		 str.contains("f") ? "f가 있음" : "f가 없음"
		  은 삼항연산자로(...) 부분이 참이면 앞쪽 ""을
		  거짓이면 뒷쪽 ""을 리턴한다.
		 */
		System.out.println(str.contains("f") ? "f가 있음" : "f가 없음");
	}
}
