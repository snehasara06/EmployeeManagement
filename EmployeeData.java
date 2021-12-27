
//Declaring variables & implementing Encapsulation 
public class EmployeeData  
{
//Employee Details
	private  String employeeName;
	private String employeeId;
	
	private String employeeMailId;
	private String employeePhoneno;
	private String employeeDob;
	private String employeeDoj;
	protected String employeeTeam;
	 protected double salary;
	
	
	EmployeeData(String employeeName, String employeeId, String employeeMailId,
			String employeePhoneno,String employeeDob,String employeeDoj,String employeeTeam,double salary){
	      this.setEmployeeName(employeeName);
	      this.setEmployeeId(employeeId);
	      this.employeeMailId=employeeMailId;
	      this.employeePhoneno=employeePhoneno;
	      this.employeeDob=employeeDob;
	      this.employeeDoj=employeeDoj;
	      this.employeeTeam=employeeTeam;
	      this.salary=salary;
	   }
	public EmployeeData() {
		// TODO Auto-generated constructor stub
	}
	
//Getter & setter methods for private variables
//EmployeeMailId
	public String getEmployeeMailId() 
		{
			return employeeMailId;
		}
	public void setEmployeeMailId(String employeeMailId) 
		{
			this.employeeMailId = employeeMailId;
		}
//EmployeePhoneNo
	public String getEmployeePhoneno() 
		{
			return employeePhoneno;
		}
	public void setEmployeePhoneno(String employeePhoneno) 
		{
			this.employeePhoneno = employeePhoneno;
		}
//EmployeeDob
	public String getEmployeeDob() 
		{
			return employeeDob;
		}
	public void setEmployeeDob(String employeeDob)
		{
			this.employeeDob = employeeDob;
		}
//EmployeeDoj
	public String getEmployeeDoj() 
		{
			return employeeDoj;
		}
	public void setEmployeeDoj(String employeeDoj) 
		{
			this.employeeDoj = employeeDoj;
		}
//EmployeeTeam
	
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	}
