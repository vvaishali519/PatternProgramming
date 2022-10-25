
public class MyName {

	public static void main(String[] args) {
		
		int n=6;
		for(int i=0;i<n;i++) {
			// V
			//D1
			for(int j=0;j<n;j++) {
				if(i==j && j<=(n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			//D2
			for(int j=0;j<n;j++) {
				if(i+j==(n-1) && j<=(n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			// A
			for(int j=0;j<n;j++) {
				if((j==0 && i>0) || (j==(n-1) && i>0) || (i==(n-1)/2) || (i==0 && j>0 && j<(n-1))) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			// I
			for(int j=0;j<n;j++) {
				if(i==0 || i==(n-1) || j==(n-1)/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			// S
			for(int j=0;j<n;j++) {
				if((i==0 && j<=3*n/4) || (j==0 && i<(n-1)/2) || (i==(n-1)/2 && j<3*n/4) || (j==3*n/4  && i>=(n-1)/2 && i<=(n-1)) || (i==(n-1) && j<=3*n/4)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			// H
			for(int j=0;j<n;j++) {
				if(j==0 || j==(n-1) || i==(n-1)/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			// A
			for(int j=0;j<n;j++) {
				if((j==0 && i>0) || (j==(n-1) && i>0) || (i==(n-1)/2) || (i==0 && j>0 && j<(n-1))) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			// L
			for(int j=0;j<n;j++) {
				if(j==0 || i==(n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			// I
		   for(int j=0;j<n;j++) {
			   if(i==0 || i==(n-1) || j==(n-1)/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			
			System.out.println();
		}
		
	}

}
