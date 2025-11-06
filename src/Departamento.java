public class Departamento {
    private String nombre;
    private List<Carrera> carreras;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.carreras = new ArrayList<>();
    }

    public void agregarCarrera(Carrera carrera) {
        carreras.add(carrera);
    }
}
