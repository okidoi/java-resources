package jdk8.methodreferences;

/**
 
Figura2D
 * void desenha(Double largura, Double altura); */

 interface Figura2D {
    void desenha(Double largura, Double altura);    
}

class Retangulo{

    public void desenhaRetangulo(Double largura, Double altura){
        System.out.println("Desenha retângulo de largura: " + largura + " e altura: " + altura);
    }

}


public class Exemplo01 {

    public static void main(String[] args) {
        
        Figura2D fig1 = (l, a) -> System.out.println("Desenha figura de Largura: " + l + " e altura: " + a);;
        fig1.desenha(8.2, 4.5);

        //Referencia a um metodo de instacia de um objeto particular
        //objeto especifico
        Retangulo ret = new Retangulo();

        //Metodo Reference
        Figura2D fig2 = ret::desenhaRetangulo;
        fig2.desenha(8.3 , 5.67);


    }


}
