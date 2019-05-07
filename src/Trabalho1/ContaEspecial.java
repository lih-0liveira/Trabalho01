package Trabalho1;

/**
 *
 * @author Lívia Oliveira
 */
public class ContaEspecial extends Contas {
   private int limite;
   private double multa;
    
    public void descontar(double valor) {
        this.sacar(this.multa*valor*0.01);
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }
    
   
    public void setLimite(int limite) {
        this.limite = limite;
    }
    
    public int getLimite() {
        return limite;
    }

    public String tipoconta(){
         return "conta-especial";

    }
}