/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testtttttttttttt22;

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
public class ListProposition extends AbstractTableModel{
    String [] user={"Id","titre","description","Durée Estimée","Date debut","date fin","Budget","Id Categorie","Competence","statut"};
      List<Proposition> all=new ArrayList<Proposition>();

    public ListProposition() {
        IProposition ifree = new PropositionDAO();
        all=ifree.findAll();
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
                return all.get(rowIndex).getDure_debut();
                 case 5: 
                return all.get(rowIndex).getDure_fin();
            case 6: 
                return all.get(rowIndex).getBudget();
            case 7: 
                return all.get(rowIndex).getCat().getNom();
            case 8: 
                return all.get(rowIndex).getCompetence();
                case 9: 
                return all.get(rowIndex).getStatut();
            default:
                return null;
        }
    }
}
