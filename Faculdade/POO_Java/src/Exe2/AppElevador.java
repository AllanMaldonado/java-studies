package Exe2;

public class AppElevador {

    public static void main(String[] args){
        Elevador elevador= new Elevador(8,15); //elevador para 15 andares com capacidade máxima de 8 pessoas

        elevador.entrar(); //entra uma pessoa
        elevador.entrar(); //entra outra pessoa
        if(!elevador.entrar()) //outra pessoa tenta entrar
            System.out.println("Capacidade excedida!");
        elevador.subir(); //vai para o primeiro andar;
        if(!elevador.subir()) // tenta subir mais um andar
            System.out.println("já está no último andar");
        elevador.sair(); //uma pessoa   sai do elevador
        System.out.println("Andar atual do elevador: "+elevador.getAndar()); //2
        System.out.println("Quantidade de pessoas dentro do elevador: "+elevador.getPessoas()); //2
    }

}
