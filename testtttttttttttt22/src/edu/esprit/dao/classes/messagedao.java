/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao.classes;

import edu.esprit.dao.interfaces.IFreelancer;
import edu.esprit.dao.interfaces.Imessage;
import edu.esprit.entities.message;
import edu.esprit.technique.dataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zied
 */
public class messagedao implements Imessage{
     private Connection connexion;
    private Statement stmt;
    private static Imessage ifreelancerdao;
            private static final String SQL_FIND_ID =  "SELECT * FROM messagefl WHERE id=?";

   
     /**
     *
     */
    public static Imessage getInstance() {
        if (ifreelancerdao == null) {
            ifreelancerdao = new messagedao();
        }
        return ifreelancerdao;
    }
    public void messagedao()
      {
          connexion = dataSource.getInstance().getConnection();
      }
      
    public void Createmessage(message free) {
          String ch;
        ch="INSERT INTO messagefl msgrecu,id_fr VALUES (?,?)";
        
            PreparedStatement pstmt = null;
            try {
               pstmt=connexion.prepareStatement(ch);
                pstmt.setString(1, free.getMsgrecu());
                pstmt.setInt(2, free.getId_fr());
                pstmt.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(messagedao.class.getName()).log(Level.SEVERE, "save failed", ex);
            }
        
    }
    
    
    public message findById(int id) {
        message found = null; 
        PreparedStatement pstmt = null;
        ResultSet rs = null;       
        
        try{
            pstmt = connexion.prepareStatement(SQL_FIND_ID);
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            if(rs.next()){
                int freeId = rs.getInt("id");
                String titre = rs.getString("msgrecu");
                int description = rs.getInt("id_fr");
                
                found = new message(freeId,titre,description);
            }

                
        }catch(SQLException  ex){
           Logger.getLogger(freelancerdao.class.getName()).log(Level.SEVERE, "find failed", ex);
        }
        return found;
    }
      }


