
package Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.Timer;

import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class Controller {
    LinkedList listaServicos = new LinkedList();
    Timer timer;
    String caminhoLog, caminhoAutomacaoIniciar, caminhoAutomacaoParar;
    String nomePosto;
    
    
    public Controller() throws IOException{
        lerArquivoIndex();
        verificar();
        
    }
    
    
    //Método para ficar rodando como uma thread para verificar se o log
    //tem alguma mensagem de erro ou se o serviço de automação está parado
    private void verificar(){
        new Thread(){
            public void run(){
                timer = new Timer(20000, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            lerArquivoIndex();
                            iniciarServico("Petros - Automação de Bombas CompanyTec - Frente de Caixa", caminhoAutomacaoIniciar);
                            String txt = lerLog(caminhoLog);
                            enviarEmail(txt);
                        } catch (IOException ex) {
                            System.out.println("Erro");
                        }
                    }
                });
                timer.start();
            }
        }.start();
    }
    
    //Método para buscar os serviços do windows
    private void buscarServicos() throws IOException{
        String os = System.getProperty("os.name").toLowerCase();
        if (os.startsWith("windows")){
            Process p = Runtime.getRuntime().exec("net start");
            BufferedReader bf = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String text;
            
            while ((text=bf.readLine()) != null){
                System.out.println(text.trim());
                if ( ( (text).trim() ).equals("Agendador de Tarefas")){
                    listaServicos.add( text.trim() );
                }  
            }
            bf.close();
        }
        else{
            
        }
    }
    //Método para parar um serviço
    public void pararServico(String nome, String caminho) throws InterruptedException, IOException{
        if (nome.equals("Petros - Automação de Bombas CompanyTec - Frente de Caixa")){
            Process exec = Runtime.getRuntime().exec("cmd.exe /c start "+caminho);
        }else{
            
        }
    }
    
    //Método para iniciar um serviço    
    public void iniciarServico(String nome, String caminho) throws IOException{
        if (nome.equals("Petros - Automação de Bombas CompanyTec - Frente de Caixa")){
            Process exec = Runtime.getRuntime().exec("cmd.exe /c start "+caminho);
        }else{
            
        }
    }
    
    //Método para reiniciar um serviço    
    public void reiniciarServico(String nome, String caminho) throws IOException{
        if (nome.equals("Petros - Automação de Bombas CompanyTec - Frente de Caixa")){
            System.out.println(caminho);
            Process exec = Runtime.getRuntime().exec("cmd.exe /c start "+caminho);
        }else{
            
        }
    }
    
    //Método para ler o arquivo log e verificar se contém erros
    public String lerLog(String caminho) throws FileNotFoundException, IOException{
        FileReader arq = new FileReader(caminho);
        BufferedReader bf =  new BufferedReader(arq);
        String text;
        int count = 3;
        while ( (text = bf.readLine()) != null ){
            if (text.contains("erro")){
                while(count>=0){
                    text += "\n"+ bf.readLine();
                    count--;
                }
                System.out.println(text);
                return text;
            }
        }
        return null;
    }
    
    //Método para ler arquivo que que contém o caminho do outros arquivos e o nome do posto
    public Iterator lerArquivoIndex() throws FileNotFoundException, IOException{
        
        LinkedList l = new LinkedList();
        File f = new File("C:\\CS-P7GO\\Index.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String text;
        
        caminhoLog = (text = br.readLine());
        l.add(caminhoLog);
        caminhoAutomacaoIniciar = (text = br.readLine());
        l.add(caminhoAutomacaoIniciar);
        caminhoAutomacaoParar = (text = br.readLine());
        l.add(caminhoAutomacaoParar);
        nomePosto = (text = br.readLine());
        l.add(nomePosto);
        
        while ( (text = br.readLine()) != null){
            l.add(text);
        }
        return l.iterator();        
    }
    
    //Método para escrever no arquivo que que contém o caminho do outros arquivos
    public void escreverArquivoIndex(Iterator i) throws IOException{
        File f = new File("C:\\CS-P7GO\\Index.txt");
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        String txt;
        while (i.hasNext()){
            txt = (String)i.next();
            bw.append(txt+"\n");
        }
        bw.append(nomePosto+"\n");
        
        bw.close();
            
        
    }
    
    //Método para retonar a lista de serviços
    public Iterator retornaListaServicos(){
        return listaServicos.iterator();
    }
    
    //método para enviar e-mail
    public void enviarEmail(String mensagem){
        Properties props = new Properties();
        /** Parâmetros de conexão com servidor Gmail */
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        

        Session session = Session.getDefaultInstance(props,
                    new javax.mail.Authenticator() {
                        @Override
                         protected PasswordAuthentication getPasswordAuthentication() 
                         {
                               return new PasswordAuthentication("csp7go@gmail.com", "csp7go2018");
                         }
                    });

        /** Ativa Debug para sessão */
        session.setDebug(true);

        try {

              Message message = new MimeMessage(session);
              message.setFrom(new InternetAddress("csp7go@gmail.com")); //Remetente

              Address[] toUser = InternetAddress //Destinatário(s)
                         .parse("oliveiradaniel11@hotmail.com");  

              message.setRecipients(Message.RecipientType.TO, toUser);
              message.setSubject("Posto: "+nomePosto);//Assunto
              message.setText(mensagem);
              /**Método para enviar a mensagem criada*/
              Transport.send(message);


         } catch (MessagingException e) {
              throw new RuntimeException(e);
        }
    }
    
}
