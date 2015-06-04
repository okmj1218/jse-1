package oop01_encapsule;

public class No04_PayC {
	private String name;
	private int salary; //급여
	public static final double tax = 0.1; //세율 0.1
	private int taxVal;
	private int income; //실급여 = 급여 - 급여*세율
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getTaxVal() {
		return taxVal;
	}
	public void setTaxVal(int salary) {
		this.taxVal = (int) (salary*tax);
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int salary) {
		this.income = salary-taxVal;
	}
	public static double getTax() {
		return tax;
	}

	

}
