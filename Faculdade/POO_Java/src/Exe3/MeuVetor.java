package Exe3;

public class MeuVetor {
    private int tamanho;
    private int quantidade;
    private String[] vetor;


    public MeuVetor(int tamanho){
        setTamanho(tamanho);
        setQuantidade(0);

        String[] vetor = new String[tamanho];
        setVetor(vetor);
    }

    public void setVetor(String[] vetor) {
        this.vetor = vetor;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    public void inserir(String fruta){
        if(this.quantidade >= this.tamanho){
            this.tamanho++;  // Aumenta o tamanho do vetor

            String[] novoVetor = new String[tamanho];

             for(int i = 0; i < this.vetor.length; i++){
                novoVetor[i] = this.vetor[i];
            }

             setVetor(novoVetor);
        }

         this.vetor[this.quantidade++] = fruta;
    }

    public String get(int pos){
        if(pos>quantidade-1){
            return null;
        }
        return this.vetor[pos];
    }

    public String get(){
        if (quantidade == 0) {
            return null; // ou lance uma exceção se preferir
        }
        return this.vetor[quantidade - 1];
    }


    public int size(){
        return this.tamanho;
    }
}
