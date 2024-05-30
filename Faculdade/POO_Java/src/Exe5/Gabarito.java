package Exe5;

public class Gabarito {
    private char[] gabarito;
    private int questao;
    private int qtde;

    public Gabarito(String resposta){
        char[] gabarito= new char[15];

        for(int i=0;i<15;i++){
            gabarito[i]=resposta.charAt(i);
        }
        setGabarito(gabarito);
        setQuestao(0);
        setQtde(15);

    }

    public void setGabarito(char[] gabarito) {
        this.gabarito = gabarito;
    }

    public void setQuestao(int questao) {
        this.questao = questao;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public char getRespostaQuestao(int pos){
        return this.gabarito[pos];
    }
}

