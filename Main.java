
//Earl Michael FRese Garcia 9941-23-19944
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // inicia con Scanner
        System.out.print("Ingresa tu nombre: "); //// solicita el nombre del usuario
        String nombre = sc.nextLine();        // Lee el nombre
        System.out.print("Ingresa tu año de nacimiento: "); //solicita el año de nacimiento
        int añoDeNacimiento = sc.nextInt();   // Lee el año
        int añoactual = 2025;

        int edad = añoactual - añoDeNacimiento;
        System.out.println("Hola " + nombre + ",Tu edad es de " + edad + ".");
    }}