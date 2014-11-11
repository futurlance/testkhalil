/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.technique;



import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author khalil
 */
public class dataSource {
    
    
    

    private String url = "jdbc:mysql://localhost:3306/test_pdev";
    private String user = "root";
    private String password = "";
    private java.sql.Connection connection = null;

    public java.sql.Connection getConnection() {
        return connection;
    }

    
    
    private static dataSource instance;
    
    private dataSource() {
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("CONNECTION ESTABLISHED");
        } catch (SQLException ex) {
            Logger.getLogger(dataSource.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public static dataSource getInstance() {
        if(instance == null){
            instance = new dataSource();
        }
        return instance;
    }
    
    
    
    
}
