public class Mascota {
    private Persona duenio;
    private Animal animal;

    public Mascota(Persona duenio, Animal animal) {
        this.duenio = duenio;
        this.animal = animal;
    }

    public Persona getDuenio() {
        return duenio;
    }

    public Animal getAnimal() {
        return animal;
    }
}
