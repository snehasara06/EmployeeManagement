import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Name validation using Regex

public  class NameValidation  extends ValidateEmployeeData
{	
	
	/*public static boolean isNameContainsOnlyAlpha(String employeeName)
	{
		return ((employeeName!=null)&&(!employeeName.equals(""))&&(employeeName.matches("^[a-zA-Z]*$")));
	}*/
		public String validate()
		{
			Scanner input=new Scanner(System.in);
			System.out.println("Enter employee name:");
			String employeeName=input.nextLine();
			//boolean flag=true;
			int flag=0;
			Pattern pattern=Pattern.compile("[^a-zA-Z0-9]");
			Matcher matcher=pattern.matcher(employeeName);
			//Checks for special characters
			boolean isNameContainsSplChar=matcher.find();
			//Checks for more than 2 consecutive repeated characters
			for(int iteration=1;iteration<employeeName.length();iteration++)
			{
				
					if(employeeName.charAt(iteration-1)==employeeName.charAt(iteration)&& employeeName.charAt(iteration+1)==employeeName.charAt(iteration))
					{
							flag=1;
							break;
						
					}
				
			}
			if(isNameContainsSplChar==true)
			{
				  System.out.println("No special characters allowed");
			      // System.out.println("Enter valid name:");
			      validate();
			    
			     }
			    else if(flag==1)
			    {
			        System.out.println("Not more than 2 consecutive characters allowed");
			        validate();
			    }
			    
			   /* else{
			        System.out.println("Employee Name:"+employeeName+"\n");
			    }*/
				
				//scanner.close();
				return employeeName;
			}
}