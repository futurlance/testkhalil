/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao.classes;

import edu.esprit.dao.interfaces.ICompetence;
import edu.esprit.dao.interfaces.IFreelancer;
import edu.esprit.dao.interfaces.IProposition;
import edu.esprit.dao.interfaces.Iproprietairedao;
import edu.esprit.entities.Categorie;
import edu.esprit.entities.Proposition;
import edu.esprit.entities.competence;
import edu.esprit.entities.freelancer;
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
public class PropositionDAO implements IProposition{
      private Connection connexion;
    private Statement stmt;
    private static IProposition ifreelancerdao;
        private static final String SQL_FIND_ID =  "SELECT * FROM propositions WHERE id=?";
        private static final String SQL_FIND_ALL ="SELECT * FROM propositions ";
         private static final String SQL_DELETE ="DELETE FROM  propositions  WHERE ID=?";
         private static final String SQL_UPDATE ="UPDATE  propositions SET titre=?,description=?,dure_estime=?,date_debut=?,date_fin=?,budget=?,id_categorie=?,id_free=? WHERE Id=?";
        private static final String SQL_FIND_ID_CAT="SELECT * FROM propositions WHERE id_categorie=?";
        private static final String SQL_UPDATE1 ="UPDATE  propositions SET id_free=? WHERE id=?";
        
        
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
        sql="INSERT INTO propositions (titre,description,dure_estime,date_debut,date_fin,budget,id_categorie,id_free,id_competence,id_prop) VALUES (?,?,?,?,?,?,?,?,?,?)";
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
                pstmt.setInt(8, free.getFree().getId());
                pstmt.setInt(9, free.getCateg().getId());
                pstmt.setInt(10, free.getProp().getId());
               
                pstmt.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(freelancerdao.class.getName()).log(Level.SEVERE, "find failed", ex);
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
                int id_categorie = rs.getInt("id_categorie");
                int id_free = rs.getInt("id_free");
                int id_competence = rs.getInt("id_competence");
                int id_prop = rs.getInt("id_prop");
                CategorieDAO cat=new CategorieDAO();
                Categorie categ=new Categorie();
                categ=cat.findBYId(id_categorie);
                freelancer free=new freelancer();
                IFreelancer freedao=new freelancerdao();
                free=freedao.findById(id_free);
                competence comp=new competence();
                ICompetence icomp=new CompetenceDAO();
                comp=icomp.findBYId(id_competence);
                proprietaire prop=new proprietaire();
                Iproprietairedao iprop=new proprietairedao();
                prop=iprop.findById(id_prop);
                float bud=Float.parseFloat(budget);
                found = new Proposition(freeId,titre,description,dure_estime,date_debut,date_fin,bud,categ,free,comp,prop);
            }

                
        }catch(SQLException  ex){
           Logger.getLogger(freelancerdao.class.getName()).log(Level.SEVERE, "find failed", ex);
        }
        return found;
    }
    
     public List<Proposition> findAll() {
       Proposition found = null;
       List<Proposition> all = new ArrayList<Proposition>();
    
         Statement stmt=null;
          ResultSet rs=null;
         
   
       try{
       
             stmt=connexion.createStatement();
              rs= stmt.executeQuery(SQL_FIND_ALL);
              while(rs.next()){//return true
               int freeId = rs.getInt("id");
                String titre = rs.getString("titre");
                String description = rs.getString("description");
                String dure_estime = rs.getString("dure_estime");
                String date_debut= rs.getString("date_debut");
                String date_fin = rs.getString("date_fin");
                String budget = rs.getString("budget");
                int id_categorie = rs.getInt("id_categorie");
                int id_free = rs.getInt("id_free");
                int id_competence = rs.getInt("id_competence");
                int id_prop = rs.getInt("id_prop");
                CategorieDAO cat=new CategorieDAO();
                Categorie categ=new Categorie();
                categ=cat.findBYId(id_categorie);
                freelancer free=new freelancer();
                IFreelancer freedao=new freelancerdao();
                free=freedao.findById(id_free);
                competence comp=new competence();
                ICompetence icomp=new CompetenceDAO();
                comp=icomp.findBYId(id_competence);
                proprietaire prop=new proprietaire();
                Iproprietairedao iprop=new proprietairedao();
                prop=iprop.findById(id_prop);
                float bud=Float.parseFloat(budget);
                found = new Proposition(freeId,titre,description,dure_estime,date_debut,date_fin,bud,categ,free,comp,prop);
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
        if(findById( free.getId())!=null){
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
                pstmt.setInt(8, free.getFree().getId());
                 pstmt.setInt(9, free.getCateg().getId());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PropositionDAO.class.getName()).log(Level.SEVERE, "update failed", ex);
        }
        
        
    }
    }
      
      public List<Proposition> findById_cat(int id) {
        Proposition found = null;
        List<Proposition> all = new ArrayList<Proposition>();
        
        PreparedStatement pstmt = null;
        ResultSet rs = null;       
        
        try{
            
            pstmt = connexion.prepareStatement(SQL_FIND_ID_CAT);
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            while(rs.next()){
                int freeId = rs.getInt("id");
                String titre = rs.getString("titre");
                String description = rs.getString("description");
                String dure_estime = rs.getString("dure_estime");
                String date_debut= rs.getString("date_debut");
                String date_fin = rs.getString("date_fin");
                Float budget = rs.getFloat("budget");
                int id_categorie = rs.getInt("id_categorie");
                Categorie cat=new Categorie();
                CategorieDAO catt=new CategorieDAO();
                cat=catt.findBYId(id_categorie);
                int id_free = rs.getInt("id_free");
                freelancer free=new freelancer();
                IFreelancer ifree=new freelancerdao();
                free=ifree.findById(id_free);
                int id_comp = rs.getInt("id_competence");
                competence comp=new competence();
                ICompetence icomp=new CompetenceDAO();
                comp=icomp.findBYId(id_comp);
                int id_prop=rs.getInt("id_prop");
                proprietaire prop=new proprietaire();
                Iproprietairedao iprop=new proprietairedao();
                prop=iprop.findById(id_prop);
                found = new Proposition(freeId,titre,description,dure_estime,date_debut,date_fin,budget,cat,free,comp,prop);
                 all.add(found);
            }

                
        }catch(SQLException  ex){
           Logger.getLogger(PropositionDAO.class.getName()).log(Level.SEVERE, "find failed", ex);
        }
        return all;
          
    }
      //*****************
      public void update1(Proposition free,int ch) {
        
       PreparedStatement pstmt=null;
        try {
                pstmt=connexion.prepareCall(SQL_UPDATE1);
                pstmt.setInt(1, ch);
                pstmt.setInt(2, free.getFree().getId());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PropositionDAO.class.getName()).log(Level.SEVERE, "update failed", ex);
        }
        
        
   
    }
}
