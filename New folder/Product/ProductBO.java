package Product;
import java.util.Iterator;
import java.util.List;

public class ProductBO {
	int flag = 0;

	public void displayProductDetails(Product product) {

		System.out.format("%-10s %-20s %-20s %-10s\n", product.getId(),
				product.getProductName(), product.getSupplierName(),
				product.getPrice());

	}

	public void searchProductByPriceRange(List<Product> productList, int pl,
			int ph) {

		Product object;
		int price;
		for (Iterator<Product> it = productList.iterator(); it.hasNext();) {
			object = it.next();
			price = object.getPrice();
			if (price >= pl && price <= ph) {
				if (flag == 0) {
					System.out.format("%-10s %-20s %-20s %-10s\n", "Id",
							"ProductName", "SupplierName", "Price");
				}
				displayProductDetails(object);
				flag = 1;
			}
		}

		if (flag == 0) {
			System.out.println("No records found");
		}

	}

	public void searchProductByNameAndSupplier(List<Product> productList,
			String pname, String sname) {
		Product object;
		for (Iterator<Product> it = productList.iterator(); it.hasNext();) {
			object = it.next();
			if (object.getProductName().equalsIgnoreCase(pname)
					&& object.getSupplierName().equalsIgnoreCase(sname)) {
				System.out.format("%-10s %-20s %-20s %-10s\n", "Id",
						"ProductName", "SupplierName", "Price");
				displayProductDetails(object);
				flag = 1;
			}
		}

		if (flag == 0) {
			System.out.println("No records found");
		}
	}
}