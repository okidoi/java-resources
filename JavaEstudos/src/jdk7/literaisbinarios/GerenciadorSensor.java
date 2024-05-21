package jdk7.literaisbinarios;

/*
 * Até a versão 6 do Java, era possível trabalhar com literais inteiros 
 * definidos como octais, decimais e hexadecimais. 
 * A partir da versão 7 também é possível trabalhar com literais binários. 
 * Para a grande maioria das aplicações comerciais isso pode não trazer grandes 
 * ganhos, mas em sistemas nos quais são frequentes as operações envolvendo bits, 
 * isso pode ser realmente útil. A sintaxe da nova declaração é simples, 
 * bastando iniciar o literal com 0b (zero e a letra 'b') seguido por uma 
 * sequência de 0s e 1s. Por exemplo:
    0b1100
    0b01
    0b1101
    Os dígitos são alinhados à direita na área de memória, 
    independentemente do tipo (byte, short, etc), ou seja, 
    0b11 é igual a 3, 0b101 é igual a 5 e assim por diante.
 * 
 */


public class GerenciadorSensor {
    private static final int SEM_LEITURA = 0b00;
    private static final int DESLIGADO = 0b01;
    private static final int LIGADO = 0b10;
    private static final int ALARME = 0b11;

    private static final String[] MENSAGENS = { "não disponível", "desligado", "ligado", "alarme" };

    public static int lerEstado() {
        return (int) (Math.random() * 0b100);
    }

    public static void main(String[] args) {
        System.out.printf("Os estados possíveis são: %s(%d) %s(%d), %s(%d), %s(%d)\n\n",
                MENSAGENS[SEM_LEITURA], SEM_LEITURA, MENSAGENS[DESLIGADO], DESLIGADO,
                MENSAGENS[LIGADO], LIGADO, MENSAGENS[ALARME], ALARME);

        int st = lerEstado();
        while (st != SEM_LEITURA) {
            System.out.printf("O estado do sensor é: %s\n", MENSAGENS[st]);
            st = lerEstado();
        }
    }
}
