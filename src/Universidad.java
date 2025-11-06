import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Facultad> facultades;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.facultades = new ArrayList<>();
    }

    public void agregarFacultad(Facultad facultad) {
        facultades.add(facultad);
    }
}