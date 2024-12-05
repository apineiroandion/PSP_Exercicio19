package app.animales;

import app.App;

public class Liebre extends Thread{

    int posicion = 0;
    boolean ganador = false;

    public Liebre(){
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
            System.out.println("La liebre ha ganado");
        }
    }

    public void avanzar(){
        int avance = (int)(Math.random()*100);
        if (avance < 20){
            System.out.println("Liebre Duerme");
            System.out.println("Posicion L: "+posicion);
        }else if (avance >= 20 && avance < 40){
            System.out.println("Liebre Salta 9 pasos");
            posicion += 9;
            System.out.println("Posicion L: "+posicion);
        }else if (avance >= 40 && avance < 50){
            System.out.println("Liebre Resbala 12 pasos");
            posicion -= 12;
            if (posicion < 0){
                posicion = 0;
            }
            System.out.println("Posicion L: "+posicion);
        }else if (avance >= 50 && avance < 80){
            System.out.println("Liebre Salta 1 paso");
            posicion += 1;
            System.out.println("Posicion L: "+posicion);
        }else{
            System.out.println("Liebre Resbala 2 pasos");
            posicion -= 2;
            if (posicion < 0){
                posicion = 0;
            }
            System.out.println("Posicion L: "+posicion);
        }
    }

    public void isGanador() {
        if (posicion >= 70) {
            System.out.println("La liebre ha ganado");
            ganador = true;
            App.finCarrera();
        }
    }
    public int getPosicion(){
        return posicion;
    }
}
