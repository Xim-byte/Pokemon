package logica;


public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    }

    public Pikachu(int num_pokedex, String nombrePokemon, float pesoPokemon, char sexo, int temporadaQueAparece, String tipo) {
        super(num_pokedex, nombrePokemon, pesoPokemon, sexo, temporadaQueAparece, tipo);
    }

    @Override
    void atacarPlacaje() {
        System.out.println("Pikachu usa Placaje");
    }

    @Override
    void atacarArañazo() {
        System.out.println("Pikachu usa Arañazo");
    }

    @Override
    void atacarMordisco() {
        System.out.println("Pikachu usa Mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Pikachu usa Impacto Trueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Pikachu usa Puño Trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Pikachu usa Rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Pikachu usa Rayo Carga");
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
