# 2. Elevador

Crie uma classe em Java denominada `Elevador` que represente as informações e o comportamento de um elevador dentro de um prédio. A classe deve armazenar:
- Andar atual (para o térreo, considere o valor zero)
- Total de andares no prédio (excluindo o térreo)
- Capacidade de pessoas no elevador
- Quantas pessoas estão presentes nele

A classe deve também disponibilizar os seguintes métodos:

- **Construtor**: Deve receber como parâmetros a capacidade do elevador e o total de andares no prédio (o elevador sempre começa no térreo e está vazio).
- **Entrar**: Para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço).
- **Sair**: Para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele).
- **Subir**: Para subir um andar (não deve subir se já estiver no último andar).
- **Descer**: Para descer um andar (não deve descer se já estiver no térreo).

Obs: Encapsular todos os atributos da classe (criar os métodos `set` e `get`).

## Exemplo de Uso

```java
Elevador elevador = new Elevador(8, 15); // elevador para 15 andares com capacidade máxima de 8 pessoas
elevador.entrar(); // entra uma pessoa
elevador.entrar(); // entra outra pessoa
if (!elevador.entrar()) { // outra pessoa tenta entrar
    System.out.println("Capacidade excedida!");
}
elevador.subir(); // vai para o primeiro andar
if (!elevador.subir()) { // tenta subir mais um andar
    System.out.println("Já está no último andar");
}
elevador.sair(); // uma pessoa sai do elevador
System.out.println("Andar atual do elevador: " + elevador.getAndar()); // 2
System.out.println("Quantidade de pessoas dentro do elevador: " + elevador.getPessoas()); // 2
