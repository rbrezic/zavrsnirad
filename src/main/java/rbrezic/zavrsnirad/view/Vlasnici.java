/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbrezic.zavrsnirad.view;


import java.awt.Component;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.Imaging;
import org.jfree.chart.encoders.ImageFormat;
import rbrezic.zavrsnirad.controller.ObradaVlasnik;
import rbrezic.zavrsnirad.model.Vlasnik;
import rbrezic.zavrsnirad.utility.AgencijaException;

/**
 *
 * @author Korisnik
 */
public class Vlasnici extends javax.swing.JFrame {

    private ObradaVlasnik obrada;
    private Vlasnik entitet;

    /**
     * Creates new form Predavaci
     */
    public Vlasnici() {
        initComponents();
        btnTrazi.setText("\uD83D\uDD0E");
        lstPodaci.setCellRenderer(new VlasnikCellRenderer());
        obrada = new ObradaVlasnik();     
        setTitle("Vlasnici");
        ucitajPodatke();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstPodaci = new javax.swing.JList<>();
        pnlPodaci = new javax.swing.JPanel();
        lblIme = new javax.swing.JLabel();
        txtIme = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPrezime = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtOib = new javax.swing.JTextField();
        lblPoruka = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtKontakt = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        lblSlika = new javax.swing.JLabel();
        btnDodaj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        txtUvjet = new javax.swing.JTextField();
        btnTrazi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstPodaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPodaciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPodaci);

        pnlPodaci.setBorder(javax.swing.BorderFactory.createTitledBorder("Podaci"));

        lblIme.setText("Ime");

        jLabel2.setText("Prezime");

        jLabel3.setText("OIB");

        jLabel4.setText("Spol");

        jLabel5.setText("Kontakt");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Muško", "Žensko" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        lblSlika.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSlikaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlPodaciLayout = new javax.swing.GroupLayout(pnlPodaci);
        pnlPodaci.setLayout(pnlPodaciLayout);
        pnlPodaciLayout.setHorizontalGroup(
            pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPodaciLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPodaciLayout.createSequentialGroup()
                        .addComponent(lblPoruka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(pnlPodaciLayout.createSequentialGroup()
                        .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblIme, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtIme, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                .addComponent(txtPrezime, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtOib, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel4)
                            .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, 154, Short.MAX_VALUE)
                                .addComponent(txtKontakt, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(lblSlika, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
        );
        pnlPodaciLayout.setVerticalGroup(
            pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPodaciLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSlika, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlPodaciLayout.createSequentialGroup()
                        .addComponent(lblIme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOib, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKontakt, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67)
                .addComponent(lblPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        txtUvjet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUvjetKeyReleased(evt);
            }
        });

        btnTrazi.setText("T");
        btnTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTrazi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDodaj)
                        .addGap(18, 18, 18)
                        .addComponent(btnPromjeni)
                        .addGap(18, 18, 18)
                        .addComponent(btnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlPodaci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPodaci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTrazi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodaj)
                    .addComponent(btnPromjeni)
                    .addComponent(btnObrisi))
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstPodaciValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPodaciValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }

        entitet = lstPodaci.getSelectedValue();
        if (entitet == null) {
            return;
        }


        txtIme.setText(entitet.getIme());
        txtPrezime.setText(entitet.getPrezime());
        txtOib.setText(entitet.getOib());
        txtKontakt.setText(entitet.getKontakt());
        
         File slika = new File("slike" + File.separator + "vlasnici" + 
                File.separator + entitet.getId() + ".png");
        if(!slika.exists()){
                 slika = new File("slike"  + 
                File.separator +  "nepoznato.png");
           
        }
        try {
            ImageIcon ii = new ImageIcon(Imaging.getBufferedImage(slika)
            .getScaledInstance(100, 150, Image.SCALE_DEFAULT));
            lblSlika.setIcon(ii);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_lstPodaciValueChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed

        lblPoruka.setText("");
        entitet = new Vlasnik();

        postaviVrijednostiUEntitet();

        try {
            obrada.create();
            ucitajPodatke();
            ocistiPolja();
        } catch (AgencijaException ex) {
            lblPoruka.setText(ex.getPoruka());
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
            lblPoruka.setText(e.getPoruka());
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
            lblPoruka.setText(e.getPoruka());
        }
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void txtUvjetKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUvjetKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            ucitajPodatke();
        }
    }//GEN-LAST:event_txtUvjetKeyReleased

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        System.out.println(jComboBox1.getSelectedItem());
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void lblSlikaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSlikaMouseClicked
        if(entitet==null){
           return;
       }
        JFileChooser jfc = new JFileChooser();
        if(jfc.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){
            try {
                BufferedImage bi= Imaging.getBufferedImage(jfc.getSelectedFile());
                File slika = new File("slike" + File.separator + 
                        "vlasnici" + File.separator + entitet.getId() + ".png");
                ImageFormats format = ImageFormats.PNG;
                Map<String, Object> param = new HashMap<>();
                Imaging.writeImage(bi, slika, format, param);
                
                ImageIcon ii = new ImageIcon(Imaging.getBufferedImage(slika)
            .getScaledInstance(100, 150, Image.SCALE_DEFAULT));
            lblSlika.setIcon(ii);
            
            } catch (Exception e) {
                e.printStackTrace();
            }   
        }
    }//GEN-LAST:event_lblSlikaMouseClicked

    private void btnTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziActionPerformed
        ucitajPodatke();
    }//GEN-LAST:event_btnTraziActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JButton btnTrazi;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIme;
    private javax.swing.JLabel lblPoruka;
    private javax.swing.JLabel lblSlika;
    private javax.swing.JList<Vlasnik> lstPodaci;
    private javax.swing.JPanel pnlPodaci;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtKontakt;
    private javax.swing.JTextField txtOib;
    private javax.swing.JTextField txtPrezime;
    private javax.swing.JTextField txtUvjet;
    // End of variables declaration//GEN-END:variables

    private void ucitajPodatke() {
        DefaultListModel<Vlasnik> m = new DefaultListModel<>();     
        obrada.getPodaci(txtUvjet.getText()).forEach(s -> m.addElement(s));
        lstPodaci.setModel(m);
    }
    private void ocistiPolja() {    
        for(Component c : pnlPodaci.getComponents()){
            if (c instanceof JTextField){
                ((JTextField) c).setText("");
            } 
        }
        lblPoruka.setText("");
    }
    private void postaviVrijednostiUEntitet() {
        entitet.setIme(txtIme.getText());
        entitet.setPrezime(txtPrezime.getText());
        entitet.setOib(txtOib.getText());
        entitet.setKontakt(txtKontakt.getText());
        obrada.setEntitet(entitet);
    }
}
