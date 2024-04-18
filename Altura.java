
import java.util.ArrayList;

public class Altura {
    String nombre;
    int altura;

    public Altura(String nombre, int altura) {
        this.nombre = nombre;
        this.altura = altura;
    }

    public static void main(String[] args) {
        
        ArrayList<Altura> alturaAlumnos = new ArrayList<>();

       
        alturaAlumnos.add(new Altura("Estudiante1", 175));
        alturaAlumnos.add(new Altura("Estudiante2", 168));
        alturaAlumnos.add(new Altura("Estudiante3", 180));
        alturaAlumnos.add(new Altura("Estudiante4", 160));

        // Mostrar lista actual con el número de posición
        mostrarAlturas(alturaAlumnos);
    }

    public static void mostrarAlturas(ArrayList<Altura> alturas) {
        for (int i = 0; i < alturas.size(); i++) {
            Altura altura = alturas.get(i);
            System.out.println("Posición " + i + ": " + altura.nombre + " - " + altura.altura + " metros");
        }
    }

        
    }
