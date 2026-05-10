package gui;
import java.util.Scanner;

public class CalculadoraBasica {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("--- Mi Calculadora en Java ---");
        
        // Ingreso de los números
        System.out.print("Ingresa el primer número: ");
        double num1 = leer.nextDouble();
        
        System.out.print("Ingresa el segundo número: ");
        double num2 = leer.nextDouble();
        
        // Elección de la operación
        System.out.println("\nElige una operación:");
        System.out.println("1. Suma (+)");
        System.out.println("2. Resta (-)");
        System.out.println("3. Multiplicación (*)");
        System.out.println("4. División (/)");
        System.out.print("Opción: ");
        int opcion = leer.nextInt();
        
        double resultado = 0;
        boolean operacionValida = true;
        
        // Proceso de la operación
        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                // Validación para evitar división por cero
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                    operacionValida = false;
                }
                break;
            default:
                System.out.println("Opción no válida.");
                operacionValida = false;
                break;
        }
        
        // Mostrar el resultado
        if (operacionValida) {
            System.out.println("\nEl resultado es: " + resultado);
        }
        
        leer.close();
    }
}