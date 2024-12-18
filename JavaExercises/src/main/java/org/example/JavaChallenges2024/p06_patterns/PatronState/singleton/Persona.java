package org.example.JavaChallenges2024.p06_patterns.PatronState.singleton;

public class Persona {

    // Atributos de la persona
    private String nombre;
    private int edad;

    // Instancia estática única de la clase
    private static Persona instancia;

    // Constructor privado para evitar la creación de instancias desde fuera de la clase
    private Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método estático para obtener la instancia única de la clase Persona
    public static Persona getInstancia(String nombre, int edad) {
        // Si la instancia aún no ha sido creada, la creamos
        if (instancia == null) {
            instancia = new Persona(nombre, edad);
        }
        return instancia;
    }

    // Métodos de la clase Persona
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
