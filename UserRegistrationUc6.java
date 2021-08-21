package ProgrammingKnowledge;
import java.util.Scanner;
import java.util.regex.Pattern;
public class UserRegistrationUc6 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		Firstname();
		Lastname();
		mailId();
		mobileNo();
		password();
		mail();
	}  
	public static void Firstname()
	{
		 System.out.println("Enter First Name");
		 String firstname = sc.next();
		 System.out.println(Pattern.matches("[A-Z][a-z]{2,}",firstname));
	}
	public static void Lastname()
	{
		 System.out.println("Enter Last Name");
		 String lastname = sc.next();
		 System.out.println(Pattern.matches("[A-Z][a-z]{2,}",lastname));
	}
	public static void mailId()
	{
		 String Email ="abc.xyz@bl.co.in";
		 System.out.println(Pattern.matches("^(abc)[.][a-z]+[@](bl)[.](co)[.][a-z]+$",Email));
	}
	public static void mobileNo()
	{
		 System.out.println("Enter Mobile no:");
		 String mobileno = sc.next();
		 //number should start with code 91 and after that it should be start from 7,8 or9
		 System.out.println(Pattern.matches("^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[789]\\d{9}$",mobileno));
	}
	public static void password()
	{
		 System.out.println("Enter The Password:");
		 String password = sc.next();
		 //password should have min 8 Char, 1 spl char, atleast 1 upper case, numbers should be there.
		 System.out.println(Pattern.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$",password));
	}
	public static void mail()
	{
		 System.out.println("Enter any mail:");
		 String mail = sc.next();
		 System.out.println(Pattern.matches("^[a-zA-z0-9.+_-]{2,}@[a-zA-z0-9]{1,}[.]{1}[a-z]{2,}$",mail));
	}

}

