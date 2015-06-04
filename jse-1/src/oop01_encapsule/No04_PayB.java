package oop01_encapsule;

public class No04_PayB {
	public static void main(String[] args) {
		 
		
		String hulk = "헐크";
		int hulkSalary = 200;
		String iron = "아이언";
		int ironSalary = 300;
		String thor = "헐크";
		int thorSalary = 500;
		
		No04_PayA hulkPay = new No04_PayA();
		No04_PayA ironPay = new No04_PayA();
		No04_PayA thorPay = new No04_PayA();
		hulkPay.setTax(hulkSalary);
		ironPay.setTax(ironSalary);
		thorPay.setTax(thorSalary);
		hulkPay.setIncome(hulkSalary);
		ironPay.setIncome(ironSalary);
		thorPay.setIncome(thorSalary);
		
		
		System.out.println("==="+hulk+"의 5월 급여내역===");
		System.out.println("급여: "+hulkSalary);
		System.out.println("세금: "+hulkPay.getTaxVal());
		System.out.println("실수령액: "+hulkPay.getIncome());
		System.out.println();
		System.out.println("==="+iron+"의 5월 급여내역===");
		System.out.println("급여: "+ironSalary);
		System.out.println("세금: "+ironPay.getTaxVal());
		System.out.println("실수령액: "+ironPay.getIncome());
		System.out.println();
		System.out.println("==="+thor+"의 5월 급여내역===");
		System.out.println("급여: "+thorSalary);
		System.out.println("세금: "+thorPay.getTaxVal());
		System.out.println("실수령액: "+thorPay.getIncome());
		System.out.println();
	}
}







