public class Gato extends Animal {
    private String caracter;

    public Gato(String nombre, String color, String caracter) {
        super(nombre, color);
        this.caracter = caracter;
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " está maullando");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " está comiendo pescado");
    }

    public void morder() {
        System.out.println(nombre + " está mordiendo (carácter: " + caracter + ")");
    }

    public void rasgunar() {
        System.out.println(nombre + " está rasguñando (carácter: " + caracter + ")");
    }
}