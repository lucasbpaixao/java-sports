package View;

import Controller.ProdutoController;
import Dao.ProdutoDao;
import Model.ProdutoVO;
import Validation.ValidationProduto;
import View.CadastroClienteView;
import View.EstoqueView;
import View.RelatorioView;
import View.VendasView;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import javax.swing.text.StyledEditorKit;

/**
 *
 * @author vinicius.pleopoldino
 * @see Dao.ProdutoDao
 * @see Model.ProdutoVO
 * @see Validation.ValidationProduto;
 */
public class ProdutoView extends javax.swing.JFrame {

    /**
     * Creates new form ProdutoView
     */
    public ProdutoView() {
        initComponents();
        setLocationRelativeTo(null);
        TFpreco.setDocument(new validacaopreco());

        List<ProdutoVO> lista = ProdutoController.list();
        DefaultTableModel model = (DefaultTableModel) Tabela.getModel();

        for (int i = Tabela.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        for (ProdutoVO List : lista) {
            model.addRow(new String[]{String.valueOf(List.getId()), List.getProduto(), String.valueOf(List.getPreco()), String.valueOf(List.getQuantidade())});
        }
    }

    /**
     * 
     * 
     * 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        JBpesquisar = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        JBalterar1 = new javax.swing.JButton();
        TFproduto = new javax.swing.JTextField();
        Deletar = new javax.swing.JButton();
        JBadicionar = new javax.swing.JButton();
        TFquantidade = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JBalterar = new javax.swing.JButton();
        TFpreco = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtos Cadrastrados"));

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item", "Preço", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabela);

        JBpesquisar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JBpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBpesquisarActionPerformed(evt);
            }
        });
        JBpesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JBpesquisarKeyReleased(evt);
            }
        });

        jButton3.setForeground(new java.awt.Color(0, 0, 102));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-pesquisar-25.png"))); // NOI18N
        jButton3.setText(" Pesquisar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        JBalterar1.setForeground(new java.awt.Color(0, 0, 102));
        JBalterar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-balde-de-tinta-25.png"))); // NOI18N
        JBalterar1.setText("Preencher");
        JBalterar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBalterar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(JBalterar1)
                        .addGap(18, 18, 18)
                        .addComponent(JBpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JBalterar1)
                            .addComponent(JBpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        TFproduto.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TFproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFprodutoActionPerformed(evt);
            }
        });

        Deletar.setForeground(new java.awt.Color(0, 0, 102));
        Deletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-excluir-25.png"))); // NOI18N
        Deletar.setText(" Deletar");
        Deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletarActionPerformed(evt);
            }
        });

        JBadicionar.setForeground(new java.awt.Color(0, 0, 102));
        JBadicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-adicionar-25.png"))); // NOI18N
        JBadicionar.setText("Adicionar");
        JBadicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBadicionarActionPerformed(evt);
            }
        });

        TFquantidade.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel1.setText("Produto");

        jLabel2.setText("Preço");

        jLabel3.setText("Quantidade");

        JBalterar.setForeground(new java.awt.Color(0, 0, 102));
        JBalterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-alterar-25.png"))); // NOI18N
        JBalterar.setText(" Alterar");
        JBalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBalterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 456, Short.MAX_VALUE)
                        .addComponent(Deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TFproduto, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(TFpreco, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TFquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(JBadicionar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JBalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3))))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBadicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFpreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(26, 40, 80));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("JavaSports");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jButton6.setBackground(new java.awt.Color(26, 40, 80));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-usuário-masculino-25 (2).png"))); // NOI18N
        jButton6.setText("Cadastrar Cliente");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(26, 40, 80));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-produto-25 (1).png"))); // NOI18N
        jButton7.setText("Cadastrar Produto");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(26, 40, 80));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-caixa-25 (1).png"))); // NOI18N
        jButton8.setText("Estoque");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(26, 40, 80));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-baixar-relatório-gráfico-25.png"))); // NOI18N
        jButton9.setText("Relatório");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(26, 40, 80));
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-vendas-totais-25.png"))); // NOI18N
        jButton10.setText("Vendas");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addContainerGap(16, Short.MAX_VALUE))
            .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 102));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-produto-25 (1)_1.png"))); // NOI18N
        jLabel17.setText("Produtos");

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(274, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBpesquisarActionPerformed

    }//GEN-LAST:event_JBpesquisarActionPerformed

    private void TFprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFprodutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFprodutoActionPerformed
    /**
     * Metodo de adicionar
     * @throws Se o campo de produto não for preenchido corretamente
     * @throws Se o campo de preco não for preenchido corretamente
     * @throws Se o campo de quaantidade não for preenchido corretamente
     */
    private void JBadicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBadicionarActionPerformed
        ValidationProduto produtoValidation = new ValidationProduto();

        if (produtoValidation.validarCampos(TFproduto, TFpreco, TFquantidade)) {

            String produto = TFproduto.getText();
            String preco = TFpreco.getText();
            String quantidade = String.valueOf(TFquantidade.getValue());

            ProdutoVO c = new ProdutoVO(produto, Double.parseDouble(preco), Integer.parseInt(quantidade), 0, 0);

            ProdutoController.cadastroDeProdutos(c);

            List<ProdutoVO> lista = ProdutoController.list();
            DefaultTableModel model = (DefaultTableModel) Tabela.getModel();

            for (int i = Tabela.getRowCount() - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            for (ProdutoVO telinh : lista) {
                model.addRow(new String[]{String.valueOf(telinh.getId()), telinh.getProduto(), String.valueOf(telinh.getPreco()), String.valueOf(telinh.getQuantidade())});
            }

            JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso");
            TFproduto.setText("");
            TFpreco.setText("");
            TFquantidade.setValue(0);
        }
    }//GEN-LAST:event_JBadicionarActionPerformed
  /**
     * Metodo de excluir
     * @throws Deve selecionar a linha para fazer a exclusao 
     */ 
    private void DeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletarActionPerformed
        int id = Integer.parseInt(Tabela.getModel().getValueAt(Tabela.getSelectedRow(), 0).toString());
        JOptionPane.showMessageDialog(this, ProdutoController.excluir(id));
        //ProdutoController.excluir(Tabela.getSelectedRow());

        DefaultTableModel model = (DefaultTableModel) Tabela.getModel();

        model.removeRow(Tabela.getSelectedRow());

    }//GEN-LAST:event_DeletarActionPerformed

  
    
    private void JBalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBalterarActionPerformed
        alterarProduto();

    }//GEN-LAST:event_JBalterarActionPerformed
    /**
     * @method para preencher dados na tabela
     */
    private void JBalterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBalterar1ActionPerformed

        preencherCampos();

    }//GEN-LAST:event_JBalterar1ActionPerformed
    
    /**
     * @method para pesquisar dados na tabela
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        listar();

    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        CadastroClienteView a = new CadastroClienteView();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        ProdutoView a = new ProdutoView();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        EstoqueView a = new EstoqueView();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        RelatorioView a = new RelatorioView();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        VendasView a = new VendasView();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void JBpesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JBpesquisarKeyReleased
        pesquisarNomeProduto(JBpesquisar.getText());

    }//GEN-LAST:event_JBpesquisarKeyReleased

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
       MenuView menu = new MenuView();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel16MouseClicked
    
    /**
     * Método para preencher campos na tabela
     */
    
    private void preencherCampos() {
        TFproduto.setText(Tabela.getModel().getValueAt(Tabela.getSelectedRow(), 1).toString());
        
        String valor = Tabela.getModel().getValueAt(Tabela.getSelectedRow(), 2).toString();

        TFpreco.setText(valor);
        String quantidade = String.valueOf(Tabela.getValueAt(Tabela.getSelectedRow(), 3));
        TFquantidade.setValue(Integer.parseInt(quantidade));

    }
    
    /**
     * Método para preencher campos na tabela
     * @param nome
     */
    private void pesquisarNomeProduto(String nome) {
        DefaultTableModel dados = (DefaultTableModel) Tabela.getModel();
        ProdutoController controller = new ProdutoController();

        List<ProdutoVO> lista = controller.pesquisarNomeProduto(nome);
        //Apaga os dados na tabela
        for (int i = Tabela.getRowCount() - 1; i >= 0; i--) {
            dados.removeRow(i);
        }
        //Lista os dados e adiciona na tabela
        for (ProdutoVO produtoVO : lista) {

            String codigo = Integer.toString(produtoVO.getId());
            String preco = Double.toString(produtoVO.getPreco());
            String quantidade = Double.toString(produtoVO.getQuantidade());

            dados.addRow(
                    new String[]{codigo, produtoVO.getProduto(), preco, quantidade});
        }
    }
    
    /**
     * Método para lstar os dados na tabela
     */
    private void listar() {
        
        //Carrega a tabela
        DefaultTableModel model = (DefaultTableModel) Tabela.getModel();
        //Caso os campos de pesquisa estejam vazios
        if (!JBpesquisar.getText().equals("") && JBpesquisar.getText() != null) {
            List<ProdutoVO> Pesquisinha = ProdutoController.pesquisar(JBpesquisar.getText());
            //Apaga os dados na tabela
            for (int i = Tabela.getRowCount() - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            //Lista e preenche os dados na tabela
            for (ProdutoVO produtoVO : Pesquisinha) {
                model.addRow(new String[]{String.valueOf(produtoVO.getId()), produtoVO.getProduto(), String.valueOf(produtoVO.getPreco()), String.valueOf(produtoVO.getQuantidade())});
            }
        //Caso eles não estejam vazios
        } else {
            List<ProdutoVO> lista = ProdutoController.list();
            
            //Apaga os dados na tabela
            for (int i = Tabela.getRowCount() - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            //Lista e preenche os dados na tabela
            for (ProdutoVO telinh : lista) {
                model.addRow(new String[]{String.valueOf(telinh.getId()), telinh.getProduto(), String.valueOf(telinh.getPreco()), String.valueOf(telinh.getQuantidade())});
            }
        }

    }
    
    /**
     * Método para alterar o produto na tabela
     */
    private void alterarProduto() {
        int id = Integer.parseInt(Tabela.getModel().getValueAt(Tabela.getSelectedRow(), 0).toString());
        String nomeProduto = TFproduto.getText();
        String preco = TFpreco.getText();
        String quantidade = String.valueOf(TFquantidade.getValue());
        
        ProdutoVO p = new ProdutoVO(nomeProduto, Double.parseDouble(preco), Integer.parseInt(quantidade), 0, 0);
        
        ProdutoController controller = new ProdutoController();
        controller.alterarProduto(p, id);
        //Seta a tabela na variável dados
        DefaultTableModel dados = (DefaultTableModel) Tabela.getModel();

        List<ProdutoVO> lista = ProdutoController.list();
        for (int i = Tabela.getRowCount() - 1; i >= 0; i--) {
            dados.removeRow(i);
        }
        for (ProdutoVO produtoVO : lista) {

            dados.addRow(new String[]{String.valueOf(produtoVO.getId()), produtoVO.getProduto(), String.valueOf(produtoVO.getPreco()), String.valueOf(produtoVO.getQuantidade())});
        }

        TFproduto.setText("");
        TFpreco.setText("");
        TFquantidade.setValue(0);
    }
      /**
    * Metodo de alterar
    * @throws produto precisa estar selecionado 
    */
    


    public class validacaopreco extends PlainDocument {

        @Override
        public void insertString(int i, String string, AttributeSet as) throws BadLocationException {
            super.insertString(i, string.replaceAll("[^0-9]", "."), as);
        }

    }

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
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deletar;
    private javax.swing.JButton JBadicionar;
    private javax.swing.JButton JBalterar;
    private javax.swing.JButton JBalterar1;
    private javax.swing.JTextField JBpesquisar;
    private javax.swing.JTextField TFpreco;
    private javax.swing.JTextField TFproduto;
    private javax.swing.JSpinner TFquantidade;
    private javax.swing.JTable Tabela;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
