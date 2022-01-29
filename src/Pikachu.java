public class Pikachu extends Pokemon{
    private String nombre;
    private byte nivel;
    private int salud;
    private final int tamanho;

    public Pikachu(String nombre, byte nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
        this.tamanho = 1;
    }

    public String getNombre() {
        return nombre;
    }

    public byte getNivel() {
        return nivel;
    }

    public int getSalud() {
        return salud;
    }

    @Override
    public int getTamanho() {
        return tamanho;
    }

    @Override
    public Raichu evolucionar() throws NoEvolucionaException {
        Raichu raichu = new Raichu();
        raichu.setNombre(getNombre());
        raichu.setNivel(getNivel());
        raichu.setSalud(getSalud());
        return raichu;
    }

    @Override
    public String gritar() {
        return "Pikachu!";
    }
}
