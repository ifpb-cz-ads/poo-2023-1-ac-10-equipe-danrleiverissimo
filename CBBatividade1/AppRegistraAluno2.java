package CBBatividade1;

public class AppRegistraAluno2 {
    public static void main(String[] args) {
        var joao = new RegistraAluno("joao querido", "rua fulano de tal, 4510", 23);
        double nota1 = 2.2, nota2 = 5.3, nota3 = 6.7;

        joao.imprimir(nota1, nota2, nota3);
    }

}
