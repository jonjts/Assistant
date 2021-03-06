/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jonjts.assistant;

import br.com.jonjts.assistant.control.ExameClinicoControle;
import br.com.jonjts.assistant.entity.ExameClinico;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

/**
 *
 * @author Jonas
 */
public class CondutaNutricionalTela extends javax.swing.JFrame implements ITab {

    private NovoPaciente novoPaciente;
    private Long idExameClinico;
    private ExameClinico exameClinico;
    private ExameClinicoControle exameClinicoControle = new ExameClinicoControle();

    public CondutaNutricionalTela(NovoPaciente novoPaciente, Long idExameClinico) {
        this.novoPaciente = novoPaciente;
        this.idExameClinico = idExameClinico;
        novoPaciente.setEnabled(false);
        initComponents();
        loadData();
        setLocationRelativeTo(null);
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
        txtConduta = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        txtConduta.setColumns(20);
        txtConduta.setRows(5);
        jScrollPane1.setViewportView(txtConduta);

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        enableTelaPaciente();
    }//GEN-LAST:event_formWindowClosing

    private void enableTelaPaciente() {
        novoPaciente.setEnabled(true);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        save();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtConduta;
    // End of variables declaration//GEN-END:variables

    @Override
    public void save() {
        try {
            exameClinico.setCondutaNutricional(txtConduta.getText());
            exameClinicoControle.update(exameClinico);
            JOptionPane.showMessageDialog(null, "Conduta nutricional salva.");
            enableTelaPaciente();
            this.dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar conduta nutricional.");
            Logger.getLogger(CondutaNutricionalTela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void clearData() {
        txtConduta.setText("");
    }

    @Override
    public void loadData() {
        try {
            exameClinico = exameClinicoControle.get((Number) idExameClinico);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            final Date data = exameClinico.getData();
            setTitle("Conduta em " + sdf.format(data));
            txtConduta.setText(exameClinico.getCondutaNutricional());
        } catch (Exception ex) {
            Logger.getLogger(CondutaNutricionalTela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
