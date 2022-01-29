public abstract class Pokemon {

    private String nombre;
    private byte nivel;
    private int salud;
    private int tamanho;

    public String getNombre() {
        return nombre;
    }

    public byte getNivel() {
        return nivel;
    }

    public int getSalud() {
        return salud;
    }

    public int getTamanho() {
        return tamanho;
    }

    public abstract Pokemon evolucionar() throws NoEvolucionaException;
    public abstract String gritar();
}
