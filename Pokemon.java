package logica;

public abstract class Pokemon {
    protected int num_pokedex;
    protected String nombrePokemon;
    protected float pesoPokemon;
    protected char sexo;
    protected int temporadaQueAparece;
    protected String tipo;

    public Pokemon() {
    }

    public Pokemon(int num_pokedex, String nombrePokemon, float pesoPokemon, char sexo, int temporadaQueAparece, String tipo) {
        this.num_pokedex = num_pokedex;
        this.nombrePokemon = nombrePokemon;
        this.pesoPokemon = pesoPokemon;
        this.sexo = sexo;
        this.temporadaQueAparece = temporadaQueAparece;
        this.tipo = tipo;
    }

    public int getNum_pokedex() {
        return num_pokedex;
    }

    public void setNum_pokedex(int num_pokedex) {
        this.num_pokedex = num_pokedex;
    }

    public String getNombrePokemon() {
        return nombrePokemon;
    }

    public void setNombrePokemon(String nombrePokemon) {
        this.nombrePokemon = nombrePokemon;
    }

    public float getPesoPokemon() {
        return pesoPokemon;
    }

    public void setPesoPokemon(float pesoPokemon) {
        this.pesoPokemon = pesoPokemon;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getTemporadaQueAparece() {
        return temporadaQueAparece;
    }

    public void setTemporadaQueAparece(int temporadaQueAparece) {
        this.temporadaQueAparece = temporadaQueAparece;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    abstract void atacarPlacaje();
    abstract void atacarArañazo();
    abstract void atacarMordisco();
    
    
    abstract void mostrarInfo();
}
