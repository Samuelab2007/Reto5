public class Wartortle extends Pokemon{
    private String nombre;
    private byte nivel;
    private int salud;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    @Override
    public Blastoise evolucionar(){
        Blastoise blastoise = new Blastoise();
        blastoise.setNombre(getNombre());
        blastoise.setNivel(getNivel());
        blastoise.setSalud(getSalud());
        return blastoise;
    }

    @Override
    public String gritar() {
        return "Wartortle!";
    }
}