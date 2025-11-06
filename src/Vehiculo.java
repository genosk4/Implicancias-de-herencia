public abstract class Vehiculo {
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract void encender();
    public abstract void apagar();

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }

    public String getInfo() {
        return marca + " " + modelo;
    }
}
