/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao.classes;



import edu.esprit.entities.administrateur;
import edu.esprit.technique.dataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author khalil
 */
public class Administrateurdao {
    private Connection connection = dataSource.getInstance().getConnection();
    private static final String SQL_SAVE =  "INSERT INTO administrateur (prenom,nom,email,pays,ville,login,pwd) VALUES (?,?,?,?,?,?,?,?)";
    private static final String SQL_FIND =  "SELECT * FROM administrateur WHERE id=?";
   
    
    
    public administrateur findById(int id) {
        administrateur found = null;
        
        PreparedStatement pstmt = null;
        ResultSet rs = null;       
        
        try{
            
            pstmt = connection.prepareStatement(SQL_FIND);
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            if(rs.next()){
                
                String adminPrenom = rs.getString("prenom");
                String adminNom = rs.getString("nom");
                String adminEmail = rs.getString("email");
                String adminPays = rs.getString("pays");
                String adminVille = rs.getString("ville");
                String adminLogin = rs.getString("login");
                String adminPwd = rs.getString("pwd");
                found = new administrateur(adminPrenom, adminNom, adminEmail, adminPays, adminVille , adminLogin, adminPwd);
            }

                
        }catch(SQLException  ex){
           Logger.getLogger(Administrateurdao.class.getName()).log(Level.SEVERE, "find failed", ex);
        }
        return found;
    }
    
    public void createAdministrateur(administrateur admin) {
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
                pstmt.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(Administrateurdao.class.getName()).log(Level.SEVERE, "save failed", ex);
            }
        }
    }
    
}
