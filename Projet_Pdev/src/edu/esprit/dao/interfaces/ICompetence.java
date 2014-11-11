/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao.interfaces;

import edu.esprit.entities.competence;
import java.util.List;

/**
 *
 * @author khalil
 */
public interface ICompetence {
    List<competence> findAll();
    competence findBYId(int id);
}
