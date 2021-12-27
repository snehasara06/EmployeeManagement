import java.util.Scanner;

//Mail Id validation using Regular Expression
public   class MailIdValidation extends ValidateEmployeeData
{
	public String validate()
	{
		System.out.println("Enter mail id:");
		Scanner scanner=new Scanner(System.in);
		String employeeMailId=scanner.next();
		String regex="^[a-z0-9+-._]+@[a-z.]+$";
		boolean check=employeeMailId.matches(regex);
		if(check)
		{
			//System.out.println("Employee MailId:"+employeeMailId+"\n");
			return employeeMailId;
		}
		else
		{
			System.out.println("Employee MailId in inavlid-Username should be in lowercase & domain name should conatin only alphabets.\n");
			return validate();
		}
		
		
	}
}
