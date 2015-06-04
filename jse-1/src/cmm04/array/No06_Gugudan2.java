package cmm04.array;

public class No06_Gugudan2 {
	public static void main(String[] args) {
		for(int i=1;i<10;i++){
			for(int j=2;j<10;j+=4){
				System.out.print(j+ "*"+ i+ "="+j*i+"\t");
				System.out.print((j+1)+ "*"+ i+ "="+j*i+"\t");
				System.out.print((j+2)+ "*"+ i+ "="+j*i+"\t");
				System.out.print((j+3)+ "*"+ i+ "="+j*i+"\t");
			}
			System.out.println();
		}
	}
}
