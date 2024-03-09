package br.com.mf;

import java.util.*;

public class Main {


    public static void cadastro(){
        Scanner input = new Scanner(System.in);
        List<String> mulher = new ArrayList<>();
        List<String> homem = new ArrayList<>();


        System.out.print("Digite o nome e sexo da pessoa: ");
        String resposta = input.nextLine();

        String[] pessoas = resposta.split(",");

        for(String pessoa : pessoas){
            String[] nomeESexo = pessoa.split("-");
            if(nomeESexo[1].equals("m")){
                homem.add(nomeESexo[0]);
            } else if (nomeESexo[1].equals("f")) {
                mulher.add(nomeESexo[0]);

            }
        }
        System.out.println("Lista de homens" + homem);
        System.out.println("Lista de Mulheres" + mulher);


    }



    public static void main(String[] args){
        cadastro();

    }
}
