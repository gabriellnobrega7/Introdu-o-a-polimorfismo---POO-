 package ex01;

 public class PessoaJuridica extends Pessoa {
    
    private String cnpj;

    public PessoaJuridica(String nome, int idade, String cnpj){

        super(nome, idade);
        this.cnpj = cnpj;

    }

    
    public int getIdade() {
        
        return super.getIdade();
    }

    public String getCnpj() {
        return cnpj;
    }

   
    public String getNome() {
        
        return super.getNome();
    }

    
    public void setIdade(int idade) {
        
        super.setIdade(idade);
    }

    
    public void setNome(String nome) {
        
        super.setNome(nome);
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

  
    public String toString() {
       
        return super.toString();
    }

}
