
public class Pattern3 {

	public static void main(String[] args) {
			
		int n=6;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i==0 && j>0) || (i == n-1 && j>0) || (j==0 && i>0 && i<n-1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			for(int j=0 ; j<n; j++)
			{
				if(i==0 && j>0 && j<(3*n)/4  || j==0 && i>0 && i<n-1 
						|| i==n-1 && j>0 && j<(3*n)/4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
					
				}
			}
			System.out.println();
		}

	}

}
