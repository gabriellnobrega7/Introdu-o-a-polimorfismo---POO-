  package ex04;

 public class Cachorro{

    private String nome;
    private String raca;


    public Cachorro(String nome, String raca){

        this.raca = raca;
        this.nome = nome;

    }
    public String getRaca() {
       return raca;
    }
    public String getNome(){

        return nome;

    }

    public void setNome(String nome){

        this.nome = nome;

    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void Latir(){


        System.out.println("O cachorro está latindo...");

    }

    
    public void Dormir(){


        System.out.println("O cachorro está dormindo...");

    }

    public void Comer(){


        System.out.println("O cachorro está comendo...");

    }

 

    public String toString() {
    return "Nome: " + nome + " | Raça: " + raca;
}
 }