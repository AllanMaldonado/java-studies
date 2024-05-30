package Exe1;

public class AppContaCorrente {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(123, "Rudolph Silva"); //criou a conta de número 123 para o Rudolph, conta comum,tem saldo zero
        conta.depositar(100); // fez um depósito de R$100,00 na conta
        conta.depositar(50); //depositou mais 50, portanto tem R$150,00 disponível

        if(!conta.sacar(200))  // tenta sacar R$200,00, mas não consegue pois não tem saldo
            System.out.println("Saldo insuficiente");
        conta.setLimite(100); // transforma em conta especial, com um limite de R$100
        if(!conta.sacar(200))  // tenta sacar R$200,00 com sucesso
            System.out.println("Saldo insuficiente");
        System.out.println("Saldo da conta do "+conta.getTitular()+" é R$ "+conta.getSaldo()+" com limite de R$ "+conta
        .getLimite());

        // imprime "Saldo da conta do Rudolph é R$ -50,00  limite de R$ 100,00"
    }
}