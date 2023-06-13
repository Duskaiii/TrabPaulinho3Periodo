package Main;

//Gabriel Heidrich RA: 00232714
       //Elias Gasperin RA: 00236544  

import ContaBancaria.ContaBancaria;
import javax.swing.JOptionPane;

public class Main extends ContaBancaria{

    public static void main(String[] args){
        
        double calculoSaldos = 0;
        
        int tamanho;
        tamanho = Integer.parseInt(JOptionPane.showInputDialog("Quantas contas deseja informar? "));

        ContaBancaria[]vetor = new ContaBancaria[tamanho];
        
        for(int i = 0; i < vetor.length; i++){
            
            
            ContaBancaria c = new ContaBancaria();
            
            c.setConta(Integer.parseInt(JOptionPane.showInputDialog("Informe o número da conta: ")));
            c.setNome(JOptionPane.showInputDialog("Informe o nome do Titular da Conta: "));
            c.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Informe o Saldo da conta: ")));
            vetor[i] = c;
            
            c.calcularTotal();
            
        }

        //Ordenação
         int chave, j;

        for (int i = 1; i < vetor.length; i++) {
            ContaBancaria conta = vetor[i];
            chave = conta.getConta();
            
            for (j = i - 1;(j >= 0 && vetor[j].getConta() > chave);j--) {
                vetor[j + 1] = vetor[j];
            }
            vetor[j + 1] = conta;
        }
        
        
        Integer option = 100;
        
        
       //Gabriel Heidrich RA: 00232714
       //Elias Gasperin RA: 00236544        
        
        while(option != 0){
            
            String input = JOptionPane.showInputDialog("Gabriel Heidrich RA: 00232714\nElias Gasperin RA: 00236544\n============Painel============\n 1. Depósito\n-------------\n"
                    + " 2. Saque\n-------------\n3. Visualizar a soma total das contas\n-------------\n4. Visualizar contas com saldo negativo\n============\n 0. Sair\n ============Painel============");
            
            option = Integer.parseInt(input);
            
            
            //Deposito
            if(option == 1){
                Integer option2 = Integer.parseInt(JOptionPane.showInputDialog("Selecione o memetodo de Depósito:"
                        + " \n 1. Por nome da conta\n 2. Por número da conta\n "));
                
            if(option2 == 1){    
                    String psNome = JOptionPane.showInputDialog("Informe o nome da conta: ");

                    
                
                
                    //Deposito por Nome da Conta
                    for(int i = 0; i < vetor.length; i++){
                        ContaBancaria c = vetor[i];
                        if( c.getNome().equals(psNome)){
                            
                            String dep2 = JOptionPane.showInputDialog("Informe o valor a "
                            + "ser depositado: ");
                            
                            c.setMovBancario(Double.parseDouble(dep2));
                            double total = c.getSaldo() + c.getMovBancario();

                           JOptionPane.showMessageDialog(null, "Conta: "+c.getConta()+" - "+c.getNome()+"\nValor "
                                    + "Depositado: R$"+c.getMovBancario());
                            
                           c.calcularTotal();
                           
                        }
                    }
                    
                    //Deposito pelo Número da Conta
                }else if(option2 == 2){
                    String psCont = JOptionPane.showInputDialog("Informe o número da conta: ");
                    
                    Integer psCont2 = Integer.parseInt(psCont);

                    
                
                
                    //Deposito por Nome da Conta
                    for(int i = 0; i < vetor.length; i++){
                        ContaBancaria c = vetor[i];
                        
                        if( psCont2 == vetor[i].getConta()){
                            
                            String dep2 = JOptionPane.showInputDialog("Informe o valor a "
                            + "ser depositado: ");
                            
                            
                            c.setMovBancario(Double.parseDouble(dep2));

                            double total = c.getSaldo() + c.getMovBancario();
                            
                            JOptionPane.showMessageDialog(null, "Conta: "+c.getConta()+" - "+c.getNome()+"\nValor "
                                    + "Depositado: R$"+c.getMovBancario());
                            
                            c.calcularTotal();
                        }
                    }  
                }
            
            
            //Gabriel Heidrich RA: 00232714
       //Elias Gasperin RA: 00236544  
            
            
            //METODO DE SAQUE   
            }else if(option == 2){
                Integer option2 = Integer.parseInt(JOptionPane.showInputDialog("Selecione o memtodo de Saque:"
                        + " \n 1. Por nome da conta\n 2. Por número da conta"));                
            if(option2 == 1){                                    
                    String psNome = JOptionPane.showInputDialog("Informe o nome da conta: ");                
                    //Saque por Nome da Conta
                    
                    double valorSaq = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor de saque? "));
                        
                    for(int i = 0; i < vetor.length; i++){
                        ContaBancaria c = vetor[i];
                        
                        if(vetor[i].getNome().equals(psNome)){
                            
                            vetor[i].setMovBancario(valorSaq * -1);

                            JOptionPane.showMessageDialog(null, "Conta: "+c.getConta()+" - "+c.getNome()+"\nValor "
                                    + "Retirado: R$"+c.getMovBancario());                            
                        }
                        c.calcularTotal();
                    }
                    
                    //Saque pelo Número da Conta
                }else if(option2 == 2){
                    String psCont = JOptionPane.showInputDialog("Informe o número da conta: ");

                    Integer psCont2 = Integer.parseInt(psCont);
                    
                    double valorSaq = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor de saque? "));
                    
                    
                    for(int i = 0; i < vetor.length; i++){
                        ContaBancaria c = vetor[i];
                        
                        if(vetor[i].getConta() == psCont2){
                            
                            vetor[i].setMovBancario(valorSaq * -1);
                            
                    
                            JOptionPane.showMessageDialog(null, "Conta: "+c.getConta()+" - "+c.getNome()+"\nValor "
                                    + "Retirado: R$"+c.getMovBancario());
                            
                            c.calcularTotal();
                        }
                        
                    }  
                }
            //Metodo de soma de todos os Saldos.
            }else if(option == 3){
                
                for(int i = 0; i < vetor.length; i++){
                    ContaBancaria conta = vetor[i];
                    
                    calculoSaldos += conta.getCalculoTotal();
                    
                }
                
                JOptionPane.showMessageDialog(null,"A soma de todos os saldos é: "+calculoSaldos);
            
                //metodo de consulta para ver contas de saldo negativo.
            }else if(option == 4){
                
                for(int i = 0; i<vetor.length; i++){
                    ContaBancaria c = vetor[i];
                    
                    
                    c.calcularTotal();
                    
                    if(c.getCalculoTotal() < 0 || c.getMovBancario() < 0){
                        JOptionPane.showMessageDialog(null,"Contas com saldo negativo: "
                                + "Número da conta: "+vetor[i].getConta()+"\n"
                                        + "Saldo Atual da conta: "+vetor[i].getCalculoTotal());
                    }else{
                        JOptionPane.showMessageDialog(null, "Não existe(m) conta(s) com saldo negativo");
                    }
                }
            }       
        }     
    }
}



//Gabriel Heidrich RA: 00232714
       //Elias Gasperin RA: 00236544  


