package cmm03.flow;

import java.util.Scanner;

public class No07_ManOrWoman {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요. ");
		String ssn = scanner.nextLine(); 
		char ch = ssn.charAt(7);
		
		if(ch == '1' || ch == '3'){
			System.out.println("남성입니다.");
		}else if(ch == '2' || ch == '4'){
			System.out.println("여성입니다.");
		}else{
			System.out.println("잘못입력하였습니다.");
		}
	}
}
