import java.util.*;
import java.io.*;
public class A {
	public static void main(String args[]) throws Exception{
	int choice,hallNo;
    boolean flag=true;
    HallBO obj=new HallBO();
    Listlist=obj.getHallList();
    String hallName,contactNo,ownerName;
    double perDayCost;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Hall hallObj;
    while(flag){
        System.out.println("Enter an option:");
        System.out.println("1.Add\n2.Replace\n3.Display\n4.Exit");
        choice=Integer.parseInt(br.readLine());
        switch(choice)
        {
            case 1:
                System.out.println("Enter the name of the hall:");
                hallName=br.readLine();
                System.out.println("Enter the contact number of the hall:");
                contactNo=br.readLine();
                System.out.println("Enter the cost per day of the hall:");
                perDayCost=Double.parseDouble(br.readLine());
                System.out.println("Enter the owner name of the hall:");
                ownerName=br.readLine();
                list.add(new Hall(hallName,contactNo,perDayCost,ownerName));
                System.out.println("Hall added successfully");
                break;
            case 2:
                System.out.println("Enter the hall number which should be replaced:");
                hallNo=Integer.parseInt(br.readLine());
                System.out.println("Enter the name of the replacement hall:");
                hallName=br.readLine();
                System.out.println("Enter the contact number of the replacement hall:");
                contactNo=br.readLine();
                System.out.println("Enter the cost per day of the replacement hall:");
                perDayCost=Double.parseDouble(br.readLine());
                System.out.println("Enter the owner name of the replacement hall:");
                ownerName=br.readLine();
                Hall hallObj1=new Hall(hallName,contactNo,perDayCost,ownerName);
                list.set(hallNo-1, hallObj1);
                System.out.println("Hall replaced successfully");
                break;
            case 3:
                obj.displayAll(list);
                break;
            case 4:
                System.out.println("Exiting Application");
                flag=false;
                break;
        }
    }
	}
}