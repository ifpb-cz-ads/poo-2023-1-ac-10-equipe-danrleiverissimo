package GCExercicio01;

public class Cobra extends Reptil {
    private String veneno;

    public Cobra(String nome, int idade, boolean viveEmTerra, String veneno) {
        super(nome, idade, viveEmTerra);
        this.veneno = veneno;
    }

    public String getVeneno() {
        return veneno;
    }
    public void setVeneno (String veneno){
        this.veneno = veneno;
    }
    @Override
    public void mover() {
        System.out.println("Cobra rasteja");
    }

    public void picar() {
        System.out.println("Cobra pica");
    }
}