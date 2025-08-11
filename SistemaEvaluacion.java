//Earl Michael Frese García 9941/23/19944

import java.util.Arrays;
import java.util.Scanner;

public class SistemaEvaluacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // necesitamos pedir el nombre del estudiante
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        // es crucial saber cuantas notas se van a ingresar
        System.out.print("¿Cuántas notas quiere ingresar? ");
        int cantidadNotas = scanner.nextInt();

        // verificar que se ingrese minimo una nota
        if (cantidadNotas < 1) {
            System.out.println("Error: debe ingresar al menos una nota.");
        } else {
            // se crea un arreglo con la cantidad de notas indicada
            double[] notas = new double[cantidadNotas];

            // se debe leer cada nota desde el usuario
            for (int i = 0; i < cantidadNotas; i++) {
                System.out.print("Ingrese la nota #" + (i + 1) + ": ");
                notas[i] = scanner.nextDouble();  // guardamos la nota en el arreglo
            }

            // llamamos al procedimiento para mostrar el resultado completo
            mostrarResultado(nombre, notas);
        }

        scanner.close();  // cerramos el scanner para no dejarlo abierto
    }

    // esta función: calcula el promedio de un arreglo de notas
    public static double calcularPromedio(double[] notas) {
        double suma = 0;  // inicializamos suma en 0
        for (double nota : notas) {
            suma += nota;  // vamos sumando cada nota
        }
        return suma / notas.length;  // dividimos entre la cantidad de notas
    }

    // esta funcion: determina la calificación literal (A, B, C, D o F)
    public static char obtenerLiteral(double promedio) {
        // Usamos rangos de promedio para devolver la letra correspondiente
        if (promedio >= 90 && promedio <= 100) {
            return 'A';
        } else if (promedio >= 80) {
            return 'B';
        } else if (promedio >= 70) {
            return 'C';
        } else if (promedio >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // esta función: decide si aprueba o no según la literal
    public static boolean estaAprobado(char literal) {
        // Retorna true solo si es A, B o C
        return (literal == 'A' || literal == 'B' || literal == 'C');
    }

    // imprime todos los resultados del estudiante
    public static void mostrarResultado(String nombre, double[] notas) {
        double promedio = calcularPromedio(notas);      // obtenemos promedio
        char literal = obtenerLiteral(promedio);         // obtenemos la letra
        boolean aprobado = estaAprobado(literal);        // verificamos si aprueba

        // Imprimimos todos los datos con formato legible
        System.out.println("\nEstudiante: " + nombre);
        System.out.println("Notas: " + Arrays.toString(notas)); // convierte el arreglo en texto
        System.out.printf("Promedio: %.2f%n", promedio);       // muestra con dos decimales
        System.out.println("Literal: " + literal);
        System.out.println("Resultado: " + (aprobado ? "Aprobado ✅" : "Reprobado ❌"));
    }
}
