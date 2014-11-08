/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testtttttttttttt22;


import edu.esprit.dao.classes.CategorieDAO;
import edu.esprit.dao.interfaces.ICategorieDAO;
import edu.esprit.entities.Categorie;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author WIEM
 */
public class ListCategories extends AbstractTableModel{

    String [] header={"id", "nom", "type"};
    List<Categorie> categories=new ArrayList<Categorie>();
    
    public ListCategories() {
        ICategorieDAO catdao=CategorieDAO.getInstance();
        categories=catdao.findAll();
    
    }

    @Override
    public String getColumnName(int column) {
        return header[column];
    }
    
    
    
    @Override
    public int getRowCount() {
        return categories.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch(columnIndex){
            case 0: 
                return categories.get(rowIndex).getId();
            case 1: 
                return categories.get(rowIndex).getNom();
            case 2: 
                return categories.get(rowIndex).getType();
           
            default:
                return null;
        }
    }
    
}

