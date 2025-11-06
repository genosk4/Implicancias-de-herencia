public abstract class Persona {
    protected String nombre;
    protected int edad;
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void realizarActividad();

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }
}
