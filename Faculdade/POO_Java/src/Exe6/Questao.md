# 6. Urna Eletrônica

Desenvolva uma classe para auxiliar no processo de votação e apuração em eleições diversas. A classe deverá manter uma lista de candidatos, possibilitar a votação, registrar o tipo de eleição (presidente, diretório acadêmico, prefeito, diretor de clube, ...) e emitir o resultado na forma de arquivo. Para isso crie a seguinte estrutura de classe:

- um construtor que recebe a quantidade de candidatos e o tipo de eleição;
- um construtor que recebe somente a quantidade de candidatos;
- métodos getters e setters para o tipo de eleição;
- um método que permite adicionar individualmente o nome de cada candidato (`adicionaCandidato(nome_candidato)`). Deve retornar um booleano;
- um método que retorna na forma de uma String, a lista de candidatos adicionados. Utilize `\n` para separar cada nome;
- um método que permite votar, deve receber o número do candidato, que é a sequência em que ele foi adicionado (0, 1, 2, ...);
- um método que emite o boletim de urna em arquivo, ou seja, um arquivo com a quantidade e o percentual de votos para cada candidato. Por exemplo:

## Breve exemplo de uso:

```java
/*
    #Eleição para o DA
        Candidato 0: Pelé 7 votos (70%)
        Candidato 1: Maradona 0 votos (0%)
        Candidato 2: Ronaldo 3 votos (30%)
*/

Urna u1 = new Urna(3, "Eleição para o DA");
u1.adicCandidato("Pelé");
u1.adicCandidato("Maradona");
u1.adicCandidato("Ronaldo");

/*    ...     */

System.out.println(u1.listaCandidatos());
u1.votar(0);
u1.votar(0);
u1.votar(2);

/*    ...     */

u1.emitirBoletim();