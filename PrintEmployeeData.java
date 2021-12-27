
// Printing all the employee's data

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
public class PrintEmployeeData  extends IdValidation 
{
	database database=new database();
	Scanner scanner=new Scanner(System.in);	
	ArrayList<EmployeeData> employeedata=new ArrayList<EmployeeData>();
	public void start()
	{
		System.out.println("\t\t\t***** Aspire Systems ****");
		System.out.println("\t\t\tEmployee Management System");
		int choice;
				do {
					System.out.println("------Menu-----");
					System.out.println("1.Create");
					System.out.println("2.Show");
					System.out.println("3.Delete");
					System.out.println("4.Update");
					System.out.println("5.Quit");
					
					System.out.println("Enter your choice:");
					choice=scanner.nextInt();
					if(choice==1)
					{						
						employeedata.add(create());
					}
					else if(choice==2)
					{
						try {
							database.show();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					else if(choice==3)
					{
						try {
							delete();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					else if(choice==4)
					{
						try {
							update();
						}
						catch(Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}	
						
					}
					else 
					{
						System.out.println("thank you");
					}
				}while(choice!=5);
	}
	
				public  EmployeeData create()
				{	
					System.out.println("---Team Menu---");
					System.out.println("1.BFS");
					System.out.println("2.EBA");
					System.out.println("3.DOTNET");
					int ch=scanner.nextInt();
										
					Scanner scanner=new Scanner(System.in);
					EmployeeData employeedata=null;
					
					EmployeeData data=new EmployeeData();
					
					//Prints Employee's name
							NameValidation employeeName=new NameValidation();
							String name=employeeName.validate();
							
							
					//Prints Employee's User ID
							IdValidation employeeId=new IdValidation();
							String id=employeeId.validate();
							
							
					//Prints Employee's Phone number
							PhNoValidation empPhNo=new PhNoValidation();
							String phno=empPhNo.validate();
							
											
					//Prints Employee's Mail ID
							MailIdValidation empMailid=new MailIdValidation();
							String mailid=empMailid.validate();
							
										
					//Prints Employee's DOB	
							DobValidation empDob=new DobValidation();
							String dob=empDob.validate();
							
							
					//Prints Employee's joining date
							DojValidation empDoj=new DojValidation();
							String doj=empDoj.validate();
							
							
					//Prints Employee's team & salary
							/*System.out.println("Enter team:");
							String team=scanner.nextLine();
							data.setEmployeeTeam(team);
							EmployeeTeam empTeam=new EmployeeTeam();
							empTeam.checkTeam(data.getEmployeeTeam());*/
							
							String team="null";
							double salary=0;
						if(ch==1)
						{
							 team="bfs";
							 salary=40000;
							//employeedata=new EmployeeData(name,id,mailid,phno,dob,doj,"BFS",40000);
						}
						else if(ch==2)
						{
							 team="eba";
							 salary=40000;
							//employeedata=new EmployeeData(name,id,mailid,phno,dob,doj,"EBA",40000);
						}
						else if(ch==3)
						{
							 team="dotnet";
							 salary=35000;
							//employeedata=new EmployeeData(name,id,mailid,phno,dob,doj,"DOTNET",35000);
						}
						
						 //String team="BFS";
					try {
						database.insertdatabase(name,id,mailid,phno,dob,doj,team,salary);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
						
					return employeedata;
						
				}
				
				

					public void delete() throws Exception
					{
						
						//IdValidation employeeId=new IdValidation();
						//String id=employeeId.validate();

						String id=scanner.next();
						
						int index=database.isAvailable(id);
						//System.out.println("index is"+index);
						if(index>=1)
						{
							database.delete(id);
						}
						else
						{
							System.out.println("given employeeid  does not exist");
						}
						
						
					}
					public void update() throws Exception
					{
						String id=scanner.next();
						int index=database.isAvailable(id);
						System.out.println("index is "+ index);
						if(index>=1)
						{
							database.update(id);
						}
						else
						{
							System.out.println("given employeeid  does not exist");
						}
						}
}
				
	/*	try {
			
		do
		{
			//int choice;
	         Scanner s=new Scanner(System.in);
			 System.out.println("1.INSERT");
	         System.out.println("2.DISPLAY");
	         System.out.println("3.SEARCH");
	         System.out.println("4.DELETE");
	         System.out.println("5.UPDATE");
	         System.out.print("Enter Your Choice : ");
	                 
	          int choice=s.nextInt();
	          s.nextLine();
	         switch(choice)
	         {
	         case 1:
	        	empdata.run();
	        	System.out.println("running");
					c.add(new PrintEmployeeData(employeeName,employeeId,employeeMailId, 
							employeePhoneno,employeeDob,employeeDoj));
					c.add(empdata.employeeName);
					break;
	         case 2:
	        	System.out.println("----------------------------");
	        	 Iterator<PrintEmployeeData> i = c.iterator();
	               while(i.hasNext()){
	                  PrintEmployeeData e = i.next(); 
	                  System.out.println(e);
	               }
	               System.out.println("----------------------------");
	               System.out.println(c);
	               flag=1;
	               break;
	         case 3:
	        	 boolean found = false;
	               System.out.print("Enter Empno to Search :");
	               String empid = s.next();
	               System.out.println("----------------------------");
	               Iterator<PrintEmployeeData> i = c.iterator();
	               i = c.iterator();
	               while(i.hasNext()){
	                  PrintEmployeeData e = i.next();
	                  if(employeeId == empid)  {
	                     System.out.println(e);
	                     found = true;
	                  }
	               }
	               
	               if(!found){
	                  System.out.println("Record Not Found");
	               }
	               System.out.println("----------------------------");
	            break; 
	         case 4:
	               found = false;
	               System.out.print("Enter Empno to Delete :");
	               empid = s.next();
	               System.out.println("----------------------------");
	               i = c.iterator();
	               while(i.hasNext()){
	                  PrintEmployeeData e = i.next();
	                  if(employeeId == empid)  {
	                     i.remove();
	                     found = true;
	                  }
	               }
	               
	               if(!found){
	                  System.out.println("Record Not Found");
	               }else{
	                  System.out.println("Record is Deleted Successfully...!");
	               }

	               System.out.println("----------------------------");
	            break;
	         case 5:
	              found = false;
	               System.out.print("Enter Empno to Update :");
	               empid = s.next();
	               
	               ListIterator<PrintEmployeeData>li = c.listIterator();
	               while(li.hasNext()){
	                  PrintEmployeeData e = li.next();
	                  if(employeeId == empid)  {
	                     System.out.print("Enter new Name : ");
	                     employeeName = s1.nextLine();

	                     System.out.print("Enter new Salary : ");
	                     employeeTeam = s.nextLine();
	                     li.set(new PrintEmployeeData());
	                     found = true;
	                  }
	               }
	               
	               if(!found){
	                  System.out.println("Record Not Found");
	               }else{
	                  System.out.println("Record is Updated Successfully...!");
	               }	             
	            break;
	            default:
	            	flag=1;
	            	break;
	            	
	         }
	         System.out.println(choice);
	         
	         
	         s.close();
		}while(flag==0);
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}*/
	