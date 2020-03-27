package com.bridgelabz.webapp.configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionConfig {
private static Connection conn=null;
private static ConnectionConfig connObj;
{
	Resources config=new Resources();
	try {
		Class.forName(config.getDriverName());
		conn=DriverManager.getConnection(config.getUrl(),config.getUserName(),config.getPassword());//connecting to database
	System.out.println("Connection established");
	
	}
	catch(SQLException | ClassNotFoundException e) {
		e.printStackTrace();
	}
}
public Connection getDbConnection() {
	return conn;
}
public  static ConnectionConfig getInstance() {
	if(connObj==null) {
		connObj=new ConnectionConfig();
		return connObj;
	}
	return connObj;
}
}
