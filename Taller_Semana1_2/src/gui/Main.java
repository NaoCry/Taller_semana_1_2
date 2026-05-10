package gui;

import entity.Contador;
import entity.Operacion;
import entity.Persona;

public class Main {
	
public static void main(String[] args) {
        
        // Crear 2 objetos de la clase Persona
        Persona persona1 = new Persona("Antonio", 28);
        Persona persona2 = new Persona("Maria", 32);

        // Mostrar la información de cada objeto
        System.out.println("--- Información de Personas ---");
        persona1.mostrarDatos();
        persona2.mostrarDatos();
        
        
        Operacion op = new Operacion();
        // Probando la sobrecarga
        int res1 = op.sumar(5, 10);
        double res2 = op.sumar(4.5, 3.2);
        int res3 = op.sumar(10, 20, 30);

        // Mostrar resultados
        System.out.println("--- Resultados de Sobrecarga ---");
        System.out.println("Suma de 2 enteros (5 + 10): " + res1);
        System.out.println("Suma de 2 doubles (4.5 + 3.2): " + res2);
        System.out.println("Suma de 3 enteros (10 + 20 + 30): " + res3);
        
        
        // Creamos varios objetos de la clase Contador
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
        Contador c4 = new Contador();

        // Mostramos el resultado
        // Nota: Podemos llamar al método usando el nombre de la clase
        Contador.mostrarTotal();
        
    }
}
