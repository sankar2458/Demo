package Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Long id;
		Integer price;
		String pname, sname;
		String choice;
		Scanner input = new Scanner(System.in);
		List<Product> ob = new ArrayList<Product>();
		Product objProduct;
		ProductBO obj = new ProductBO();
		do {
			System.out.println("Enter the product id");
			id = input.nextLong();
			input.nextLine();
			System.out.println("Enter the product name");
			pname = input.nextLine();
			System.out.println("Enter the supplier name");
			sname = input.nextLine();
			System.out.println("Enter the product price");
			price = input.nextInt();

			objProduct = new Product(id, sname, pname, price);
			ob.add(objProduct);
			System.out
					.println("Do you want to enter the details of another product? Enter yes or no (not case sensitive)");
			choice = input.next();

		} while (choice.equalsIgnoreCase("YES"));
		input.nextLine();
		System.out.println("Enter the minimum price range");
		int pl = input.nextInt();
		System.out.println("Enter the maximum price range");
		int ph = input.nextInt();
		obj.searchProductByPriceRange(ob, pl, ph);
	}
}




