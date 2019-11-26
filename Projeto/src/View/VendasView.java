/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.CadastroClienteController;
import Controller.VendaController;
import Controller.ProdutoController;
import Model.CadastroClienteModel;
import Model.ProdutoVO;
import Model.Venda;
import com.sun.xml.internal.bind.v2.runtime.JAXBContextImpl;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lucas.sbpaixao
 */
public class VendasView extends javax.swing.JFrame {

    /**
     * Creates new form Vendas
     */
    private List<ProdutoVO> produtos;
    private List<ProdutoVO> carrinho;
    private List<CadastroClienteModel> clientes;
    private int[][] quantidadesAtuais;

    public VendasView() {
        initComponents();
        setLocationRelativeTo(null);
        produtos = ProdutoController.list();
        clientes = CadastroClienteController.listar();
        carrinho = new ArrayList<>();
        quantidadesAtuais = new int[produtos.size()][2];
        populaMatriz();
        preencherCombo();
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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        lblValorToral = new javax.swing.JLabel();
        JBFinalizar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        JBAddCarrinho = new javax.swing.JButton();
        spinnerQtd = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        comboProduto = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnCliente = new javax.swing.JButton();
        btnProduto = new javax.swing.JButton();
        btnEstoque = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();
        btnVendas = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtCPF = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vendas");

        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("CPF do Cliente");

        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Quantidade");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Carrinho"));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Quantidade", "Valor"
            }
        ));
        jScrollPane1.setViewportView(tabela);

        jLabel6.setText("Valor Total: ");

        lblValorToral.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValorToral, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblValorToral))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        JBFinalizar.setForeground(new java.awt.Color(0, 0, 102));
        JBFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-finalizar-pedido-20.png"))); // NOI18N
        JBFinalizar.setText("Finalizar Compra");
        JBFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFinalizarActionPerformed(evt);
            }
        });

        jButton2.setForeground(new java.awt.Color(0, 0, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-cancelar-20.png"))); // NOI18N
        jButton2.setText("Cancelar Compra");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        JBAddCarrinho.setForeground(new java.awt.Color(0, 0, 102));
        JBAddCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-carrinho-de-compras-20.png"))); // NOI18N
        JBAddCarrinho.setText("Adicionar ao Carrinho");
        JBAddCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAddCarrinhoActionPerformed(evt);
            }
        });

        spinnerQtd.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Produto");

        comboProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Produto" }));

        jPanel2.setBackground(new java.awt.Color(26, 40, 80));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("JavaSports");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        btnCliente.setBackground(new java.awt.Color(26, 40, 80));
        btnCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-usuário-masculino-25 (2).png"))); // NOI18N
        btnCliente.setText("Cadastrar Cliente");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnProduto.setBackground(new java.awt.Color(26, 40, 80));
        btnProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-produto-25 (1).png"))); // NOI18N
        btnProduto.setText("Cadastrar Produto");
        btnProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutoActionPerformed(evt);
            }
        });

        btnEstoque.setBackground(new java.awt.Color(26, 40, 80));
        btnEstoque.setForeground(new java.awt.Color(255, 255, 255));
        btnEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-caixa-25 (1).png"))); // NOI18N
        btnEstoque.setText("Estoque");
        btnEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoqueActionPerformed(evt);
            }
        });

        btnRelatorio.setBackground(new java.awt.Color(26, 40, 80));
        btnRelatorio.setForeground(new java.awt.Color(255, 255, 255));
        btnRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-baixar-relatório-gráfico-25.png"))); // NOI18N
        btnRelatorio.setText("Relatório");
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });

        btnVendas.setBackground(new java.awt.Color(26, 40, 80));
        btnVendas.setForeground(new java.awt.Color(255, 255, 255));
        btnVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-vendas-totais-25.png"))); // NOI18N
        btnVendas.setText("Vendas");
        btnVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnVendas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnRelatorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addContainerGap(16, Short.MAX_VALUE))
            .addComponent(btnEstoque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-performance-de-vendas-24.png"))); // NOI18N
        jLabel5.setText("Vendas");

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(jSeparator2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 509, Short.MAX_VALUE)
                                .addComponent(JBFinalizar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(173, 173, 173)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(133, 133, 133)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(spinnerQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(JBAddCarrinho)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(JBAddCarrinho)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(JBFinalizar))
                .addGap(97, 97, 97))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBAddCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAddCarrinhoActionPerformed

        if (tabela.getRowCount() == 0) {
            if (txtCPF.getText().equals("   .   .   -  ")) {
                JOptionPane.showMessageDialog(null, "O Campo CPF Não Pode Ser Vazio", "Preenchimento Invalido", JOptionPane.ERROR_MESSAGE);
                return;
            }
            txtCPF.enable(false);
        }
        
        if(comboProduto.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Favor Selecionar um Produto", "Selecione um produto", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tabela.getModel();

        String id = String.valueOf(comboProduto.getSelectedItem()).substring(0, 1);
        ProdutoVO produto = new ProdutoVO("", 0, 0, 0,0);
        produto = acharProduto(Integer.parseInt(id));

        int quantidade = Integer.parseInt(String.valueOf(spinnerQtd.getValue()));

        int index = acharNaMatriz(Integer.parseInt(id));
        double valor = quantidade * produto.getPreco();
        if (validaQuantidade(index, quantidade)) {

            model.addRow(new String[]{String.valueOf(comboProduto.getSelectedItem()), String.valueOf(quantidade), String.valueOf(valor)});

            produto.setQuantidadeVendida(quantidade);
            carrinho.add(produto);
            
            quantidadesAtuais[index][1] -= quantidade; 
        } else {
            JOptionPane.showMessageDialog(null, "A Quantidade Informada não é Equivalente ao estoque. \nQuantidade em Estoque: " + quantidadesAtuais[index][1], "Erro de Quantidade", JOptionPane.ERROR_MESSAGE);
            return;
        }

        mudaValor(valor);

        comboProduto.setSelectedIndex(0);
        spinnerQtd.setValue(1);
    }//GEN-LAST:event_JBAddCarrinhoActionPerformed

    public void limpar() {
        comboProduto.setSelectedIndex(0);
        spinnerQtd.setValue(1);
    }
    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        CadastroClienteView cliente = new CadastroClienteView();
        cliente.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnClienteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtCPF.setText("");
        txtCPF.enable(true);
        comboProduto.setSelectedIndex(0);
        spinnerQtd.setValue(1);
        lblValorToral.setText("0");

        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        for (int i = tabela.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutoActionPerformed
        ProdutoView a = new ProdutoView();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnProdutoActionPerformed

    private void JBFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFinalizarActionPerformed
        Venda venda = new Venda();

        venda.setCarrinho(carrinho);
        venda.setData(new Date(System.currentTimeMillis()));
        venda.setValorTotal(Double.parseDouble(lblValorToral.getText()));
        String cpf = txtCPF.getText().replace(".", "").replace("-", "");
        CadastroClienteModel cliente = acharCliente(Long.parseLong(cpf));
        
        if (cliente != null) {
            venda.setCliente(cliente);
        } else {
            JOptionPane.showMessageDialog(null, "Não Existe Cliente Com Esse CPF", "Cliente Inexistente", JOptionPane.ERROR_MESSAGE);
            txtCPF.enable(true);
            return;
        }

        for (ProdutoVO produto : carrinho) {
            System.out.println(produto.getProduto());
        }

        VendaController.cadastrarVenda(venda);

        txtCPF.setText("");
        txtCPF.enable(true);
        comboProduto.setSelectedIndex(0);
        spinnerQtd.setValue(1);
        lblValorToral.setText("0");

        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        for (int i = tabela.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        JOptionPane.showMessageDialog(null, "Venda Registrada com Sucesso", "Sucesso na Operação", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_JBFinalizarActionPerformed

    private void btnEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoqueActionPerformed
        EstoqueView estoque = new EstoqueView();
        estoque.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnEstoqueActionPerformed

    private void btnVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendasActionPerformed
        VendasView vendas = new VendasView();
        vendas.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVendasActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        RelatorioView relatorio = new RelatorioView();
        relatorio.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        MenuView menu = new MenuView();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(VendasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendasView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAddCarrinho;
    private javax.swing.JButton JBFinalizar;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnEstoque;
    private javax.swing.JButton btnProduto;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnVendas;
    private javax.swing.JComboBox<String> comboProduto;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblValorToral;
    private javax.swing.JSpinner spinnerQtd;
    private javax.swing.JTable tabela;
    private javax.swing.JFormattedTextField txtCPF;
    // End of variables declaration//GEN-END:variables

    private void preencherCombo() {
        for (ProdutoVO produto : produtos) {
            comboProduto.addItem(produto.getId() + " - " + produto.getProduto());
        }

    }

    private ProdutoVO acharProduto(int id) {

        for (ProdutoVO produto : produtos) {
            char idProduto = (char) produto.getId();
            if (idProduto == id) {
                return produto;
            }
        }

        return null;
    }

    private CadastroClienteModel acharCliente(long cpf) {
        System.out.println(clientes.size());
        for (CadastroClienteModel cliente : clientes) {
            System.out.println(cliente.getCpf());
            if (cliente.getCpf() == cpf) {
                return cliente;
            }
        }

        return null;
    }

    private void mudaValor(double valor) {
        double valorTotal = valor + Double.parseDouble(lblValorToral.getText());
        lblValorToral.setText(String.valueOf(valorTotal));
    }

    private void populaMatriz() {
        int i = 0;
        for (ProdutoVO p : produtos) {
            quantidadesAtuais[i][0] = p.getId();
            quantidadesAtuais[i][1] = p.getQuantidade();
            i++;
        }
    }

    private int acharNaMatriz(int id) {
        for (int i = 0; i < quantidadesAtuais.length; i++) {
            if (quantidadesAtuais[i][0] == id) {
                return i;
            }
        }
        return -1;
    }

    private boolean validaQuantidade(int index, int quantidade) {
        if (quantidadesAtuais[index][1] < quantidade) {
            return false;
        }

        return true;
    }
}
