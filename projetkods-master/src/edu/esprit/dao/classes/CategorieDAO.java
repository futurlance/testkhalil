/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao.classes;



import edu.esprit.dao.interfaces.ICategorieDAO;
import edu.esprit.entities.Categorie;
import edu.esprit.technique.dataSource;


import java.util.List;
import java.sql.*;//api jdbc
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author USER
 */
public class CategorieDAO  implements ICategorieDAO{

    
     private Connection connection;

    public CategorieDAO() {
        connection = dataSource.getInstance().getConnection();
    }

  
     //patron de coneption / singleton : restreindre le nombre d'instances
    
    private static final String SQL_FIND ="SELECT * FROM CATEGORIE WHERE ID=?";
     private static final String SQL_FIND_NOM =  "SELECT * FROM CATEGORIE WHERE nom=?";
    private static final String SQL_SAVE ="INSERT INTO CATEGORIE(ID,NOM,TYPE) values (?,?,?)";
    
    private static final String SQL_FIND_ALL ="SELECT * FROM CATEGORIE ";
    
    private static final String SQL_UPDATE ="UPDATE  CATEGORIE SET NOM=? , TYPE=? WHERE ID=?";
    
    private static final String SQL_DELETE ="DELETE FROM  CATEGORIE  WHERE ID=?";
    
    
    
    
   
  
    public void save(Categorie categorie) {
       /*if(findBYId(categorie.getId())==null){*/
       PreparedStatement pstmt=null;
        try {
            pstmt=connection.prepareCall(SQL_SAVE);
            pstmt.setInt(1,categorie.getId());
            pstmt.setString(2, categorie.getNom());
            pstmt.setString(3, categorie.getType());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategorieDAO.class.getName()).log(Level.SEVERE, "save failed", ex);
        }
        
        
    }

    
   

    
    public void update(Categorie categorie) {
       if(findBYId( categorie.getId())!=null){
       PreparedStatement pstmt=null;
        try {
         pstmt=connection.prepareCall(SQL_UPDATE);
            pstmt.setString(1,  categorie.getNom());
            pstmt.setString(2, categorie.getType());
             pstmt.setInt(3,categorie.getId());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategorieDAO.class.getName()).log(Level.SEVERE, "update failed", ex);
        }
       }
    }
        

    
   
    public void delete(Categorie categorie) {
        if(findBYId(categorie.getId())!=null){
       PreparedStatement pstmt=null;
        try {
            pstmt=connection.prepareCall(SQL_DELETE);
             pstmt.setInt( 1, categorie.getId());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategorieDAO.class.getName()).log(Level.SEVERE, "delete failed", ex);
        }
        
        
    }
    }

    
      public Categorie findBYId(int id) {
     Categorie found = null;
    
       PreparedStatement pstmt=null;
          ResultSet rs=null;
         
   
       try{
       
             pstmt=connection.prepareStatement(SQL_FIND);
             pstmt.setInt(1,id);
              rs= pstmt.executeQuery();
              if(rs.next()){//return true
               int categorieId=rs.getInt("ID");
               String categorieNom=rs.getString("NOM");
               String categorieType=rs.getString("TYPE");
               found = new Categorie(categorieId,categorieNom,categorieType);}
       }
             catch(SQLException ex) {
          Logger.getLogger(CategorieDAO.class.getName()).log(Level.SEVERE, "find failed", ex);
         
       
       }  
       
     return found;
    }
    public Categorie findByNom(String nom) {
        Categorie found = null;
        
        PreparedStatement pstmt = null;
        ResultSet rs = null;       
        
        try{
            
            pstmt=connection.prepareStatement(SQL_FIND_NOM);
            pstmt.setString(1, nom);
            rs = pstmt.executeQuery();
            if(rs.next()){
                int categorieId = rs.getInt("id");
                 String categorieNom=rs.getString("NOM");
               String categorieType=rs.getString("TYPE");
                found = new Categorie(categorieId,categorieNom,categorieType);
            }

                
        }catch(SQLException  ex){
           Logger.getLogger(freelancerdao.class.getName()).log(Level.SEVERE, "find failed", ex);
        }
        return found;
    }
    
    
    
    

    public List<Categorie> findAll() {
       List<Categorie> all = new ArrayList<Categorie>();
    
         Statement stmt=null;
          ResultSet rs=null;
         
   
       try{
       
             stmt=connection.createStatement();
              rs= stmt.executeQuery(SQL_FIND_ALL);
              while(rs.next()){//return true
               int categorieId=rs.getInt("ID");
               String categorieNom=rs.getString("NOM");
               String categorieType=rs.getString("TYPE");
            
               Categorie found = new Categorie(categorieId,categorieNom,categorieType);
              all.add(found);}
       }
             catch(SQLException ex) {
          Logger.getLogger(CategorieDAO.class.getName()).log(Level.SEVERE, "find all failed", ex);
         
       
       }  
       
     return all;
    }
    
  
    
    
       private static ICategorieDAO iCategorieDAO;

    public static ICategorieDAO getInstance() {
        if (iCategorieDAO == null) {
            iCategorieDAO = new CategorieDAO();
        }
        return iCategorieDAO;
    }

    
    
    
    
    
    
    
}