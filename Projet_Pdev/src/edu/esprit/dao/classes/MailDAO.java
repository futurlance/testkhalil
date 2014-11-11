/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao.classes;


import edu.esprit.dao.interfaces.ImailDAO;
import edu.esprit.entities.Mail;
import edu.esprit.technique.dataSource;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author malzak
 */
public class MailDAO implements ImailDAO {
    
    private Connection connection;
    
    public MailDAO(){
        connection = dataSource.getInstance().getConnection(); 
}
    
     public List<Mail> DisplayAllMail() {

        List<Mail> listemail = new ArrayList<Mail>();

        String requete = "select * from mail";
        try {
            Statement statement = connection
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                Mail mail = new Mail();
                mail.setMailAddressSender(resultat.getString(1));
                mail.setMailAddressRecipient(resultat.getString(2));
                mail.setMailObject(resultat.getString(3));
                mail.setMailSubject(resultat.getString(4));
                mail.setDate(resultat.getDate(5));
                

                listemail.add(mail);
            }
            return listemail;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des mail " + ex.getMessage());
            return null;
        }
    }
     DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS"); 
     Calendar cal = Calendar.getInstance();
     
     
     public void envoyerEmail(Mail m){
         String requete = "insert into mail (mailAddressSender,mailAddressRecipient,mailObject,mailSubject,date,fichier) values (?,?,?,?,NOW(),?)";
        // String requete = "insert into email (to,from,subject,msg,fichier) values (?,?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setString(1, m.getMailAddressSender());
            ps.setString(2, m.getMailAddressRecipient());
            ps.setString(3, m.getMailObject());
            ps.setString(4, m.getMailSubject());
            //ps.setDate(5, m.getDate());
            ps.setString(5, m.getPiecejointe());
            ps.executeUpdate();
            //JOptionPane.showMessageDialog(null, ps);
            System.out.println("Mail envoyé avec succès");
            JOptionPane.showMessageDialog(null, "Mail envoyé avec succés");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreurrrr lors de l'envoye " + ex.getMessage());
        }
     }
     private static ImailDAO iMailDao;

    public static ImailDAO getInstance() {
        if (iMailDao == null) {
            iMailDao = new MailDAO();
        }
        return iMailDao;
    }

    

    
    
    }

    
    
    

