/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao.interfaces;

import edu.esprit.entities.message;

/**
 *
 * @author zied
 */
public interface Imessage {
 void Createmessage(message free) ;  
 message findById(int id) ;
    
}
