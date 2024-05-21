package jdk7.inferenciacriacaoobjetostipogenerico;

import java.util.*;

public class InferenciaGenerics {
    public static void main(String[] args) {
       
       //SEM INFERENCIA
        Map<Integer, Set<Integer>> mapOfIntegers = new HashMap<Integer, Set<Integer>>();
        Integer aKey = 10;
        Set<Integer> aSet = new HashSet<Integer>();
        mapOfIntegers.put(aKey, aSet);


        //COM INFERENCIA
        Map<Integer, Set<Integer>> mapOfIntegers2 = new HashMap<>();
        Integer aKey2 = 10;    
        Set<Integer> aSet2 = new HashSet<>();
        mapOfIntegers2.put(aKey2, aSet2);



    }
}