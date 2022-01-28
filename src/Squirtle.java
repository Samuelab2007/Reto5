public class Squirtle extends Pokemon{
    private String nombre;
    private byte nivel;
    private int salud;

    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

    public byte getNivel() {
        return nivel;
    }


    @Override
    public Wartortle evolucionar() {
        Wartortle wartortle = new Wartortle();
        wartortle.setNombre(getNombre());
        wartortle.setNivel(getNivel());
        wartortle.setSalud(getSalud());
        return wartortle;
    }

    @Override
    public String gritar() {
        return "Squirtle!";
    }
}
