/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entities;

/**
 *
 * @author khalil
 */
public class competence {
    private int id;
    private String nom;

    public competence() {
    }

    public competence(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "competence{" + "id=" + id + ", nom=" + nom + '}';
    }
    
    
}
