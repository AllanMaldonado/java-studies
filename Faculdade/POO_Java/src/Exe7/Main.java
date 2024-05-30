package Exe7;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente c1 =new Cliente(123432,"Daniel dos Santos","18-99985-8989",1000);
        TodosClientes todosClientes=new TodosClientes();
        todosClientes.insere(c1);
        todosClientes.insere(new Cliente(123,"Joao Silva","189995588",4000));
        todosClientes.insere(new Cliente(3333,"Rita Oliveira","188745658",3000));
        //System.out.println(todosClientes.listaClientes());
        if(todosClientes.remove(1234)==false)
            System.out.println("Cliente não encontrado para remoção");
        List<Cliente> rendaAlta=todosClientes.buscaClientesPorRenda(-1);
        for(int i=0; i<rendaAlta.size(); i++)
            System.out.println(rendaAlta.get(i).getNome());

    }
}
