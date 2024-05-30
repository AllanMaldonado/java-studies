package Exe7;

public class Cliente {
    private int rg;
    private String nome;
    private String fone;
    private double renda;
    public Cliente (int rg, String nome, String fone, double renda){
        setRg(rg); this.nome=nome; this.fone=fone; this.renda=renda;
    }
    public Cliente(){
        this(0,"","",0);
    }
    public int getRg(){ return rg;}
    private void setRg(int rg){
        if(rg>=0)
            this.rg=rg;
    }
    public String getNome(){return nome;}
    public void setNome(String nome){ this.nome=nome;}
    public String getFone(){  return fone;}
    public void setFone(String fone){ this.fone=fone;}
    public double getRenda() { return renda; }
    public void setRenda(double renda) {
        if(renda>=0)
            this.renda = renda;
    }
    public String toString()
    {
        return rg+" "+nome+" "+fone+" "+renda;
    }

}

