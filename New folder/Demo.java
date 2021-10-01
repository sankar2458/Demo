import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			List<String> hall = new ArrayList<String>();
			
			System.out.println("Enter the number of halls:");
			int n = sc.nextInt();
			
			for(int i=1;i<=n;i++)
			{
				
				System.out.println("Enter the Hall Name "+(i));
				String name = sc.nextLine();
				hall.add(name);		
			}
			System.out.println(hall);
	}
}