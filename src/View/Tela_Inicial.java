/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controller;
import java.awt.AWTException;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.Timer;


public class Tela_Inicial extends javax.swing.JFrame {
    Controller controller;
    String senha = "masterp7";

    private String nomeServico;
    Timer timer;
    public Tela_Inicial() {
        
        initComponents();
        new Menu().teste();
        try {
            controller = new Controller();
            controller.lerArquivoIndex();
            addCampoTexto();
        } catch (IOException ex) {
            Logger.getLogger(Tela_Inicial.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
   

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaConfiguracao = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaServicos = new javax.swing.JList<>();
        BotaoReiniciar = new javax.swing.JButton();
        BotaoParar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        labelSeguranca = new javax.swing.JLabel();
        caminhoAutomacaoParar = new javax.swing.JTextField();
        labelCaminhoArquivos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        caminhoSincronizacaoParar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        caminhoAutomacaoIniciar = new javax.swing.JTextField();
        caminhoSincronizacaoIniciar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        labelNovaSenha = new javax.swing.JLabel();
        campoTrocaSenha = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        caminhoLog = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        botaoSalvar = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuServicos = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        menuConfiguracao = new javax.swing.JMenu();

        telaConfiguracao.setTitle("Configurações");
        telaConfiguracao.setAlignmentX(24.0F);
        telaConfiguracao.setVisible(true);

        javax.swing.GroupLayout telaConfiguracaoLayout = new javax.swing.GroupLayout(telaConfiguracao.getContentPane());
        telaConfiguracao.getContentPane().setLayout(telaConfiguracaoLayout);
        telaConfiguracaoLayout.setHorizontalGroup(
            telaConfiguracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 282, Short.MAX_VALUE)
        );
        telaConfiguracaoLayout.setVerticalGroup(
            telaConfiguracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 301, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Controlador de Serviços - P7GO");
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        setMaximumSize(new java.awt.Dimension(422, 362));
        setMinimumSize(new java.awt.Dimension(422, 362));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        listaServicos.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        listaServicos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Petros - Automação de Bombas CompanyTec - Frente de Caixa", "Petros - Sincronizador CompanyTec - Frente de Caixa" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaServicos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaServicos.setToolTipText("");
        listaServicos.setSelectionBackground(new java.awt.Color(51, 102, 255));
        jScrollPane1.setViewportView(listaServicos);

        BotaoReiniciar.setBackground(new java.awt.Color(255, 255, 153));
        BotaoReiniciar.setText("Reiniciar");
        BotaoReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoReiniciarActionPerformed(evt);
            }
        });

        BotaoParar.setBackground(new java.awt.Color(255, 255, 153));
        BotaoParar.setText("Parar");
        BotaoParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPararActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotaoReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(BotaoParar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(BotaoParar, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        labelSeguranca.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        labelSeguranca.setText("Segurança:");

        caminhoAutomacaoParar.setText("C:\\p7\\Parar.exe");

        labelCaminhoArquivos.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        labelCaminhoArquivos.setText("Caminho dos arquivos:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setText("Automação:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("Sincronização:");

        caminhoSincronizacaoParar.setText("C:\\p7\\Parar.exe");

        jLabel3.setText("Iniciar:");

        caminhoAutomacaoIniciar.setText("C:\\p7\\Iniciar.exe");
        caminhoAutomacaoIniciar.setMaximumSize(new java.awt.Dimension(6, 20));

        caminhoSincronizacaoIniciar.setText("C:\\p7\\Iniciar.exe");

        jLabel4.setText("Iniciar:");

        labelNovaSenha.setText("Nova senha:");

        campoTrocaSenha.setText("jPasswordField1");

        jLabel5.setText("Parar:");

        jLabel6.setText("Parar:");

        caminhoLog.setText("jhfjfhjfhkj");
        caminhoLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caminhoLogActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setText("Log:");

        botaoSalvar.setBackground(new java.awt.Color(255, 255, 204));
        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(labelCaminhoArquivos))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTrocaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelSeguranca)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(caminhoAutomacaoIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(caminhoAutomacaoParar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(caminhoLog, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botaoSalvar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(caminhoSincronizacaoIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(caminhoSincronizacaoParar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSeguranca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNovaSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoTrocaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelCaminhoArquivos)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caminhoLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(caminhoAutomacaoIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(caminhoAutomacaoParar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caminhoSincronizacaoParar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caminhoSincronizacaoIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoSalvar)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(null);

        menuServicos.setText("Serviços");
        menuServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuServicosActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuServicos);

        jMenu1.setText("Sobre");
        jMenuBar1.add(jMenu1);

        menuConfiguracao.setText("Configurações");
        menuConfiguracao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuConfiguracaoMouseClicked(evt);
            }
        });
        menuConfiguracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConfiguracaoActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuConfiguracao);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPararActionPerformed
        String nome = listaServicos.getSelectedValue();
        String caminhoAutomacaoParar = this.caminhoAutomacaoParar.getText();
        if (nome != null){
            try {        
                controller.pararServico(nome, caminhoAutomacaoParar);
            } catch (InterruptedException | IOException ex) {
                Logger.getLogger(Tela_Inicial.class.getName()).log(Level.SEVERE, null, ex);
            }    
        }else{
            JOptionPane.showMessageDialog(null, "Escolha o serviço que deseja parar!");
        }
        
    }//GEN-LAST:event_BotaoPararActionPerformed

    //Action do botão para iniciar um serviço
    private void BotaoReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoReiniciarActionPerformed
        String nome = listaServicos.getSelectedValue();
        String caminhoAutomacaoIniciar = this.caminhoAutomacaoIniciar.getText();
        if (nome != null){
            try {
                controller.reiniciarServico(nome, caminhoAutomacaoIniciar);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao iniciar o processo");
            }    
        }else{
            JOptionPane.showMessageDialog(null, "Escolha o serviço que deseja reiniciar!");
        }
        
    }//GEN-LAST:event_BotaoReiniciarActionPerformed

    //Método para solicitar a senha
    private boolean solicitaSenha(){
        JPasswordField jpf = new JPasswordField();
        //Exibir a janela para o usuario
        JOptionPane.showConfirmDialog(null,
        new Object[]{"Digite a senha:",jpf}, "ATENÇÃO!!!",
        JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
        String senha = new String(jpf.getPassword());
        if(senha!=null){
            if (senha.equals(this.senha)){
                return true;
            }
        }    
        return false;
    }
    
    //Método para adicionar o caminho dos arquivos aos campos de text
    private void addCampoTexto(){
        try {
            Iterator i = controller.lerArquivoIndex();
            if(i != null){
                caminhoLog.setText((String)i.next());
                caminhoAutomacaoIniciar.setText((String)i.next());
                caminhoAutomacaoParar.setText((String)i.next());
            }
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler Aquivo Index.txt");
        }
        
    }
    
    
    
    private void menuServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuServicosActionPerformed
       
    }//GEN-LAST:event_menuServicosActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        LinkedList l = new LinkedList();
        l.add(caminhoLog.getText());
        l.add(caminhoAutomacaoIniciar.getText());
        l.add(caminhoAutomacaoParar.getText());
        System.out.println(l.toString());
        try {
            controller.escreverArquivoIndex(l.iterator());
        } catch (IOException ex) {
            Logger.getLogger(Tela_Inicial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void menuConfiguracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConfiguracaoActionPerformed
       
    }//GEN-LAST:event_menuConfiguracaoActionPerformed

    private void menuConfiguracaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuConfiguracaoMouseClicked
        
    }//GEN-LAST:event_menuConfiguracaoMouseClicked

    private void caminhoLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caminhoLogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caminhoLogActionPerformed
    
  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              new Tela_Inicial().setVisible(false);
              
            }
        });
        
    }
    
    //Classe privada para colocar o icone do p7go ao lado do relógio 
    private class Menu{
        
        
        private void teste(){
            
            Runnable runner = new Runnable() {
                boolean estado = false; //Váriável que informa o estado da tela: Visível ou invisível
                
                //Método resposável por fazer o programa aparecer ao lado do relógio
                public void run() {
                    if (SystemTray.isSupported()) {
                        SystemTray tray = SystemTray.getSystemTray();
                        Image image = Toolkit.getDefaultToolkit().getImage("C:\\CS-P7GO\\p7go.jpg");
                        PopupMenu popup = new PopupMenu();
                        MenuItem item = new MenuItem("Abrir CS-P7GO");
                        MenuItem item2 = new MenuItem("Encerrar CS-P7GO");
                        popup.add(item);
                        popup.add(item2);
                        
                        //Action do abrir e minimizar o CS_P7GO
                        item.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent ae) {
                                if(estado){
                                    setExtendedState(JFrame.ICONIFIED);
                                    estado = false;
                                    setVisible(false);
                                    popup.getItem(0).setLabel("Abrir CS-P7GO");
                                }else if(solicitaSenha()){
                                    setExtendedState(JFrame.NORMAL);
                                    estado = true;
                                    setVisible(true);
                                    popup.getItem(0).setLabel("Minimizar CS-P7GO");
                                }
                            }
                        });
                        
                        
                        //Action do encerrar CS-P7GO
                        item2.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent ae) {
                                if(solicitaSenha()){
                                    System.exit(0);
                                }
                            }
                        });
                           
                        
                        
                        TrayIcon trayIcon = new TrayIcon(image, "Acessar CS-P7GO", popup);
                        trayIcon.setImageAutoSize(true); 
                        try {
                            tray.add(trayIcon);
                        } catch (AWTException e) {
                            System.err.println("Não pode adicionar a tray");
                        }
                    } else {
                        System.err.println("Tray indisponível");
                    }
                }
            };
            EventQueue.invokeLater(runner);
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoParar;
    private javax.swing.JButton BotaoReiniciar;
    private javax.swing.JToggleButton botaoSalvar;
    private javax.swing.JTextField caminhoAutomacaoIniciar;
    private javax.swing.JTextField caminhoAutomacaoParar;
    private javax.swing.JTextField caminhoLog;
    private javax.swing.JTextField caminhoSincronizacaoIniciar;
    private javax.swing.JTextField caminhoSincronizacaoParar;
    private javax.swing.JPasswordField campoTrocaSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCaminhoArquivos;
    private javax.swing.JLabel labelNovaSenha;
    private javax.swing.JLabel labelSeguranca;
    private javax.swing.JList<String> listaServicos;
    private javax.swing.JMenu menuConfiguracao;
    private javax.swing.JMenu menuServicos;
    private javax.swing.JInternalFrame telaConfiguracao;
    // End of variables declaration//GEN-END:variables


}
