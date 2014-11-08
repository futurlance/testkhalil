/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entities;

/**
 *
 * @author zied
 */
public class message {
    int id;
    String msgrecu;
    int id_fr;

    public message(int id, String msgrecu, int id_fr) {
        this.id = id;
        this.msgrecu = msgrecu;
        this.id_fr = id_fr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMsgrecu() {
        return msgrecu;
    }

    public void setMsgrecu(String msgrecu) {
        this.msgrecu = msgrecu;
    }

    public int getId_fr() {
        return id_fr;
    }

    public void setId_fr(int id_fr) {
        this.id_fr = id_fr;
    }
    

   
    
}
