package jdk8.exemplo01;

public class ExemploThread {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable(){

            @Override
            public void run(){
                System.out.println("Thread 1 em execução");
            }

        });

        t1.start();

        Thread t2 = new Thread(()-> System.out.println("Thread 2 em execução"));

        t2.start();
    }

//OBSERVAÇÂO: Como a Interface Runnable possui apenas um único método abstrato (run()) então o compilador
//entende que é esse que está sendo implementado pelo operador LAMBDA EXPRESSION.

}
