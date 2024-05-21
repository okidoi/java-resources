package jdk8.exemplo02;

public class Exemplo02 {
    public static void main(String[] args) {
       
        Figura fig1 = new Figura(){

            @Override
            public void desenha(){
                System.out.println("Desenha figura 1");
            }
        };

        fig1.desenha();

        Figura fig2 = ()->System.out.println("Desenha figura 2");
        fig2.desenha();
    }

}


interface Figura{
    void desenha();
}
