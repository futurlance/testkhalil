/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao.classes;

import edu.esprit.dao.interfaces.IProposition;
import edu.esprit.entities.Categorie;
import edu.esprit.entities.Proposition;
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
public class PropositionDAO implements IProposition{
      private Connection connexion;
    private Statement stmt;
    private static IProposition ifreelancerdao;
        private static final String SQL_FIND_ID =  "SELECT * FROM proposition WHERE id=?";
        private static final String SQL_FIND_ALL ="SELECT * FROM proposition ";
         private static final String SQL_DELETE ="DELETE FROM  proposition  WHERE ID=?";
         private static final String SQL_UPDATE ="UPDATE  proposition SET titre=?,description=?,dure_estime=?,date_debut=?,date_fin=?,budget=?,id_categorie=?,competence=?,statut=? WHERE Id=?";


    public static IProposition getInstance() {
        if (ifreelancerdao == null) {
            ifreelancerdao = new PropositionDAO();
        }
        return ifreelancerdao;
    }

    public PropositionDAO() {
        connexion = dataSource.getInstance().getConnection();
    }
    
    
    public void createproposition(Proposition free) {
          String sql;
        sql="INSERT INTO proposition (titre,description,dure_estime,date_debut,date_fin,budget,id_categorie,competence,statut) VALUES (?,?,?,?,?,?,?,?,?)";
        if(findById(free.getId())== null){
            PreparedStatement pstmt = null;
            try {
                pstmt = connexion.prepareStatement(sql);
                pstmt.setString(1, free.getTitre());
                pstmt.setString(2, free.getDescription());
                pstmt.setString(3, free.getDure_estime());
                pstmt.setString(4, free.getDure_debut());
                pstmt.setString(5, free.getDure_fin());
                pstmt.setFloat(6, free.getBudget());
                pstmt.setInt(7,free.getCat().getId());
                pstmt.setString(8, free.getCompetence());
               
                pstmt.executeUpdate();
            } catch (SQLException ex) {
                System.out.println("erreur lors de l'insertion " + ex.getMessage());
            }
        }
    }
    
    public Proposition findById(int id) {
        Proposition found = null;
        
        PreparedStatement pstmt = null;
        ResultSet rs = null;       
        
        try{
            
            pstmt = connexion.prepareStatement(SQL_FIND_ID);
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            if(rs.next()){
                int freeId = rs.getInt("id");
                String titre = rs.getString("titre");
                String description = rs.getString("description");
                String dure_estime = rs.getString("dure_estime");
                String date_debut= rs.getString("date_debut");
                String date_fin = rs.getString("date_fin");
                String budget = rs.getString("budget");
                String id_categorie = rs.getString("id_categorie");
                String competence = rs.getString("competence");
                String statut = rs.getString("statut");
                int x;
                x=Integer.parseInt(id_categorie);
                CategorieDAO cat=new CategorieDAO();
                Categorie categ=new Categorie();
                categ=cat.findBYId(x);
                float bud=Float.parseFloat(budget);
                found = new Proposition(freeId,titre,description,dure_estime,date_debut,date_fin,bud,categ,competence,statut);
            }

                
        }catch(SQLException  ex){
           Logger.getLogger(freelancerdao.class.getName()).log(Level.SEVERE, "find failed", ex);
        }
        return found;
    }
    
     public List<Proposition> findAll() {
       
       List<Proposition> all = new ArrayList<Proposition>();
    
         Statement stmt=null;
          ResultSet rs=null;
         
   
       try{
       
             stmt=connexion.createStatement();
              rs= stmt.executeQuery(SQL_FIND_ALL);
              while(rs.next()){//return true
               int freeId = rs.getInt("id");
               String freePrenom = rs.getString("titre");
                String freeNom = rs.getString("description");
                String freeEmail = rs.getString("dure_estime");
                String freePays = rs.getString("date_debut");
                String freeVille = rs.getString("date_fin");
                float freeLogin = Float.parseFloat(rs.getString("budget"));
                int freePwd = rs.getInt("id_categorie");
                Categorie cat=new Categorie();
                CategorieDAO catt=new CategorieDAO();
                cat=catt.findBYId(freePwd);
                String freestatut = rs.getString("competence");
                 String statut = rs.getString("statut");
               Proposition found = new Proposition(freeId,freePrenom, freeNom, freeEmail, freePays, freeVille, freeLogin,cat,freestatut,statut);
              all.add(found);}
       }
             catch(SQLException ex) {
          Logger.getLogger(CategorieDAO.class.getName()).log(Level.SEVERE, "find all failed", ex);
         
       
       }  
       
     return all;
    }
     
     public void delete(Proposition categorie) {
        
        if(findById(categorie.getId())!=null){
       PreparedStatement pstmt=null;
        try {
            pstmt=connexion.prepareCall(SQL_DELETE);
             pstmt.setInt( 1, categorie.getId());
            pstmt.executeUpdate();
            Logger.getLogger(PropositionDAO.class.getName()).log(Level.SEVERE, "delete succee");
        } catch (SQLException ex) {
            Logger.getLogger(PropositionDAO.class.getName()).log(Level.SEVERE, "delete failed", ex);
        }
        
        
    }
    }
     
      public void update(Proposition free) {
       /* if(findById( free.getId())!=null){*/
       PreparedStatement pstmt=null;
        try {
            pstmt=connexion.prepareCall(SQL_UPDATE);
                
                pstmt.setString(1, free.getTitre());
                pstmt.setString(2, free.getDescription());
                pstmt.setString(3, free.getDure_estime());
                pstmt.setString(4, free.getDure_debut());
                pstmt.setString(5, free.getDure_fin());
                pstmt.setFloat(6, free.getBudget());
                pstmt.setInt(7,free.getCat().getId());
                pstmt.setString(8, free.getCompetence());
                 pstmt.setInt(9, free.getId());
                  pstmt.setString(10, free.getStatut());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PropositionDAO.class.getName()).log(Level.SEVERE, "update failed", ex);
        }
        
        
    
    }
}
