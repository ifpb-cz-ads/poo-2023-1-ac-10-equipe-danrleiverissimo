package GCExercicio01;

public abstract class Reptil extends Animal {
    private boolean viveEmTerra;

    public Reptil(String nome, int idade, boolean viveEmTerra) {
        super(nome, idade);
        this.viveEmTerra = viveEmTerra;
    }

    public boolean ViveEmTerra() {
        return viveEmTerra;
    }

    @Override
    public abstract void mover();
}
