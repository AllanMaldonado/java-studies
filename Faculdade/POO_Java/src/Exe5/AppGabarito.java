package Exe5;

public class AppGabarito {
    public static void main(String[] args) {
       Gabarito gabarito=new Gabarito("AABBBACACACADDE");



       Prova prova=new Prova(gabarito);

        prova.respostaAluno("A");
        prova.respostaAluno("A");
        prova.respostaAluno("B");
        prova.respostaAluno("B");
        prova.respostaAluno("B");
        prova.respostaAluno("A");
        prova.respostaAluno("C");
        prova.respostaAluno("A");
        prova.respostaAluno("C");
        prova.respostaAluno("A");
        prova.respostaAluno("C");
        prova.respostaAluno("A");
        prova.respostaAluno("D");
        prova.respostaAluno("D");
        prova.respostaAluno("E");


        //última resposta (15ª), a partir desse ponto não aceite mais respostas
        System.out.println("Você acertou "+prova.getAcertos()+" questões");
        System.out.println("Sua nota foi "+prova.getNota());
    }
    /**/
}
