/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testtttttttttttt22;

import edu.esprit.dao.classes.CategorieDAO;
import edu.esprit.dao.classes.PropositionDAO;
import edu.esprit.dao.interfaces.ICategorieDAO;
import edu.esprit.dao.interfaces.IProposition;
import edu.esprit.entities.Categorie;
import edu.esprit.entities.Proposition;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author khalil
 */
public class proprietaire_interface extends javax.swing.JFrame {

    /**
     * Creates new form proprietaire_interface
     */
    public proprietaire_interface() {
        initComponents();
        getcategories();
       panel_modif.setVisible(false);
        panel_ajouter.setVisible(false);
    }
      public void getcategories() {
        List<Categorie> listes = new ArrayList<Categorie>();
        ICategorieDAO cat_Dao = CategorieDAO.getInstance();
        listes = cat_Dao.findAll();
        for (Categorie d : listes) {
          
        combo1.addItem(d.getNom());
        }
        }
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        panel_general = new javax.swing.JPanel();
        panel_2_boutton = new javax.swing.JPanel();
        ajouter_boutoon = new javax.swing.JButton();
        supp_modif_boutton = new javax.swing.JButton();
        panel_ajouter = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        titre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        dure_estime = new javax.swing.JTextField();
        envoyer_boutton = new javax.swing.JButton();
        retour_boutton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        budgettt = new javax.swing.JTextField();
        dure_debut = new com.toedter.calendar.JDateChooser();
        date_fin = new com.toedter.calendar.JDateChooser();
        competencee = new javax.swing.JTextField();
        combo1 = new javax.swing.JComboBox();
        panel_modif = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_propos = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        retour_button_modif = new javax.swing.JButton();
        modif_button = new javax.swing.JButton();
        suprime_propos = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        tab22 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        text1 = new javax.swing.JTextField();
        text2 = new javax.swing.JTextField();
        text3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tab33 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        panel_general.setLayout(null);

        panel_2_boutton.setLayout(null);

        ajouter_boutoon.setText("Ajouter");
        ajouter_boutoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouter_boutoonActionPerformed(evt);
            }
        });
        panel_2_boutton.add(ajouter_boutoon);
        ajouter_boutoon.setBounds(352, 154, 143, 50);

        supp_modif_boutton.setText("Modifier/Supprimer");
        supp_modif_boutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supp_modif_bouttonActionPerformed(evt);
            }
        });
        panel_2_boutton.add(supp_modif_boutton);
        supp_modif_boutton.setBounds(352, 323, 143, 50);

        panel_general.add(panel_2_boutton);
        panel_2_boutton.setBounds(0, 0, 830, 450);

        panel_ajouter.setLayout(null);

        jLabel1.setText("Categorie :");
        panel_ajouter.add(jLabel1);
        jLabel1.setBounds(137, 54, 64, 16);

        jLabel2.setText("Titre :");
        panel_ajouter.add(jLabel2);
        jLabel2.setBounds(137, 102, 36, 16);

        jLabel3.setText("Description :");
        panel_ajouter.add(jLabel3);
        jLabel3.setBounds(140, 150, 72, 16);

        jLabel4.setText("Durée Estimée :");
        panel_ajouter.add(jLabel4);
        jLabel4.setBounds(130, 270, 92, 16);

        jLabel5.setText("Date debut :");
        panel_ajouter.add(jLabel5);
        jLabel5.setBounds(130, 310, 71, 16);

        jLabel6.setText("Date fin :");
        panel_ajouter.add(jLabel6);
        jLabel6.setBounds(130, 350, 53, 16);

        jLabel7.setText("Competence :");
        panel_ajouter.add(jLabel7);
        jLabel7.setBounds(137, 16, 80, 16);
        panel_ajouter.add(titre);
        titre.setBounds(371, 99, 150, 22);

        description.setColumns(20);
        description.setRows(5);
        jScrollPane1.setViewportView(description);

        panel_ajouter.add(jScrollPane1);
        jScrollPane1.setBounds(370, 140, 166, 116);
        panel_ajouter.add(dure_estime);
        dure_estime.setBounds(370, 270, 166, 22);

        envoyer_boutton.setText("Envoyer");
        envoyer_boutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                envoyer_bouttonActionPerformed(evt);
            }
        });
        panel_ajouter.add(envoyer_boutton);
        envoyer_boutton.setBounds(590, 420, 77, 25);

        retour_boutton.setText("Retour");
        retour_boutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retour_bouttonActionPerformed(evt);
            }
        });
        panel_ajouter.add(retour_boutton);
        retour_boutton.setBounds(710, 420, 71, 25);

        jLabel8.setText("Budget :");
        panel_ajouter.add(jLabel8);
        jLabel8.setBounds(130, 390, 60, 16);

        budgettt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                budgetttActionPerformed(evt);
            }
        });
        panel_ajouter.add(budgettt);
        budgettt.setBounds(370, 380, 170, 22);
        panel_ajouter.add(dure_debut);
        dure_debut.setBounds(370, 310, 170, 22);
        panel_ajouter.add(date_fin);
        date_fin.setBounds(370, 340, 170, 22);
        panel_ajouter.add(competencee);
        competencee.setBounds(370, 10, 150, 22);

        combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo1ActionPerformed(evt);
            }
        });
        panel_ajouter.add(combo1);
        combo1.setBounds(370, 50, 150, 22);

        panel_general.add(panel_ajouter);
        panel_ajouter.setBounds(0, 0, 830, 450);

        table_propos.setModel(new ListProposition());
        table_propos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_proposMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_propos);

        jLabel9.setText("Titre :");

        jLabel10.setText("Description :");

        jLabel11.setText("Durée Estimée :");

        jLabel12.setText("Date Debut :");

        jLabel13.setText("Date Fin :");

        jLabel14.setText("Budget :");

        jLabel15.setText("Categorie :");

        jLabel16.setText("Competence :");

        retour_button_modif.setText("Retour");
        retour_button_modif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retour_button_modifActionPerformed(evt);
            }
        });

        modif_button.setText("Modifier");
        modif_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modif_buttonActionPerformed(evt);
            }
        });

        suprime_propos.setText("Supprimer");
        suprime_propos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suprime_proposActionPerformed(evt);
            }
        });

        jLabel17.setText("Id :");

        javax.swing.GroupLayout panel_modifLayout = new javax.swing.GroupLayout(panel_modif);
        panel_modif.setLayout(panel_modifLayout);
        panel_modifLayout.setHorizontalGroup(
            panel_modifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_modifLayout.createSequentialGroup()
                .addGroup(panel_modifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_modifLayout.createSequentialGroup()
                        .addGroup(panel_modifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_modifLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(suprime_propos)))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_modifLayout.createSequentialGroup()
                        .addComponent(modif_button)
                        .addGap(279, 279, 279))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_modifLayout.createSequentialGroup()
                        .addComponent(retour_button_modif)
                        .addGap(153, 153, 153)))
                .addGroup(panel_modifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel17))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(panel_modifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(53, 53, 53))
        );
        panel_modifLayout.setVerticalGroup(
            panel_modifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_modifLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_modifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panel_modifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(panel_modifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panel_modifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(panel_modifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panel_modifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panel_modifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(panel_modifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_modifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(panel_modifLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(suprime_propos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(modif_button)
                .addGap(17, 17, 17)
                .addComponent(retour_button_modif)
                .addGap(66, 66, 66))
        );

        panel_general.add(panel_modif);
        panel_modif.setBounds(0, 0, 830, 450);

        panel_general.setBounds(0, 0, 830, 450);
        jDesktopPane1.add(panel_general, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane1.addTab("Gerer Les Propositions", jDesktopPane1);

        jDesktopPane2.setBackground(new java.awt.Color(255, 255, 255));

        jTable2.setModel(new ListCategories());
        jScrollPane3.setViewportView(jTable2);

        jScrollPane3.setBounds(70, 70, 452, 160);
        jDesktopPane2.add(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane1.addTab("Consulter Categories", jDesktopPane2);

        jDesktopPane3.setBackground(new java.awt.Color(255, 255, 255));

        tab22.setModel(new ListProposition());
        jScrollPane4.setViewportView(tab22);

        jScrollPane4.setBounds(0, 0, 670, 150);
        jDesktopPane3.add(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel18.setText("Id :");
        jLabel18.setBounds(40, 220, 20, 16);
        jDesktopPane3.add(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel19.setText("Prenom :");
        jLabel19.setBounds(40, 270, 60, 16);
        jDesktopPane3.add(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel20.setText("Nom :");
        jLabel20.setBounds(40, 320, 60, 16);
        jDesktopPane3.add(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        text1.setBounds(110, 220, 80, 22);
        jDesktopPane3.add(text1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        text2.setBounds(110, 260, 80, 22);
        jDesktopPane3.add(text2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        text3.setBounds(110, 310, 80, 22);
        jDesktopPane3.add(text3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setText("Attribuer");
        jButton1.setBounds(180, 410, 83, 25);
        jDesktopPane3.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        tab33.setModel(new ListUsers());
        tab33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab33MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tab33);

        jScrollPane5.setBounds(292, 190, 530, 180);
        jDesktopPane3.add(jScrollPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane1.addTab("Panier Propositions", jDesktopPane3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ajouter_boutoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouter_boutoonActionPerformed
       
        panel_2_boutton.setVisible(false);
        panel_ajouter.setVisible(true);
    }//GEN-LAST:event_ajouter_boutoonActionPerformed

    private void envoyer_bouttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_envoyer_bouttonActionPerformed
        String titres="";
        String desc="";
        String dure_est="";
        String dure_deb="";
        String dure_fins="";
        String budget="";
        String categ="";
        String compet="";
        titres=titre.getText();
        desc=description.getText();
        dure_est=dure_estime.getText();
        dure_deb=dure_debut.getDate().toString();
        dure_deb=dure_deb.substring(0,10);
        dure_fins=date_fin.getDate().toString();
        dure_fins=dure_fins.substring(0,10);
        
        budget=budgettt.getText();
        compet=competencee.getText();
        categ=combo1.getSelectedItem().toString();
        
        int x=0;
        List<Categorie> listes = new ArrayList<Categorie>();
        ICategorieDAO cat_Dao = CategorieDAO.getInstance();
        listes = cat_Dao.findAll();
        for (Categorie d : listes) {
          if(categ.equals(d.getNom()))
              x=d.getId(); 
        }
       ICategorieDAO cat=new CategorieDAO();
        Categorie cattt=new Categorie();
        cattt=cat.findBYId(x);
        JOptionPane.showMessageDialog(null,cattt.getId());
        JOptionPane.showMessageDialog(null,cattt.getNom());
        JOptionPane.showMessageDialog(null,cattt.getType());
        
         int z=0;
        float bud=Float.parseFloat(budget);
        Proposition prop=new Proposition(z, titres, desc, dure_est, dure_deb, dure_fins, bud, cattt, compet);
        IProposition propos =new PropositionDAO();
        propos.createproposition(prop);
        JOptionPane.showMessageDialog(null, "Insertion Reuissite");
        
        
        
    }//GEN-LAST:event_envoyer_bouttonActionPerformed

    private void budgetttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_budgetttActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_budgetttActionPerformed

    private void supp_modif_bouttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supp_modif_bouttonActionPerformed
        panel_modif.setVisible(true);
        panel_2_boutton.setVisible(false);
        panel_ajouter.setVisible(false);
    }//GEN-LAST:event_supp_modif_bouttonActionPerformed

    private void retour_bouttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retour_bouttonActionPerformed
       panel_2_boutton.setVisible(true);
       panel_ajouter.setVisible(false);
       panel_modif.setVisible(false);
       panel_general.removeAll();
       panel_general.repaint();
       panel_general.validate();
       panel_general.add(panel_2_boutton);
       panel_general.repaint();
       panel_general.revalidate();
    }//GEN-LAST:event_retour_bouttonActionPerformed

    private void retour_button_modifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retour_button_modifActionPerformed
       panel_2_boutton.setVisible(true);
       panel_ajouter.setVisible(false);
       panel_modif.setVisible(false);
       panel_general.removeAll();
       panel_general.repaint();
       panel_general.validate();
       panel_general.add(panel_2_boutton);
       panel_general.repaint();
       panel_general.revalidate();
       
    }//GEN-LAST:event_retour_button_modifActionPerformed

    private void combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo1ActionPerformed

    private void table_proposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_proposMouseClicked
        int row = table_propos.getSelectedRow();
        jTextField1.setText(table_propos.getModel().getValueAt(row, 1).toString());   
        jTextField2.setText(table_propos.getModel().getValueAt(row, 2).toString());
        jTextField3.setText(table_propos.getModel().getValueAt(row, 3).toString());   
        jTextField4.setText(table_propos.getModel().getValueAt(row, 4).toString());
        jTextField5.setText(table_propos.getModel().getValueAt(row, 5).toString());   
        jTextField6.setText(table_propos.getModel().getValueAt(row, 6).toString());
        jTextField7.setText(table_propos.getModel().getValueAt(row, 7).toString());   
        jTextField8.setText(table_propos.getModel().getValueAt(row, 8).toString());
         jTextField9.setText(table_propos.getModel().getValueAt(row,0).toString());
    }//GEN-LAST:event_table_proposMouseClicked

    private void suprime_proposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suprime_proposActionPerformed
        String titres="";
        String desc="";
        String dure_est="";
        String dure_deb="";
        String dure_fins="";
        String budget="";
        String categ="";
        String compet="";
        int z=Integer.parseInt(jTextField9.getText());
        titres=jTextField1.getText();
        desc=jTextField2.getText();
        dure_est=jTextField3.getText();
        dure_deb=jTextField4.getText();
        dure_fins=jTextField5.getText();
        
        budget=jTextField6.getText();
        compet=jTextField7.getText();
        categ=jTextField8.getText();
        
        int x=0;
        List<Categorie> listes = new ArrayList<Categorie>();
        ICategorieDAO cat_Dao = CategorieDAO.getInstance();
        listes = cat_Dao.findAll();
        for (Categorie d : listes) {
          if(categ.equals(d.getNom()))
              x=d.getId(); 
        }
       ICategorieDAO cat=new CategorieDAO();
        Categorie cattt=new Categorie();
        cattt=cat.findBYId(x);  
        float bud=Float.parseFloat(budget);
        Proposition prop=new Proposition(z, titres, desc, dure_est, dure_deb, dure_fins, bud, cattt, compet);
        IProposition propos =new PropositionDAO();
        propos.delete(prop);
        table_propos.setModel(new ListProposition());
    }//GEN-LAST:event_suprime_proposActionPerformed

    private void modif_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modif_buttonActionPerformed
         String titres="";
        String desc="";
        String dure_est="";
        String dure_deb="";
        String dure_fins="";
        String budget="";
        String categ="";
        String compet="";
        int z=Integer.parseInt(jTextField9.getText());
        titres=jTextField1.getText();
        desc=jTextField2.getText();
        dure_est=jTextField3.getText();
        dure_deb=jTextField4.getText();
        dure_fins=jTextField5.getText();
        
        budget=jTextField6.getText();
        compet=jTextField7.getText();
        categ=jTextField8.getText();
        
        int x=0;
        List<Categorie> listes = new ArrayList<Categorie>();
        ICategorieDAO cat_Dao = CategorieDAO.getInstance();
        listes = cat_Dao.findAll();
        for (Categorie d : listes) {
          if(categ.equals(d.getNom()))
              x=d.getId(); 
        }
       ICategorieDAO cat=new CategorieDAO();
        Categorie cattt=new Categorie();
        cattt=cat.findBYId(x);  
        float bud=Float.parseFloat(budget);
        Proposition prop=new Proposition(z, titres, desc, dure_est, dure_deb, dure_fins, bud, cattt, compet);
        IProposition propos =new PropositionDAO();
        propos.update(prop);
        table_propos.setModel(new ListProposition());
    }//GEN-LAST:event_modif_buttonActionPerformed

    private void tab33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab33MouseClicked
       int row = tab33.getSelectedRow();
        text1.setText(tab33.getModel().getValueAt(row, 0).toString());   
        text2.setText(tab33.getModel().getValueAt(row, 1).toString());
        text3.setText(tab33.getModel().getValueAt(row, 2).toString());   
    }//GEN-LAST:event_tab33MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(proprietaire_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(proprietaire_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(proprietaire_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(proprietaire_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new proprietaire_interface().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajouter_boutoon;
    private javax.swing.JTextField budgettt;
    private javax.swing.JComboBox combo1;
    private javax.swing.JTextField competencee;
    private com.toedter.calendar.JDateChooser date_fin;
    private javax.swing.JTextArea description;
    private com.toedter.calendar.JDateChooser dure_debut;
    private javax.swing.JTextField dure_estime;
    private javax.swing.JButton envoyer_boutton;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton modif_button;
    private javax.swing.JPanel panel_2_boutton;
    private javax.swing.JPanel panel_ajouter;
    private javax.swing.JPanel panel_general;
    private javax.swing.JPanel panel_modif;
    private javax.swing.JButton retour_boutton;
    private javax.swing.JButton retour_button_modif;
    private javax.swing.JButton supp_modif_boutton;
    private javax.swing.JButton suprime_propos;
    private javax.swing.JTable tab22;
    private javax.swing.JTable tab33;
    private javax.swing.JTable table_propos;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField text2;
    private javax.swing.JTextField text3;
    private javax.swing.JTextField titre;
    // End of variables declaration//GEN-END:variables
}
