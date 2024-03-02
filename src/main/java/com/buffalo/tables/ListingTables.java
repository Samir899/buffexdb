package com.buffalo.tables;

	
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class ListingTables {
   public static List<String> getAllTables() throws Exception {
	   
	   List<String> tables = new ArrayList<>();
	   
      //Registering the Driver
//      DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	   DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
      //Getting the connection
      String mysqlUrl = "jdbc:mysql://localhost:3306/buffexdb";
      Connection con = DriverManager.getConnection(mysqlUrl, "root", "1234");
//      System.out.println("Connection established......");
      //Creating a Statement object
      Statement stmt = con.createStatement();
      //Retrieving the data
      ResultSet rs = stmt.executeQuery("Show tables");
//      System.out.println("Tables in the current database: ");
      while(rs.next()) {
//         System.out.print(rs.getString(1));
         if(!rs.getString(1).contains("_seq"))
        	 tables.add(rs.getString(1).toUpperCase());
//         System.out.println();
      }
      
      return tables;
   }
}
