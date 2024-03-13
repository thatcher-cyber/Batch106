package Loop;

public class StarEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		for(int i=10; i>=1; i--) {
			for(int j=1;j<=i;j++) {
				for(int k=0; k<=9;k++) {
				System.out.print("*");
				k++;
				}
			}
			System.out.println();
		}

	}

}
