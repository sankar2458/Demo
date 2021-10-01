 import java.io.*;
import java.util.*;
public class Mainn {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List itemTypeList = new ArrayList();
		
		ItemType itemType;
		
		int i = 0;
		char choice = '\0';
		
		do {
			itemType = new ItemType();
			System.out.println("Enter the details of Item Type "+(++i)+"\r\n"
					+ "Name:");
			itemType.setName(br.readLine());
			System.out.println("Deposit:");
			itemType.setDeposit(Double.parseDouble(br.readLine()));
			System.out.println("Cost per Day:");
			itemType.setCostPerDay(Double.parseDouble(br.readLine()));
			
			itemTypeList.add(itemType);
			System.out.println("Do you want to continue?(y/n)");
			choice = (char) br.read();
			br.readLine();
			
			
		}while(choice == 'y');
		
		System.out.format("%-20s%-20s%-20s\n","Name","Deposit","CostPerDay");
		
		for(ItemType itemTypes:itemTypeList) {
			System.out.println(itemTypes);
		}
	}
}