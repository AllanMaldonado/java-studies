package Exe7;

import java.util.ArrayList;
import java.util.List;

public class TodosClientes {
    private List<Cliente> clientes;
    public TodosClientes(){
        clientes=new ArrayList<>();
    }
    public void insere(Cliente cliente){
        clientes.add(cliente);
    }
    public String listaClientes()    {
        String str="";
        for(Cliente c : clientes)
            str+=c.getNome()+", ";
        return str;
    }
    public List<Cliente> buscaClientesPorRenda(double renda)
    {
        List<Cliente> aux=new ArrayList();
        for(Cliente c : clientes)
            if(c.getRenda()>=renda || renda==-1)
                aux.add(c);
        return aux;
    }
    public boolean remove(int rg)
    {   boolean removeu=false;
        for (int i=0;i<clientes.size();i++){
            if(clientes.get(i).getRg()==rg) {
                clientes.remove(i);
                removeu=true;
            }
        }
        return removeu;
    }
}

