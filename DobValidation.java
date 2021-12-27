
// Date of birth & Age Validation
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public  class DobValidation extends ValidateEmployeeData
{
	public String validate() 
	{
	        //System.out.println("Enter date of birth(YYYY-MM-DD): ");
	        //try (Scanner input = new Scanner(System.in)) {
				//String employeeDob = input.nextLine();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter date of birth:");
		String empDob=scanner.nextLine();
				LocalDate dateofBirth = LocalDate.parse(empDob);
				
				//Checks the age of employee 
				int employeeAge=ageCalculate(dateofBirth);
				if((employeeAge>18) && (employeeAge<60))
				{
				//System.out.println("Employee Age :"+employeeAge);
				return empDob;
				}
				else
				{
					System.out.println("Employee's Age should be above 18 and below 60.");
					return validate() ;
				}
				
    }
	
	// Returns age given the date of birth
	public static int ageCalculate(LocalDate dob) 
	{
	        LocalDate currentDate = LocalDate.now();
	       // String cDate=currentDate.toString();
	        if(dob.compareTo(currentDate)>=0)
	        {
	            System.out.println("Employee's age is invalid.");
	        }
	        else
	        {
	        return Period.between(dob, currentDate).getYears();
	        }
		/*SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		sdf.setLenient(false);
		try {
			 String dateofbirth=dob.toString();
		Date d1 = (Date) sdf.parse(dateofbirth);
		System.out.println("TRUE");
		} catch (Exception e) {
		System.out.println("FALSE");
		}*/
	    return 0;
	}

}
