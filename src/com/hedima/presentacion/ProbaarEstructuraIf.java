package com.hedima.presentacion;

public class ProbaarEstructuraIf {
    public static void main(String[] args) {

        //En base a una variable decir si es mayor de edad o menor
        //Declaro la variable
        int edad = 18;


        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        //Declarar una variable y decir si es un número positivo o negativo

        int numero = 10;
        if (numero > 0) {
            System.out.println("Es un número positivo");
        } else {
            System.out.println("Es un número negativo");
        }


        //Declarar una variable y decir si es un número par o impar
        int numero2 = 10;
        if (numero2 % 2 == 0) {
            System.out.println("Es un número par");
        } else {
            System.out.println("Es un número impar");
        }



    }
}
