package api02.util.stringTokenize;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[] args) {
		StringTokenizer tok = new StringTokenizer("Hello Java");
		while (tok.hasMoreElements()) {
			String token = tok.nextToken();
			System.out.print("\t"+token); //\t 는 탭키를 나타냄
		}
	}
}
