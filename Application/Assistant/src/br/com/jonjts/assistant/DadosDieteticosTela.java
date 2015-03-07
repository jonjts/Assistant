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
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPreferencias = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtIntorelancia = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtAlergias = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtAversoes = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbSal = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        cbAcucar = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        txtSuplementacao = new javax.swing.JTextField();
        cbLiqAssociados = new javax.swing.JComboBox();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtIngestaoHidrica = new javax.swing.JTextArea();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Aversões Alimentares:");

        jLabel2.setText("Preferências Alimentares:");

        txtPreferencias.setColumns(20);
        txtPreferencias.setRows(5);
        jScrollPane2.setViewportView(txtPreferencias);

        txtIntorelancia.setColumns(20);
        txtIntorelancia.setRows(5);
        jScrollPane7.setViewportView(txtIntorelancia);

        txtAlergias.setColumns(20);
        txtAlergias.setRows(5);
        jScrollPane8.setViewportView(txtAlergias);

        txtAversoes.setColumns(20);
        txtAversoes.setRows(5);
        jScrollPane9.setViewportView(txtAversoes);

        jLabel3.setText("Intolerâncias Alimentares:");

        jLabel4.setText("Alergias Alimentares:");

        jLabel5.setText("Ingestão Hidrica:");

        jLabel6.setText("Liquidos Associados as Refeições:");

        jLabel7.setText("Restrição de Sal:");

        cbSal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sim", "Não" }));
        cbSal.setSelectedIndex(1);

        jLabel8.setText("Restrição de Açucar:");

        cbAcucar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sim", "Não" }));
        cbAcucar.setSelectedIndex(1);

        jLabel9.setText("Suplementacao:");

        cbLiqAssociados.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sim", "Não" }));
        cbLiqAssociados.setSelectedIndex(1);

        txtIngestaoHidrica.setColumns(20);
        txtIngestaoHidrica.setRows(5);
        jScrollPane10.setViewportView(txtIngestaoHidrica);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                        .addComponent(jScrollPane8)
                        .addComponent(jScrollPane7)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbSal, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSuplementacao, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbAcucar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbLiqAssociados, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel2)
                                .addGap(60, 60, 60)
                                .addComponent(jLabel3)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel4)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(75, 75, 75))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtSuplementacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(cbSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cbAcucar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbLiqAssociados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbAcucar;
    private javax.swing.JComboBox cbLiqAssociados;
    private javax.swing.JComboBox cbSal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea txtAlergias;
    private javax.swing.JTextArea txtAversoes;
    private javax.swing.JTextArea txtIngestaoHidrica;
    private javax.swing.JTextArea txtIntorelancia;
    private javax.swing.JTextArea txtPreferencias;
    private javax.swing.JTextField txtSuplementacao;
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
        txtAversoes.setText("");
        txtIntorelancia.setText("");
        txtPreferencias.setText("");
        txtIngestaoHidrica.setText("");
        txtSuplementacao.setText("");
        
        cbAcucar.setSelectedIndex(1);
        cbLiqAssociados.setSelectedIndex(1);
        cbSal.setSelectedIndex(1);
    }

    @Override
    public void loadData() {
        txtAlergias.setText(dadosDieteticos.getAlergias());
        txtAversoes.setText(dadosDieteticos.getAversao());
        txtAversoes.setText(dadosDieteticos.getIngestaoHidrica());
        txtIntorelancia.setText(dadosDieteticos.getIntolerancia());
        cbLiqAssociados.setSelectedItem(dadosDieteticos.getLiquidosAssociados());
        txtPreferencias.setText(dadosDieteticos.getPreferencia());
        txtIngestaoHidrica.setText(dadosDieteticos.getIngestaoHidrica());
        txtSuplementacao.setText(dadosDieteticos.getSuplemento());
        cbAcucar.setSelectedItem(dadosDieteticos.getRestricaoAcucar());
        cbSal.setSelectedItem(dadosDieteticos.getRestricaoSal());
    }
    
    private void preencherDados(){
        dadosDieteticos.setAlergias(txtAlergias.getText());
        dadosDieteticos.setAversao(txtAversoes.getText());
        dadosDieteticos.setIngestaoHidrica(txtAversoes.getText());
        dadosDieteticos.setIntolerancia(txtIntorelancia.getText());
        dadosDieteticos.setLiquidosAssociados((String) cbLiqAssociados.getSelectedItem());
        dadosDieteticos.setPreferencia(txtPreferencias.getText());
        dadosDieteticos.setRestricaoAcucar((String) cbAcucar.getSelectedItem());
        dadosDieteticos.setRestricaoSal((String) cbSal.getSelectedItem());
        dadosDieteticos.setSuplemento(txtSuplementacao.getText());
    }

    public void setDadosDieteticos(DadosDieteticos dadosDieteticos) {
        this.dadosDieteticos = dadosDieteticos;
    }
    
    
}
