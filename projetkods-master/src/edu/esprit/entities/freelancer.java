/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entities;



/**
 *
 * @author khalil
 */
public class freelancer {
    private int id ;
    private String prenom;
    private String nom;
    private String email;
    private String pays;
    private String ville;
    private String login;
    private String pwd ;
    private String statut ;

    public freelancer() {
    }

    public freelancer(int id,String prenom, String nom, String email, String pays, String ville, String login, String pwd, String statut) {
        this.id=id;
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
        this.pays = pays;
        this.ville = ville;
        this.login = login;
        this.pwd = pwd;
        this.statut = statut;
    }

    public String getStatus() {
        return statut;
    }

    public void setStatus(String status) {
        this.statut = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

   

    

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }


    @Override
    public String toString() {
        return "freelancer{" + "prenom=" + prenom + ", nom=" + nom + ", email=" + email + ", pays=" + pays + ", ville=" + ville + ", login=" + login + ", pwd=" + pwd + ", status=" + statut + '}';
    }
    
   
}
