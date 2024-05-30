package Exe5;

public class Prova {
    private int questao;
    private int qtde;
    private char respostaGabarito;
    private Gabarito gabarito;
    private int acertos;
    private double nota;

    public void setGabarito(Gabarito gabarito) {
        this.gabarito = gabarito;
    }

    public Prova(Gabarito gabarito){
        setGabarito(gabarito);
        setQuestao(0);
        setQtde(15);
        setAcertos(0);
        setNota(0);
    }

    public void setAcertos(int acertos) {
        this.acertos = acertos;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setQuestao(int questao) {
        this.questao = questao;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public double getNota() {
        return nota;
    }

    public int getAcertos() {
        return acertos;
    }

    public void respostaAluno (String resposta){
        String gabarito = Character.toString(this.gabarito.getRespostaQuestao(this.questao++));
        if(gabarito.equals(resposta)){
            this.acertos++;
            if(this.questao<=10){
                this.nota+=0.5;
            }else{
                this.nota+=1;
            }
        }
    }

}
