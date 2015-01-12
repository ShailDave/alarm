package com.shail.ws;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sun.org.apache.xml.internal.security.utils.Base64;

public class HelloWorld {

	 public String sayHelloWorld() throws SQLException  
	    {  
		 final String url = "jdbc:oracle:thin:sys as sysdba/admin@(description=( address_list=(address=(protocol=tcp) (host=localhost)(port=1521))) (source_route=yes)(connect_data=(sid=orcl)))";

			final String driver = "oracle.jdbc.driver.OracleDriver";
			String res="";
			Connection c;
			Statement st=null;
			ResultSet rs=null;
			try {
				// Load the driver
				Class.forName(driver);
				// Establish database connection
				c = DriverManager.getConnection(url);
				st = c.createStatement();
			} catch (java.lang.ClassNotFoundException e) {
				System.out.println("Cannot find driver class");
				System.exit(1);
			} catch (java.sql.SQLException e) {
				e.printStackTrace();
				System.out.println("Cannot get connection");
				System.exit(1);
			}
			String query = "Select name from Dummywebservice where id=1";
			rs = st.executeQuery(query);
			while(rs.next())
			{
				res += rs.getString("Name")+" ";
			}
	        return res;  
	    }  
	 
	 public String sayAbhi()
	 {
		 return "Abhi";
	 }
	 
	 public String getRingTone() throws ClassNotFoundException, SQLException
	 {
		 final String url = "jdbc:oracle:thin:sys as sysdba/admin@(description=( address_list=(address=(protocol=tcp) (host=localhost)(port=1521))) (source_route=yes)(connect_data=(sid=orcl)))";

			final String driver = "oracle.jdbc.driver.OracleDriver";
			Connection c;
			Class.forName(driver);
			c = DriverManager.getConnection(url);

			String sql = "SELECT aud FROM audioTab ";
			PreparedStatement stmt;
			try {
				stmt = c.prepareStatement(sql);
				ResultSet resultSet = stmt.executeQuery();
				
					resultSet.next();
					Blob aBlob = resultSet.getBlob(1);
					byte[] barr = aBlob.getBytes(1, (int)aBlob.length());
					String resp = Base64.encode(barr);
					return resp;
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}

			
	 }

	
}
