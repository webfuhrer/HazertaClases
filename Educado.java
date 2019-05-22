
package com.mycompany.mavenproject1;

public class Educado {
    public static void main(String[] argumentos) {
        Persona p=new Persona();
        p.apellido="Perez";
        p.edad=32;
        p.nombre="Manuel";
        
        System.out.println("La persona se llama "+p.nombre+" "+p.apellido
        +" y tiene "+p.edad+" años");
        Persona x=new Persona();
        x.nombre="Ana";
        x.apellido="Gil";
        x.edad=40;
        System.out.println("La persona se llama "+x.nombre+" "+x.apellido
        +" y tiene "+x.edad+" años");
    }
  
}
