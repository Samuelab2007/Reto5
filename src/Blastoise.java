public class Blastoise extends Pokemon{
    private String nombre;
    private byte nivel;
    private int salud;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public void setNivel(byte nivel) {
        this.nivel = nivel;
    }

    @Override
    public byte getNivel() {
        return nivel;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    @Override
    public int getSalud() {
        return salud;
    }

    @Override
    public int getTamanho() {
        return 3;
    }

    @Override
    public Pokemon evolucionar() throws NoEvolucionaException {
        throw new NoEvolucionaException();
    }
    @Override
    public String gritar() {
        return "Blastoise!";
    }
}
