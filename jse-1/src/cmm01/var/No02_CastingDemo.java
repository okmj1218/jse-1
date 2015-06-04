package cmm01.var;
/*
 Date : 2015.05.11
 Author ������	
 Description : �ɽ��� ���� ���� �н��ڷ�
  * */
class No20_CastingDemo{
	public static void main(String[] args) {
/*
 Up - casting
 ��ȯ (conversion)
 =promotion
 =������(Implict) �ڵ���ȯ
 �ڵ��� ��ȯ�� ������ Ÿ���� ǥ�������� �����ʿ���
 ���� ������ ��ȯ�� �ɋ��� �����ϴ�.
 byte -> short -> int -> long -> float -> double
 char -> int
  
 * */
      byte varByte = 1;
      int varInt = 123;
      double varDouble = 123.456;
      
      int upByte = varByte;
      double upByte2 = varByte;
      double upInt = varInt;
      
		
		System.out.println("Hellojava");
		
		
		/*
		 Down - castings
		 =�ɽ���(Casting)
		 =������ȯ
		 ���α׷����� �����(Explict) ���� �����ϴ� Ÿ�Ժ�ȯ
		 ��Һ�ȯ�� �Ǵ� ��쿡�� �ݵ�� ��������� �ɽ����Ͽ��� �Ѵ�
		 ��, ������ �ս��� �߻��� �� �ִ�.
		 
		   * */
			Double varDou = 123.456;
			int varInt2 = 3;
		   // int downByte = (int) varDou;
			byte varB2 = (byte) varInt2;
			float varF = 123.456f;
			int varInt3 = (int) varF;
			
			System.out.println("varInt3 �� : "+ varInt3);
			
	}
  
 
	
	
}

