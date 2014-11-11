/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao.interfaces;

import edu.esprit.entities.Proposition;
import java.util.List;

/**
 *
 * @author khalil
 */
public interface IProposition {
    Proposition findById(int id);
    void createproposition(Proposition prop);
    List<Proposition> findAll();
    void delete(Proposition categorie);
    void update(Proposition free);
    List<Proposition> findById_cat(int id);
    void update1(Proposition free,int ch);
}
