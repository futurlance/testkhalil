/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao.interfaces;


import edu.esprit.entities.Categorie;
import java.util.List;

/**
 *
 * @author khalil
 */
public interface ICategorieDAO {
    void save(Categorie categorie) ;

     Categorie findBYId(int id);
Categorie findByNom(String nom);
     void update(Categorie categorie);

     void delete(Categorie categorie);

    List<Categorie> findAll();
}
