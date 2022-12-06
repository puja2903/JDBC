package com.sms.fetch;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sms.Helper;

public class FetchTable {
	//fetching employee details in the database (display)
	public void fetchMenuDriven() throws SQLException{
		Connection conn = Helper.con();  //try to connect using helper class
		Statement stmt = conn.createStatement();
		ResultSet rs=stmt.executeQuery("select * from MenuDriven");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getInt(5));			
		}	
	}

}
