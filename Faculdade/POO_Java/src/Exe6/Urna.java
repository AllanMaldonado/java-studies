package Exe6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Urna {
    private String[] lista;
    private String tipoEleicao;
    private int[] votos;
    private int qtdeCandidatos;
    private int TL;
    private int totVotos;

    public Urna(int qtdeCandidatos,String tipoEleicao){
        String[] lista = new String[qtdeCandidatos];
        setLista(lista);

        int[]votos = new int[qtdeCandidatos];
        setVotos(votos);

        setTipoEleicao(tipoEleicao);
        setTL(0);
    }

    public void setTL(int TL) {
        this.TL = TL;
    }

    public Urna(int qtdeCandidatos){
        String[] lista = new String[qtdeCandidatos];
        setLista(lista);

        int[]votos = new int[qtdeCandidatos];
        setVotos(votos);

        setTipoEleicao("Eleição");
    }

    public void setLista(String[] lista) {
        this.lista = lista;
    }

    public void setQtdeCandidatos(int qtdeCandidatos) {
        this.qtdeCandidatos = qtdeCandidatos;
    }

    public void setTipoEleicao(String tipoEleicao) {
        this.tipoEleicao = tipoEleicao;
    }

    public void setVotos(int[] votos) {
        this.votos = votos;
    }

    public String getTipoEleicao() {
        return tipoEleicao;
    }

    public void adicCandidato(String nome){
        this.lista[this.TL++]=nome;
    }

    public String listaCandidatos(){
        String candidatos="";
        for(int i=0;i<this.TL;i++){
            candidatos += this.lista[i]+"\n";
        }
        return candidatos;
    }

    public void votar(int pos){
        this.votos[pos]++;
        this.totVotos++;
    }

    public void emitirBoletim(){
        System.out.println(this.tipoEleicao);
        double porcentagem = 0;
        String Texto="";

        try {
        FileWriter fwriter = new FileWriter("C:\\lista6\\src\\Exe6\\Boletim.txt", true);
        BufferedWriter bwriter = new BufferedWriter(fwriter);

        for (int i=0; i<TL;i++){


            System.out.print("Candidato"+i+": ");
            System.out.print(lista[i]+" "+votos[i]+" votos ");

            porcentagem=  ((double)votos[i]/(double)totVotos)*100;

            System.out.print("("+(int)porcentagem+"%)");
            System.out.println();
            Texto+="\n#"+tipoEleicao+"\n"+"Candidato"+i+": "+lista[i]+" "+votos[i]+" votos "+"("+(int)porcentagem+"%)"+"\n";


        }
        bwriter.append(Texto);

        bwriter.close();
        fwriter.close();

    } catch(
    IOException e) {
        System.err.println("Problemas: " + e.getMessage());
    }

}
}
