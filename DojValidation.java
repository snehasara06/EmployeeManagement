
//Date of Joining validation
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public  class DojValidation extends ValidateEmployeeData
{
	public String validate()
    {
    
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter date of joining:");
		String empDoj=scanner.nextLine();
    LocalDate dateOfJoining = LocalDate.parse(empDoj);
    int localdate=experience(dateOfJoining);
    if(localdate>=0)
    {
   // System.out.println("Employee's Experience:" +localdate);
    return empDoj;
    }
    else
    {
    	return validate();
    }
    }
   
    public static int experience(LocalDate doj) 
    {
        LocalDate currentDate = LocalDate.now();
        if(doj.compareTo(currentDate)>0)
        {
            System.out.println("Invalid date of joining. DOJ cannot be future dates.");
        }
        else
        {
        return Period.between(doj, currentDate).getYears();
        }
    return 0;
}
}
