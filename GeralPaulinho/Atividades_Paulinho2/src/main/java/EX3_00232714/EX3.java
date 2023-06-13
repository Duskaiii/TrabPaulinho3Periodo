package EX3;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuário
 */
public class EX3 {
    public static void main(String[] args) {
        
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantos números da sequencia fibonacci deseja: "));
                      
        System.out.println("Sequência Fibonacci de " + quantidade + ":");
        
        for (long i = 0; i <= quantidade; i++) {
        
            System.out.print(fibonacci(i) + " ");
            
        }
    }
    
    public static long fibonacci(long n) {
        
        if (n <= 1) {
            
            return n;
            
        } else {
            
            return fibonacci(n -1) + fibonacci(n - 2);
            
        }
        
    }
}
