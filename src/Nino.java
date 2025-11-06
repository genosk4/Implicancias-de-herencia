public class Nino extends Persona {
    private Escuela escuela;

    public Nino(String nombre, int edad, Escuela escuela) {
        super(nombre, edad);
        this.escuela = escuela;
    }

    @Override
    public void realizarActividad() {
        System.out.println(nombre + "está jugando");
    }

    public void irEscuela() {
        System.out.println(nombre + "va a la escuela" + escuela.getNombre());
    }
}
