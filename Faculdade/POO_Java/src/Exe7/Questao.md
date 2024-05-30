# 7. Clientes

## Classe Cliente

Crie a classe `Cliente` contendo:

a) Os atributos:
- `rg` (tipo `int`)
- `nome` (tipo `String`)
- `fone` (tipo `String`)
- `renda` (tipo `double`)

b) Dois construtores:
- Um sem parâmetros.
- Outro com os parâmetros `rg`, `nome`, `fone` e `renda`.

c) Métodos getters e setters para os atributos `rg`, `nome`, `fone` e `renda`.

d) Método `toString()` para retornar uma `String` que é a concatenação dos atributos da classe.

Exemplo de saída do método `toString()`: 20374444 Paulo da Silva 3222-5599 1000.50”


## Classe TodosClientes

Crie a classe `TodosClientes` contendo:

a) Um atributo `clientes` que é um `ArrayList` de `Cliente`.

b) Construtor que instancia o `ArrayList`.

c) Métodos:
- `void insere(Cliente c)`:
    - Recebe um objeto do tipo `Cliente` e o insere no array.
- `String listaClientes()`:
    - Retorna uma `String` com uma relação de todos os nomes de clientes cadastrados, separados por vírgulas.

Exemplo de saída do método `listaClientes()`: “Paulo da Silva, Arthur Moreira, Cristina Melo”

d) Método `List<Cliente> buscaClientesPorRenda(double renda)`:
- Retorna um `ArrayList` contendo todos os clientes que possuem renda superior à renda enviada como parâmetro.
- Caso o parâmetro seja o valor `-1`, todos os clientes serão retornados.

e) Método `boolean remove(int rg)`:
- Remove o `Cliente` do `ArrayList` que possui determinado `rg`.
