/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hobbyteca.vista;

import hobbyteca.controlador.ControladorVerLibro;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;


/**
 *
 * @author jesus
 */
public class VerLibro extends javax.swing.JDialog {
    /**
     * Creates new form VerPelicula
     */
    private final ControladorVerLibro controladorVerLibro;
    public VerLibro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        controladorVerLibro = new ControladorVerLibro(this);
        controladorVerLibro.rellenarDatos();
        
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
        buttonGroupVisualizado = new javax.swing.ButtonGroup();
        buttonGroupValoracionPersonal = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelEscritor = new javax.swing.JLabel();
        jLabelTextEscritor = new javax.swing.JLabel();
        jLabelEditorial = new javax.swing.JLabel();
        jLabelTextEditorial = new javax.swing.JLabel();
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
        jLabelLe??do = new javax.swing.JLabel();
        jRadioButtonVisualizadoSi = new javax.swing.JRadioButton();
        jRadioButtonVisualizadoNo = new javax.swing.JRadioButton();
        jLabelRecomendar = new javax.swing.JLabel();
        jRadioButtonRecomendarSi = new javax.swing.JRadioButton();
        jRadioButtonRecomendarNo = new javax.swing.JRadioButton();
        jButtonAplicar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Libro");

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("TITULO");

        jLabelEscritor.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabelEscritor.setText("Escritor:");

        jLabelTextEscritor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelTextEscritor.setForeground(new java.awt.Color(0, 0, 255));
        jLabelTextEscritor.setText("jLabel1");

        jLabelEditorial.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabelEditorial.setText("Editorial:");

        jLabelTextEditorial.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelTextEditorial.setForeground(new java.awt.Color(0, 0, 255));
        jLabelTextEditorial.setText("jLabel2");

        jLabelLanzamiento.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabelLanzamiento.setText("Lanzamiento:");

        jLabelTextLanzamiento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelTextLanzamiento.setForeground(new java.awt.Color(0, 0, 255));
        jLabelTextLanzamiento.setText("jLabel3");

        jLabelGenero.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabelGenero.setText("G??nero:");

        jLabelTextGenero.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelTextGenero.setForeground(new java.awt.Color(0, 0, 255));
        jLabelTextGenero.setText("jLabel4");

        jLabelDescripcion.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabelDescripcion.setText("Descripci??n:");

        jTextAreaDescripcion.setEditable(false);
        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        jTextAreaDescripcion.setForeground(new java.awt.Color(0, 0, 255));
        jTextAreaDescripcion.setLineWrap(true);
        jTextAreaDescripcion.setRows(5);
        jScrollPaneDescripcion.setViewportView(jTextAreaDescripcion);

        jLabelValoracionMedia.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabelValoracionMedia.setText("Valoraci??n Media:");

        jLabelTextValoracionMedia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelTextValoracionMedia.setForeground(new java.awt.Color(0, 102, 0));
        jLabelTextValoracionMedia.setText("0/5");

        jLabelValoracionPersonal.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabelValoracionPersonal.setText("Valoraci??n Personal:");

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

        jLabelLe??do.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabelLe??do.setText("Le??do:");

        buttonGroupVisualizado.add(jRadioButtonVisualizadoSi);
        jRadioButtonVisualizadoSi.setText("S??");

        buttonGroupVisualizado.add(jRadioButtonVisualizadoNo);
        jRadioButtonVisualizadoNo.setText("No");

        jLabelRecomendar.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabelRecomendar.setText("Recomendar:");

        buttonGroupRecomendar.add(jRadioButtonRecomendarSi);
        jRadioButtonRecomendarSi.setText("S??");

        buttonGroupRecomendar.add(jRadioButtonRecomendarNo);
        jRadioButtonRecomendarNo.setText("No");

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
                                    .addComponent(jLabelEditorial, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelEscritor, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jLabelValoracionPersonal, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelValoracionMedia, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelRecomendar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelLe??do, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(buttonGroupValoracionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(buttonGroupValoracionPersonalLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(buttonGroupValoracionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTextEscritor)
                                    .addComponent(jLabelTextEditorial)
                                    .addComponent(jLabelTextLanzamiento)
                                    .addComponent(jLabelTextGenero)))
                            .addGroup(buttonGroupValoracionPersonalLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabelTextValoracionMedia))
                            .addGroup(buttonGroupValoracionPersonalLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(buttonGroupValoracionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(buttonGroupValoracionPersonalLayout.createSequentialGroup()
                                        .addComponent(jRadioButtonVisualizadoSi)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonVisualizadoNo))
                                    .addGroup(buttonGroupValoracionPersonalLayout.createSequentialGroup()
                                        .addComponent(jRadioButtonValor0)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonValor1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButtonValor2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButtonValor3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonValor4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonValor5))
                                    .addGroup(buttonGroupValoracionPersonalLayout.createSequentialGroup()
                                        .addComponent(jRadioButtonRecomendarSi)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButtonRecomendarNo))
                                    .addComponent(jScrollPaneDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonGroupValoracionPersonalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAplicar)
                .addGap(306, 306, 306))
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
                        .addComponent(jLabelTextEscritor, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelEscritor))
                .addGap(18, 18, 18)
                .addGroup(buttonGroupValoracionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEditorial)
                    .addComponent(jLabelTextEditorial))
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
                    .addComponent(jLabelLe??do)
                    .addComponent(jRadioButtonVisualizadoSi)
                    .addComponent(jRadioButtonVisualizadoNo))
                .addGap(18, 18, 18)
                .addGroup(buttonGroupValoracionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRecomendar)
                    .addComponent(jRadioButtonRecomendarSi)
                    .addComponent(jRadioButtonRecomendarNo))
                .addGap(18, 18, 18)
                .addComponent(jButtonAplicar)
                .addContainerGap(20, Short.MAX_VALUE))
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
        int valoracion=Integer.parseInt(getSelectedButtonText(buttonGroupValoracion));
        int recomendado;
        int visto;
        if( getSelectedButtonText(buttonGroupRecomendar).equals("No") ){
            recomendado=0;
        }else{
            recomendado=1;
        }
        if( getSelectedButtonText(buttonGroupVisualizado).equals("No") ){
            visto=0;
        }else{
            visto=1;
        }
        try {
            controladorVerLibro.guardarActualizacion(valoracion,recomendado, visto);
            JOptionPane.showMessageDialog(this, "Se han guardado los cambios correctamente","Info", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error con la bdd contacte con el administrador", "Error inesperado", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(VerLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
        controladorVerLibro.rellenarDatos();
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
            java.util.logging.Logger.getLogger(VerLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VerLibro dialog = new VerLibro(new javax.swing.JFrame(), true);
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

 public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
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
    private javax.swing.ButtonGroup buttonGroupVisualizado;
    private javax.swing.JButton jButtonAplicar;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelEditorial;
    private javax.swing.JLabel jLabelEscritor;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelLanzamiento;
    private javax.swing.JLabel jLabelLe??do;
    private javax.swing.JLabel jLabelRecomendar;
    private javax.swing.JLabel jLabelTextEditorial;
    private javax.swing.JLabel jLabelTextEscritor;
    private javax.swing.JLabel jLabelTextGenero;
    private javax.swing.JLabel jLabelTextLanzamiento;
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
    private javax.swing.JRadioButton jRadioButtonVisualizadoNo;
    private javax.swing.JRadioButton jRadioButtonVisualizadoSi;
    private javax.swing.JScrollPane jScrollPaneDescripcion;
    private javax.swing.JTextArea jTextAreaDescripcion;
    // End of variables declaration//GEN-END:variables

    public javax.swing.ButtonGroup getButtonGroupRecomendar() {
        return buttonGroupRecomendar;
    }

    public void setButtonGroupRecomendar(javax.swing.ButtonGroup buttonGroupRecomendar) {
        this.buttonGroupRecomendar = buttonGroupRecomendar;
    }

    public javax.swing.ButtonGroup getButtonGroupValoracion() {
        return buttonGroupValoracion;
    }

    public void setButtonGroupValoracion(javax.swing.ButtonGroup buttonGroupValoracion) {
        this.buttonGroupValoracion = buttonGroupValoracion;
    }

    public javax.swing.JPanel getButtonGroupValoracionPersonal() {
        return buttonGroupValoracionPersonal;
    }

    public void setButtonGroupValoracionPersonal(javax.swing.JPanel buttonGroupValoracionPersonal) {
        this.buttonGroupValoracionPersonal = buttonGroupValoracionPersonal;
    }

    public javax.swing.ButtonGroup getButtonGroupVisualizado() {
        return buttonGroupVisualizado;
    }

    public void setButtonGroupVisualizado(javax.swing.ButtonGroup buttonGroupVisualizado) {
        this.buttonGroupVisualizado = buttonGroupVisualizado;
    }

    public javax.swing.JButton getjButtonAplicar() {
        return jButtonAplicar;
    }

    public void setjButtonAplicar(javax.swing.JButton jButtonAplicar) {
        this.jButtonAplicar = jButtonAplicar;
    }

    public javax.swing.JLabel getjLabelDescripcion() {
        return jLabelDescripcion;
    }

    public void setjLabelDescripcion(javax.swing.JLabel jLabelDescripcion) {
        this.jLabelDescripcion = jLabelDescripcion;
    }

    public javax.swing.JLabel getjLabelEditorial() {
        return jLabelEditorial;
    }

    public void setjLabelEditorial(javax.swing.JLabel jLabelEditorial) {
        this.jLabelEditorial = jLabelEditorial;
    }

    public javax.swing.JLabel getjLabelEscritor() {
        return jLabelEscritor;
    }

    public void setjLabelEscritor(javax.swing.JLabel jLabelEscritor) {
        this.jLabelEscritor = jLabelEscritor;
    }

    public javax.swing.JLabel getjLabelGenero() {
        return jLabelGenero;
    }

    public void setjLabelGenero(javax.swing.JLabel jLabelGenero) {
        this.jLabelGenero = jLabelGenero;
    }

    public javax.swing.JLabel getjLabelLanzamiento() {
        return jLabelLanzamiento;
    }

    public void setjLabelLanzamiento(javax.swing.JLabel jLabelLanzamiento) {
        this.jLabelLanzamiento = jLabelLanzamiento;
    }

    public javax.swing.JLabel getjLabelLe??do() {
        return jLabelLe??do;
    }

    public void setjLabelLe??do(javax.swing.JLabel jLabelLe??do) {
        this.jLabelLe??do = jLabelLe??do;
    }

    public javax.swing.JLabel getjLabelRecomendar() {
        return jLabelRecomendar;
    }

    public void setjLabelRecomendar(javax.swing.JLabel jLabelRecomendar) {
        this.jLabelRecomendar = jLabelRecomendar;
    }

    public javax.swing.JLabel getjLabelTextEditorial() {
        return jLabelTextEditorial;
    }

    public void setjLabelTextEditorial(javax.swing.JLabel jLabelTextEditorial) {
        this.jLabelTextEditorial = jLabelTextEditorial;
    }

    public javax.swing.JLabel getjLabelTextEscritor() {
        return jLabelTextEscritor;
    }

    public void setjLabelTextEscritor(javax.swing.JLabel jLabelTextEscritor) {
        this.jLabelTextEscritor = jLabelTextEscritor;
    }

    public javax.swing.JLabel getjLabelTextGenero() {
        return jLabelTextGenero;
    }

    public void setjLabelTextGenero(javax.swing.JLabel jLabelTextGenero) {
        this.jLabelTextGenero = jLabelTextGenero;
    }

    public javax.swing.JLabel getjLabelTextLanzamiento() {
        return jLabelTextLanzamiento;
    }

    public void setjLabelTextLanzamiento(javax.swing.JLabel jLabelTextLanzamiento) {
        this.jLabelTextLanzamiento = jLabelTextLanzamiento;
    }

    public javax.swing.JLabel getjLabelTextValoracionMedia() {
        return jLabelTextValoracionMedia;
    }

    public void setjLabelTextValoracionMedia(javax.swing.JLabel jLabelTextValoracionMedia) {
        this.jLabelTextValoracionMedia = jLabelTextValoracionMedia;
    }

    public javax.swing.JLabel getjLabelTitulo() {
        return jLabelTitulo;
    }

    public void setjLabelTitulo(javax.swing.JLabel jLabelTitulo) {
        this.jLabelTitulo = jLabelTitulo;
    }

    public javax.swing.JLabel getjLabelValoracionMedia() {
        return jLabelValoracionMedia;
    }

    public void setjLabelValoracionMedia(javax.swing.JLabel jLabelValoracionMedia) {
        this.jLabelValoracionMedia = jLabelValoracionMedia;
    }

    public javax.swing.JLabel getjLabelValoracionPersonal() {
        return jLabelValoracionPersonal;
    }

    public void setjLabelValoracionPersonal(javax.swing.JLabel jLabelValoracionPersonal) {
        this.jLabelValoracionPersonal = jLabelValoracionPersonal;
    }

    public javax.swing.JRadioButton getjRadioButtonRecomendarNo() {
        return jRadioButtonRecomendarNo;
    }

    public void setjRadioButtonRecomendarNo(javax.swing.JRadioButton jRadioButtonRecomendarNo) {
        this.jRadioButtonRecomendarNo = jRadioButtonRecomendarNo;
    }

    public javax.swing.JRadioButton getjRadioButtonRecomendarSi() {
        return jRadioButtonRecomendarSi;
    }

    public void setjRadioButtonRecomendarSi(javax.swing.JRadioButton jRadioButtonRecomendarSi) {
        this.jRadioButtonRecomendarSi = jRadioButtonRecomendarSi;
    }

    public javax.swing.JRadioButton getjRadioButtonValor0() {
        return jRadioButtonValor0;
    }

    public void setjRadioButtonValor0(javax.swing.JRadioButton jRadioButtonValor0) {
        this.jRadioButtonValor0 = jRadioButtonValor0;
    }

    public javax.swing.JRadioButton getjRadioButtonValor1() {
        return jRadioButtonValor1;
    }

    public void setjRadioButtonValor1(javax.swing.JRadioButton jRadioButtonValor1) {
        this.jRadioButtonValor1 = jRadioButtonValor1;
    }

    public javax.swing.JRadioButton getjRadioButtonValor2() {
        return jRadioButtonValor2;
    }

    public void setjRadioButtonValor2(javax.swing.JRadioButton jRadioButtonValor2) {
        this.jRadioButtonValor2 = jRadioButtonValor2;
    }

    public javax.swing.JRadioButton getjRadioButtonValor3() {
        return jRadioButtonValor3;
    }

    public void setjRadioButtonValor3(javax.swing.JRadioButton jRadioButtonValor3) {
        this.jRadioButtonValor3 = jRadioButtonValor3;
    }

    public javax.swing.JRadioButton getjRadioButtonValor4() {
        return jRadioButtonValor4;
    }

    public void setjRadioButtonValor4(javax.swing.JRadioButton jRadioButtonValor4) {
        this.jRadioButtonValor4 = jRadioButtonValor4;
    }

    public javax.swing.JRadioButton getjRadioButtonValor5() {
        return jRadioButtonValor5;
    }

    public void setjRadioButtonValor5(javax.swing.JRadioButton jRadioButtonValor5) {
        this.jRadioButtonValor5 = jRadioButtonValor5;
    }

    public javax.swing.JRadioButton getjRadioButtonVisualizadoNo() {
        return jRadioButtonVisualizadoNo;
    }

    public void setjRadioButtonVisualizadoNo(javax.swing.JRadioButton jRadioButtonVisualizadoNo) {
        this.jRadioButtonVisualizadoNo = jRadioButtonVisualizadoNo;
    }

    public javax.swing.JRadioButton getjRadioButtonVisualizadoSi() {
        return jRadioButtonVisualizadoSi;
    }

    public void setjRadioButtonVisualizadoSi(javax.swing.JRadioButton jRadioButtonVisualizadoSi) {
        this.jRadioButtonVisualizadoSi = jRadioButtonVisualizadoSi;
    }

    public javax.swing.JScrollPane getjScrollPaneDescripcion() {
        return jScrollPaneDescripcion;
    }

    public void setjScrollPaneDescripcion(javax.swing.JScrollPane jScrollPaneDescripcion) {
        this.jScrollPaneDescripcion = jScrollPaneDescripcion;
    }

    public javax.swing.JTextArea getjTextAreaDescripcion() {
        return jTextAreaDescripcion;
    }

    public void setjTextAreaDescripcion(javax.swing.JTextArea jTextAreaDescripcion) {
        this.jTextAreaDescripcion = jTextAreaDescripcion;
    }
}
