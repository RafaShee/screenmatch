package br.com.alura.screenmatch.exercicios1;

import java.util.*;
import java.util.stream.Collectors;

import static java.awt.SystemColor.text;

public class ex {
    public static void main(String[] args) {

        //ex1
//        List<String> input = Arrays.asList("10", "abc", "20", "30x");
//        List<Integer> ex2 = input.stream()
//                .filter(n -> n.matches("\\d+"))
//                .map(Integer::valueOf)
//                .collect(Collectors.toList());
//        System.out.println(ex2);

        //ex2
//        System.out.println(processaNumero(Optional.of(5)));
//        System.out.println(processaNumero(Optional.of(-3)));
//        System.out.println(processaNumero(Optional.empty()));

        //ex3
//        System.out.println(obterPrimeiroEUltimoNome("  João Carlos Silva   ")); // Saída: "João Silva"
//        System.out.println(obterPrimeiroEUltimoNome("Maria   ")); // Saída: "Maria"

        //ex4
//        System.out.println(ehPalindromo("socorram-me, subi no ônibus em Marrocos")); // Saída: true
//        System.out.println(ehPalindromo("Java")); // Saída: false

        //ex5
        List<String> emails = Arrays.asList("TESTE@EXEMPLO.COM", "exemplo@Java.com ", "Usuario@teste.Com");
        System.out.println(converterEmails(emails));
    }

    //ex2
    public static Optional<Integer> processaNumero(Optional<Integer> numero) {

        return numero
                .filter(n -> n>=0)
                .map(n -> n * n);

    }

    //ex3
    public static String obterPrimeiroEUltimoNome(String nomeCompleto) {

        nomeCompleto = nomeCompleto.trim();
        String[] nome = nomeCompleto.split("\\s+");

        if (nome.length >= 2) {
            return nome[0] + " " + nome[nome.length - 1];
        } else {
            return nomeCompleto;
        }
    }

    //ex4
//    public static boolean ehPalindromo(String palavra) {
//        String formatedText = text.trim().replaceAll("[^a-zA-Z]", "").toLowerCase();
//        String invertedFormatedText = new StringBuilder(formatedText).reverse().toString();
//
//        return formatedText.equals(invertedFormatedText);
//    }

    //ex5
    public static List<String> converterEmails(List<String> emails) {
        return emails.stream()
                .map(email -> email.trim().toLowerCase())
                .toList();
    }
}
