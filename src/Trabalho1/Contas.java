package Trabalho1;

/**
 *
 * @author Lívia Oliveira
 */
public class Contas {
    
    String nome;
    int numero;
    double saldo;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
       this.nome = nome;
   }
   
    public int getNumero(){
       return numero;
    }
   
    public void setNumero(int numero){
       this.numero = numero;
   }
   
    public double getSaldo(){
       return saldo;
   }
    
    public void setSaldo(double saldo){
       this.saldo = saldo;
   }
   
    void depositar(double valor){
        this.saldo=this.saldo+valor;
    }
        
    boolean sacar(double valor){
        if(this.saldo>=valor){
            this.saldo-=valor;
            return(true);
        }
        else
            return false;
    }
   
    public void transferir(Contas conta, double valor) {
        if(valor <= this.getSaldo()) {
            this.saldo -= valor;
            conta.saldo += valor;
        }
   }
    public void tipoConta(){
       System.out.println("Tipo de conta: conta-comum");
   }
    
}
