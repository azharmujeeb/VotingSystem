
package javaassignment;

import java.sql.*;

public class DB_operation {

    static Connection connect() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private Connection conn;
    private Statement st;
    private ResultSet rs;
    
    private Connection getConnection(){
        try{
        
          String url = "jdbc:mysql://localhost/vote";
          String user = "root";
          String password = "";
          
          Class.forName("com.mysql.jdbc.Driver");
          conn = DriverManager.getConnection(url, user, password);
        }
        catch(SQLException e){
            System.out.println("Error" +e.getMessage());
        }
        catch(ClassNotFoundException e){
            System.out.println("Error" +e.getMessage());
           
        }
        finally{
            return conn;
            
        }
    }
    public ResultSet searchQuery(String sql){
        try{
        getConnection();
        st = conn.createStatement();
        rs = st.executeQuery(sql);
    }
        catch(SQLException e){
            System.out.println("Error" +e.getMessage());
        }
        return rs;
    }
    
}
