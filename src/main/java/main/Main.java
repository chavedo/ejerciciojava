/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author mariano
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un programa en java en el cual se pida al usuario ingresar su nombre, apellido, edad, hobbie, 
        //editor de código preferido, sistema operativo que utiliza, luego deberá mostrarse por consola los datos ingresados.
        //El programa deber ser subido a un repositorio de GitHub, pegar el link del ejercicio resuelto en el siguiente recuadro
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        String nombre = scanobj.nextLine();
        System.out.println("Ingrese su apellido:");
        String apellido = scanobj.nextLine();
        System.out.println("Ingrese su edad:");
        String edad = scanobj.nextLine();
        System.out.println("Ingrese su hobbie:");
        String hobbie = scanobj.nextLine();
        System.out.println("Ingrese su IDE favorito:");
        String ide = scanobj.nextLine();
        System.out.println("Ingrese el Sistema Operativo que utiliza:");
        String os = scanobj.nextLine();
        System.out.println("Su nombre y apellido es " + nombre + " " +  apellido
                + ", tiene" + edad + "años" + ", su hobbie es " + hobbie + 
                ", su IDE preferido es " + ide + " y utiliza " + os);
    }

}
