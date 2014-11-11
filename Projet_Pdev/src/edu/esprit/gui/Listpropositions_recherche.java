/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.gui;

import edu.esprit.dao.classes.PropositionDAO;
import edu.esprit.dao.interfaces.IProposition;
import edu.esprit.entities.Proposition;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author khalil
 */
public class Listpropositions_recherche extends AbstractTableModel{
    String [] user={"Id","titre","description","Durée Estimée","Date debut","date fin","Budget","Nom Categorie","Nom freelancer","Nom competence","Nom proprietaire"};
      List<Proposition> all=new ArrayList<Proposition>();

    public Listpropositions_recherche() {
    }
     
    public Listpropositions_recherche(List<Proposition> alll) {
        IProposition ifree = new PropositionDAO();
        this.all=alll;
    }

    

    @Override
    public String getColumnName(int column) {
        return user[column];
    }
    
    
    
    @Override
    public int getRowCount() {
        return all.size();
    }

    @Override
    public int getColumnCount() {
        return user.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch(columnIndex){
             case 0: 
                return all.get(rowIndex).getId(); 
            case 1: 
                return all.get(rowIndex).getTitre();
                  case 2: 
                return all.get(rowIndex).getDescription();
            case 3: 
                return all.get(rowIndex).getDure_estime();
            case 4: 
                return all.get(rowIndex).getDate_debut();
                 case 5: 
                return all.get(rowIndex).getDate_fin();
            case 6: 
                return all.get(rowIndex).getBudget();
            case 7: 
                return all.get(rowIndex).getCat().getNom();
            case 8: 
                return all.get(rowIndex).getFree().getNom();
           case 9: 
                return all.get(rowIndex).getCateg().getNom();
               case 10: 
                return all.get(rowIndex).getProp().getNom();
            default:
                return null;
        }
    }
}
