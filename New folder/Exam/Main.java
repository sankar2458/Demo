package Exam;

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the book details(code,title,author,price,category)");
        String[]arr = sc.nextLine().split(",");
        System.out.println("Menu");
        System.out.println("1.Buy book");
        System.out.println("2.Rent book");
        int n = sc.nextInt();
        if(n==1){
            System.out.println("Bill:");
            
        }
	}
}
