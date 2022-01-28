public class Charizard extends Pokemon{
    private String nombre;
    private byte nivel;
    private int salud;

    @Override
    public Pokemon evolucionar() throws NoEvolucionaException{
        throw new NoEvolucionaException();
    }

    @Override
    public String gritar() {
        return "Charizard!";
    }

    public byte getNivel() {
        return nivel;
    }

    public void setNivel(byte nivel) {
        this.nivel = nivel;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
