public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo moto " + getInfo());
    }

    @Override
    public void apagar() {
        System.out.println("Apagando moto " + getInfo());
    }

    public int getCilindrada() {
        return cilindrada;
    }
}
