public class Reto5 {


    public static void main(String[] args){

        Charmander miCharmander = new Charmander("ab2", (byte) 4,12);

        System.out.println(miCharmander.getNombre());
        System.out.println(miCharmander.getNivel());
        System.out.println(miCharmander.getSalud());
        System.out.println("Grito: "+miCharmander.gritar());
        System.out.println("Evolucion");


        Charmeleon miCharmeleon = miCharmander.evolucionar();       //Crea una copia, para evitar crear demasiados objetos.

        System.out.println(miCharmeleon.gritar());
        System.out.println(miCharmeleon.getNombre());


        Charizard miCharizard = miCharmeleon.evolucionar();
        System.out.println(miCharizard.gritar());
        System.out.println(miCharizard.getSalud());

        Pokebola masterBall = new Pokebola(2);

        System.out.println(masterBall.capturar(miCharmander));


        //Consultar información del pokemon que esta o no está por dentro
        if(masterBall.getpokemonAdentro() == 1){
            System.out.println("La información del pokemon es: ");
            System.out.println(masterBall.getPokemonCapturado().getNombre());
            System.out.println(masterBall.getPokemonCapturado().getSalud());
            System.out.println(masterBall.getPokemonCapturado().getNivel());

        }else{
            System.out.println("La pokebola esta vacia");
        }


    }

}
