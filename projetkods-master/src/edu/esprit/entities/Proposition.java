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
    private String date_debut;
        private String date_fin;
    private float budget;
    private Categorie cat
    private String competence;
    private String statut
    int y
    public Proposition() {
    }

    public Proposition(int id, String titre, String description, String dure_estime, String date_debut, String date_fin, float budget, Categorie cat, String competence,String statut) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.dure_estime = dure_estime;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.budget = budget;
        this.cat = cat;
        this.competence = competence;
        this.statut = statut;
    }
 
 
    public String getStatut() {
        return statut;
    }

    private void setStatut(String statut) {
        this.statut = statut;
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
        return date_debut;
    }

    public String getDure_fin() {
        return date_fin;
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
        this.date_debut = dure_debut;
    }

    public void setDure_fin(String dure_fin) {
        this.date_fin = dure_fin;
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
        return "Proposition{" + "id=" + id + ", titre=" + titre + ", description=" + description + ", dure_estime=" + dure_estime + ", dure_debut=" + date_debut + ", dure_fin=" + date_fin + ", budget=" + budget + ", cat=" + cat + ", competence=" + competence +", statut=" + statut +'}';
    }

    

    
   

    
    
    
    
    
    
}
