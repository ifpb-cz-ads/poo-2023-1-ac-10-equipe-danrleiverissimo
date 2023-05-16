package CBBatividade1;

public class RegistraAluno {
    private String nome;
    private String endereco;
    private int idade;
    
    public RegistraAluno(String nome, String endereco, int idade) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
    }
    
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimir(){
        System.out.println("nome: " + nome);
        System.out.println("endereço: " + endereco);
        System.out.println("idade: " + idade);
    }

    public void imprimir(double mNota, double pNota, double gNota){
        System.out.println("nome: " + nome);
        System.out.println("nota Matematica: " + mNota);
        System.out.println("nota portugues: " + pNota);
        System.out.println("nota Geografia: " + gNota);
        
    }
}
