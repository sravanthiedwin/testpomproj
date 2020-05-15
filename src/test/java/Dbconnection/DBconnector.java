package Dbconnection;
/*1.register the driver class
class.forname()
forName()method of aClass class is used to register the driver class
this method is used to load the driver class dynamically
2.create a connection
getConnection is the method of driver manager class is used to establish connection with database.
3.create statement
create statement is the method of connection interface is used to create statement
The object of the statement is responsible to execute queries with the database.
4.Execute query
execute query is the method of statement interface to execute queries to the database.
This method returns the object of resultSet that can be used to get all the records of the table.
5.close connection
By closing connection object statement and resultSet  will be closed automatically.
The close()method  of connection interface is used to close the connection.*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBconnector {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		   {
			 String dburl ="jdbc:mysql://127.0.0.1:3306/testing";//testing is the DB name 
			 String username ="root";//username of db
			 String password ="edwin@143";//pwd of db
			 String query ="Select * from employee";//employee table from db
			 Connection con= null;
		  			 Class.forName("com.mysql.jdbc.Driver"); 
					con = DriverManager.getConnection(dburl, username, password);
				      Statement stmt = con.createStatement();
				       ResultSet rs = stmt.executeQuery(query);
				       while(rs.next()) {
				    	   int id = rs.getInt("eid");//column name from db(eid)
					         String name = rs.getString("first_name");//column name from db(firstname)
					         String lname = rs.getString("last_name");//column name fromdb(last name)
					         int phone = rs.getInt("phoneno");//column name from db(phone no)
					          System.out.println(id);
					         System.out.println(name);
					         System.out.println(lname);
					         System.out.println(phone);
				       }
				       
				    		  
						  
				          rs.close();
				         stmt.close();
				       	  con.close();
						
				          					    	         
		

	}}}





