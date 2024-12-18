package org.example.JavaChallenges2024.p07_interviews;

public class MainPersona {
    public static void main(String[] args) {
        // Creamos un objeto Persona usando el Builder
        Persona persona = new Persona.PersonaBuilder("Edisson", 37)
                .direccion("Medellin Calle 123")
                .build();

        // Podemos imprimir la información de la persona
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Dirección: " + persona.getDireccion());
    }
}
