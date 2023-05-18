package GCExercicio01;

public class Cachorro extends Mamifero {
    private String raca;

    public Cachorro(String nome, int idade, boolean amamenta, String raca) {
        super(nome, idade, amamenta);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void mover() {
        System.out.println("Cachorro corre");
    }

    public void latir() {
        System.out.println("Au au!");
    }
}
