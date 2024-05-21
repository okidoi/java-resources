package jdk8.exemplo03;


import java.util.ArrayList;
import java.util.List;


public class Exemplo03{
       
    public static void main(String[] args) {
    
        List<Produto> lista = new ArrayList<Produto>();
        

        lista.add(new Produto("TV 34", 200.00));
        lista.add(new Produto("TV 33", 190.00));
        lista.add(new Produto("TV 32", 180.00));
        lista.add(new Produto("TV 31", 170.00));

        //lambda expression com argumento
        System.out.println("Lista antes de ordenar");
        lista.forEach((parametroProduto) -> System.out.println(parametroProduto.getNome() + " = " + parametroProduto.getValor() ));

        lista.sort((prod1, prod2) -> prod1.getValor().compareTo(prod2.getValor()));

        //Múltiplas linhas ou comandos (bloco) 
        System.out.println("Lista após de ordenar por valor");
        lista.forEach((parametroProduto) -> {
            System.out.println(parametroProduto.getNome());
            System.out.println(" = " );
            System.out.println(parametroProduto.getValor());
        });
    }

}


class Produto{
    
    public String nome;
    public Double valor;

    
    public Produto(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    

}