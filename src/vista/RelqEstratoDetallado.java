/*
 * Copyright (C) 2016 Luis Hurtado <luis.9499@hotmail.com>
 * ----------------------------------------------------------------------------
 * "THE BEER-WARE LICENSE" (Revision 1.0):
 *  <luis.9499@hotmail.com> wrote this file. As long as you retain this notice you
 *  can do whatever you want with this stuff. If we meet some day, and you think
 *  this stuff is worth it, you can buy me a beer in return
 *  ----------------------------------------------------------------------------
 */
package vista;

import java.awt.Color;
import java.text.DecimalFormat;
import tarifas.ControlTarifas;
import tarifas.ControlTasas;

/**
 * GUI de la aplicacion Detallada
 * @author luis
 * @version 1.2
 */


public class RelqEstratoDetallado extends javax.swing.JFrame {

    /**
     * Creates new form RelqEstratoDetallado
     */
    public RelqEstratoDetallado() {
        getContentPane().setBackground(Color.white);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxEstActual = new javax.swing.JComboBox<>();
        jComboBoxEstReal = new javax.swing.JComboBox<>();
        jComboBoxPeriodo = new javax.swing.JComboBox();
        jTextFieldConsumo = new javax.swing.JTextField();
        jComboBoxUbicac = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldValorFact = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldApFact = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldValorReal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldApReal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextFieldAjustSub = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldAjustContr = new javax.swing.JTextField();
        jTextFieldApDif = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldDifTotal = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculo Reliquidación Estrato");
        setBackground(java.awt.Color.white);

        jLabel1.setText("Estrato Actual");

        jLabel2.setText("Estrato Real");

        jLabel3.setText("Periodo");

        jLabel4.setText("Consumo");

        jLabel5.setText("Ubicación");

        jComboBoxEstActual.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));

        jComboBoxEstReal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));

        jComboBoxPeriodo.setMaximumRowCount(12);
        jComboBoxPeriodo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "201611", "201610", "201609", "201608", "201607", "201606", "201605", "201604", "201603", "201602", "201601", "201512", "201511", "201510", "201509", "201508", "201507", "201506", "201505", "201504" }));

        jTextFieldConsumo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldConsumo.setText("0");

        jComboBoxUbicac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Urbano", "Rural" }));

        jLabel6.setText("Consumo Facturado");

        jTextFieldValorFact.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel8.setText("AP Facturado");

        jTextFieldApFact.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel7.setText("Consumo Real");

        jTextFieldValorReal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel9.setText("AP Real");

        jTextFieldApReal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jButton1.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextFieldAjustSub.setForeground(new java.awt.Color(0, 51, 204));
        jTextFieldAjustSub.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel10.setText("Ajuste Subsidio");

        jLabel11.setText("Ajuste Contribución");

        jTextFieldAjustContr.setForeground(new java.awt.Color(0, 51, 204));
        jTextFieldAjustContr.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jTextFieldApDif.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldApDif.setForeground(new java.awt.Color(0, 51, 204));
        jTextFieldApDif.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Descuento TOTAL");

        jTextFieldDifTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldDifTotal.setForeground(new java.awt.Color(0, 153, 51));
        jTextFieldDifTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel13.setText("Ajuste AP");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(55, 55, 55)
                .addComponent(jLabel3)
                .addGap(62, 62, 62)
                .addComponent(jLabel4)
                .addGap(56, 56, 56)
                .addComponent(jLabel5))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jComboBoxEstActual, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jComboBoxEstReal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jComboBoxPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jTextFieldConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jComboBoxUbicac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton1))
            .addGroup(layout.createSequentialGroup()
                .addGap(533, 533, 533)
                .addComponent(jButton2))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jLabel10))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addGap(84, 84, 84)
                .addComponent(jTextFieldAjustSub, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTextFieldValorFact, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldValorReal, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel11))
            .addGroup(layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(jTextFieldAjustContr, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jLabel12))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jTextFieldDifTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel8)
                .addGap(53, 53, 53)
                .addComponent(jLabel9)
                .addGap(113, 113, 113)
                .addComponent(jLabel13))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTextFieldApFact, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldApReal, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jTextFieldApDif, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxEstActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxEstReal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxUbicac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel10))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jTextFieldAjustSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldValorFact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldValorReal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel11)))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldAjustContr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel12)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldDifTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel13)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldApFact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldApReal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldApDif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Boton para limpiar interfaz
     * @param evt 
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextFieldApDif.setText("");
        jTextFieldApFact.setText("");
        jTextFieldApReal.setText("");
        jTextFieldConsumo.setText("0");
        jTextFieldDifTotal.setText("");
        jTextFieldValorFact.setText("");
        jTextFieldValorReal.setText("");
        jTextFieldAjustContr.setText("");
        jTextFieldAjustSub.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed
    /**
     * Calcula todos los valores
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tarifas.ControlTarifas cTar = new ControlTarifas();
        tarifas.ControlTasas cAp = new ControlTasas();

        DecimalFormat formateador = new DecimalFormat("$ #.##");

        int estAct = Integer.parseInt(jComboBoxEstActual.getSelectedItem().toString());
        int estReal = Integer.parseInt(jComboBoxEstReal.getSelectedItem().toString());
        int periodo = Integer.parseInt(jComboBoxPeriodo.getSelectedItem().toString());
        int consumo = Integer.parseInt(jTextFieldConsumo.getText());
        String ubicacion = jComboBoxUbicac.getSelectedItem().toString();
        cTar.comparaEstrato(estAct, estReal);

        double a = cTar.valorFact(estAct, consumo, periodo);
        jTextFieldValorFact.setText(formateador.format(a));

        double b = cTar.valorReal(estReal, consumo, periodo);
        jTextFieldValorReal.setText(formateador.format(b));

        if ("Urbano".equals(ubicacion)) {
            double c = cAp.selPeriodo(periodo, estAct);
            jTextFieldApFact.setText(formateador.format(c));
        } else {
            double c = cAp.selPeriodo(periodo, 1);
            jTextFieldApFact.setText(formateador.format(c));
        }
        
        if ("Urbano".equals(ubicacion)) {
            double d = cAp.selPeriodo(periodo, estReal);
            jTextFieldApReal.setText(formateador.format(d));
        } else {
            double d = cAp.selPeriodo(periodo, 1);
            jTextFieldApReal.setText(formateador.format(d));
        }

        double e = cAp.difTasas(periodo, estAct, estReal, ubicacion);
        jTextFieldApDif.setText(formateador.format(e));

        double contAct = cTar.calContr(estAct, consumo, periodo);
        double contReal = cTar.calContr(estReal, consumo, periodo);
        double difContr = contAct - contReal;
        jTextFieldAjustContr.setText(formateador.format(difContr));

        double subAct = cTar.calSubsidio(consumo, estAct, periodo);
        double subReal = cTar.calSubsidio(consumo, estReal, periodo);
        double difSub = subReal - subAct;
        jTextFieldAjustSub.setText(formateador.format(difSub));

        double f = cTar.valorDif(estAct, estReal, consumo, periodo);

        double g = e + f;
        jTextFieldDifTotal.setText(formateador.format(g));

    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RelqEstratoDetallado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelqEstratoDetallado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelqEstratoDetallado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelqEstratoDetallado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelqEstratoDetallado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxEstActual;
    private javax.swing.JComboBox<String> jComboBoxEstReal;
    private javax.swing.JComboBox jComboBoxPeriodo;
    private javax.swing.JComboBox<String> jComboBoxUbicac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextFieldAjustContr;
    private javax.swing.JTextField jTextFieldAjustSub;
    private javax.swing.JTextField jTextFieldApDif;
    private javax.swing.JTextField jTextFieldApFact;
    private javax.swing.JTextField jTextFieldApReal;
    private javax.swing.JTextField jTextFieldConsumo;
    private javax.swing.JTextField jTextFieldDifTotal;
    private javax.swing.JTextField jTextFieldValorFact;
    private javax.swing.JTextField jTextFieldValorReal;
    // End of variables declaration//GEN-END:variables
}
