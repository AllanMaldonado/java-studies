package Exe1;

public class ContaCorrente {
    private int id;
    private String titular;
    private double saldo;
    private boolean status;
    private double limite;

    ContaCorrente(int id, String titular){
        setId(id);
        setTitular(titular);
        setSaldo(0);
        setStatus(false);//sem especial
        setLimite(0);
    }

    public void setLimite(double limite) {
        this.limite = limite;
        setStatus(true);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void depositar(double deposito){
        if(deposito>=0)
            this.saldo+=deposito;
    }

    public boolean sacar(double saque){
        double temporario = this.saldo+this.limite;

        if(temporario<saque){
            return false;
        }else{
            this.saldo-=saque;
            return true;
        }
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }
}
