import java.util.Scanner;

public class variables {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = teclado.nextInt();
        System.out.print("Ingrese su estatura: ");
        float estatura = teclado.nextFloat();
        System.out.print("¿Es estudiante? (true/false): ");
        boolean estudiante = teclado.nextBoolean();
        System.out.println("\nDatos ingresados:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);
        System.out.println("Estudiante: " + estudiante);
    }
}


