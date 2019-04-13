package entidade;
public class Conta {
    private int numConta;
    private String nomeTitular;
    private double saldo;
    //Construtores
    public Conta(){ 
    }
    /**Construtor com saldo
     * @param numConta     
     * @param nomeTitular     
     * @param saldo     
     */
    public Conta(int numConta, String nomeTitular, double saldo){
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }
    
    public Conta(int numConta, String nomeTitular){
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
    }
    
    //Metodo de acesso
    public int getNumConta() {
        return numConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double saldo){
        this.saldo += saldo;
        System.out.println("O novo saldo é: R$"+getSaldo());
    }
    
    public void sacar(double saldo){
        this.saldo -= saldo + 5;
        System.out.println("O novo saldo é: R$"+getSaldo());
    }    
}
