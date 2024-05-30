# Prova e Gabarito

Considere a seguinte classe, cujo método `respostaQuestao` recebe como parâmetro o número de uma questão e retorna a sua resposta correta, proveniente de um gabarito:

```java
public class Gabarito {
    public char respostaQuestao(int numeroQuestao) {
        // Implementação do método
    }
}
```
Escreva a classe `Prova` em que cada objeto representa uma prova feita por um aluno. Esta prova possui 15 questões de múltipla escolha (letras A a E). As 10 primeiras questões valem 0,5 ponto e as 5 últimas questões valem 1 ponto. Esta classe deverá controlar as questões respondidas pelo aluno. Para isto, a classe deve implementar os métodos:

- **Construtor**: recebe como parâmetro um objeto da classe `Gabarito` contendo o gabarito da prova.
- **respostaAluno**: recebe como parâmetro a resposta dada pelo aluno a uma questão; este método não recebe entre os parâmetros o número da questão, ele mesmo deve estabelecer um controle interno de modo que as questões sejam inseridas sequencialmente, ou seja, a primeira vez que o método é chamado, insere a primeira questão, a segunda, insere a segunda questão, e assim por diante.
- **getAcertos**: retorna a quantidade de questões que o aluno acertou.
- **getNota**: retorna a nota que o aluno tirou na prova.
## Exemplo de Uso

```java
Gabarito gabarito = new Gabarito("AABBBACACACADDE"); // Cria um gabarito com as respostas corretas
Prova prova = new Prova(gabarito);

prova.respostaAluno("A"); // Primeira resposta
prova.respostaAluno("A"); // Segunda resposta
// ... Insere mais respostas
prova.respostaAluno("D"); // Última resposta (15ª), a partir desse ponto não aceita mais respostas

System.out.println("Você acertou " + prova.getAcertos() + " questões");
System.out.println("Sua nota foi " + prova.getNota());
