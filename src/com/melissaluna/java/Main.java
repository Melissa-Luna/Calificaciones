package com.melissaluna.java;

public class Main {



    public static void main(String[] args) {
        String nombre = "Melissa";
        System.out.println("Nombre del estudiante: "+nombre);
        int[] calif = new int[5];
        calif[0] = 100;
        calif[1] = 55;
        calif[2] = 88;
        calif[3] = 70;
        calif[4] = 96;
        int suma = 0;
        float promedio;

        System.out.println("Calificación 1: "+calif[0]);
        System.out.println("Calificación 2: "+calif[1]);
        System.out.println("Calificación 3: "+calif[2]);
        System.out.println("Calificación 4: "+calif[3]);
        System.out.println("Calificación 5: "+calif[4]);

        for (int i=0; i<calif.length; i++){
            suma+=calif[i];
        }
        promedio=(suma/calif.length);
        System.out.println("Promedio: "+promedio);

       if (promedio<=50){
           System.out.println("Calificación: F");
       }else if (promedio >=51 && promedio <=60){
           System.out.println("Calificación: E");
       }else if (promedio >=61 && promedio <=70){
           System.out.println("Calificación: D");
       }else if (promedio >=71 && promedio <=80){
           System.out.println("Calificación: C");
       }else if (promedio >=81 && promedio <=90){
           System.out.println("Calificación: B");
       }else if (promedio >=91 && promedio <=100){
           System.out.println("Calificación: A");
       }else {
           System.out.println("El promedio no entra a ningún rango");
       }


    }
}
