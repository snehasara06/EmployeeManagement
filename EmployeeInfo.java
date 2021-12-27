
/*
 * 1.Load & register the driver
 * 2.establish connection
 * 3.create platform to execute query
 * 4.execute query
 * 5.process the result
 * 6.close connection
 */

/*import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class EmployeeInfo {

	private static Connection connection=null;
	private static Scanner scanner=new Scanner(System.in);
	
	public static void main(String [] args)
	{
		EmployeeInfo empInfo=new EmployeeInfo();
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String dBURL="jdbc:mysql://localhost:3306/employee";
		String  username="root";
		String password="Angel@2000";
		
		connection= DriverManager.getConnection(dBURL,username,password);
		
		System.out.println("Enter choice:");
		System.out.println("1.INSERT");
		int choice=Integer.parseInt(scanner.nextLine());
		
		switch(choice)
		{
		case 1:
			empInfo.insert();
			break;
		
		default:
		break;
		}		
		} 
		catch(Exception e)
		{
			throw new RuntimeException("Something went wrong");
		}
		
	}
		

	private void insert()
	{
		System.out.println("Insert record"); 
		
		String sql="insert into employeeInfo(name,id,mailid,phonno) values "; 
	}
}



*/