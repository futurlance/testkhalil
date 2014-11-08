/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entities;

/**
 *
 * @author USER
 */
public class Proposition {
    
    private int id;
    private String titre;
    private String description;
    private String dure_estime;
    private String dure_debut;
    private String dure_fin;
    private float budget;
    private Categorie cat;
    private String competence;

    public Proposition() {
    }

    public Proposition(int id, String titre, String description, String dure_estime, String dure_debut, String dure_fin, float budget, Categorie cat, String competence) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.dure_estime = dure_estime;
        this.dure_debut = dure_debut;
        this.dure_fin = dure_fin;
        this.budget = budget;
        this.cat = cat;
        this.competence = competence;
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    public String getDure_estime() {
        return dure_estime;
    }

    public String getDure_debut() {
        return dure_debut;
    }

    public String getDure_fin() {
        return dure_fin;
    }

    public float getBudget() {
        return budget;
    }

    public Categorie getCat() {
        return cat;
    }

    public String getCompetence() {
        return competence;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDure_estime(String dure_estime) {
        this.dure_estime = dure_estime;
    }

    public void setDure_debut(String dure_debut) {
        this.dure_debut = dure_debut;
    }

    public void setDure_fin(String dure_fin) {
        this.dure_fin = dure_fin;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }

    public void setCat(Categorie cat) {
        this.cat = cat;
    }

    public void setCompetence(String competence) {
        this.competence = competence;
    }
    
    
   
    @Override
    public String toString() {
        return "Proposition{" + "id=" + id + ", titre=" + titre + ", description=" + description + ", dure_estime=" + dure_estime + ", dure_debut=" + dure_debut + ", dure_fin=" + dure_fin + ", budget=" + budget + ", cat=" + cat + ", competence=" + competence + '}';
    }

    

    
   

    
    
    
    
    
    
}
