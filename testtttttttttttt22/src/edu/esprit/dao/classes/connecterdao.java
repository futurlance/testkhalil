/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao.classes;

import edu.esprit.dao.interfaces.IConnecterDao;
import edu.esprit.entities.connecter;
import edu.esprit.technique.dataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author khalil
 */
public class connecterdao implements IConnecterDao{
     private Connection connexion;
    private Statement stmt;
    private static final String SQL_FIND_ALL ="SELECT * FROM connecter ";
    private static final String SQL_SAVE ="INSERT INTO connecter(id_conecter) values (?)";
    
    private static IConnecterDao ifreelancerdao;
    public static IConnecterDao getInstance() {
        if (ifreelancerdao == null) {
            ifreelancerdao = new connecterdao();
        }
        return ifreelancerdao;
    }
    
    public connecterdao() {
    connexion = dataSource.getInstance().getConnection();
    }
    
    
    public connecter findAll() {
       connecter found = null;
    
         Statement stmt=null;
          ResultSet rs=null;
         
   
       try{
       
             stmt=connexion.createStatement();
              rs= stmt.executeQuery(SQL_FIND_ALL);
              while(rs.next()){//return true
               int connecId = rs.getInt("id_conecter");
                
                found = new connecter(connecId);
              }
       }
             catch(SQLException ex) {
          Logger.getLogger(CategorieDAO.class.getName()).log(Level.SEVERE, "find all failed", ex);
         
       
       }  
       
     return found;
    }
    //*************
     public void save(connecter categorie) {
       /*if(findBYId(categorie.getId())==null){*/
       PreparedStatement pstmt=null;
       
        try {
            pstmt=connexion.prepareCall(SQL_SAVE);
            pstmt.setInt(1,categorie.getId());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(connecterdao.class.getName()).log(Level.SEVERE, "save failed", ex);
        }
        
        
    }
}
