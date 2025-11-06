public class Empleado extends Persona {
    private Departamento departamento;
    private Vehiculo vehiculo;

    public Empleado(String nombre, int edad, Departamento departamento) {
        super(nombre, edad);
        this.departamento = departamento;
    }

    @Override
    public void realizarActividad() {
        System.out.println(nombre + " está trabajando ");
    }

    public void asignarVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }


    public Departamento getDepartamento() { return departamento; }
    public Vehiculo getVehiculo() { return vehiculo; }
}
