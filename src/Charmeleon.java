public class Charmeleon extends Pokemon{
    private String nombre;
    private byte nivel;
    private int salud;

    public Charmeleon(String nombre, byte nivel, int salud){
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }
    public Charmeleon(){}

    @Override
    public Pokemon evolucionar() {
        Charizard charizard = new Charizard();
        charizard.setNombre(getNombre());
        charizard.setNivel(getNivel());
        charizard.setSalud(getSalud());
        return charizard;
    }

    @Override
    public String gritar() {
        return "Charmeleon!";
    }

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
}
