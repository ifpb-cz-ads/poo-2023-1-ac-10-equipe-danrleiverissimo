package GCExercicio01;

public class Gato extends Mamifero {
    private boolean gostaDeCaixa;

    public Gato(String nome, int idade, boolean amamenta, boolean gostaDeCaixa) {
        super(nome, idade, amamenta);
        this.gostaDeCaixa = gostaDeCaixa;
    }

    public boolean GostaDeCaixa() {
        return gostaDeCaixa;
    }
    public void setGostaDeCaixa(boolean gostaDeCaixa){
        this.gostaDeCaixa = gostaDeCaixa;
    }

    @Override
    public void mover() {
        System.out.println("Gato salta");
    }

    public void miar() {
        System.out.println("Miau!");
    }
}
