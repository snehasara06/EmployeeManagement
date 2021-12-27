import java.util.Scanner;

// Employee Id validation
public   class IdValidation  extends ValidateEmployeeData 
{
	public String validate()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the user ID: ");
		String employeeId=scanner.next();
		try
		{
		if(employeeId.length()==7)
		{
		String firsthalf=employeeId.substring(0,3);
		String secondhalf=employeeId.substring(3,7);
		Boolean alpha=firsthalf.contains("ACE");
		Boolean flag=true;
		//^[Aa]{1}[Cc]{1}[Ee]{1}[0-9]{1}[0-9]{1}[0-9]{1}[0-9]{1}+$
		int number = Integer.parseInt(secondhalf);
		
		//Checking for 0's
		if(number>0000 && number<=9999)
		{
		flag=true;
		}
		else
		{
		flag=false;
		}
		
		/*if(number%number==0)
		{
		 numeric=true;
		}
		else
		{
		 numeric=false;
		}*/
			if(alpha==false ||flag==false)
			{
				System.out.println("Invalid Employee ID.ACE000 is not allowed.\n");
			 return validate();
			}
			else
			{
				//System.out.println("Employee ID of the employee is :"+employeeId+"\n");
				return employeeId;
			 
			}
		}
		//For ID greater than length of 7
		else{
		   System.out.println("Oops!!ID should be of length 7.\n");
		   return validate();
		}
		}
		catch (NumberFormatException e)
		{
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return employeeId;
		}
		}
