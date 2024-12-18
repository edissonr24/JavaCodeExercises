package org.example.JavaChallenges2024.p06_patterns.PatronState.singleton;

public class MainPersonaSingleton {
    public static void main(String[] args) {
        // Obtener la instancia única de la clase Persona
        Persona persona1 = Persona.getInstancia("Juan", 30);
        Persona persona2 = Persona.getInstancia("Maria", 25);

        // Verificar si ambas variables se refieren a la misma instancia
        System.out.println(persona1 == persona2); // Debe imprimir "true"

        // Mostrar la información de la persona
        persona1.mostrarInformacion();
        persona2.mostrarInformacion();
    }
}
