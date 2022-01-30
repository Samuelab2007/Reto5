public class Wartortle extends Pokemon{
    private String nombre;
    private byte nivel;
    private int salud;

    public Wartortle(String nombre, byte nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }
    public Wartortle(){}

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
    public int getTamanho() {
        return 2;
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
