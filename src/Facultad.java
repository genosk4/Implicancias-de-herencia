import java.util.ArrayList;
import java.util.List;

public class Facultad {
    private String nombre;
    private List<Departamento> departamentos;

    public Facultad(String nombre) {
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();
    }

    public void agregarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }
}
