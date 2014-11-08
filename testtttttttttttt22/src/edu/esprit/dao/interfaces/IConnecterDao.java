/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao.interfaces;

import edu.esprit.entities.connecter;
import java.util.List;

/**
 *
 * @author khalil
 */
public interface IConnecterDao {
    connecter findAll();
    void save(connecter categorie);
}
