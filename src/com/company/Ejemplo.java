package com.company;
interface Persona{
    void hablar(String mensaje);
}
public class Ejemplo {
    var p = new Persona(){
        @Override
        public void hablar(String mensaje) {
            System.out.println("La clase anonima esta diciendo: "+mensaje);
        }
    }

    p.hablar(mensaje "hola a todos");

}
