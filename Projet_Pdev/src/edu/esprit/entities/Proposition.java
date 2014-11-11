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
    private Categorie cat;
    private freelancer free;
    private competence categ;
    private proprietaire prop;
    private String statut;

    public Proposition() {
    }

    public Proposition(int id, String titre, String description, String dure_estime, String date_debut, String date_fin, float budget, Categorie cat, freelancer free, competence categ, proprietaire prop, String statut) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.dure_estime = dure_estime;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.budget = budget;
        this.cat = cat;
        this.free = free;
        this.categ = categ;
        this.prop = prop;
        this.statut = statut;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

   

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDure_estime() {
        return dure_estime;
    }

    public void setDure_estime(String dure_estime) {
        this.dure_estime = dure_estime;
    }

    public String getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(String date_debut) {
        this.date_debut = date_debut;
    }

    public String getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(String date_fin) {
        this.date_fin = date_fin;
    }

    public float getBudget() {
        return budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }

    public Categorie getCat() {
        return cat;
    }

    public void setCat(Categorie cat) {
        this.cat = cat;
    }

    public freelancer getFree() {
        return free;
    }

    public void setFree(freelancer free) {
        this.free = free;
    }

    public competence getCateg() {
        return categ;
    }

    public void setCateg(competence categ) {
        this.categ = categ;
    }

    public proprietaire getProp() {
        return prop;
    }

    public void setProp(proprietaire prop) {
        this.prop = prop;
    }

    

    

    

    

    
   

    
    
    
    
    
    
}
