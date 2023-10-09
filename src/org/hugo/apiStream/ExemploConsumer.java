package org.hugo.apiStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExemploConsumer {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);

        Consumer<Integer> imprimirNumerosPares = numero -> {

                if (numero % 2 == 0) {
                    System.out.println(numero);
                }

            };

        numeros.forEach(n ->{
            if(n % 2 == 0){
                System.out.println(n);
            }
        });

    }
}
