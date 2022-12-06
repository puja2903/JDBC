package EmployeeDetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.sms.Helper;

public class EmployeeUploader {
		Scanner sc=new Scanner(System.in);
		int dep_id;
		String dep_name,dep_head,dep_description;
		public void storeDepartmentDetails() throws SQLException{
			System.out.println("Enter department id :");
	    	dep_id=sc.nextInt();
	    	System.out.println("enter department name :");
	    	dep_name=sc.next();
	    	System.out.println("Enter department head :");
	    	dep_head=sc.next();
	    	System.out.println("enter department description :");
	    	dep_description=sc.next();
	    	
	    	Connection co=Helper.con();
	    	
	    	
	    	PreparedStatement stmt=co.prepareStatement("insert into department values(?,?,?,?)");
	    	
	    	stmt.setInt(1, dep_id);
	    	stmt.setString(2, dep_name);
	    	stmt.setString(3, dep_head);
	    	stmt.setString(4, dep_description);
	    	
	    	stmt.executeUpdate();	
	    	
	    	ResultSet rs=stmt.executeQuery("select * from department");
	    	
	    	while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));			
			}	
}
}