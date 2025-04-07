package logica;



public class Bulbasaur extends Pokemon implements IPlanta{

    public Bulbasaur() {
    }

    public Bulbasaur(int num_pokedex, String nombrePokemon, float pesoPokemon, char sexo, int temporadaQueAparece, String tipo) {
        super(num_pokedex, nombrePokemon, pesoPokemon, sexo, temporadaQueAparece, tipo);
    }

    @Override
    void atacarPlacaje() {
        System.out.println("Bulbasaur usa Placaje");
    }

    @Override
    void atacarArañazo() {
        System.out.println("Bulbasaur usa Arañazo");
    }

    @Override
    void atacarMordisco() {
        System.out.println("Bulbasaur usa Mordisco");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Bulbasaur usa Paralizar");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Bulbasaur usa Drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Bulbasaur usa Hoja Afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Bulbasaur usa Latigo Cepa");
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
