public class Perro extends Animal {
    public Perro(String nombre, String color) {
        super(nombre, color);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " está ladrando");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " está comiendo croquetas");
    }
}
