package New;

import java.util.*;
public class Mainn {
	public static void main(String args[]) throws Exception{
	Scanner sc=new Scanner(System.in);
    ArrayList<String> hall=new ArrayList<String>();
    System.out.println("Enter the number of halls:");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
        System.out.println("Enter the Hall Name "+i);
        hall.add(sc.next());
    }
    System.out.println("Enter the hall name to be searched:");
    String find=sc.next();
    if(hall.contains(find))
    {
        int pos=hall.indexOf(find);
        System.out.println(find+" hall is found in the list at position "+pos);
    }
    else
    {
    System.out.println(find+" hall is not found");    
    }
 } 
}