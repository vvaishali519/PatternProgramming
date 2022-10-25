
public class HappyDiwali {

	public static void main(String[] args) {
		
		int n=6;
		for (int i = 0; i < n; i++) {
			// H
			for(int j=0; j < n; j++) {
				if(j==0 || j==(n-1) || i==(n-1)/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			// A
			for (int j = 0; j < n; j++) {
				if( (j==0 && i > 0) || (j==(n-1) && i > 0) || (i==0 && j>0 && j<(n-1)) || i==(n-1)/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			// P
			for(int j = 0;j < n; j++) {
				if(j==0 || (i==0 && j<(n-1)) || (j==(n-1) && i>0 && i<(n-1)/2) || (i==(n-1)/2 && j<(n-1))) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			// P
			for(int j = 0;j < n; j++) {
				if(j==0 || (i==0 && j<(n-1)) || (j==(n-1) && i>0 && i<(n-1)/2) || (i==(n-1)/2 && j<(n-1))) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			// Y
			for(int j=0;j<n;j++) {
				if((i==j && j<=(n-1)/2) || (i+j == (n-1) && j>=(n-1)/2) || (j==(n-1)/2 && i>=(n-1)/2)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();	
		}
		
		for (int i = 0; i < n; i++) {
			// D
			
		}

	}

}
