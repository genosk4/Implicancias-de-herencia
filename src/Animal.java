public abstract class Animal {
    protected String nombre;
    protected String color;

    public Animal(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public abstract void hacerSonido();
    public abstract void comer();

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }
}
