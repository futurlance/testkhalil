/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testtttttttttttt22;

import edu.esprit.dao.classes.proprietairedao;
import edu.esprit.entities.proprietaire;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author khalil
 */
public class Listprop extends AbstractTableModel{
      String [] user={"Id","prenom","nom","email","pays","ville","login","pwd","Nom Entreprise","statut"};
      List<proprietaire> all=new ArrayList<proprietaire>();

    

    public Listprop() {
        proprietairedao iprop= new proprietairedao();
        all=iprop.findAll();
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
                return all.get(rowIndex).getPrenom();
                  case 2: 
                return all.get(rowIndex).getNom();
            case 3: 
                return all.get(rowIndex).getEmail();
            case 4: 
                return all.get(rowIndex).getPays();
                 case 5: 
                return all.get(rowIndex).getVille();
            case 6: 
                return all.get(rowIndex).getLogin();
            case 7: 
                return all.get(rowIndex).getPwd();
            case 8: 
                return all.get(rowIndex).getEntrep();
            case 9: 
                return all.get(rowIndex).getStatut();  
            default:
                return null;
        }
    }
}
