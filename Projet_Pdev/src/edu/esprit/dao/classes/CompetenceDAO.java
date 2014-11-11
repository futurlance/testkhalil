/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao.classes;

import edu.esprit.dao.interfaces.ICompetence;
import edu.esprit.entities.competence;
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
public class CompetenceDAO implements ICompetence{
    
     private Connection connection;

    public CompetenceDAO() {
        connection = dataSource.getInstance().getConnection();
    }
    private static final String SQL_FIND_ALL ="SELECT * FROM competence ";
    private static final String SQL_FIND ="SELECT * FROM competence WHERE ID=?";
    
    
    public List<competence> findAll() {
       List<competence> all = new ArrayList<competence>();
    
         Statement stmt=null;
          ResultSet rs=null;
         
   
       try{
       
             stmt=connection.createStatement();
              rs= stmt.executeQuery(SQL_FIND_ALL);
              while(rs.next()){//return true
               int competenceId=rs.getInt("ID");
               String competenceNom=rs.getString("NOM");
               competence found = new competence(competenceId, competenceNom);
              all.add(found);}
       }
             catch(SQLException ex) {
          Logger.getLogger(CompetenceDAO.class.getName()).log(Level.SEVERE, "find all failed", ex);
         
       
       }  
       
     return all;
    }
    
    public competence findBYId(int id) {
     competence found = null;
    
       PreparedStatement pstmt=null;
          ResultSet rs=null;
         
   
       try{
       
             pstmt=connection.prepareStatement(SQL_FIND);
             pstmt.setInt(1,id);
              rs= pstmt.executeQuery();
              if(rs.next()){//return true
               int categorieId=rs.getInt("ID");
               String categorieNom=rs.getString("NOM");
               found = new competence(categorieId,categorieNom);}
       }
             catch(SQLException ex) {
          Logger.getLogger(CompetenceDAO.class.getName()).log(Level.SEVERE, "find failed", ex);
         
       
       }  
       
     return found;
    }
    
    
     private static ICompetence iCategorieDAO;

    public static ICompetence getInstance() {
        if (iCategorieDAO == null) {
            iCategorieDAO = new CompetenceDAO();
        }
        return iCategorieDAO;
    }
}
