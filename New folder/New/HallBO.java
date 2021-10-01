package New;

import java.util.ArrayList;
import java.util.List;
//import oops.collections.p3.Hall;
public class HallBO {
    List<Hall>totalHall=new ArrayList<>();
	public List<Hall> getHallList() {
		List<Hall> hallList=new ArrayList<>();
		hallList.add(new Hall("SPK hall","12345",Double.parseDouble("10000"),"John"));
		hallList.add(new Hall("DRG hall","67890",Double.parseDouble("15000"),"Joe"));
		hallList.add(new Hall("EFG hall","45678",Double.parseDouble("20000"),"Jack"));
		return hallList;
	}
	
	public void displayAll(List<Hall> hallList) {
		System.out.printf("%-20s%-20s%-20s%-20s\n","Name","Contact Number","Cost per Day","Owner Name");
        for(int i=0;i<hallList.size();i++){
            Hall obj=hallList.get(i);
        System.out.printf("%-20s%-20s%-20s%-20s\n",obj.getName(),obj.getContactNumber(),obj.getCostPerDay(),obj.getOwnerName());
        }
	}
}