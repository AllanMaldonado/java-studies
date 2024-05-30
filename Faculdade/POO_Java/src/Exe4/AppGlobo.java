package Exe4;

public class AppGlobo {
    public static void main(String[] args) {
        Globo globo;
        globo = new Globo(60); // cria um globo com 60 números, do 1 ao 60
        int num = globo.getNumero(); // retira um número sorteado do globo
        System.out.println("Quantidade de números restantes: " + globo.getTotalNumerosRestantes());
        // imprime "Quantidade de números restantes: 59"
    }

}
