class Pokebola {
    private final int tamanho;
    private Pokemon pokemonCapturado;
    private byte pokemonAdentro;

    public Pokebola(int tamanho) {
        this.tamanho = tamanho;
    }


    public Pokemon getPokemonCapturado() {
        return pokemonCapturado;
    }

    public byte getpokemonAdentro() {
        return pokemonAdentro;
    }

    public void setPokemonCapturado(Pokemon pokemonCapturado) {
        this.pokemonCapturado = pokemonCapturado;
    }

    public String capturar(Pokemon pokemonCapturado){
        if(this.tamanho >= pokemonCapturado.getTamanho()){
            setPokemonCapturado(pokemonCapturado);
            pokemonAdentro = 1;
            return "Capturado";

        }else{
            pokemonAdentro = 0;
            return "Demasiado grande para capturar";
        }

    }

}
