/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jproycompi;

import java.awt.Image;
import javax.swing.ImageIcon;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

/**
 *
 * @author jorge
 */
public class Start extends javax.swing.JFrame {

    audio au = new audio();
    String cadena, melodia = "", CoroM = "G4q Bb4q C5q ", coro = "";

    /**
     * Creates new form Start
     */
    public Start() {
        initComponents();
        this.setTitle("Compilador");
        this.setLocationRelativeTo(null);

        lblCoro.setVisible(false);
        lblsave.setVisible(false);
        lblMelodia.setVisible(false);
        cargarimagen();

        txtCoro.setLineWrap(true);
        txtMelodia.setLineWrap(true);
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
        btnPlayCoro = new javax.swing.JButton();
        lblCoro = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCoro = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMelodia = new javax.swing.JTextArea();
        btnPlayMelodia = new javax.swing.JButton();
        lblMelodia = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        CBTipo = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblsave = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnPlayCoro.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btnPlayCoro.setText("Reproducir Coro");
        btnPlayCoro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayCoroActionPerformed(evt);
            }
        });

        lblCoro.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblCoro.setForeground(new java.awt.Color(255, 0, 0));
        lblCoro.setText("Advertencia: Hay un espacio de demás");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Titulo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MingLiU-ExtB", 1, 14))); // NOI18N

        txtTitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Coro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MingLiU-ExtB", 1, 14))); // NOI18N

        txtCoro.setColumns(20);
        txtCoro.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        txtCoro.setRows(5);
        jScrollPane1.setViewportView(txtCoro);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Melodia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MingLiU-ExtB", 1, 15))); // NOI18N

        txtMelodia.setColumns(20);
        txtMelodia.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        txtMelodia.setRows(5);
        jScrollPane2.setViewportView(txtMelodia);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnPlayMelodia.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btnPlayMelodia.setText("Reproducir Melodia");
        btnPlayMelodia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayMelodiaActionPerformed(evt);
            }
        });

        lblMelodia.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblMelodia.setForeground(new java.awt.Color(255, 0, 0));
        lblMelodia.setText("Error");

        jLabel3.setFont(new java.awt.Font("MingLiU-ExtB", 1, 14)); // NOI18N
        jLabel3.setText("Instrumentos: \n");

        jLabel4.setFont(new java.awt.Font("MingLiU-ExtB", 1, 14)); // NOI18N
        jLabel4.setText("-guitarra  -violin -piano");

        jLabel5.setFont(new java.awt.Font("MingLiU-ExtB", 1, 14)); // NOI18N
        jLabel5.setText("-flauta -armonica -guitarra_electrica");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnPlayCoro, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCoro)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPlayMelodia, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMelodia))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(lblMelodia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPlayMelodia, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPlayCoro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCoro)
                        .addGap(61, 61, 61))))
        );

        jPanel3.setBackground(new java.awt.Color(51, 0, 0));

        jLabel1.setText("jLabel1");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Guardar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 0, 0))); // NOI18N

        CBTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CBTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "nots", "midi", "mid" }));

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSave.setText("Guardar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Formato");

        lblsave.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblsave.setForeground(new java.awt.Color(0, 0, 255));
        lblsave.setText("Archivo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblsave))
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(CBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBTipo)
                    .addComponent(jLabel2))
                .addGap(51, 51, 51)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblsave)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        jMenu1.setText("Archivo");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlayCoroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayCoroActionPerformed
        // validar CORO
        if (validarInstrumentsCoro(txtCoro)) {
            lblCoro.setVisible(false);
            //validar si esta escrito bien las notas que tocaran los instrumentos
            if (validarNotasCoro(txtCoro)) {
                lblCoro.setVisible(false);
                getCoro(txtCoro);
                System.out.println("*********************************");
                Reproducir(coro);

            } else {
                lblCoro.setText("Error: notas mal escritas");
                lblCoro.setVisible(true);
            }
        } else {
            lblCoro.setText("Error: instrumentos mal escritos");
            lblCoro.setVisible(true);
        }
    }//GEN-LAST:event_btnPlayCoroActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if (validarInstrumentsCoro(txtCoro) && validarNotasCoro(txtCoro) && validarInstruments(txtMelodia) && validarNotasInd(txtMelodia)) {
            lblsave.setVisible(false);
            if (txtTitulo.getText().length() > 0) {
                lblsave.setVisible(false);
                getCoro(txtCoro);
                getMelodia(txtMelodia);
                
                String formato = (String) CBTipo.getSelectedItem(), ruta = "";
                File saveFile = new File(txtTitulo.getText().trim()+"." + formato);
                JFileChooser chooser = new JFileChooser();
                chooser.setSelectedFile(saveFile);
                int rFormato = chooser.showSaveDialog(this);
                if (rFormato == JFileChooser.APPROVE_OPTION) {
                    ruta = chooser.getSelectedFile() + "";

                    switch (formato) {
                        case "nots":
                            au.guardar(1, ruta, melodia, txtCoro.getText());
                            break;
                        case "mid":
                            au.guardar(2, ruta, melodia, txtCoro.getText());
                            break;
                        case "midi":
                            au.guardar(3, ruta, melodia, txtCoro.getText());
                            break;
                    }
                    lblsave.setText("Archivo " + formato + " guardado!!!");
                    lblsave.setVisible(true);
                }
            } else {
                lblsave.setText("Ingrese un titulo !!!");
                lblsave.setVisible(true);
            }
        } else {
            lblsave.setText("Verifique la Melodia !!!");
            lblsave.setVisible(true);
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnPlayMelodiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayMelodiaActionPerformed

        //validar si estan escritos bien los instrumentos        
        if (validarInstrumentsCoro(txtCoro) && validarNotasCoro(txtCoro)) {
            lblMelodia.setVisible(false);
            if (validarInstruments(txtMelodia)) {
                lblMelodia.setVisible(false);
                //validar si esta escrito bien las notas que tocaran los instrumentos
                if (validarNotasInd(txtMelodia)) {
                    lblMelodia.setVisible(false);
                    getMelodia(txtMelodia);
                    Reproducir(melodia);
                } else {
                    lblMelodia.setText("Error: notas mal escritas");
                    lblMelodia.setVisible(true);
                }
            } else {
                lblMelodia.setText("Error: instrumentos o coro mal escritos");
                lblMelodia.setVisible(true);
            }
        } else {
            lblMelodia.setText("Error: verificar coro");
            lblMelodia.setVisible(true);
        }
    }//GEN-LAST:event_btnPlayMelodiaActionPerformed

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
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBTipo;
    private javax.swing.JButton btnPlayCoro;
    private javax.swing.JButton btnPlayMelodia;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCoro;
    private javax.swing.JLabel lblMelodia;
    private javax.swing.JLabel lblsave;
    private javax.swing.JTextArea txtCoro;
    private javax.swing.JTextArea txtMelodia;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables

    private void cargarimagen() {

        ImageIcon icon = new ImageIcon(System.getProperty("user.dir") + "\\Imagenes\\imagen.png");
        icon = new ImageIcon(icon.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
        jLabel1.setIcon(icon);

    }

    private void Reproducir(String notas) {
        Player player = new Player();
        Pattern pattern = new Pattern(notas);
        player.play(pattern);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////            VALIDAR CORO
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private boolean validarInstrumentsCoro(JTextArea txtNota) {
        boolean sen = true;
        if (txtNota.getText().length() > 0) {
            String texto = txtNota.getText().replace("\\n", "");
            System.out.println("---------------------------------------");
            System.out.println("---------------------------------------");

            String[] p = texto.split(":|;");
            for (int i = 0; i < p.length; i++) {
                if (i % 2 == 0) {
                    if ("-".equals(au.ConversionWords(p[i] + ":")) || "coro".equals(au.ConversionWords(p[i] + ":"))) {
                        System.out.println("ERROR Coro");
                        sen = false;
                        break;
                    }
                }
            }
        } else {
            sen = false;
        }
        return sen;
    }

    //validar notas de cada instrumento
    private boolean validarNotasCoro(JTextArea txtNota) {
        String[] notas;
        boolean sen = true;
        String texto = txtNota.getText().replace("\\n", "");
        System.out.println("******************************************");
        //C D E F G A B C C C
        String[] p = texto.split(":|;");
        for (int i = 0; i < p.length; i++) {
            if (i % 2 != 0 && !p[i - 1].equals(" coro") && !p[i - 1].equals("\ncoro")) {
                //validando notas mientras no sea el o instrumento
                notas = p[i].split(" ");
                for (int j = 1; j < notas.length; j++) {
                    if ("-".equals(au.ConversionNotas(notas[j] + " "))) {
                        System.out.println("ERROR Notas");
                        sen = false;
                        break;
                    }
                }
                if (!sen) {
                    break;
                }
            }
        }
        return sen;
    }

    /// Escribir la nota musical a producir
    private void getCoro(JTextArea txtNota) {
        coro = "";
        String[] notas;
        String texto = txtNota.getText().replace("\\n", "");
        System.out.println("******************************************");
        //C D E F G A B C C C
        String[] p = texto.split(":|;");
        for (int i = 0; i < p.length; i++) {
            if (i % 2 != 0 && !p[i - 1].equals(" coro") && !p[i - 1].equals("\ncoro")) {
                //las notas
                System.out.println(i + " NOTAS-> " + p[i]);
                notas = p[i].split(" ");
                for (int j = 1; j < notas.length; j++) {
                    coro += au.ConversionNotas(notas[j] + " ") + " ";
                }
                //melodia = au.ConversionWords(p[i] + ":");
            } else if (i % 2 == 0) {
                //los instrumentos y CoroM
                coro += au.ConversionWords(p[i] + ":").equals("coro") ? "" : au.ConversionWords(p[i] + ":") + " ";
                System.out.println(i + " Tools -> " + p[i]);
            }
        }
        System.out.println("--------------------->CORO------\n" + coro);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////            VALIDAR MELODIA
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //funcion para validar los instrumentos/coro que se van a usar en la melodia
    private boolean validarInstruments(JTextArea txtNota) {
        boolean sen = true;
        if (txtNota.getText().length() > 0) {
            String texto = txtNota.getText().replace("\\n", "");
            System.out.println("---------------------------------------");
            /*System.out.println("texto ori: " + txtNota.getText());
        System.out.println("texto cambi: " + texto);*/
            System.out.println("---------------------------------------");

            String[] p = texto.split(":|;");
            for (int i = 0; i < p.length; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " - ª" + p[i] + "ª -> " + au.ConversionWords(p[i] + ":"));
                    if ("-".equals(au.ConversionWords(p[i] + ":"))) {
                        System.out.println("ERROR Instrumento");
                        sen = false;
                        break;
                    }
                }
            }
        } else {
            sen = false;
        }
        return sen;
    }

    //validar notas de cada instrumento
    private boolean validarNotasInd(JTextArea txtNota) {
        String[] notas;
        boolean sen = true;
        String texto = txtNota.getText().replace("\\n", "");
        System.out.println("******************************************");
        //C D E F G A B C C C
        String[] p = texto.split(":|;");
        for (int i = 0; i < p.length; i++) {
            if (i % 2 != 0 && !p[i - 1].equals(" coro") && !p[i - 1].equals("\ncoro")) {
                //validando notas mientras no sea el CoroM o instrumento
                System.out.println(i + " NOTAS-> " + p[i]);
                notas = p[i].split(" ");
                for (int j = 1; j < notas.length; j++) {
                    if ("-".equals(au.ConversionNotas(notas[j] + " "))) {
                        System.out.println("ERROR Notas");
                        sen = false;
                        break;
                    }
                    //                 System.out.println(notas[j] + "<->" + au.ConversionNotas(notas[j]+" "));
                }
                if (!sen) {
                    break;
                }
            }
        }
        return sen;
    }

    /// Escribir la nota musical a producir
    private void getMelodia(JTextArea txtNota) {
        melodia = "";
        String[] notas;
        String texto = txtNota.getText().replace("\\n", "");
        System.out.println("******************************************");
        //C D E F G A B C C C
        String[] p = texto.split(":|;");
        for (int i = 0; i < p.length; i++) {
            if (i % 2 != 0 && !p[i - 1].equals(" coro") && !p[i - 1].equals("\ncoro")) {
                //las notas
                System.out.println(i + " NOTAS-> " + p[i]);
                notas = p[i].split(" ");
                for (int j = 1; j < notas.length; j++) {
                    melodia += au.ConversionNotas(notas[j] + " ") + " ";
                }
                //melodia = au.ConversionWords(p[i] + ":");
            } else if (i % 2 == 0) {
                //los instrumentos y CoroM
                melodia += au.ConversionWords(p[i] + ":").equals("coro") ? coro + "" : au.ConversionWords(p[i] + ":") + " ";
                System.out.println(i + " Tools -> " + p[i]);
            }
        }
        System.out.println("--------------------->MELODIA------\n" + melodia);
    }

}
