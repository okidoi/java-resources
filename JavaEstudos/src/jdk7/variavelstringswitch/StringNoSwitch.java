package jdk7.variavelstringswitch;

public class StringNoSwitch {
    public static void main(String[] args) {
        for (String param : args) {
            switch (param) {
                case "-test":
                    System.out.println("O programa está sendo executado em modo teste");
                    break;
                case "-silent":
                    System.out.println("O programa envia poucas informações na saída padrão");
                    break;
                case "-verbose":
                    System.out.println("O programa envia muitas informações na saída padrão");
                    break;
                default:
                    System.err.printf("Parâmetro %s não reconhecido\n", param);
                    System.exit(-1);
            }
        }
    }
}
