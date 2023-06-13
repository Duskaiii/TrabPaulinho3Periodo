package EX2;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuário
 */
public class EX2 {

    public static void main(String[] args) {
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digíte o valor desejado:"));
        
        long resultado = fatorial(numero);
        
        System.out.println("A fatorial de " + numero + " é " + resultado);
              
    }
    
    public static long fatorial(long n) {
        
        if (n == 0) {
            
            return 1;
            
        } else {
            
           return n * fatorial(n - 1); 
            
        }
        
    }
    
}
