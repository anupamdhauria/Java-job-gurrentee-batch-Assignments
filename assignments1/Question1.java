package assignments1;

public class Question1 {

	public static void main(String[] args) {
int n=6;
		
		for(int i=0;i<n;i++)
		{
			//i
			for(int j=0;j<n;j++)
			{
				if(j==(n-1)/2 && i!=1||i==0 && j==(n-1)/2 )
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			
			//N
			
			for(int j=0;j<n;j++)
			{
				if((j==0)|| j==(n-1) ||i==j)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			//E
			System.out.print("	");
			for(int j=0;j<n;j++)
			{
				if(j==0 || i==0||i==(n-1)|| i==(n-1)||i==(n-1)/2)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("	");
			//U
			for(int j=0;j<n;j++)
			{
				if(j==0 && i<(n-1)|| j==(n-1) && i<(n-1) ||i==(n-1)&& j>0&&j<n-1 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("	");
			//R
			for(int j=0;j<n;j++)
			{
				if(j==0 || i==0 && j<n-1 || i==(n-1)/2 && j<(n-1) || j==(n-1)&& i>0 && i<(n-1)/2 ||
						 i>=(n-1)/2 &&(i-j)==n-i-1 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("	");
			
			//O
			for(int j=0;j<n;j++)
			{
				if((i==0 && j>0 && j<n-1)||
					(i==n-1 && j>0 && j<n-1)||
					(j==0 && i>0 && i<n-1)||
					(j==n-1 && i>0 && i<n-1))
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("	");
			
			for(int j=0;j<n;j++)
			{
				if((j==0)|| j==(n-1) ||i==j)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
