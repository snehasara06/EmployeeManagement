
//Phone number validation with Polymorphism & abstraction 
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public  class PhNoValidation extends ValidateEmployeeData
{
	/*public static boolean checkPhNo(String employeePhoneNo)
		{
			Pattern pattern=Pattern.compile("(6/7/8/9)?[7-9][0-9]{9}");
			Matcher matcher=pattern.matcher(employeePhoneNo);
			return (matcher.find() && matcher.group().equals(employeePhoneNo));
		}
	
	public int validate(String employeePhoneNo)
		{
			if(checkPhNo(employeePhoneNo))
			{
				System.out.println("Employee PhoneNo:"+employeePhoneNo+"\n");
			return 1;
			}
			else
			{
				System.out.println("Phone number should be of 10 digits only and start with 6,7,8,or 9.\n");
				return 0;
			}
			
		}*/
	public String validate()
	{
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter phone number: ");
	String employeePhno=scanner.next();
	Pattern pattern=Pattern.compile("^(\\+91[\\-\\s]?)?[0]?(91)?[6789]\\d{9}$");
	Matcher matcher=pattern.matcher(employeePhno);
	boolean flag1=(matcher.find() && matcher.group().equals(employeePhno));
	if(flag1)
	{
		//System.out.println("Employee PhoneNo:"+employeePhno);
		return employeePhno;
	}
	else
	{
		System.out.println("Phone number should be of 10 digits only and start with 6,7,8,or 9");
	return validate();
	}
}
}


