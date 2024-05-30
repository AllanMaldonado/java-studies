package Exe3;

public class AppMeuVetor {
    public static void main(String[] args) {
        MeuVetor meuVetor = new MeuVetor(3); // vetor com no máximo 3 elementos
        meuVetor.inserir("banana"); // insere primeiro elemento
        meuVetor.inserir("uva"); // insere segundo elemento
        meuVetor.inserir("carambola"); // insere terceiro elemento
        meuVetor.inserir("mexerica"); // insere quarto elemento e aumenta a capacidade do vetor para 4 elementos
        System.out.println(meuVetor.get(1)); // imprime "uva"
        System.out.println(meuVetor.get()); // imprime "mexerica"
        System.out.println("O vetor tem " + meuVetor.size() + " elementos");
        // imprime "O vetor tem 4 elementos
    }
}
