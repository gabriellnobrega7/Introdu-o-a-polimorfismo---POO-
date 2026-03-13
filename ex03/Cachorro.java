 package ex03;

public class Cachorro {
    

    private String nome;
    private String raca;

    public Cachorro(String nome, String raca){

        this.nome = nome;
        this.raca = raca;

    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void latir() {
        System.out.println(nome + " está latindo: Au Au!");
    }

    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }



}