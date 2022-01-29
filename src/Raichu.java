public class Raichu extends Pokemon{
    private String nombre;
    private byte nivel;
    private int salud;

    public Raichu(String nombre,byte nivel, int salud){
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }
    public Raichu(){}

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
        return 2;
    }

    @Override
    public Pokemon evolucionar() throws NoEvolucionaException {
        throw new NoEvolucionaException();
    }

    @Override
    public String gritar() {
        return "Raichu!";
    }
}
