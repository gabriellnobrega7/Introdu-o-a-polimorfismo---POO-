 package ex04;

import java.util.Scanner;

public class Aplicacao{

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        String nome, raca;

        nome = input.nextLine();
        input.nextLine();
        raca = input.nextLine();

        Cachorro c1 = new Cachorro(nome, raca);

        System.out.println("Digite o do Cachorro adestrado agora: ");

        nome = input.nextLine();
        input.nextLine();
        raca = input.nextLine();

        Cachorro c2 = new CachorroAdestrado(nome, raca);

        imprime(c1);

        System.out.println();

        imprime(c2);


    }

    public static void imprime(Cachorro c){

        System.out.println("Nome do cachorro: " + c.getNome());
        System.out.println("Raça: " + c.getRaca());

         if(c instanceof CachorroAdestrado){
            System.out.println("Comandos do cachorro adestrado:");

        ((CachorroAdestrado)c).deitar();
        ((CachorroAdestrado)c).rolar();
        ((CachorroAdestrado)c).fingirDeMorto();
        }
        else{
             System.out.println("Este cachorro não é adestrado.");
        }
    }
 }