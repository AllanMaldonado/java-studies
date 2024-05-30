package Exe4;

public class Globo {
    private int Numero;

    private int TotalNumerosRestantes;

    public Globo(int TotalNumerosRestantes){
        setTotalNumerosRestantes(TotalNumerosRestantes);
        setNumero(TotalNumerosRestantes);
    }

    public void setTotalNumerosRestantes(int totalNumerosRestantes) {
        this.TotalNumerosRestantes = totalNumerosRestantes;
    }

    public int getTotalNumerosRestantes() {
        return TotalNumerosRestantes;
    }

    public void setNumero(int TotalNumerosRestantes) {
        this.Numero = (int) Math.random() * TotalNumerosRestantes;
        setTotalNumerosRestantes(TotalNumerosRestantes-1);
    }

    public int getNumero() {
        return this.Numero ;
    }
}

