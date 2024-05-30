package Exe2;

public class Elevador {
    private int totAndar;
    private int maxPessoas;
    private int Andar;
    private int Pessoas=0;


    //------------------------------------------
    public void setTotAndar(int totAndar) {
        if(totAndar>=0)
            this.totAndar = totAndar;
    }

    public void setMaxPessoas(int maxPessoas) {
        if(maxPessoas>=0)
            this.maxPessoas = maxPessoas;
    }

    public void setAndar(int andarAtual) {
        this.Andar = andarAtual;
    }

    public void setPessoas(int qtdePessoas) {
        this.Pessoas = qtdePessoas;
    }

    public int getTotAndar() {
        return totAndar;
    }

    public int getPessoas() {
        return Pessoas;
    }

    public int getAndar() {
        return Andar;
    }

    public int getMaxPessoas() {
        return maxPessoas;
    }

    //------------------------------------------
    public Elevador(int maxPessoas, int totAndar){
        setTotAndar(totAndar);
        setMaxPessoas(maxPessoas);

        setAndar(0);
        setPessoas(0);
    }
    //------------------------------------------
    public boolean entrar(){
        if(this.Pessoas<this.maxPessoas){
            this.Pessoas++;
            return true;
        }
        return false;
    }
    public boolean sair(){
        if(this.Pessoas>0){
            this.Pessoas--;
            return true;
        }
        return false;
    }

    public boolean subir(){
        if(this.Andar<this.totAndar){
            this.Andar++;
            return true;
        }
        return false;
    }
    public boolean descer(){
        if(this.Andar>0){
            this.Andar--;
            return true;
        }
        return false;
    }
}

