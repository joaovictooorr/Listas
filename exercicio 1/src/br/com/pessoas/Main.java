package br.com.pessoas;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void cadastrarPessoas() {
        Scanner input = new Scanner(System.in);


            System.out.print("Digite os nomes das pessoas com , :  ");
            String resposta = input.next();
            String[] vetorPessoas = resposta.split(",");
            String nome = Arrays.toString(resposta.split(","));
            Pessoas pessoa = new Pessoas(nome);
            System.out.println("Pessoas cadastrada");

        arrayordenado(vetorPessoas);
    }

    private static void arrayordenado(String[] vetorPessoas) {
        Arrays.sort(vetorPessoas);
        Arrays.stream(vetorPessoas).forEach(System.out::println);
    }


    public static void main(String[] args){

        cadastrarPessoas();


    }
}
