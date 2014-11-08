/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testtttttttttttt22;

import edu.esprit.dao.classes.CategorieDAO;
import edu.esprit.dao.classes.PropositionDAO;
import edu.esprit.dao.classes.freelancerdao;
import edu.esprit.dao.classes.messagedao;
import edu.esprit.dao.interfaces.ICategorieDAO;
import edu.esprit.dao.interfaces.IFreelancer;
import edu.esprit.dao.interfaces.IProposition;
import edu.esprit.dao.interfaces.Imessage;
import edu.esprit.entities.Categorie;
import edu.esprit.entities.Proposition;
import edu.esprit.entities.freelancer;
import edu.esprit.entities.message;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author zied
 */
public class freelancer_gestion extends javax.swing.JFrame {

    /**
     * Creates new form freelancertaches
     */
    public freelancer_gestion() throws SQLException {
        initComponents();
        getnom();
        getcategories();
    }

    public void getnom() throws SQLException{
        List<freelancer> Liste= new ArrayList<freelancer>();
         IFreelancer cat_Dao = freelancerdao.getInstance();
        Liste = cat_Dao.findAll();
        for (freelancer d : Liste) {
          
        combo1.addItem(d.getNom());
        }
    }
    public void getcategories() {
        List<Categorie> listes = new ArrayList<Categorie>();
        ICategorieDAO cat_Dao = CategorieDAO.getInstance();
        listes = cat_Dao.findAll();
        for (Categorie d : listes) {
          
        combo.addItem(d.getNom());
        }
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        msg = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        combo1 = new javax.swing.JComboBox();
        jLabel33 = new javax.swing.JLabel();
        emmeteur_id = new javax.swing.JTextField();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        choix1 = new javax.swing.JCheckBox();
        choix2 = new javax.swing.JCheckBox();
        choix3 = new javax.swing.JCheckBox();
        test4 = new javax.swing.JCheckBox();
        test5 = new javax.swing.JCheckBox();
        test6 = new javax.swing.JCheckBox();
        passer = new javax.swing.JButton();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        general_panel = new javax.swing.JPanel();
        free_gestion = new javax.swing.JPanel();
        retour_button = new javax.swing.JButton();
        prenom_text = new javax.swing.JTextField();
        nom_text = new javax.swing.JTextField();
        email_text = new javax.swing.JTextField();
        pays_text = new javax.swing.JTextField();
        ville_text = new javax.swing.JTextField();
        login_text = new javax.swing.JTextField();
        pwd_text = new javax.swing.JTextField();
        statut_text = new javax.swing.JTextField();
        id_text = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panel_trois_boutton = new javax.swing.JPanel();
        free_button = new javax.swing.JButton();
        prop_button = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        panel_prop = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table3_1 = new javax.swing.JTable();
        supprime_prop = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        prop_verrou = new javax.swing.JPanel();
        dev_prop = new javax.swing.JButton();
        verr_prop = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        id_text_prop = new javax.swing.JTextField();
        prenom_text_prop = new javax.swing.JTextField();
        nom_text_prop = new javax.swing.JTextField();
        email_text_prop = new javax.swing.JTextField();
        pays_text_prop = new javax.swing.JTextField();
        ville_text_prop = new javax.swing.JTextField();
        login_text_prop = new javax.swing.JTextField();
        pwd_text_prop = new javax.swing.JTextField();
        entrp_text_prop = new javax.swing.JTextField();
        statut_text_prop = new javax.swing.JTextField();
        retour_prop_button = new javax.swing.JButton();
        jDesktopPane4 = new javax.swing.JDesktopPane();
        combo = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        tab1 = new javax.swing.JTable();
        demande = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jDesktopPane5 = new javax.swing.JDesktopPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        statut = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        prenom = new javax.swing.JTextField();
        nom = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        pays = new javax.swing.JTextField();
        ville = new javax.swing.JTextField();
        login = new javax.swing.JTextField();
        pwd = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        nstatut = new javax.swing.JTextField();
        nid = new javax.swing.JTextField();
        nprenom = new javax.swing.JTextField();
        nnom = new javax.swing.JTextField();
        nemail = new javax.swing.JTextField();
        npays = new javax.swing.JTextField();
        nville = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        nmotdepasse = new javax.swing.JTextField();
        mstatut = new javax.swing.JButton();
        mid = new javax.swing.JButton();
        mprenom = new javax.swing.JButton();
        mnom = new javax.swing.JButton();
        memail = new javax.swing.JButton();
        mpays = new javax.swing.JButton();
        mville = new javax.swing.JButton();
        mlogin = new javax.swing.JButton();
        mmotdepasse = new javax.swing.JButton();
        jDesktopPane6 = new javax.swing.JDesktopPane();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel32 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(240, 240, 240));

        jLabel2.setText("Veuiller saisir votre message");
        jLabel2.setBounds(100, 60, 165, 16);
        jDesktopPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        msg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msgActionPerformed(evt);
            }
        });
        msg.setBounds(100, 90, 290, 130);
        jDesktopPane1.add(msg, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel24.setText("Sasir le nom du destinataire");
        jLabel24.setBounds(100, 290, 170, 16);
        jDesktopPane1.add(jLabel24, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setText("Envoyer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(100, 470, 77, 25);
        jDesktopPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo1ActionPerformed(evt);
            }
        });
        combo1.setBounds(320, 280, 120, 30);
        jDesktopPane1.add(combo1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel33.setText("Emetteur  Login :");
        jLabel33.setBounds(100, 360, 140, 16);
        jDesktopPane1.add(jLabel33, javax.swing.JLayeredPane.DEFAULT_LAYER);
        emmeteur_id.setBounds(320, 350, 120, 22);
        jDesktopPane1.add(emmeteur_id, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane2.addTab("envoyer messages", jDesktopPane1);

        jDesktopPane2.setBackground(new java.awt.Color(240, 240, 240));

        choix1.setText("MYSQL/Oracle tests");
        choix1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choix1ActionPerformed(evt);
            }
        });
        choix1.setBounds(190, 50, 141, 25);
        jDesktopPane2.add(choix1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        choix2.setText("Montage video tests");
        choix2.setBounds(190, 110, 143, 25);
        jDesktopPane2.add(choix2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        choix3.setText("Java/J22e tests");
        choix3.setBounds(190, 170, 115, 25);
        jDesktopPane2.add(choix3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        test4.setText("Sony vegas tests");
        test4.setBounds(190, 240, 125, 25);
        jDesktopPane2.add(test4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        test5.setText("Android tests");
        test5.setBounds(190, 300, 103, 25);
        jDesktopPane2.add(test5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        test6.setText("CSS/PHP5 tests");
        test6.setBounds(190, 360, 117, 25);
        jDesktopPane2.add(test6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        passer.setText("Passer");
        passer.setBounds(190, 440, 71, 25);
        jDesktopPane2.add(passer, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane2.addTab("passer tests", jDesktopPane2);

        jDesktopPane3.setBackground(new java.awt.Color(255, 255, 255));

        general_panel.setLayout(null);

        free_gestion.setLayout(null);

        retour_button.setText("Retour");
        retour_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retour_buttonActionPerformed(evt);
            }
        });
        free_gestion.add(retour_button);
        retour_button.setBounds(700, 450, 71, 25);
        free_gestion.add(prenom_text);
        prenom_text.setBounds(650, 30, 100, 22);
        free_gestion.add(nom_text);
        nom_text.setBounds(650, 70, 100, 22);
        free_gestion.add(email_text);
        email_text.setBounds(650, 110, 100, 22);
        free_gestion.add(pays_text);
        pays_text.setBounds(650, 160, 100, 22);
        free_gestion.add(ville_text);
        ville_text.setBounds(650, 200, 100, 22);
        free_gestion.add(login_text);
        login_text.setBounds(650, 240, 100, 22);
        free_gestion.add(pwd_text);
        pwd_text.setBounds(650, 280, 100, 22);
        free_gestion.add(statut_text);
        statut_text.setBounds(650, 320, 100, 22);
        free_gestion.add(id_text);
        id_text.setBounds(650, 0, 100, 22);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        free_gestion.add(jScrollPane1);
        jScrollPane1.setBounds(30, 30, 452, 402);

        general_panel.add(free_gestion);
        free_gestion.setBounds(0, 0, 780, 480);

        free_button.setText("Freelancer");
        free_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                free_buttonActionPerformed(evt);
            }
        });

        prop_button.setText("Propriétaire");
        prop_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prop_buttonActionPerformed(evt);
            }
        });

        jButton10.setText("Sous Administrateur");

        javax.swing.GroupLayout panel_trois_bouttonLayout = new javax.swing.GroupLayout(panel_trois_boutton);
        panel_trois_boutton.setLayout(panel_trois_bouttonLayout);
        panel_trois_bouttonLayout.setHorizontalGroup(
            panel_trois_bouttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_trois_bouttonLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(panel_trois_bouttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton10)
                    .addComponent(prop_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(free_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        panel_trois_bouttonLayout.setVerticalGroup(
            panel_trois_bouttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_trois_bouttonLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(free_button, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(prop_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        general_panel.add(panel_trois_boutton);
        panel_trois_boutton.setBounds(220, 120, 400, 270);

        panel_prop.setLayout(null);

        table3_1.setModel(new Listprop());
        table3_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table3_1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table3_1);

        panel_prop.add(jScrollPane2);
        jScrollPane2.setBounds(20, 68, 452, 120);

        supprime_prop.setText("Supprimer");
        supprime_prop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprime_propActionPerformed(evt);
            }
        });
        panel_prop.add(supprime_prop);
        supprime_prop.setBounds(20, 233, 93, 25);

        jLabel13.setText("Deverrouiller/Verouiller ?");
        panel_prop.add(jLabel13);
        jLabel13.setBounds(209, 233, 143, 16);

        jButton5.setText("Oui");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        panel_prop.add(jButton5);
        jButton5.setBounds(255, 276, 51, 25);

        prop_verrou.setLayout(null);

        dev_prop.setText("Deverrouiller");
        dev_prop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dev_propActionPerformed(evt);
            }
        });
        prop_verrou.add(dev_prop);
        dev_prop.setBounds(20, 30, 105, 25);

        verr_prop.setText("Verrouiller");
        verr_prop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verr_propActionPerformed(evt);
            }
        });
        prop_verrou.add(verr_prop);
        verr_prop.setBounds(20, 90, 105, 25);

        panel_prop.add(prop_verrou);
        prop_verrou.setBounds(210, 310, 150, 150);

        jLabel14.setText("Id :");
        panel_prop.add(jLabel14);
        jLabel14.setBounds(530, 30, 20, 16);

        jLabel15.setText("Prenom :");
        panel_prop.add(jLabel15);
        jLabel15.setBounds(530, 80, 53, 16);

        jLabel16.setText("Nom :");
        panel_prop.add(jLabel16);
        jLabel16.setBounds(530, 120, 35, 16);

        jLabel17.setText("Email :");
        panel_prop.add(jLabel17);
        jLabel17.setBounds(530, 180, 40, 16);

        jLabel18.setText("Pays :");
        panel_prop.add(jLabel18);
        jLabel18.setBounds(530, 230, 35, 16);

        jLabel19.setText("Ville :");
        panel_prop.add(jLabel19);
        jLabel19.setBounds(530, 280, 33, 16);

        jLabel20.setText("Login :");
        panel_prop.add(jLabel20);
        jLabel20.setBounds(530, 330, 39, 16);

        jLabel21.setText("Password :");
        panel_prop.add(jLabel21);
        jLabel21.setBounds(530, 380, 70, 16);

        jLabel22.setText("Nom Entreprise :");
        panel_prop.add(jLabel22);
        jLabel22.setBounds(520, 410, 100, 16);

        jLabel23.setText("Statut :");
        panel_prop.add(jLabel23);
        jLabel23.setBounds(530, 450, 43, 16);
        panel_prop.add(id_text_prop);
        id_text_prop.setBounds(630, 20, 120, 22);
        panel_prop.add(prenom_text_prop);
        prenom_text_prop.setBounds(630, 70, 120, 22);
        panel_prop.add(nom_text_prop);
        nom_text_prop.setBounds(630, 120, 120, 22);
        panel_prop.add(email_text_prop);
        email_text_prop.setBounds(630, 170, 120, 22);
        panel_prop.add(pays_text_prop);
        pays_text_prop.setBounds(630, 220, 120, 22);
        panel_prop.add(ville_text_prop);
        ville_text_prop.setBounds(630, 270, 120, 22);
        panel_prop.add(login_text_prop);
        login_text_prop.setBounds(630, 320, 120, 22);
        panel_prop.add(pwd_text_prop);
        pwd_text_prop.setBounds(630, 370, 120, 22);
        panel_prop.add(entrp_text_prop);
        entrp_text_prop.setBounds(630, 410, 120, 22);
        panel_prop.add(statut_text_prop);
        statut_text_prop.setBounds(630, 440, 120, 22);

        retour_prop_button.setText("Retour");
        retour_prop_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retour_prop_buttonActionPerformed(evt);
            }
        });
        panel_prop.add(retour_prop_button);
        retour_prop_button.setBounds(10, 450, 71, 25);

        general_panel.add(panel_prop);
        panel_prop.setBounds(0, 0, 780, 480);

        general_panel.setBounds(0, 0, 780, 480);
        jDesktopPane3.add(general_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane2.addTab("evaluer projets", jDesktopPane3);

        jDesktopPane4.setBackground(new java.awt.Color(240, 240, 240));

        combo.setBounds(10, 50, 120, 22);
        jDesktopPane4.add(combo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        tab1.setModel(new ListProposition());
        jScrollPane3.setViewportView(tab1);

        jScrollPane3.setBounds(140, 10, 490, 260);
        jDesktopPane4.add(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        demande.setText("Envoyer Demande");
        demande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demandeActionPerformed(evt);
            }
        });
        demande.setBounds(410, 330, 140, 25);
        jDesktopPane4.add(demande, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton4.setText("Chercher");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.setBounds(200, 330, 120, 25);
        jDesktopPane4.add(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setText("choisir categorie");
        jLabel3.setBounds(30, 20, 120, 16);
        jDesktopPane4.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane2.addTab("rechercher travail", jDesktopPane4);

        jDesktopPane5.setBackground(new java.awt.Color(240, 240, 240));

        jLabel5.setText("id:");
        jLabel5.setBounds(50, 60, 60, 16);
        jDesktopPane5.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setText("prenom:");
        jLabel1.setBounds(50, 100, 60, 16);
        jDesktopPane5.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setText("nom:");
        jLabel4.setBounds(50, 140, 30, 16);
        jDesktopPane5.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setText("email:");
        jLabel6.setBounds(50, 190, 36, 16);
        jDesktopPane5.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setText("pays:");
        jLabel7.setBounds(50, 230, 31, 16);
        jDesktopPane5.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setText("ville:");
        jLabel8.setBounds(50, 280, 27, 16);
        jDesktopPane5.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel9.setText("login:");
        jLabel9.setBounds(50, 330, 32, 16);
        jDesktopPane5.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel10.setText("mot de de passe:");
        jLabel10.setBounds(50, 380, 90, 16);
        jDesktopPane5.add(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel11.setText("Statut:");
        jLabel11.setBounds(50, 420, 39, 16);
        jDesktopPane5.add(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        statut.setBounds(220, 420, 100, 22);
        jDesktopPane5.add(statut, javax.swing.JLayeredPane.DEFAULT_LAYER);
        id.setBounds(220, 60, 100, 22);
        jDesktopPane5.add(id, javax.swing.JLayeredPane.DEFAULT_LAYER);
        prenom.setBounds(220, 100, 100, 22);
        jDesktopPane5.add(prenom, javax.swing.JLayeredPane.DEFAULT_LAYER);
        nom.setBounds(220, 140, 100, 22);
        jDesktopPane5.add(nom, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mail.setBounds(220, 190, 100, 22);
        jDesktopPane5.add(mail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pays.setBounds(220, 230, 100, 22);
        jDesktopPane5.add(pays, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ville.setBounds(220, 280, 100, 22);
        jDesktopPane5.add(ville, javax.swing.JLayeredPane.DEFAULT_LAYER);
        login.setBounds(220, 320, 100, 22);
        jDesktopPane5.add(login, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pwd.setBounds(220, 380, 100, 22);
        jDesktopPane5.add(pwd, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setText("Afficher");
        jButton2.setBounds(120, 490, 90, 40);
        jDesktopPane5.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        nstatut.setText("nouveau statut..");
        nstatut.setBounds(380, 420, 100, 22);
        jDesktopPane5.add(nstatut, javax.swing.JLayeredPane.DEFAULT_LAYER);

        nid.setText("nouveau id..");
        nid.setBounds(380, 60, 100, 22);
        jDesktopPane5.add(nid, javax.swing.JLayeredPane.DEFAULT_LAYER);

        nprenom.setText("nouveau prenom..");
        nprenom.setBounds(380, 100, 100, 22);
        jDesktopPane5.add(nprenom, javax.swing.JLayeredPane.DEFAULT_LAYER);

        nnom.setText("nouveau nom..");
        nnom.setBounds(380, 140, 100, 22);
        jDesktopPane5.add(nnom, javax.swing.JLayeredPane.DEFAULT_LAYER);

        nemail.setText("nouveau email..");
        nemail.setBounds(380, 190, 100, 22);
        jDesktopPane5.add(nemail, javax.swing.JLayeredPane.DEFAULT_LAYER);

        npays.setText("nouveau pays..");
        npays.setBounds(380, 230, 100, 22);
        jDesktopPane5.add(npays, javax.swing.JLayeredPane.DEFAULT_LAYER);

        nville.setText("nouveau ville..");
        nville.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nvilleActionPerformed(evt);
            }
        });
        nville.setBounds(380, 280, 100, 22);
        jDesktopPane5.add(nville, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField8.setText("nouveau login..");
        jTextField8.setBounds(380, 320, 100, 22);
        jDesktopPane5.add(jTextField8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        nmotdepasse.setText("nouveau mot de pasee..");
        nmotdepasse.setBounds(380, 380, 100, 22);
        jDesktopPane5.add(nmotdepasse, javax.swing.JLayeredPane.DEFAULT_LAYER);

        mstatut.setText("modifier");
        mstatut.setBounds(510, 420, 73, 25);
        jDesktopPane5.add(mstatut, javax.swing.JLayeredPane.DEFAULT_LAYER);

        mid.setText("modifier");
        mid.setBounds(510, 60, 79, 25);
        jDesktopPane5.add(mid, javax.swing.JLayeredPane.DEFAULT_LAYER);

        mprenom.setText("modifier");
        mprenom.setBounds(510, 100, 73, 25);
        jDesktopPane5.add(mprenom, javax.swing.JLayeredPane.DEFAULT_LAYER);

        mnom.setText("modifier");
        mnom.setBounds(510, 140, 73, 20);
        jDesktopPane5.add(mnom, javax.swing.JLayeredPane.DEFAULT_LAYER);

        memail.setText("modifier");
        memail.setBounds(510, 190, 73, 25);
        jDesktopPane5.add(memail, javax.swing.JLayeredPane.DEFAULT_LAYER);

        mpays.setText("modifier");
        mpays.setBounds(510, 230, 73, 25);
        jDesktopPane5.add(mpays, javax.swing.JLayeredPane.DEFAULT_LAYER);

        mville.setText("modifier");
        mville.setBounds(510, 280, 73, 25);
        jDesktopPane5.add(mville, javax.swing.JLayeredPane.DEFAULT_LAYER);

        mlogin.setText("modifier");
        mlogin.setBounds(510, 320, 73, 25);
        jDesktopPane5.add(mlogin, javax.swing.JLayeredPane.DEFAULT_LAYER);

        mmotdepasse.setText("modifier");
        mmotdepasse.setBounds(510, 380, 73, 25);
        jDesktopPane5.add(mmotdepasse, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane2.addTab("gerer compte", jDesktopPane5);

        jDesktopPane6.setBackground(new java.awt.Color(240, 240, 240));

        jLabel26.setText("Identified");
        jLabel26.setBounds(30, 50, 53, 16);
        jDesktopPane6.add(jLabel26, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel27.setText("Mot de passe");
        jLabel27.setBounds(30, 80, 90, 16);
        jDesktopPane6.add(jLabel27, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel28.setText("Numero carte bancaire");
        jLabel28.setBounds(30, 120, 140, 16);
        jDesktopPane6.add(jLabel28, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel29.setText("N' travail");
        jLabel29.setBounds(30, 160, 50, 16);
        jDesktopPane6.add(jLabel29, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel30.setText("Titre de projet");
        jLabel30.setBounds(30, 200, 83, 16);
        jDesktopPane6.add(jLabel30, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel31.setText("Travail");
        jLabel31.setBounds(30, 230, 39, 16);
        jDesktopPane6.add(jLabel31, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTextField1.setBounds(250, 40, 140, 22);
        jDesktopPane6.add(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTextField3.setBounds(250, 120, 140, 22);
        jDesktopPane6.add(jTextField3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTextField4.setBounds(250, 160, 140, 22);
        jDesktopPane6.add(jTextField4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.setBounds(250, 190, 140, 22);
        jDesktopPane6.add(jTextField5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTextField6.setBounds(250, 230, 140, 22);
        jDesktopPane6.add(jTextField6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton6.setText("Parcourir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jButton6.setBounds(430, 220, 85, 25);
        jDesktopPane6.add(jButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton7.setText("valider");
        jButton7.setBounds(240, 300, 71, 25);
        jDesktopPane6.add(jButton7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton8.setText("Quitter");
        jButton8.setBounds(460, 300, 73, 25);
        jDesktopPane6.add(jButton8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setBounds(250, 80, 140, 22);
        jDesktopPane6.add(jPasswordField1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel32.setText("Carte");
        jLabel32.setBounds(290, 10, 40, 16);
        jDesktopPane6.add(jLabel32, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane2.addTab("Sousmettre", jDesktopPane6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void retour_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retour_buttonActionPerformed
       
    }//GEN-LAST:event_retour_buttonActionPerformed

    private void free_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_free_buttonActionPerformed
       
    }//GEN-LAST:event_free_buttonActionPerformed

    private void prop_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prop_buttonActionPerformed
     
       
    }//GEN-LAST:event_prop_buttonActionPerformed

    private void table3_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table3_1MouseClicked
        
    }//GEN-LAST:event_table3_1MouseClicked

    private void supprime_propActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprime_propActionPerformed

    
    }//GEN-LAST:event_supprime_propActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void dev_propActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dev_propActionPerformed
        
    }//GEN-LAST:event_dev_propActionPerformed

    private void verr_propActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verr_propActionPerformed

        
    }//GEN-LAST:event_verr_propActionPerformed

    private void retour_prop_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retour_prop_buttonActionPerformed
        
    }//GEN-LAST:event_retour_prop_buttonActionPerformed

    private void choix1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choix1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_choix1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Imessage m=new messagedao();
        String msgr=msg.getText();
        String nomr=String.valueOf(combo1.getSelectedItem());
        int em=Integer.parseInt(emmeteur_id.getText());
        int x=0;
        message f=new message(x,msgr,em);
        m.Createmessage(f);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nvilleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nvilleActionPerformed
    }//GEN-LAST:event_nvilleActionPerformed

    private void combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo1ActionPerformed

    private void msgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_msgActionPerformed

    private void demandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demandeActionPerformed
        String ch1;
        String ch2;
        String ch3;
        
    }//GEN-LAST:event_demandeActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       String ch=combo.getSelectedItem().toString();
       int x=0;
        List<Categorie> listes = new ArrayList<Categorie>();
        ICategorieDAO cat_Dao = CategorieDAO.getInstance();
        listes = cat_Dao.findAll();
        for (Categorie d : listes) {
          if(ch.equals(d.getNom()))
              x=d.getId(); 
        }
        
        Proposition prop=new Proposition();
        IProposition p=new PropositionDAO();
        List<Proposition> listtt = new ArrayList<Proposition>();
        listtt=p.findById_cat(x);
        JOptionPane.showMessageDialog(null, listtt.size());
       tab1.setModel(new Listpropositions_recherche(listtt));
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(freelancer_gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(freelancer_gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(freelancer_gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(freelancer_gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new freelancer_gestion().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(freelancer_gestion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox choix1;
    private javax.swing.JCheckBox choix2;
    private javax.swing.JCheckBox choix3;
    private javax.swing.JComboBox combo;
    private javax.swing.JComboBox combo1;
    private javax.swing.JButton demande;
    private javax.swing.JButton dev_prop;
    private javax.swing.JTextField email_text;
    private javax.swing.JTextField email_text_prop;
    private javax.swing.JTextField emmeteur_id;
    private javax.swing.JTextField entrp_text_prop;
    private javax.swing.JButton free_button;
    private javax.swing.JPanel free_gestion;
    private javax.swing.JPanel general_panel;
    private javax.swing.JTextField id;
    private javax.swing.JTextField id_text;
    private javax.swing.JTextField id_text_prop;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JDesktopPane jDesktopPane4;
    private javax.swing.JDesktopPane jDesktopPane5;
    private javax.swing.JDesktopPane jDesktopPane6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField login;
    private javax.swing.JTextField login_text;
    private javax.swing.JTextField login_text_prop;
    private javax.swing.JTextField mail;
    private javax.swing.JButton memail;
    private javax.swing.JButton mid;
    private javax.swing.JButton mlogin;
    private javax.swing.JButton mmotdepasse;
    private javax.swing.JButton mnom;
    private javax.swing.JButton mpays;
    private javax.swing.JButton mprenom;
    private javax.swing.JTextField msg;
    private javax.swing.JButton mstatut;
    private javax.swing.JButton mville;
    private javax.swing.JTextField nemail;
    private javax.swing.JTextField nid;
    private javax.swing.JTextField nmotdepasse;
    private javax.swing.JTextField nnom;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField nom_text;
    private javax.swing.JTextField nom_text_prop;
    private javax.swing.JTextField npays;
    private javax.swing.JTextField nprenom;
    private javax.swing.JTextField nstatut;
    private javax.swing.JTextField nville;
    private javax.swing.JPanel panel_prop;
    private javax.swing.JPanel panel_trois_boutton;
    private javax.swing.JButton passer;
    private javax.swing.JTextField pays;
    private javax.swing.JTextField pays_text;
    private javax.swing.JTextField pays_text_prop;
    private javax.swing.JTextField prenom;
    private javax.swing.JTextField prenom_text;
    private javax.swing.JTextField prenom_text_prop;
    private javax.swing.JButton prop_button;
    private javax.swing.JPanel prop_verrou;
    private javax.swing.JTextField pwd;
    private javax.swing.JTextField pwd_text;
    private javax.swing.JTextField pwd_text_prop;
    private javax.swing.JButton retour_button;
    private javax.swing.JButton retour_prop_button;
    private javax.swing.JTextField statut;
    private javax.swing.JTextField statut_text;
    private javax.swing.JTextField statut_text_prop;
    private javax.swing.JButton supprime_prop;
    private javax.swing.JTable tab1;
    private javax.swing.JTable table3_1;
    private javax.swing.JCheckBox test4;
    private javax.swing.JCheckBox test5;
    private javax.swing.JCheckBox test6;
    private javax.swing.JButton verr_prop;
    private javax.swing.JTextField ville;
    private javax.swing.JTextField ville_text;
    private javax.swing.JTextField ville_text_prop;
    // End of variables declaration//GEN-END:variables
}
