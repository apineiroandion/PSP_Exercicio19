package app.animales;

import app.App;

public class Tortuga extends Thread{

    int posicion = 0;
    boolean ganador = false;

    public Tortuga(){
        super();
    }

    public void run(){
        while (posicion < 70 && !App.finCarrera){
            avanzar();
            isGanador();
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Error: "+e.getMessage());
            }
        }
        if (ganador){
            System.out.println("La tortuga ha ganado");
        }
    }

    public void avanzar(){
        int avance = (int)(Math.random()*100);
        if (avance < 50){
            System.out.println("Tortuga avanza 3 pasos");
            posicion += 3;
            System.out.println("Posicion T: "+posicion);
        }else if (avance >= 50 && avance < 70){
            System.out.println("Tortuga retrocede 6 pasos");
            posicion -= 6;
            if (posicion < 0){
                posicion = 0;
            }
            System.out.println("Posicion T: "+posicion);
        }else{
            System.out.println("Tortuga avanza 1 paso");
            posicion += 1;
            System.out.println("Posicion T: "+posicion);
        }
    }

    public void isGanador() {
        if (posicion >= 70) {
            System.out.println("La tortuga ha ganado");
            ganador = true;
            App.finCarrera();
        }
    }

    public void pararCarrrera(){
        this.interrupt();
    }

    public int getPosicion(){
        return posicion;
    }

}
