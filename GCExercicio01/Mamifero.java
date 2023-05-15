package GCExercicio01;

public abstract class Mamifero extends Animal {
    private boolean amamenta;

    public Mamifero(String nome, int idade, boolean amamenta) {
        super(nome, idade);
        this.amamenta = amamenta;
    }

    public boolean Amamenta() {
        return amamenta;
    }

    @Override
    public abstract void mover();
}