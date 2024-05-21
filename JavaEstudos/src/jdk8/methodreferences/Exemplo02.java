package jdk8.methodreferences;

import java.util.ArrayList;
import java.util.List;


class Impressora{
    public static void imprime(Produto p){
        System.out.println(p.getNome() + " = " + p.getValor());
    }
}

public class Exemplo02 {

 public static void main(String[] args) {
    
        List<Produto> lista = new ArrayList<Produto>();
        

        lista.add(new Produto("TV 34", 200.00));
        lista.add(new Produto("TV 33", 190.00));
        lista.add(new Produto("TV 32", 180.00));
        lista.add(new Produto("TV 31", 170.00));

        //lambda expression com argumento
        System.out.println("Imprimindo com o lambda expression");
        lista.forEach((parametroProduto) -> System.out.println(parametroProduto.getNome() + " = " + parametroProduto.getValor() ));

        System.out.println("Imprimindo com o a impressora");
        //method references
        lista.forEach(Impressora::imprime);

        
        System.out.println("Imprimindo com o produto");
        //method references usando metodo de instancia de um objeto arbitrário a partir de um tipo específico (uma classe específica)
        lista.forEach(Produto::imprime);

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
    
    public void imprime(){
        System.out.println(nome + " = " + valor);
    }

}
