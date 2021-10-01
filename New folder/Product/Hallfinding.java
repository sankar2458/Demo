package Product;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Hallfinding {

	public static void main(String[] args) {
		String name;
		
		Scanner sc = new Scanner(System.in);
		List<String> hall = new ArrayList<String>();
		
		System.out.println("Enter the number of halls:");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			
			System.out.println("Enter the Hall Name "+(i+1));
			name = sc.next();
			sc.nextLine();
			hall.add(name);		
		}
		System.out.println(hall);
	}

}