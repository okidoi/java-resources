package jdk7.multicatch.afterjava7;

import java.io.FileReader;

import jdk7.multicatch.beforejava7.MyBufferedReader;

public class GerenciadorRecursosMultiCatch {
    public static void main(String[] args) throws Exception {
        try (MyBufferedReader br = new MyBufferedReader(new FileReader("classes.txt"))) {
            String line;
            while ((line = br.readLine()) != null)
                instantiate(line);
        }
    }

 }

    private static void instantiate(String className) throws Exception {
        try {
            Class<?> clazz = Class.forName(className);
            Object o = clazz.newInstance();
            System.out.println(o.getClass().getName());

        } catch (ClassNotFoundException e) {
            System.err.println("Classe nao encontrada: " + className);
            throw e;
        } catch (InstantiationException e) {
            System.err.println("Nao foi possivel instanciar a classe: " + className);
            throw e;
        } catch (IllegalAccessException e) {
            System.err.println("Nao foi possivel instanciar a classe: " + className);
            throw e;
        }
    }
}
