package gui;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Estudiantes;

public class GestionEstudiantes {
    public static void main(String[] args) {
        // Ahora el ArrayList no es de Strings, sino de objetos Estudiante
        ArrayList<Estudiantes> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Registro de Estudiantes (POO) ---");

        while (true) {
            try {
                System.out.print("Ingrese nombre (o 'fin'): ");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("fin")) break;

                if (input.trim().isEmpty()) {
                    throw new Exception("El nombre no puede estar vacío.");
                }

                // CREAMOS el objeto y lo añadimos a la lista
                Estudiantes nuevoEstudiante = new Estudiantes(input);
                lista.add(nuevoEstudiante);

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // Mostrar la lista
        System.out.println("\n--- Lista de Objetos Estudiante ---");
        for (Estudiantes est : lista) {
            System.out.println("Estudiante: " + est.getNombre());
        }

        scanner.close();
    }
}
