/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao.classes;



import edu.esprit.dao.interfaces.IFreelancer;
import edu.esprit.entities.freelancer;
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
public class freelancerdao implements IFreelancer{
    
    private Connection connexion;
    private Statement stmt;
    
    
    private static final String SQL_SAVE =  "INSERT INTO freelancer (prenom,nom,email,pays,ville,login,pwd) VALUES (?,?,?,?,?,?,?)";
    private static final String SQL_FIND_ID =  "SELECT * FROM freelancer WHERE id=?";
    private static final String SQL_FIND_PRENOM =  "SELECT * FROM freelancer WHERE prenom=?";
    private static final String SQL_FIND_NOM =  "SELECT * FROM freelancer WHERE nom=?";
    private static final String SQL_FIND_ALL ="SELECT * FROM freelancer ";
      private static final String SQL_DELETE ="DELETE FROM  freelancer  WHERE ID=?";
      private static final String SQL_UPDATE ="UPDATE  freelancer SET status=? WHERE ID=?";

    public freelancerdao()  {
        connexion = dataSource.getInstance().getConnection();
       
    }

    
     
     private static IFreelancer ifreelancerdao;

    public static IFreelancer getInstance() throws SQLException {
        if (ifreelancerdao == null) {
            ifreelancerdao = new freelancerdao();
        }
        return ifreelancerdao;
    }
    
    public void update_actif(freelancer categorie) {
        if(findById( categorie.getId())!=null){
       PreparedStatement pstmt=null;
       String ch="Non Actif";
        try {
            pstmt=connexion.prepareCall(SQL_UPDATE);
            pstmt.setString(1,  ch);
             pstmt.setInt(2,categorie.getId());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategorieDAO.class.getName()).log(Level.SEVERE, "update failed", ex);
        }
    }
    }
    
    public void update_nonactif(freelancer categorie) {
        if(findById( categorie.getId())!=null){
       PreparedStatement pstmt=null;
       String ch="Actif";
        try {
            pstmt=connexion.prepareCall(SQL_UPDATE);
            pstmt.setString(1,  ch);
             pstmt.setInt(2,categorie.getId());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategorieDAO.class.getName()).log(Level.SEVERE, "update failed", ex);
        }
    }
    }
     
      public void createFreelancer(freelancer free) {
          String sql;
        sql="INSERT INTO freelancer (prenom,nom,email,pays,ville,login,password,status) VALUES (?,?,?,?,?,?,?,?)";
        if(findById(free.getId())== null){
            PreparedStatement pstmt = null;
            try {
                pstmt = connexion.prepareStatement(sql);
                pstmt.setString(1, free.getPrenom());
                pstmt.setString(2, free.getNom());
                pstmt.setString(3, free.getEmail());
                pstmt.setString(4, free.getPays());
                pstmt.setString(5, free.getVille());
                pstmt.setString(6, free.getLogin());
                pstmt.setString(7, free.getPwd());
                pstmt.setString(8, free.getStatus());
                pstmt.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(freelancerdao.class.getName()).log(Level.SEVERE, "save failed", ex);
            }
        }
    }
      
      
    public freelancer findById(int id) {
        freelancer found = null;
        
        PreparedStatement pstmt = null;
        ResultSet rs = null;       
        
        try{
            
            pstmt = connexion.prepareStatement(SQL_FIND_ID);
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            if(rs.next()){
                int freeId = rs.getInt("id");
                String freePrenom = rs.getString("prenom");
                String freeNom = rs.getString("nom");
                String freeEmail = rs.getString("email");
                String freePays = rs.getString("pays");
                String freeVille = rs.getString("ville");
                String freeLogin = rs.getString("login");
                String freePwd = rs.getString("password");
                String freestatut = rs.getString("status");
                found = new freelancer(freeId,freePrenom, freeNom, freeEmail, freePays, freeVille, freeLogin, freePwd,freestatut);
            }

                
        }catch(SQLException  ex){
           Logger.getLogger(freelancerdao.class.getName()).log(Level.SEVERE, "find failed", ex);
        }
        return found;
    }
    
    public freelancer findByPrenom(String prenom) {
        freelancer found = null;
        
        PreparedStatement pstmt = null;
        ResultSet rs = null;       
        
        try{
            
            pstmt = connexion.prepareStatement(SQL_FIND_PRENOM);
            pstmt.setString(1, prenom);
            rs = pstmt.executeQuery();
            if(rs.next()){
                int freeId = rs.getInt("id");
                String freePrenom = rs.getString("prenom");
                String freeNom = rs.getString("nom");
                String freeEmail = rs.getString("email");
                String freePays = rs.getString("pays");
                String freeVille = rs.getString("ville");
                String freeLogin = rs.getString("login");
                String freePwd = rs.getString("pwd");
                String freestatut = rs.getString("statut");
                found = new freelancer(freeId,freePrenom, freeNom, freeEmail, freePays, freeVille, freeLogin, freePwd,freestatut);
            }

                
        }catch(SQLException  ex){
           Logger.getLogger(freelancerdao.class.getName()).log(Level.SEVERE, "find failed", ex);
        }
        return found;
    }
    
    public freelancer findByNom(String nom) {
        freelancer found = null;
        
        PreparedStatement pstmt = null;
        ResultSet rs = null;       
        
        try{
            
            pstmt = connexion.prepareStatement(SQL_FIND_NOM);
            pstmt.setString(1, nom);
            rs = pstmt.executeQuery();
            if(rs.next()){
                int freeId = rs.getInt("id");
                String freePrenom = rs.getString("prenom");
                String freeNom = rs.getString("nom");
                String freeEmail = rs.getString("email");
                String freePays = rs.getString("pays");
                String freeVille = rs.getString("ville");
                String freeLogin = rs.getString("login");
                String freePwd = rs.getString("pwd");
                String freestatut = rs.getString("statut");
                found = new freelancer(freeId,freePrenom, freeNom, freeEmail, freePays, freeVille, freeLogin, freePwd,freestatut);
            }

                
        }catch(SQLException  ex){
           Logger.getLogger(freelancerdao.class.getName()).log(Level.SEVERE, "find failed", ex);
        }
        return found;
    }
    
   public List<freelancer> findAll() {
       
       List<freelancer> all = new ArrayList<freelancer>();
    
         Statement stmt=null;
          ResultSet rs=null;
         
   
       try{
       
             stmt=connexion.createStatement();
              rs= stmt.executeQuery(SQL_FIND_ALL);
              while(rs.next()){//return true
               int freeId = rs.getInt("id");
               String freePrenom = rs.getString("prenom");
                String freeNom = rs.getString("nom");
                String freeEmail = rs.getString("email");
                String freePays = rs.getString("pays");
                String freeVille = rs.getString("ville");
                String freeLogin = rs.getString("login");
                String freePwd = rs.getString("password");
                String freestatut = rs.getString("status");
               freelancer found = new freelancer(freeId,freePrenom, freeNom, freeEmail, freePays, freeVille, freeLogin, freePwd,freestatut);
              all.add(found);}
       }
             catch(SQLException ex) {
          Logger.getLogger(CategorieDAO.class.getName()).log(Level.SEVERE, "find all failed", ex);
         
       
       }  
       
     return all;
    }

    public void delete(freelancer categorie) {
        if(findById(categorie.getId())!=null){
       PreparedStatement pstmt=null;
        try {
            pstmt=connexion.prepareCall(SQL_DELETE);
             pstmt.setInt( 1, categorie.getId());
            pstmt.executeUpdate();
            Logger.getLogger(freelancerdao.class.getName()).log(Level.SEVERE, "delete succee");
        } catch (SQLException ex) {
            Logger.getLogger(freelancerdao.class.getName()).log(Level.SEVERE, "delete failed", ex);
        }
        
        
    }
    }
   
   
}
