package app;

import app.animales.Liebre;
import app.animales.Tortuga;

public class App {
    public static boolean finCarrera = false;
    public static void main(String[] args) {
        Tortuga tortuga = new Tortuga();
        Liebre liebre = new Liebre();

        System.out.println("Inicio de la carrera");

        tortuga.start();
        liebre.start();
    }

    public static synchronized void finCarrera(){
        if (!finCarrera){
            finCarrera = true;
            System.out.println("Fin de la carrera");
        }
    }

    public static synchronized void gananLosDos(Tortuga tortuga, Liebre liebre){
        if (!finCarrera){
            finCarrera = true;
            if (tortuga.getPosicion() >= 70 && liebre.getPosicion() >= 70) {
                System.out.println("Empate");
            }
        }
    }

}
