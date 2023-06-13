package EX1;

/**
 *
 * @author Usuário
 */


public class Soma50 {

    public static void main(String[] args) {

        int resultado = soma(50);
        System.out.println("A soma de 0 a 50 é: " + resultado);

    }

    public static int soma(int n) {

        if (n == 0) {

            return 0;

        } else {

            return n + soma(n- 1);

        }
    }
}
