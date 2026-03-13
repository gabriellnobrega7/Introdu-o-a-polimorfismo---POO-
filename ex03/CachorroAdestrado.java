 package ex03;

public class CachorroAdestrado extends Cachorro{
    
     public CachorroAdestrado(String nome, String raca) {
        super(nome, raca);
    }

    public void deitar() {
        System.out.println(getNome() + " deitou.");
    }

    public void rolar() {
        System.out.println(getNome() + " rolou.");
    }

    public void fingirDeMorto() {
        System.out.println(getNome() + " está fingindo de morto.");
    }

    

}