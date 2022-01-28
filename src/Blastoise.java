public class Blastoise extends Pokemon{
    private String nombre;
    private byte nivel;
    private int salud;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivel(byte nivel) {
        this.nivel = nivel;
    }

    public void setSalud(int salud) {
        this.salud = salud;
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
