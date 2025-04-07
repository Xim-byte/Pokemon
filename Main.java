package logica;


public class Main {


    public static void main(String[] args) {
        Charmander c1 = new Charmander(364, "Llama", 89, 'F', 2, "Fuego");
        Bulbasaur b1 = new Bulbasaur(85, "Flora", 96, 'F', 10, "Planta");
        Squirtle s1 = new Squirtle(608, "Hidro", 26, 'M', 7, "Agua");
        Pikachu p1= new Pikachu(1, "Pika Pika", 37, 'F', 1, "Eléctrico");
        
        
        c1.mostrarInfo();
        System.out.println("");
        System.out.println("---------------------------------");
        b1.mostrarInfo();
        System.out.println("");
        System.out.println("---------------------------------");
        s1.mostrarInfo();
        System.out.println("");
        System.out.println("---------------------------------");
        p1.mostrarInfo();
        System.out.println("");
        System.out.println("---------------------------------");
        
        c1.atacarArañazo();
        b1.atacarParalizar();
        s1.atacarHidropulso();
        p1.atacarRayo();
    }
    
}
