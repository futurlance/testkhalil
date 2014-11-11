/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao.interfaces;


import edu.esprit.entities.Mail;
import java.util.List;

/**
 *
 * @author malzak
 */
public interface ImailDAO {
    
    List<Mail>DisplayAllMail();
    
    void envoyerEmail(Mail m);
    
}

