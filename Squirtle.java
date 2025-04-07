
package logica;


public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }

    public Squirtle(int num_pokedex, String nombrePokemon, float pesoPokemon, char sexo, int temporadaQueAparece, String tipo) {
        super(num_pokedex, nombrePokemon, pesoPokemon, sexo, temporadaQueAparece, tipo);
    }
    

    @Override
    void atacarPlacaje() {
        System.out.println("Squirtle uso Placaje");
    }

    @Override
    void atacarArañazo() {
        System.out.println("Squirtle uso Arañazo");
    }

    @Override
    void atacarMordisco() {
        System.out.println("Squirtle uso Mordisco");
    }

    @Override
    public void atacarHidroBomba() {
        System.out.println("Squirtle uso Hidro Bomba");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle uso Pistola de Agua");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle uso Burbuja");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Squirtle uso Hidropulso");
    }

    @Override
    void mostrarInfo() {
        System.out.println("Nombre: "+ nombrePokemon);
        System.out.println("Número en Pokedex: "+ num_pokedex);
        System.out.println("Peso: "+ pesoPokemon);
        System.out.println("Sexo: "+ sexo);
        System.out.println("Temporada en que aparece: "+ temporadaQueAparece);
        System.out.println("Tipo: "+ tipo);
    }
    
}
