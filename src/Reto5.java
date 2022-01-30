import java.util.InputMismatchException;
import java.util.Scanner;

public class Reto5 {

    public static void estadoPokebola(Pokebola pokebola){
        if(pokebola.getpokemonAdentro() == 1){
            System.out.println("La información del pokemon capturado es: ");
            System.out.println("Nombre: "+pokebola.getPokemonCapturado().getNombre());
            System.out.println("Salud: "+pokebola.getPokemonCapturado().getSalud());
            System.out.println("Nivel: "+pokebola.getPokemonCapturado().getNivel());

        }else{
            System.out.println("La pokebola esta vacia");
        }

    }


    static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Prueba de las funcionalidades de la aplicacion");
        System.out.println("Vamos a crear un Charmander");
        System.out.print("Nombre: ");
        String nombre = lector.next();
        byte nivel = 0;
        int salud = 0;
        try {
            System.out.print("Nivel: ");
            nivel = lector.nextByte();
            if (nivel <= 0) {
                throw new NivelNoSoportadoException();
            }

        } catch (NivelNoSoportadoException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        } catch (InputMismatchException e) {
            System.out.println("El nivel ingresado tiene que ser un numero entero en el rango: 1 - 127");
            System.exit(0);
        }
        try {
            System.out.print("Salud: ");
            salud = lector.nextInt();
            if (salud < 0) {
                throw new NivelNoSoportadoException();
            }
        }catch (NivelNoSoportadoException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }catch(InputMismatchException e){
                System.out.println("Solo se permiten numeros enteros positivos");
                System.exit(0);
        }


        Charmander miCharmander = new Charmander(nombre, nivel, salud);

        System.out.println("\nAhora usamos los métodos gritar y evolucionar");
        System.out.println("Grito: " + miCharmander.gritar());
        System.out.println("Evolucion...");
        Charmeleon miCharmeleon = miCharmander.evolucionar();       //Crea una copia, para evitar crear demasiados objetos.

        System.out.println("Su Charmander ha evolucionado a charmeleon\n");
        System.out.println("Para probar que es el mismo, vamos a mostrarte sus datos\n");
        System.out.println("Nombre: " + miCharmeleon.getNombre());
        System.out.println("Nivel: " + miCharmeleon.getNivel());
        System.out.println("Salud: " + miCharmeleon.getSalud());

        System.out.println("Grito: " + miCharmeleon.gritar());
        System.out.println("\nRepetimos el proceso, obteniendo un Charizard");
        Charizard miCharizard = miCharmeleon.evolucionar();

        System.out.println("Los atributos de nombre, salud y nivel siempre se mantienen al evolucionar");
        System.out.println("Grito: " + miCharizard.gritar());

        System.out.println("Charizard es la ultima evolucion, por lo cual si lo intentara evolucionar me arrojaría una excepción\n");

        try {
            miCharizard.evolucionar();
        } catch (NoEvolucionaException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nAhora veamos lo que son las capturas de los pokemon");
        System.out.println("Si la pokebola tiene un tamaño menor que el pokemon a capturar esta no podrá");
        Pokebola masterBall = new Pokebola(2);
        System.out.println("La pokebola que usaremos es de tamaño 2, si intentamos capturar un charizard, no será posible");
        System.out.println(masterBall.capturar(miCharizard));

        Wartortle miWartortle = new Wartortle("Wartortle",(byte)20,1200);
        System.out.println("\nSi intentamos con un Wartortle predeterminado, que tiene tamaño 2, la captura será exitosa");
        System.out.println(masterBall.capturar(miWartortle));

        estadoPokebola(masterBall);

    }

}
