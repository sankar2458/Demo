import java.util.Scanner;

public class Mainn {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of halls:");
		n = sc.nextInt();
		String arr[] = new String[n];
		
		for(int i=0;i<=n;i++)
		{
			arr[i]=sc.next();
			sc.nextLine();
		}
		System.out.println();
		System.out.format("%-15s %-10s %s\n","Name","Cost","Owner");
		for(int i=1;i<n+1;i++)
        {
			String x[] = arr[i].split(",");
            System.out.format("%-15s %-10s %s",x[0],x[1],x[2]);
            System.out.println();
        }
	}

}
