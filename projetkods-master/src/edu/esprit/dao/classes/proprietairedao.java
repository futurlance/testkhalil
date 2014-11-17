/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao.classes;


import edu.esprit.dao.interfaces.Iproprietairedao;
import edu.esprit.entities.proprietaire;
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
public class proprietairedao implements Iproprietairedao{
    private Connection connection = dataSource.getInstance().getConnection();
    private static final String SQL_SAVE =  "INSERT INTO propraitaire (prenom,nom,email,pays,ville,nom_entreprise,login,password,status) VALUES (?,?,?,?,?,?,?,?,?)";
    private static final String SQL_FIND =  "SELECT * FROM propraitaire WHERE id=?";
    private static final String SQL_FIND_ALL ="SELECT * FROM propraitaire ";
    private static final String SQL_DELETE ="DELETE FROM  propraitaire  WHERE ID=?";
   
    
    
    public proprietaire findById(int id) {
        proprietaire found = null;
        
        PreparedStatement pstmt = null;
        ResultSet rs = null;       
        
        try{
            
            pstmt = connection.prepareStatement(SQL_FIND);
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            if(rs.next()){
                String adminId = rs.getString("id");
                String adminPrenom = rs.getString("prenom");
                String adminNom = rs.getString("nom");
                String adminEmail = rs.getString("email");
                String adminPays = rs.getString("pays");
                String adminVille = rs.getString("ville");
                String adminLogin = rs.getString("login");
                String adminPwd = rs.getString("password");
                String adminEntrep = rs.getString("nom_entreprise");
                String adminstatus = rs.getString("status");
                int x=Integer.parseInt(adminId);
                found = new proprietaire(x,adminNom, adminNom, adminEmail, adminPays, adminVille, adminPwd, adminPwd, adminEntrep, adminstatus);
            }

                
        }catch(SQLException  ex){
           Logger.getLogger(proprietairedao.class.getName()).log(Level.SEVERE, "find failed", ex);
        }
        return found;
    }
    
    public void createProprietaire(proprietaire admin) {
        if(findById(admin.getId())== null){
            PreparedStatement pstmt = null;
            try {
                pstmt = connection.prepareStatement(SQL_SAVE);
                pstmt.setString(1, admin.getPrenom());
                pstmt.setString(2, admin.getNom());
                pstmt.setString(3, admin.getEmail());
                pstmt.setString(4, admin.getPays());
                pstmt.setString(5, admin.getVille());
                pstmt.setString(6, admin.getLogin());
                pstmt.setString(7, admin.getPwd());
                pstmt.setString(8, admin.getEntrep());
                pstmt.setString(9, admin.getStatut());
                pstmt.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(proprietairedao.class.getName()).log(Level.SEVERE, "save failed", ex);
            }
        }
    }
    public List<proprietaire> findAll() {
       
       List<proprietaire> all = new ArrayList<proprietaire>();
    
         Statement stmt=null;
          ResultSet rs=null;
         
   
       try{
       
             stmt=connection.createStatement();
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
                String freeEntrep = rs.getString("nom_entreprise");
                String freestatut = rs.getString("status");
               proprietaire found = new proprietaire(freeId,freePrenom, freeNom, freeEmail, freePays, freeVille, freeLogin, freePwd,freeEntrep,freestatut);
              all.add(found);}
       }
             catch(SQLException ex) {
          Logger.getLogger(CategorieDAO.class.getName()).log(Level.SEVERE, "find all failed", ex);
         
       
       }  
       
     return all;
    }
    
    public void delete(proprietaire categorie) {
        if(findById(categorie.getId())!=null){
       PreparedStatement pstmt=null;
        try {
            pstmt=connection.prepareCall(SQL_DELETE);
             pstmt.setInt( 1, categorie.getId());
            pstmt.executeUpdate();
            Logger.getLogger(freelancerdao.class.getName()).log(Level.SEVERE, "delete succee");
        } catch (SQLException ex) {
            Logger.getLogger(freelancerdao.class.getName()).log(Level.SEVERE, "delete failed", ex);
        }
        
        
    }
}
}
