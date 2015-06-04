package oop01_encapsule;

public class No04_PayA {
	private String name;
	private int salary; //급여
	public static final double tax = 0.1; //세율 0.1
	private int taxVal;
	private int income; //실급여 = 급여 - 급여*세율
	
	
	public void setTax(int salary){
	//	System.out.println("PayA 에 넘어온 파라미터값 :" + salary);
		this.taxVal = (int) (salary*tax);
	}
	
	public void setIncome(int salary){
		this.income = (int) (salary - taxVal);
	}
	
	public int getTaxVal(){
		return (int) taxVal;
	}

	public int getIncome(){
		return income;
	}
	
}




/*
 객체지향 4대 특징(4대 문법)
 은닉화(encapsule)        getter(read)    setter(write)
 상속(inheritance)         필드에 있는             필드에 있는
 추상화(implement)         값을 읽어오는 것        값을 저장하는것 
 다형성(polymorphism)
 * */






