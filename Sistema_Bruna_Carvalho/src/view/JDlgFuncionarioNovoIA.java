/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.FuncionarioBlf;
import bean.ProdutoBlf;
import dao.Funcionario_DAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Bruna Lopes Freitas
 */
public class JDlgFuncionarioNovoIA extends javax.swing.JDialog {
    
    Funcionario_DAO funcionario_DAO;
    FuncionarioControle funcionarioControle;
    
    MaskFormatter mascaraCpf;  
    MaskFormatter mascaraDataNascimento;
    MaskFormatter mascaraTelefoneResidencial;
    MaskFormatter mascaraCelular;
    MaskFormatter mascaraCep;

    /**
     * Creates new form JDlgFuncionarioNovoIA
     */
    public JDlgFuncionarioNovoIA(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        
        funcionarioControle = new FuncionarioControle();
        funcionario_DAO = new Funcionario_DAO();
        List lista = funcionario_DAO.listAll();
        funcionarioControle.setList(lista);
        
         try {
            
             mascaraCpf = new MaskFormatter("###.###.###-##");
             mascaraDataNascimento = new MaskFormatter("##/##/####");
             mascaraTelefoneResidencial = new MaskFormatter("(##) ####-#### ");
             mascaraCelular = new MaskFormatter("(##) ####-#### ");
             mascaraCep = new MaskFormatter("#####-###");
            
             
        } catch ( ParseException exc) {
           
        }
         
       jFmtCpf.setFormatterFactory( new DefaultFormatterFactory( mascaraCpf )); 
       jFmtDataNascimento.setFormatterFactory( new DefaultFormatterFactory(mascaraDataNascimento) );
       jFmtTelefoneResidencial.setFormatterFactory( new DefaultFormatterFactory(mascaraTelefoneResidencial));   
       jFmtCelular.setFormatterFactory(new DefaultFormatterFactory(mascaraCelular));
       jFmtCep.setFormatterFactory(new DefaultFormatterFactory(mascaraCep));
     
    }

    
    
    
    public FuncionarioBlf viewBean() {
        FuncionarioBlf funcionarioBlf = new FuncionarioBlf();
        int id = Integer.valueOf(jTxtCodigo.getText());
        
        funcionarioBlf.setIdFuncionarioBlf(id);
        funcionarioBlf.setNomeBlf(jTxtNome.getText());
        funcionarioBlf.setApelidoBlf(jTxtApelido.getText());
        
        funcionarioBlf.setSexoBlf(jCboSexo.getSelectedIndex());

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            funcionarioBlf.setDataNascimentoBlf(formato.parse(jFmtDataNascimento.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(JDlgUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        funcionarioBlf.setCpfBlf(jFmtCpf.getText());
        funcionarioBlf.setCelularBlf(jFmtCelular.getText());
        funcionarioBlf.setTelefoneResidencialBlf(jFmtTelefoneResidencial.getText());

        funcionarioBlf.setCepBlf(jFmtCep.getText());
        funcionarioBlf.setEnderecoBlf(jTxtEndereço.getText());
        funcionarioBlf.setBairroBlf(jTxtBairro.getText());
        funcionarioBlf.setCidadeBlf(jTxtCidade.getText());
        funcionarioBlf.setUfBlf(jTxtUf.getText());
        funcionarioBlf.setEmailBlf(jTxtEmail.getText());
   
        if (jCheckBox1.isSelected() == true) {
            funcionarioBlf.setAtivoBlf("S");
        } else {
            funcionarioBlf.setAtivoBlf("N");
        }
        return funcionarioBlf;
    }
      
       
        public void beanView( FuncionarioBlf funcionarioBlf) {
        String cad = String.valueOf(funcionarioBlf.getIdFuncionarioBlf());
        jTxtCodigo.setText(cad);        
        jTxtNome.setText(funcionarioBlf.getNomeBlf());
        jTxtApelido.setText(funcionarioBlf.getApelidoBlf());
        jCboSexo.setSelectedIndex(funcionarioBlf.getSexoBlf());
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        jFmtDataNascimento.setText( formato.format(funcionarioBlf.getDataNascimentoBlf()));
        
        jFmtCpf.setText(funcionarioBlf.getCpfBlf());
        jFmtCelular.setText(funcionarioBlf.getCelularBlf());
        jFmtTelefoneResidencial.setText(funcionarioBlf.getTelefoneResidencialBlf());
        
        jFmtCep.setText(funcionarioBlf.getCepBlf());
        jTxtEndereço.setText(funcionarioBlf.getEnderecoBlf());
        jTxtBairro.setText(funcionarioBlf.getBairroBlf());
        jTxtCidade.setText(funcionarioBlf.getCidadeBlf());
        jTxtUf.setText(funcionarioBlf.getUfBlf());
        jTxtEmail.setText(funcionarioBlf.getEmailBlf());
        
         if (funcionarioBlf.getAtivoBlf().equals("S") == true) {
            jCheckBox1.setSelected(true);
        } else {
            jCheckBox1.setSelected(false);
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

        jPanel1 = new javax.swing.JPanel();
        jBtnOK = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jTxtCodigo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jFmtTelefoneResidencial = new javax.swing.JFormattedTextField();
        jTxtNome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jCboSexo = new javax.swing.JComboBox<>();
        jFmtCep = new javax.swing.JFormattedTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jTxtEndereço = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTxtBairro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTxtCidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTxtUf = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTxtEmail = new javax.swing.JTextField();
        jTxtApelido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jFmtDataNascimento = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jFmtCpf = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jFmtCelular = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jBtnOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/confirmar.png"))); // NOI18N
        jBtnOK.setText("OK");
        jBtnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOKActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnOK);

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancela.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnCancelar);

        jLabel15.setText("Apelido");

        jLabel7.setText("Cep");

        jCboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Não-binário", "Prefiro não dizer" }));

        jCheckBox1.setText("Ativo");

        jLabel8.setText("Endereço");

        jLabel9.setText("Bairro");

        jLabel10.setText("Cidade");

        jLabel11.setText("Uf");

        jLabel12.setText("Email");

        jLabel1.setText("Nome");

        jLabel2.setText("Sexo");

        jLabel3.setText("Data de Nascimento");

        jLabel4.setText("Cpf");

        jLabel5.setText("Celular");

        jLabel14.setText("Código");

        jLabel6.setText("Telefone Residencial");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jFmtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jFmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jCboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jFmtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jFmtTelefoneResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jFmtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jTxtEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(jTxtApelido, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtUf, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTxtApelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFmtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jFmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jFmtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jFmtTelefoneResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jFmtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(jTxtEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTxtUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addGap(70, 70, 70)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOKActionPerformed
        // TODO add your handling code here:
        FuncionarioBlf funcionarioBlf = viewBean();
         if (getTitle().toUpperCase().substring(0, 1).equals("I")) {
            funcionario_DAO.insert(funcionarioBlf);
        } else {            
            funcionario_DAO.update(funcionarioBlf);
             List lista = funcionario_DAO.listAll();
             funcionarioControle.setList(lista);
            
        }
         
        
         
        setVisible(false);
        
    }//GEN-LAST:event_jBtnOKActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgFuncionarioNovoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgFuncionarioNovoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgFuncionarioNovoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgFuncionarioNovoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgFuncionarioNovoIA dialog = new JDlgFuncionarioNovoIA(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnOK;
    private javax.swing.JComboBox<String> jCboSexo;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JFormattedTextField jFmtCelular;
    private javax.swing.JFormattedTextField jFmtCep;
    private javax.swing.JFormattedTextField jFmtCpf;
    private javax.swing.JFormattedTextField jFmtDataNascimento;
    private javax.swing.JFormattedTextField jFmtTelefoneResidencial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxtApelido;
    private javax.swing.JTextField jTxtBairro;
    private javax.swing.JTextField jTxtCidade;
    private javax.swing.JTextField jTxtCodigo;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtEndereço;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtUf;
    // End of variables declaration//GEN-END:variables
}
