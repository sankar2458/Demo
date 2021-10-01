package Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayMain {
	public static void main(String[] args) {
	String name;
	String choice;
	double deposit,cpd;
	Scanner sc = new Scanner(System.in);
	List<ItemType> ob = new ArrayList<ItemType>();
	ItemType objProduct;
	do {
		System.out.println("Enter the details of Item Type ");
		System.out.println("Name:");
		name = sc.next();
		sc.nextLine();
		System.out.println("Deposit:");
		deposit = sc.nextDouble();
		sc.nextLine();
		System.out.println("Cost Per Day:");
		cpd=sc.nextDouble();
		sc.nextLine();
		
		

		ItemType type = new ItemType(name,deposit,cpd);
		objProduct = type;
		ob.add(objProduct);
		System.out.println("Do you want to enter the details of another product? y/n");
		choice = sc.next();

	} while (choice.equalsIgnoreCase("Y"));
	//sc.nextLine();
	System.out.format("%-20s %-20s %-20s\n", "Name", "Deposit", "CostPerDay");
	System.out.println(" %-20s %-20s %-20s\n"+ob.toString());
	}
}

