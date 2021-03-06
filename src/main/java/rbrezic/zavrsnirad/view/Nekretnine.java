/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbrezic.zavrsnirad.view;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.Imaging;
import rbrezic.zavrsnirad.controller.ObradaLokacija;
import rbrezic.zavrsnirad.controller.ObradaNekretnina;
import rbrezic.zavrsnirad.controller.ObradaVlasnik;
import rbrezic.zavrsnirad.controller.ObradaVrsta;
import rbrezic.zavrsnirad.model.Lokacija;
import rbrezic.zavrsnirad.model.Nekretnina;
import rbrezic.zavrsnirad.model.Vlasnik;
import rbrezic.zavrsnirad.model.Vrsta;
import rbrezic.zavrsnirad.utility.AgencijaException;

/**
 *
 * @author Korisnik
 */
public class Nekretnine extends javax.swing.JFrame {

    private ObradaNekretnina obrada;
    private Nekretnina entitet;

    /**
     * Creates new form Smjerovi
     */
    public Nekretnine() {
        initComponents();

        obrada = new ObradaNekretnina();
        btnTrazi.setText("\uD83D\uDD0E");
        setTitle("Nekretnine");
        ucitajPodatke();

        DefaultComboBoxModel<Lokacija> ms = new DefaultComboBoxModel<>();
        new ObradaLokacija().getPodaci().forEach(s -> {
            ms.addElement(s);
        });
        cmbLokacija.setModel(ms);

        DefaultComboBoxModel<Vrsta> ma = new DefaultComboBoxModel<>();
        new ObradaVrsta().getPodaci().forEach(a -> {
            ma.addElement(a);
        });
        cmbVrsta.setModel(ma);

        DefaultComboBoxModel<Vlasnik> mp = new DefaultComboBoxModel<>();
        new ObradaVlasnik().getPodaci().forEach(p -> {
            mp.addElement(p);
        });
        cmbVlasnik.setRenderer(new VlasnikCellRenderer());
        cmbVlasnik.setModel(mp);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNaziv = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtKvadratura = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCijena = new javax.swing.JTextField();
        chbLegaliziran = new javax.swing.JCheckBox();
        lblPoruka = new javax.swing.JLabel();
        lblOpis = new javax.swing.JLabel();
        lblm2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOpis = new javax.swing.JTextArea();
        lblHRK = new javax.swing.JLabel();
        lblSlika3 = new javax.swing.JLabel();
        lblSlika1 = new javax.swing.JLabel();
        lblLokacija = new javax.swing.JLabel();
        cmbLokacija = new javax.swing.JComboBox<>();
        cmbVlasnik = new javax.swing.JComboBox<>();
        lblVlasnik = new javax.swing.JLabel();
        lblSlika2 = new javax.swing.JLabel();
        cmbVrsta = new javax.swing.JComboBox<>();
        lblLokacija1 = new javax.swing.JLabel();
        btnDodaj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPodaci = new javax.swing.JList<>();
        btnExportJson = new javax.swing.JButton();
        btnTrazi = new javax.swing.JButton();
        txtUvjet = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Podaci"));

        jLabel1.setText("Naziv");

        jLabel2.setText("Kvadratura");

        jLabel3.setText("Cijena");

        chbLegaliziran.setText("Legalizacija");

        lblOpis.setText("Opis");

        lblm2.setText("m2");

        txtOpis.setColumns(20);
        txtOpis.setRows(5);
        jScrollPane1.setViewportView(txtOpis);

        lblHRK.setText("HRK");

        lblSlika3.setText("[Slika 3]");
        lblSlika3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSlika3MouseClicked(evt);
            }
        });

        lblSlika1.setText("[Slika 1]");
        lblSlika1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSlika1MouseClicked(evt);
            }
        });

        lblLokacija.setText("Lokacija");

        lblVlasnik.setText("Vlasnik");

        lblSlika2.setText("[Slika 2]");
        lblSlika2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSlika2MouseClicked(evt);
            }
        });

        lblLokacija1.setText("Vrsta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCijena, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblHRK, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtKvadratura, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(lblm2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(lblSlika1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbVlasnik, 0, 299, Short.MAX_VALUE)
                            .addComponent(lblPoruka, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                            .addComponent(cmbLokacija, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblOpis, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                            .addComponent(chbLegaliziran)
                            .addComponent(lblVlasnik)
                            .addComponent(lblLokacija)
                            .addComponent(lblLokacija1)
                            .addComponent(cmbVrsta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSlika3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSlika2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtKvadratura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblm2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCijena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHRK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblOpis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chbLegaliziran)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLokacija)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblSlika1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(lblSlika2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblSlika3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbLokacija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVlasnik)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbVlasnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLokacija1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbVrsta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(lblPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        lstPodaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPodaciValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstPodaci);

        btnExportJson.setText("ISPIS");
        btnExportJson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportJsonActionPerformed(evt);
            }
        });

        btnTrazi.setText("T");
        btnTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziActionPerformed(evt);
            }
        });

        txtUvjet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUvjetKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtUvjet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTrazi)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDodaj)
                        .addGap(18, 18, 18)
                        .addComponent(btnPromjeni)
                        .addGap(18, 18, 18)
                        .addComponent(btnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExportJson))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTrazi)
                            .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDodaj)
                        .addComponent(btnPromjeni)
                        .addComponent(btnObrisi))
                    .addComponent(btnExportJson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed

        lblPoruka.setText("");
        entitet = new Nekretnina();

        postaviVrijednostiUEntitet();

        try {
            obrada.create();
            ucitajPodatke();
            ocistiPolja();
        } catch (AgencijaException e) {
            postaviPoruku(e);
        }

    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
        entitet = lstPodaci.getSelectedValue();
        if (entitet == null) {
            return;
        }

        postaviVrijednostiUEntitet();
        try {
            obrada.update();
            ucitajPodatke();
            ocistiPolja();

        } catch (AgencijaException e) {
            postaviPoruku(e);
        }

    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        entitet = lstPodaci.getSelectedValue();
        if (entitet == null) {
            return;
        }

        obrada.setEntitet(entitet);

        try {
            obrada.delete();
            ucitajPodatke();
            ocistiPolja();
        } catch (AgencijaException e) {
            postaviPoruku(e);
        }
    }//GEN-LAST:event_btnObrisiActionPerformed
    private void postaviPoruku(AgencijaException e) {

        switch (e.getKomponenta()) {
            case "naziv":
                txtNaziv.setBorder(new LineBorder(Color.RED, 2, true));
                txtNaziv.requestFocus();
                break;
        }

        lblPoruka.setText(e.getPoruka());
        OcistiPoruku op = new OcistiPoruku();
        op.start();
    }

    private class OcistiPoruku extends Thread {

        @Override
        public void run() {
            try {
                Thread.sleep(3 * 1000);
            } catch (InterruptedException e) {
            }
            lblPoruka.setText("");
        }

    }

    private void lstPodaciValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPodaciValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }

        entitet = lstPodaci.getSelectedValue();
        if (entitet == null) {
            return;
        }
        DefaultComboBoxModel<Lokacija> ms = (DefaultComboBoxModel<Lokacija>) cmbLokacija.getModel();
        for (int i = 0; i < ms.getSize(); i++) {
            if (ms.getElementAt(i).getId().equals(entitet.getLokacija().getId())) {
                cmbLokacija.setSelectedIndex(i);
                break;
            }
        }
        DefaultComboBoxModel<Vrsta> ma = (DefaultComboBoxModel<Vrsta>) cmbVrsta.getModel();
        for (int i = 0; i < ms.getSize(); i++) {
            if (ma.getElementAt(i).getId().equals(entitet.getVrsta().getId())) {
                cmbVrsta.setSelectedIndex(i);
                break;
            }
        }

        DefaultComboBoxModel<Vlasnik> mp = (DefaultComboBoxModel<Vlasnik>) cmbVlasnik.getModel();
        for (int i = 0; i < mp.getSize(); i++) {
            if (mp.getElementAt(i).getId().equals(entitet.getVlasnik().getId())) {
                cmbVlasnik.setSelectedIndex(i);
                break;
            }
        }

        txtNaziv.setText(entitet.getNaziv());
        txtOpis.setText(entitet.getOpis());
        txtCijena.setText(entitet.getCijena().toString());
        txtKvadratura.setText(entitet.getKvadratura().toString());
        chbLegaliziran.setSelected(entitet.getLegalizacija());

        File slika = new File("slike" + File.separator + "nekretnine"
                + File.separator + entitet.getId() + "_1.png");
        if (!slika.exists()) {
            slika = new File("slike"
                    + File.separator + "nekretninaprazno.png");
        }
        try {
            ImageIcon ii = new ImageIcon(Imaging.getBufferedImage(slika)
                    .getScaledInstance(300, 150, Image.SCALE_DEFAULT));
            lblSlika1.setIcon(ii);
        } catch (Exception e) {
            e.printStackTrace();
        }
        slika = new File("slike" + File.separator + "nekretnine"
                + File.separator + entitet.getId() + "_2.png");
        if (!slika.exists()) {
            slika = new File("slike"
                    + File.separator + "nekretninaprazno.png");
        }
        try {
            ImageIcon ii = new ImageIcon(Imaging.getBufferedImage(slika)
                    .getScaledInstance(300, 150, Image.SCALE_DEFAULT));
            lblSlika2.setIcon(ii);
        } catch (Exception e) {
            e.printStackTrace();
        }
        slika = new File("slike" + File.separator + "nekretnine"
                + File.separator + entitet.getId() + "_3.png");
        if (!slika.exists()) {
            slika = new File("slike"
                    + File.separator + "nekretninaprazno.png");
        }
        try {
            ImageIcon ii = new ImageIcon(Imaging.getBufferedImage(slika)
                    .getScaledInstance(300, 150, Image.SCALE_DEFAULT));
            lblSlika3.setIcon(ii);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_lstPodaciValueChanged

    private void btnExportJsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportJsonActionPerformed
        ExclusionStrategy strategy = new ExclusionStrategy() {
            @Override
            public boolean shouldSkipField(FieldAttributes field) {
                if (field.getDeclaringClass() == Lokacija.class && field.getName().equals("nekretnine")) {
                    return true;
                }
                if (field.getDeclaringClass() == Vlasnik.class && field.getName().equals("nekretnine")) {
                    return true;
                }
                if (field.getDeclaringClass() == Vrsta.class && field.getName().equals("nekretnine")) {
                    return true;
                }
                return false;
            }

            @Override
            public boolean shouldSkipClass(Class<?> clazz) {
                return false;
            }
        };

        Gson gson = new GsonBuilder()
                .addSerializationExclusionStrategy(strategy)
                .setPrettyPrinting()
                .create();

        JFileChooser jfc = new JFileChooser();
        jfc.setCurrentDirectory(new File(System.getProperty("user.home")));
        jfc.setSelectedFile(new File(System.getProperty("user.home") + File.separator + "podaci.json"));

        if (jfc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {

            if (!jfc.getSelectedFile().exists()
                    || (jfc.getSelectedFile().exists()
                    && JOptionPane.showConfirmDialog(rootPane,
                            "Datoteka postoji, prepisati?",
                            "Datoteka postoji",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION)) {
                try {
                    BufferedWriter writer = new BufferedWriter(
                            new FileWriter(jfc.getSelectedFile(), StandardCharsets.UTF_8));
                    writer.write(gson.toJson(obrada.getPodaci()));
                    writer.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
    }//GEN-LAST:event_btnExportJsonActionPerformed
    
    private void btnTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziActionPerformed
        ucitajPodatke();
    }//GEN-LAST:event_btnTraziActionPerformed

    private void txtUvjetKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUvjetKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ucitajPodatke();
        }
    }//GEN-LAST:event_txtUvjetKeyReleased

    private void lblSlika1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSlika1MouseClicked
        if (entitet == null) {
            return;
        }
        JFileChooser jfc = new JFileChooser();
        if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                BufferedImage bi = Imaging.getBufferedImage(jfc.getSelectedFile());
                File slika = new File("slike" + File.separator
                        + "nekretnine" + File.separator + entitet.getId() + "_1.png");
                ImageFormats format = ImageFormats.PNG;
                Map<String, Object> param = new HashMap<>();
                Imaging.writeImage(bi, slika, format, param);

                ImageIcon ii = new ImageIcon(Imaging.getBufferedImage(slika)
                        .getScaledInstance(300, 150, Image.SCALE_DEFAULT));
                lblSlika1.setIcon(ii);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_lblSlika1MouseClicked

    private void lblSlika2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSlika2MouseClicked
        if (entitet == null) {
            return;
        }
        JFileChooser jfc = new JFileChooser();
        if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                BufferedImage bi = Imaging.getBufferedImage(jfc.getSelectedFile());
                File slika = new File("slike" + File.separator
                        + "nekretnine" + File.separator + entitet.getId() + "_2.png");
                ImageFormats format = ImageFormats.PNG;
                Map<String, Object> param = new HashMap<>();
                Imaging.writeImage(bi, slika, format, param);

                ImageIcon ii = new ImageIcon(Imaging.getBufferedImage(slika)
                        .getScaledInstance(300, 150, Image.SCALE_DEFAULT));
                lblSlika2.setIcon(ii);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_lblSlika2MouseClicked

    private void lblSlika3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSlika3MouseClicked
        if (entitet == null) {
            return;
        }
        JFileChooser jfc = new JFileChooser();
        if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                BufferedImage bi = Imaging.getBufferedImage(jfc.getSelectedFile());
                File slika = new File("slike" + File.separator
                        + "nekretnine" + File.separator + entitet.getId() + "_3.png");
                ImageFormats format = ImageFormats.PNG;
                Map<String, Object> param = new HashMap<>();
                Imaging.writeImage(bi, slika, format, param);

                ImageIcon ii = new ImageIcon(Imaging.getBufferedImage(slika)
                        .getScaledInstance(300, 150, Image.SCALE_DEFAULT));
                lblSlika3.setIcon(ii);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_lblSlika3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnExportJson;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JButton btnTrazi;
    private javax.swing.JCheckBox chbLegaliziran;
    private javax.swing.JComboBox<Lokacija> cmbLokacija;
    private javax.swing.JComboBox<Vlasnik> cmbVlasnik;
    private javax.swing.JComboBox<Vrsta> cmbVrsta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblHRK;
    private javax.swing.JLabel lblLokacija;
    private javax.swing.JLabel lblLokacija1;
    private javax.swing.JLabel lblOpis;
    private javax.swing.JLabel lblPoruka;
    private javax.swing.JLabel lblSlika1;
    private javax.swing.JLabel lblSlika2;
    private javax.swing.JLabel lblSlika3;
    private javax.swing.JLabel lblVlasnik;
    private javax.swing.JLabel lblm2;
    private javax.swing.JList<Nekretnina> lstPodaci;
    private javax.swing.JTextField txtCijena;
    private javax.swing.JTextField txtKvadratura;
    private javax.swing.JTextField txtNaziv;
    private javax.swing.JTextArea txtOpis;
    private javax.swing.JTextField txtUvjet;
    // End of variables declaration//GEN-END:variables

    private void ucitajPodatke() {
        DefaultListModel<Nekretnina> m = new DefaultListModel<>();
        obrada.getPodaci(txtUvjet.getText()).forEach(s -> m.addElement(s));
        lstPodaci.setModel(m);
    }

    private void ocistiPolja() {
        txtNaziv.setText("");
        txtKvadratura.setText("");
        txtOpis.setText("");
        txtCijena.setText("");
        chbLegaliziran.setSelected(false);
    }

    private void postaviVrijednostiUEntitet() {

        entitet.setLokacija((Lokacija) cmbLokacija.getSelectedItem());
        entitet.setVlasnik((Vlasnik) cmbVlasnik.getSelectedItem());
        entitet.setVrsta((Vrsta) cmbVrsta.getSelectedItem());

        try {
            entitet.setKvadratura(new BigDecimal(txtKvadratura.getText()));
        } catch (Exception e) {
            entitet.setKvadratura(BigDecimal.ZERO);
        }

        entitet.setNaziv(txtNaziv.getText());
        entitet.setOpis(txtOpis.getText());
        try {
            entitet.setCijena(new BigDecimal(txtCijena.getText()));
        } catch (Exception e) {
            entitet.setCijena(BigDecimal.ZERO);
        }

        entitet.setLegalizacija(chbLegaliziran.isSelected());
        obrada.setEntitet(entitet);
    }
}
