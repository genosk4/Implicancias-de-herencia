import java.util.ArrayList;
import java.util.List;

public class Escuela {
    private String nombre;
    private List<Nino> ninos;

    public Escuela(String nombre, List<Nino> ninos) {
        this.nombre = nombre;
        this.ninos = new ArrayList<>();
    }

    public void agregarNino(Nino nino) {
        ninos.add(nino);
    }

    public List<Nino> getNinos() {
        return ninos;
    }

    public String getNombre() {
        return nombre;
    }
}
