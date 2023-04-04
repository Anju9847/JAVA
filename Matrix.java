import java.util.Scanner;
class Matrix
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows");
		int m = sc.nextInt();
		System.out.println("Enter the number of columns");
		int n = sc.nextInt();
		int i,j;
		int[][] a =new int[2][3];
		int[][] b =new int[2][3];
		int[][] c =new int[2][3];
		System.out.println("Enter the first matrix :");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
			a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the second matrix :");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
			b[i][j] = sc.nextInt();
		}	}
		//add c =a+b
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
			c[i][j] = a[i][j]+b[i][j];
			}
		}

		System.out.println("The resultant matrix :");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
			System.out.println(c[i][j]+" ");
			}
			System.out.println(" ");
		}
		
	}
}


