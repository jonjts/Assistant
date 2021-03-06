/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jonjts.assistant;

import br.com.jonjts.assistant.control.RestaurarControl;
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonas
 */
public class RestaurarTela extends BackupTela {

    private RestaurarControl restaurarControl;

    public RestaurarTela(Main main) {
        super(main);
        initComponents();
        setTitle("Restaurar Backup");
        restaurarControl = new RestaurarControl();
        getBtnBackup().setText("Restaurar");
    }

    @Override
    protected String getFolder(String title) throws HeadlessException {
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle(title);
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setVisible(true);
        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            return file.getPath();
        }
        return null;
    }

    @Override
    protected void doBackupVancado() throws HeadlessException {
        if (validAvancado()) {
            String folder = getFolder("Pasta do backup");
            if (folder != null) {
                try {
                    restaurarControl.doRestore("\"" + getLblMyysql().getText(), getTxtSenha().getText(), folder);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro\n" + ex.getMessage());
                    Logger.getLogger(BackupTela.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Verifique as informações");
        }
    }

    @Override
    protected void doBackupSimples() throws HeadlessException {
        String folder = getFolder("Pasta do backup");
        if (folder != null) {
            try {
                restaurarControl.doRestore(restaurarControl.pathMysql, "jonas", folder);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro\n" + ex.getMessage());
                Logger.getLogger(BackupTela.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
