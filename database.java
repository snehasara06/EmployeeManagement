import java.sql.*;

public class database {
	
	private String url="jdbc:mysql://localhost:3306/employee";
	private String  username="root";
	private String password="Angel@2000";
	
	public void insertdatabase(String name,String id,String mailid,String phno,String dob,String doj,String team, double salary) throws Exception
		{
		
			 String query="insert into employee.employeeinfo values(?,?,?,?,?,?,?,?)";
			 
			 Class.forName("com.mysql.jdbc.Driver");
			 Connection connection=DriverManager.getConnection(url,username,password);
			 PreparedStatement statement=connection.prepareStatement(query);
			
			 statement.setString(1, name);
			 statement.setString(2, id);
			 statement.setString(3, mailid);
			 statement.setString(4, phno);
			 statement.setString(5, dob);
			 statement.setString(6, doj);
			 statement.setString(7, team);
			 statement.setDouble(8, salary);
			 
			 int count=statement.executeUpdate();
			 System.out.println(count +" rows affected");
			 System.out.println("Data entered successfully!!!\n");
			
		}

	public void show() throws Exception
		{
			String query="select * from employee.employeeinfo;";
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection(url,username,password);
			Statement statement=connection.createStatement();
			ResultSet resultset=statement.executeQuery(query);
				
			String output="";
			while(resultset.next())
				{
					output=("------EMPLOYEE DETAILS OF "+resultset.getString(1).toUpperCase()+"-----"
					+"\n"+" NAME: "+resultset.getString(1).toUpperCase()
					+"\n"+" ID: "+resultset.getString(2)
					+"\n"+" MAIL ID: "+resultset.getString(3)
					+"\n"+" PHONE NO: "+resultset.getString(4)
					+"\n"+" DATE OF BIRTH: "+resultset.getString(5)
					+"\n"+" DATE OF JOINING: "+resultset.getString(6)
					+"\n"+" TEAM: "+resultset.getString(7).toUpperCase()
					+"\n"+" SALARY: Rs." +resultset.getDouble(8)+"\n");
					System.out.println(output);
				}
				
		}
	public int isAvailable( String id)  throws Exception
		{
			String query="select count(*) as rowcount from employee.employeeinfo where id = '"+id+"';";
			int count=0;
						
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection(url,username,password);
			Statement statement=connection.createStatement();
			ResultSet resultset=statement.executeQuery(query);
			
			resultset.next();
			count=resultset.getInt("rowcount");
			return count;
					
		}
	
	public void delete(String id)
		{
			String query="delete from employee.employeeinfo where id= '"+id+"';";
			
			try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection(url,username,password);
			Statement statement=connection.createStatement();
	
			
			int deleted= statement.executeUpdate(query);
			System.out.println(deleted +" rows deleted");
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
	
	public void update(String id)
	{
		
		String query="update employee.employeeinfo set name='snehasara',mailid='snehasara@gmail.com',phno='9756842310',dob='2000-01-01',doj='2020-06-20',team='bfs',salary=45000 where id='ACE1092'";
		//String query="insert into employee.employeeinfo values(?,?,?,?,?,?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection(url,username,password);
			Statement statement=connection.createStatement();
			
			/* statement.setString(1, name);
			 statement.setString(2, id);
			 statement.setString(3, mailid);
			 statement.setString(4, phno);
			 statement.setString(5, dob);
			 statement.setString(6, doj);
			 statement.setString(7, team);
			 statement.setDouble(8, salary);*/
			
			int updated=statement.executeUpdate(query);
			System.out.println(updated + " rows updated");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
