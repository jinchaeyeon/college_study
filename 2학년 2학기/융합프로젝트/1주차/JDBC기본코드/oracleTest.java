package com.oracle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.time.LocalDateTime;

public class oracleTest 
{
    public static void main(String args[])
    {    	
        Connection conn = null;        
        Statement stmt = null;
        ResultSet rs = null;  
        
        try {            
            String SQL = "SELECT * FROM BOARD";
                       
            conn = DBConnection.getConnection();
            
            stmt = conn.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()) {
            	Long no = rs.getLong(1);            	
            	String title = rs.getString(2);             	
            	String content = rs.getString(3);
            	String id = rs.getString(4);
            	LocalDateTime regDateTime = rs.getTimestamp(5).toLocalDateTime();
            	System.out.println(no + " | " + title + " | " + content + 
            			" | " + id + " | " + regDateTime);            	
            }
        } catch (SQLException sqle) {
            System.out.println("SELECT문에서 예외 발생");
            sqle.printStackTrace();            
        }finally{            
            try{
                if ( rs != null ){rs.close();}   
                if ( stmt != null ){stmt.close();}   
                if ( conn != null ){conn.close(); }
            }catch(Exception e){
                throw new RuntimeException(e.getMessage());
            }            
        }
    }
}

