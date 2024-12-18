package org.example.JavaChallenges2024.p07_interviews;

public class Persona {
    private String nombre;
    private int edad;
    private String direccion;

    // Constructor privado para evitar la creación directa de objetos Persona
    private Persona() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public static class PersonaBuilder {
        private String nombre;
        private int edad;
        private String direccion;

        public PersonaBuilder(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public PersonaBuilder direccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public Persona build() {
            Persona persona = new Persona();
            persona.nombre = this.nombre;
            persona.edad = this.edad;
            persona.direccion = this.direccion;
            return persona;
        }
    }
}
