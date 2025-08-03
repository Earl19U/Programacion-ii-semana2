//Earl Michael FRese Garcia 9941-23-19944
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar la cantidad de estudiantes
        System.out.print("¿Cuántos estudiantes (1-5)? ");
        int cantidad = sc.nextInt();
        sc.nextLine(); // Limpia el buffer

        // Declara arreglos para almacenar los datos
        String[] nombres = new String[cantidad];
        double[] promedios = new double[cantidad];
        String[] estados = new String[cantidad];

        // Procesa cada estudiante
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Estudiante " + (i + 1));

            // Solicita nombre
            System.out.print("Nombre: ");
            nombres[i] = sc.nextLine();

            // Solicita notas
            System.out.print("Nota 1: ");
            double nota1 = sc.nextDouble();
            System.out.print("Nota 2: ");
            double nota2 = sc.nextDouble();
            System.out.print("Nota 3: ");
            double nota3 = sc.nextDouble();
            sc.nextLine(); // Limpia el buffer

            // Calcular el promedio
            double promedio = (nota1 + nota2 + nota3) / 3.0;
            promedios[i] = promedio;

            // Determinar el estado
            String estado = "Reprobado";
            if (promedio >= 61) {
                estado = "Aprobado";
            }
            estados[i] = estado;
        }

        // Muestra los resultados
        System.out.println("\nResumen de estudiantes:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Nombre: " + nombres[i]);
            System.out.println("Promedio: " + promedios[i]);
            System.out.println("Estado: " + estados[i]);
            System.out.println();
        }

        sc.close();
    }
}
