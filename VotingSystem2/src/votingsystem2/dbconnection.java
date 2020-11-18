/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votingsystem2;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author azhar
 */
public class dbconnection {
    public static Connection con(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/votingsystem","root","");
        }catch(Exception e){
           JOptionPane.showMessageDialog(null,"Connected");
        }
        return con;
    }
}
