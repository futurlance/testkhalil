/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.gui;

import edu.esprit.dao.classes.freelancerdao;
import edu.esprit.entities.freelancer;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author khalil
 */
public class ListUsers_prop extends AbstractTableModel{
    String [] user={"Id","prenom","nom","email"};
      List<freelancer> all=new ArrayList<freelancer>();

    public ListUsers_prop() {
        freelancerdao ifree = new freelancerdao();
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
                return all.get(rowIndex).getPrenom();
                  case 2: 
                return all.get(rowIndex).getNom();
            case 3: 
                return all.get(rowIndex).getEmail();
            default:
                return null;
        }
    }
    
}
