package com.attinad.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MysqlConnection {
	 Connection con = null;
     PreparedStatement pst = null;
     
public void insertTemptoDB(){
	
try{  
Class.forName("com.mysql.jdbc.Driver");  
  
 con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/Temperature","root","mysql");  
    System.out.println("DB conn");
	
}catch(Exception e){

	System.out.println(e);}  
  
}

public void insertData(String value) throws SQLException{
	System.out.println("inserting");
	pst = con.prepareStatement("INSERT INTO temp ( time , temp) VALUES (NOW(),?)");  
	pst.setString(1,value);
	pst.executeUpdate();
	con.close();
}

}
