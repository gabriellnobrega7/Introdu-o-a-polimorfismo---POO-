 package ex04;

public class CachorroAdestrado extends Cachorro {
    
    public CachorroAdestrado(String nome, String raca){

        super(nome, raca);

    }

    public void deitar() {
        System.out.println("O cachorro deitou.");
    }

    public void rolar() {
        System.out.println("O cachorro rolou.");
    }

    public void fingirDeMorto() {
        System.out.println("O cachorro está fingindo de morto.");
    }



}