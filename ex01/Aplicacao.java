package ex01;

import java.util.Scanner;

public class Aplicacao {
    
    public static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        
        String nome, info;
        int idade;

        nome = input.nextLine();
        idade = input.nextInt();
        input.nextLine(); // limpa o buffer
        info = input.nextLine();

        Pessoa pf = new PessoaFisica(nome, idade, info);

        nome = input.nextLine();
        idade = input.nextInt();
        input.nextLine(); // limpa o buffer
        info = input.nextLine();

        Pessoa pj = new PessoaJuridica(nome, idade, info);

        imprime(pf);

        System.out.println();

        imprime(pj);

        

    }

    public static void imprime(Pessoa p){

            System.out.println("Nome da pessoa: " + p.getNome());
            System.out.println("Idade: " + p.getIdade());
            if(p instanceof PessoaFisica){
                System.out.println("cpf: " + ((PessoaFisica)p).getCpf());
            }
            else{
                System.out.println("CNPJ: " + ((PessoaJuridica)p).getCnpj());
            }
    }

    /*public static void imprime(PessoaJuridica p){

            System.out.println("Nome da pessoa: " + p.getNome());
            System.out.println("Idade: " + p.getIdade());
            System.out.println("cnpj: " + p.getCnpj());

    }*/

}
