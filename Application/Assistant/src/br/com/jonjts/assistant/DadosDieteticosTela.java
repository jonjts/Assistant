/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jonjts.assistant;

import br.com.jonjts.assistant.entity.DadosDieteticos;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonas
 */
public class DadosDieteticosTela extends javax.swing.JFrame implements ITab{

    private NovoPaciente novoPaciente;
    private DadosDieteticos dadosDieteticos;
    
    public DadosDieteticosTela(NovoPaciente novoPaciente) {
        this.novoPaciente = novoPaciente;
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAversoes = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPreferencias = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtIntorelancia = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtAlergias = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtIngestaoHidrica = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtLiquidosAssociadosRefeicoes = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Aversões Alimentares:");

        jLabel2.setText("Preferências Alimentares:");

        txtAversoes.setColumns(20);
        txtAversoes.setRows(5);
        jScrollPane1.setViewportView(txtAversoes);

        txtPreferencias.setColumns(20);
        txtPreferencias.setRows(5);
        jScrollPane2.setViewportView(txtPreferencias);

        txtIntorelancia.setColumns(20);
        txtIntorelancia.setRows(5);
        jScrollPane7.setViewportView(txtIntorelancia);

        txtAlergias.setColumns(20);
        txtAlergias.setRows(5);
        jScrollPane8.setViewportView(txtAlergias);

        txtIngestaoHidrica.setColumns(20);
        txtIngestaoHidrica.setRows(5);
        jScrollPane9.setViewportView(txtIngestaoHidrica);

        txtLiquidosAssociadosRefeicoes.setColumns(20);
        txtLiquidosAssociadosRefeicoes.setRows(5);
        jScrollPane10.setViewportView(txtLiquidosAssociadosRefeicoes);

        jLabel3.setText("Intolerâncias Alimentares:");

        jLabel4.setText("Alergias Alimentares:");

        jLabel5.setText("Ingestão Hidrica:");

        jLabel6.setText("Liquidos Associados as Refeições:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane10)
                    .addComponent(jScrollPane9)
                    .addComponent(jScrollPane8)
                    .addComponent(jScrollPane7)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel1)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel2)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(219, 219, 219)
                                .addComponent(jLabel4)))
                        .addGap(51, 51, 51)
                        .addComponent(jLabel5)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea txtAlergias;
    private javax.swing.JTextArea txtAversoes;
    private javax.swing.JTextArea txtIngestaoHidrica;
    private javax.swing.JTextArea txtIntorelancia;
    private javax.swing.JTextArea txtLiquidosAssociadosRefeicoes;
    private javax.swing.JTextArea txtPreferencias;
    // End of variables declaration//GEN-END:variables

    @Override
    public void save() {
        if(dadosDieteticos == null){
            insert();
        }else{
            update();
        }
    }
    
    private void insert(){
        try {
            dadosDieteticos = new DadosDieteticos();
            preencherDados();
            dadosDieteticos = novoPaciente.saveDadosDietateticos(dadosDieteticos);
            JOptionPane.showMessageDialog(null, "Salvo");
        } catch (Exception ex) {
            dadosDieteticos = null;
            JOptionPane.showMessageDialog(null, "Erro ao salvar Dados Dietéticos");
            Logger.getLogger(DadosDieteticosTela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void update(){
        try {
            preencherDados();
            novoPaciente.updateDadosDieteticos(dadosDieteticos);
            JOptionPane.showMessageDialog(null, "Salvo");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar Dados Dietéticos");
            Logger.getLogger(DadosDieteticosTela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void clearData() {
        txtAlergias.setText("");
        txtAversoes.setText("");
        txtIngestaoHidrica.setText("");
        txtIntorelancia.setText("");
        txtLiquidosAssociadosRefeicoes.setText("");
        txtPreferencias.setText("");
    }

    @Override
    public void loadData() {
        txtAlergias.setText(dadosDieteticos.getAlergias());
        txtAversoes.setText(dadosDieteticos.getAversao());
        txtIngestaoHidrica.setText(dadosDieteticos.getIngestaoHidrica());
        txtIntorelancia.setText(dadosDieteticos.getIntolerancia());
        txtLiquidosAssociadosRefeicoes.setText(dadosDieteticos.getLiquidosAssociados());
        txtPreferencias.setText(dadosDieteticos.getPreferencia());
    }
    
    private void preencherDados(){
        dadosDieteticos.setAlergias(txtAlergias.getText());
        dadosDieteticos.setAversao(txtAversoes.getText());
        dadosDieteticos.setIngestaoHidrica(txtIngestaoHidrica.getText());
        dadosDieteticos.setIntolerancia(txtIntorelancia.getText());
        dadosDieteticos.setLiquidosAssociados(txtLiquidosAssociadosRefeicoes.getText());
        dadosDieteticos.setPreferencia(txtPreferencias.getText());
    }

    public void setDadosDieteticos(DadosDieteticos dadosDieteticos) {
        this.dadosDieteticos = dadosDieteticos;
    }
    
    
}