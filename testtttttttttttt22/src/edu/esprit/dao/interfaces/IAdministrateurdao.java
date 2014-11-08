/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao.interfaces;

import edu.esprit.entities.administrateur;





/**
 *
 * @author khalil
 */
public interface IAdministrateurdao {
    
   void save(administrateur admin);
    administrateur findById(int id);
}
