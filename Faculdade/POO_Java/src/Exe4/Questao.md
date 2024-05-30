# Globo de Bingo

Desenvolva uma classe para representar um globo utilizado nos jogos de bingo. O Globo deverá, ao ser inicializado, fornecer números entre 1 e um valor máximo, de forma aleatória e não repetidos. No projeto da classe, defina construtores, métodos `get`, `set` e demais métodos.

## Exemplo de Uso

```java
Globo globo;
globo = new Globo(60); // cria um globo com 60 números, do 1 ao 60
int num = globo.getNumero(); // retira um número sorteado do globo
System.out.println("Quantidade de números restantes: " + globo.getTotalNumerosRestantes());
// imprime "Quantidade de números restantes: 59"
