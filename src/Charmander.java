public class Charmander extends Pokemon{
    private String nombre;
    private byte nivel;
    private int salud;
    private final int tamanho;

    public Charmander(String nombre, byte nivel, int salud){
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
        this.tamanho = 1;
    }

    @Override
    public Charmeleon evolucionar() {
        Charmeleon charmeleon = new Charmeleon();
        charmeleon.setNombre(getNombre());
        charmeleon.setNivel(getNivel());
        charmeleon.setSalud(getSalud());
        return charmeleon;
    }

    @Override
    public String gritar() {
        return "Charmander!";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNivel(byte nivel) {
        this.nivel = nivel;
    }

    public byte getNivel() {
        return nivel;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    @Override
    public int getTamanho() {
        return tamanho;
    }

    public int getSalud() {
        return salud;
    }
}
