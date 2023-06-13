package ContaBancaria;

/**
 *
 * @author Usuário
 */
public class ContaBancaria {

    private String nome;
    private double saldo;
    private int conta;
    
    
    private double movBancario;
    
    private double totalConta;
    private double calculoTotal;
    
    private double totalBanco;
    private double negativo;


    public ContaBancaria() {
    }

    public ContaBancaria(String nome, double saldo, int conta, double movBancario, double totalConta, double totalBanco, double negativo) {
        this.nome = nome;
        this.saldo = saldo;
        this.conta = conta;
        this.movBancario = movBancario;
        this.totalConta = totalConta;
        this.totalBanco = totalBanco;
        this.negativo = negativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getMovBancario() {
        return movBancario;
    }

    public void setMovBancario(double movBancario) {
        this.movBancario = movBancario;
    }

    public double getTotalConta() {
        return totalConta;
    }

    public void setTotalConta(double totalConta) {
        this.totalConta = totalConta;
    }

    public double getTotalBanco() {
        return totalBanco;
    }

    public void setTotalBanco(double totalBanco) {
        this.totalBanco = totalBanco;
    }

    public double getNegativo() {
        return negativo;
    }

    public void setNegativo(double negativo) {
        this.negativo = negativo;
    }

    public double getCalculoTotal() {
        return calculoTotal;
    }

    public void setCalculoTotal(double calculoTotal) {
        this.calculoTotal = calculoTotal;
    }

        public void calcularTotal(){
        calculoTotal += saldo + movBancario;
    }
        
        

    @Override
    public String toString() {
        return "ContaBancaria{" + "nome=" + nome + ", saldo=" + saldo + ", conta=" + conta + ", movBancario=" + movBancario + ", totalConta=" + totalConta + ", totalBanco=" + totalBanco + ", negativo=" + negativo + '}';
    }
    
        
        
        
}
