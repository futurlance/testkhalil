/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao.interfaces;

import edu.esprit.entities.proprietaire;



/**
 *
 * @author khalil
 */
public interface Iproprietairedao {
     proprietaire findById(int id);
     void createProprietaire(proprietaire admin);
     void delete(proprietaire categorie);
}
