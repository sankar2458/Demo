package Exam;
import java.util.regex.*;
import java.util.*;
public class Qwerty{
public static boolean isValid(String email)
{
String regex = "^(.+)@(.+)$";
Pattern pattern = Pattern.compile(regex);
if (email == null)
return false;
return pattern.matcher(email).matches();
}
public static void main(String args[]){
String email;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the email address");
email = sc.next();
sc.nextLine();
boolean result = isValid(email);
if (result == true)
System.out.println("Valid email address");
else
System.out.println("Invalid email address");
}
}