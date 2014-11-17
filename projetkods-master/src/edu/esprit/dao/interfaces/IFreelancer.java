/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao.interfaces;

import edu.esprit.entities.freelancer;
import java.util.List;

/**
 *
 * @author khalil
 */
public interface IFreelancer {
    void createFreelancer(freelancer free);
    freelancer findById(int id);
    freelancer findByPrenom(String prenom);
    freelancer findByNom(String nom);
    List<freelancer> findAll();
    void delete(freelancer categorie);
    void update_actif(freelancer categorie);
    void update_nonactif(freelancer categorie) ;
}
