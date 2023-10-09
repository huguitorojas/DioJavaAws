package org.hugo.apiStream;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ExemploSupplier {
    public static void main(String[] args) {

        Supplier<String> saudacao = ()-> "Ola, seja bem-vindo";

        List<String> litaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .toList();

        litaSaudacoes.forEach(System.out::println);

    }
}
