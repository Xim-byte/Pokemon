package logica;


public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }

    public Charmander(int num_pokedex, String nombrePokemon, float pesoPokemon, char sexo, int temporadaQueAparece, String tipo) {
        super(num_pokedex, nombrePokemon, pesoPokemon, sexo, temporadaQueAparece, tipo);
    }

    @Override
    public void atacarPunioFuego() {
       System.out.println("Charmander utilizó Punio Fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander utilizó Ascuas");
    }

    @Override
    public void atacarLanzarLlamas() {
        System.out.println("Charmander utilizó Lanzar Llamas");
    }
    
    @Override
    public void atacarPlacaje(){
        System.out.println("Charmander utilizó Placaje");
    }

    @Override
    void atacarArañazo() {
        System.out.println("Charmander utilizó Arañazo");
    }

    @Override
    void atacarMordisco() {
        System.out.println("Charmander utilizó Mordisco");
    }

    @Override
    void mostrarInfo(){
        System.out.println("Nombre: "+ nombrePokemon);
        System.out.println("Número en Pokedex: "+ num_pokedex);
        System.out.println("Peso: "+ pesoPokemon);
        System.out.println("Sexo: "+ sexo);
        System.out.println("Temporada en que aparece: "+ temporadaQueAparece);
        System.out.println("Tipo: "+ tipo);
    }
    
}
