/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hobbyteca.vista;

import hobbyteca.controlador.ControladorVerManga;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

/**
 *
 * @author jesus
 */
public class VerManga extends javax.swing.JDialog {
    /**
     * Creates new form VerManga
     */
    
    private final ControladorVerManga controladorVerManga;
    public VerManga(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        controladorVerManga=new ControladorVerManga(this);
        controladorVerManga.rellenarDatos();

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupRecomendar = new javax.swing.ButtonGroup();
        buttonGroupValoracion = new javax.swing.ButtonGroup();
        buttonGroupValoracionPersonal = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelDirector = new javax.swing.JLabel();
        jLabelTextDirector = new javax.swing.JLabel();
        jLabelProductora = new javax.swing.JLabel();
        jLabelTextProductora = new javax.swing.JLabel();
        jLabelLanzamiento = new javax.swing.JLabel();
        jLabelTextLanzamiento = new javax.swing.JLabel();
        jLabelGenero = new javax.swing.JLabel();
        jLabelTextGenero = new javax.swing.JLabel();
        jLabelDescripcion = new javax.swing.JLabel();
        jScrollPaneDescripcion = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jLabelValoracionMedia = new javax.swing.JLabel();
        jLabelTextValoracionMedia = new javax.swing.JLabel();
        jLabelValoracionPersonal = new javax.swing.JLabel();
        jRadioButtonValor0 = new javax.swing.JRadioButton();
        jRadioButtonValor1 = new javax.swing.JRadioButton();
        jRadioButtonValor2 = new javax.swing.JRadioButton();
        jRadioButtonValor3 = new javax.swing.JRadioButton();
        jRadioButtonValor4 = new javax.swing.JRadioButton();
        jRadioButtonValor5 = new javax.swing.JRadioButton();
        jLabelRecomendar = new javax.swing.JLabel();
        jRadioButtonRecomendarSi = new javax.swing.JRadioButton();
        jRadioButtonRecomendarNo = new javax.swing.JRadioButton();
        jLabelCapitulosVistos = new javax.swing.JLabel();
        jComboBoxCapitulosVistos = new javax.swing.JComboBox();
        jLabelTextCapitulosTotales = new javax.swing.JLabel();
        jButtonAplicar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manga");

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("TITULO");

        jLabelDirector.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabelDirector.setText("Director:");

        jLabelTextDirector.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelTextDirector.setForeground(new java.awt.Color(0, 0, 255));
        jLabelTextDirector.setText("jLabel1");

        jLabelProductora.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabelProductora.setText("Productora:");

        jLabelTextProductora.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelTextProductora.setForeground(new java.awt.Color(0, 0, 255));
        jLabelTextProductora.setText("jLabel2");

        jLabelLanzamiento.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabelLanzamiento.setText("Lanzamiento:");

        jLabelTextLanzamiento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelTextLanzamiento.setForeground(new java.awt.Color(0, 0, 255));
        jLabelTextLanzamiento.setText("jLabel3");

        jLabelGenero.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabelGenero.setText("Género:");

        jLabelTextGenero.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelTextGenero.setForeground(new java.awt.Color(0, 0, 255));
        jLabelTextGenero.setText("jLabel4");

        jLabelDescripcion.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabelDescripcion.setText("Descripción:");

        jTextAreaDescripcion.setEditable(false);
        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        jTextAreaDescripcion.setForeground(new java.awt.Color(0, 0, 255));
        jTextAreaDescripcion.setLineWrap(true);
        jTextAreaDescripcion.setRows(5);
        jScrollPaneDescripcion.setViewportView(jTextAreaDescripcion);

        jLabelValoracionMedia.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabelValoracionMedia.setText("Valoración Media:");

        jLabelTextValoracionMedia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelTextValoracionMedia.setForeground(new java.awt.Color(0, 102, 0));
        jLabelTextValoracionMedia.setText("0/5");

        jLabelValoracionPersonal.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabelValoracionPersonal.setText("Valoración Personal:");

        buttonGroupValoracion.add(jRadioButtonValor0);
        jRadioButtonValor0.setText("0");

        buttonGroupValoracion.add(jRadioButtonValor1);
        jRadioButtonValor1.setText("1");

        buttonGroupValoracion.add(jRadioButtonValor2);
        jRadioButtonValor2.setText("2");

        buttonGroupValoracion.add(jRadioButtonValor3);
        jRadioButtonValor3.setText("3");

        buttonGroupValoracion.add(jRadioButtonValor4);
        jRadioButtonValor4.setText("4");

        buttonGroupValoracion.add(jRadioButtonValor5);
        jRadioButtonValor5.setText("5");

        jLabelRecomendar.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabelRecomendar.setText("Recomendar:");

        buttonGroupRecomendar.add(jRadioButtonRecomendarSi);
        jRadioButtonRecomendarSi.setText("Sí");

        buttonGroupRecomendar.add(jRadioButtonRecomendarNo);
        jRadioButtonRecomendarNo.setText("No");

        jLabelCapitulosVistos.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabelCapitulosVistos.setText("Capitulos Vistos:");

        jComboBoxCapitulosVistos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "?", "??", "????", "?????" }));

        jLabelTextCapitulosTotales.setText("/??");

        jButtonAplicar.setText("Aplicar");
        jButtonAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAplicarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonGroupValoracionPersonalLayout = new javax.swing.GroupLayout(buttonGroupValoracionPersonal);
        buttonGroupValoracionPersonal.setLayout(buttonGroupValoracionPersonalLayout);
        buttonGroupValoracionPersonalLayout.setHorizontalGroup(
            buttonGroupValoracionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonGroupValoracionPersonalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonGroupValoracionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonGroupValoracionPersonalLayout.createSequentialGroup()
                        .addGroup(buttonGroupValoracionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(buttonGroupValoracionPersonalLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(buttonGroupValoracionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDescripcion, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelGenero, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelLanzamiento, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelProductora, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelDirector, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jLabelValoracionPersonal, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelValoracionMedia, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelRecomendar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelCapitulosVistos, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(buttonGroupValoracionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(buttonGroupValoracionPersonalLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(buttonGroupValoracionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTextDirector)
                                    .addComponent(jLabelTextProductora)
                                    .addComponent(jLabelTextLanzamiento)
                                    .addComponent(jLabelTextGenero)))
                            .addGroup(buttonGroupValoracionPersonalLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabelTextValoracionMedia))
                            .addGroup(buttonGroupValoracionPersonalLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(buttonGroupValoracionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(buttonGroupValoracionPersonalLayout.createSequentialGroup()
                                        .addComponent(jRadioButtonRecomendarSi)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButtonRecomendarNo))
                                    .addComponent(jScrollPaneDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(buttonGroupValoracionPersonalLayout.createSequentialGroup()
                                        .addGroup(buttonGroupValoracionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, buttonGroupValoracionPersonalLayout.createSequentialGroup()
                                                .addComponent(jComboBoxCapitulosVistos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabelTextCapitulosTotales))
                                            .addGroup(buttonGroupValoracionPersonalLayout.createSequentialGroup()
                                                .addComponent(jRadioButtonValor0)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jRadioButtonValor1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jRadioButtonValor2)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButtonValor3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonValor4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonValor5))))))
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonGroupValoracionPersonalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAplicar)
                .addGap(313, 313, 313))
        );
        buttonGroupValoracionPersonalLayout.setVerticalGroup(
            buttonGroupValoracionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonGroupValoracionPersonalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelTitulo)
                .addGap(18, 18, 18)
                .addGroup(buttonGroupValoracionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonGroupValoracionPersonalLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabelTextDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelDirector))
                .addGap(18, 18, 18)
                .addGroup(buttonGroupValoracionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProductora)
                    .addComponent(jLabelTextProductora))
                .addGap(18, 18, 18)
                .addGroup(buttonGroupValoracionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLanzamiento)
                    .addComponent(jLabelTextLanzamiento))
                .addGap(18, 18, 18)
                .addGroup(buttonGroupValoracionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGenero)
                    .addComponent(jLabelTextGenero))
                .addGroup(buttonGroupValoracionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonGroupValoracionPersonalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPaneDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(buttonGroupValoracionPersonalLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabelDescripcion)))
                .addGap(18, 18, 18)
                .addGroup(buttonGroupValoracionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTextValoracionMedia)
                    .addComponent(jLabelValoracionMedia))
                .addGap(18, 18, 18)
                .addGroup(buttonGroupValoracionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValoracionPersonal)
                    .addComponent(jRadioButtonValor0)
                    .addComponent(jRadioButtonValor1)
                    .addComponent(jRadioButtonValor2)
                    .addComponent(jRadioButtonValor3)
                    .addComponent(jRadioButtonValor4)
                    .addComponent(jRadioButtonValor5))
                .addGap(18, 18, 18)
                .addGroup(buttonGroupValoracionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCapitulosVistos)
                    .addComponent(jLabelTextCapitulosTotales)
                    .addComponent(jComboBoxCapitulosVistos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(buttonGroupValoracionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRecomendar)
                    .addComponent(jRadioButtonRecomendarSi)
                    .addComponent(jRadioButtonRecomendarNo))
                .addGap(18, 18, 18)
                .addComponent(jButtonAplicar)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonGroupValoracionPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonGroupValoracionPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAplicarActionPerformed
       String valoracion= getSelectedButtonText(buttonGroupValoracion);
       int recomendado;  
       String tomosVistos=jComboBoxCapitulosVistos.getSelectedItem()+"";
     
        if( getSelectedButtonText(buttonGroupRecomendar).equals("No") ){
        recomendado=0;
        }else{
        recomendado=1;
        }
       
        try { 
            controladorVerManga.guardarActualizacion(valoracion,recomendado, tomosVistos);
            JOptionPane.showMessageDialog(this, "Se han guardado los cambios correctamente","Info", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error con la bdd contacte con el administrador", "Error inesperado", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(VerManga.class.getName()).log(Level.SEVERE, null, ex);
        }
        controladorVerManga.rellenarDatos();
    }//GEN-LAST:event_jButtonAplicarActionPerformed

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
            java.util.logging.Logger.getLogger(VerManga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerManga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerManga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerManga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VerManga dialog = new VerManga(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }



    public JLabel getjLabelTextDirector() {
        return jLabelTextDirector;
    }

    public void setjLabelTextDirector(JLabel jLabelTextDirector) {
        this.jLabelTextDirector = jLabelTextDirector;
    }

    public JLabel getjLabelTextGenero() {
        return jLabelTextGenero;
    }

    public void setjLabelTextGenero(JLabel jLabelTextGenero) {
        this.jLabelTextGenero = jLabelTextGenero;
    }

    public JLabel getjLabelTextLanzamiento() {
        return jLabelTextLanzamiento;
    }

    public void setjLabelTextLanzamiento(JLabel jLabelTextLanzamiento) {
        this.jLabelTextLanzamiento = jLabelTextLanzamiento;
    }

    public JLabel getjLabelTextValoracionMedia() {
        return jLabelTextValoracionMedia;
    }

    public void setjLabelTextValoracionMedia(JLabel jLabelTextValoracionMedia) {
        this.jLabelTextValoracionMedia = jLabelTextValoracionMedia;
    }

    public JLabel getjLabelValoracionPersonal() {
        return jLabelValoracionPersonal;
    }

    public void setjLabelValoracionPersonal(JLabel jLabelValoracionPersonal) {
        this.jLabelValoracionPersonal = jLabelValoracionPersonal;
    }


    public JRadioButton getjRadioButtonRecomendarNo() {
        return jRadioButtonRecomendarNo;
    }

    public void setjRadioButtonRecomendarNo(JRadioButton jRadioButtonRecomendarNo) {
        this.jRadioButtonRecomendarNo = jRadioButtonRecomendarNo;
    }

    public JRadioButton getjRadioButtonRecomendarSi() {
        return jRadioButtonRecomendarSi;
    }

    public void setjRadioButtonRecomendarSi(JRadioButton jRadioButtonRecomendarSi) {
        this.jRadioButtonRecomendarSi = jRadioButtonRecomendarSi;
    }
    
   

    public JTextArea getjTextAreaDescripcion() {
        return jTextAreaDescripcion;
    }

    public void setjTextAreaDescripcion(JTextArea jTextAreaDescripcion) {
        this.jTextAreaDescripcion = jTextAreaDescripcion;
    }

    public void setjLabelTitulo(JLabel jLabelTitulo) {
        this.jLabelTitulo = jLabelTitulo;
    }

    public JLabel getjLabelTitulo() {
        return jLabelTitulo;
    }

    public JLabel getjLabelTextProductora() {
        return jLabelTextProductora;
    }

    public void setjLabelTextProductora(JLabel jLabelTextProductora) {
        this.jLabelTextProductora = jLabelTextProductora;
    }

    public JRadioButton getjRadioButtonValor0() {
        return jRadioButtonValor0;
    }

    public void setjRadioButtonValor0(JRadioButton jRadioButtonValor0) {
        this.jRadioButtonValor0 = jRadioButtonValor0;
    }

    public JRadioButton getjRadioButtonValor1() {
        return jRadioButtonValor1;
    }

    public void setjRadioButtonValor1(JRadioButton jRadioButtonValor1) {
        this.jRadioButtonValor1 = jRadioButtonValor1;
    }

    public JRadioButton getjRadioButtonValor2() {
        return jRadioButtonValor2;
    }

    public void setjRadioButtonValor2(JRadioButton jRadioButtonValor2) {
        this.jRadioButtonValor2 = jRadioButtonValor2;
    }

    public JRadioButton getjRadioButtonValor3() {
        return jRadioButtonValor3;
    }

    public void setjRadioButtonValor3(JRadioButton jRadioButtonValor3) {
        this.jRadioButtonValor3 = jRadioButtonValor3;
    }

    public JRadioButton getjRadioButtonValor4() {
        return jRadioButtonValor4;
    }

    public void setjRadioButtonValor4(JRadioButton jRadioButtonValor4) {
        this.jRadioButtonValor4 = jRadioButtonValor4;
    }

    public JRadioButton getjRadioButtonValor5() {
        return jRadioButtonValor5;
    }

    public void setjRadioButtonValor5(JRadioButton jRadioButtonValor5) {
        this.jRadioButtonValor5 = jRadioButtonValor5;
    }

    public JLabel getjLabelTextCapitulosTotales() {
        return jLabelTextCapitulosTotales;
    }

    public void setjLabelTextCapitulosTotales(JLabel jLabelTextCapitulosTotales) {
        this.jLabelTextCapitulosTotales = jLabelTextCapitulosTotales;
    }



    public JLabel getjLabelCapitulosVistos() {
        return jLabelCapitulosVistos;
    }

    public void setjLabelCapitulosVistos(JLabel jLabelCapitulosVistos) {
        this.jLabelCapitulosVistos = jLabelCapitulosVistos;
    }

    public JComboBox getjComboBoxCapitulosVistos() {
        return jComboBoxCapitulosVistos;
    }

    public void setjComboBoxCapitulosVistos(JComboBox jComboBoxCapitulosVistos) {
        this.jComboBoxCapitulosVistos = jComboBoxCapitulosVistos;
    }
    
 public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements();
                buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    }


    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupRecomendar;
    private javax.swing.ButtonGroup buttonGroupValoracion;
    private javax.swing.JPanel buttonGroupValoracionPersonal;
    private javax.swing.JButton jButtonAplicar;
    private javax.swing.JComboBox jComboBoxCapitulosVistos;
    private javax.swing.JLabel jLabelCapitulosVistos;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelDirector;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelLanzamiento;
    private javax.swing.JLabel jLabelProductora;
    private javax.swing.JLabel jLabelRecomendar;
    private javax.swing.JLabel jLabelTextCapitulosTotales;
    private javax.swing.JLabel jLabelTextDirector;
    private javax.swing.JLabel jLabelTextGenero;
    private javax.swing.JLabel jLabelTextLanzamiento;
    private javax.swing.JLabel jLabelTextProductora;
    private javax.swing.JLabel jLabelTextValoracionMedia;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelValoracionMedia;
    private javax.swing.JLabel jLabelValoracionPersonal;
    private javax.swing.JRadioButton jRadioButtonRecomendarNo;
    private javax.swing.JRadioButton jRadioButtonRecomendarSi;
    private javax.swing.JRadioButton jRadioButtonValor0;
    private javax.swing.JRadioButton jRadioButtonValor1;
    private javax.swing.JRadioButton jRadioButtonValor2;
    private javax.swing.JRadioButton jRadioButtonValor3;
    private javax.swing.JRadioButton jRadioButtonValor4;
    private javax.swing.JRadioButton jRadioButtonValor5;
    private javax.swing.JScrollPane jScrollPaneDescripcion;
    private javax.swing.JTextArea jTextAreaDescripcion;
    // End of variables declaration//GEN-END:variables
}
