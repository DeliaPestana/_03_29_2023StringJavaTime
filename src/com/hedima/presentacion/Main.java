package com.hedima.presentacion;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class Main {
    public static void main(String[] args)
    {
//        System.out.println("Hello world!");
//        Métodos de la classe String
        /*
        String frase = "La casa Verde";
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        System.out.println("Longitud de la frase " + frase.length());
        System.out.println(frase.substring(2, 4));
        System.out.println(frase.substring(0, 2));
        System.out.println("La primera posición de la a " +frase.indexOf("a"));
        System.out.println("la última posición de la a " +frase.lastIndexOf("a"));
        String frase2 = "La casa Verde";
        System.out.println(frase.equals(frase2));
*/
        /*
         * Crear la cadena de texto: “Nunca mates una mosca sobre la cabeza de un tigre.”
         * Mostrar la cadena toda en mayúsculas
         * Mostrar la cadena en minúsculas
         * Mostrar solo la palabra Nunca
         * Mostrar solo la palabra mosca
         * Mostrar la palabra cabeza
         * Mostrar la posición de la letra primera m
         * Devolver la longitud de la cadena
         */
/*
        String frase = "Nunca mates una mosca sobre la cabeza de un tigre.";
        System.out.println("La frase en mayúscula: " + frase.toUpperCase());
        System.out.println("La frase en minúscula: " + frase.toLowerCase());
        System.out.println("La palabra Nunca: " + frase.substring(0, 5));
        System.out.println("La palabra mosca: " + frase.substring(16, 21));
        System.out.println("La palabra cabeza: " + frase.substring(31, 37));
        System.out.println("La primera posición de la m " +frase.indexOf("m"));
        System.out.println("Longitud de la frase " + frase.length());
*/
// Código de Gabriela:
/*
        System.out.println("Ejemplo de Gabriela");

        String texto = "Nunca mates una mosca sobre la cabeza de un tigre";
        System.out.println("Todo mayúsculas: " + texto.toUpperCase());
        System.out.println("Todo minusculas: " + texto.toLowerCase());
        System.out.println("Mostrar solo primera palabra: " + texto.substring(0, texto.indexOf(" ")));
        System.out.println("Extraer palabra 'mosca': (" + texto.substring(16, 21) +")");
        System.out.println("Mostrar solo la palabra mosca : (" + texto.substring(texto.indexOf("mosca"), texto.indexOf("mosca")+"mosca".length())+")");
        System.out.println("Extraer palabra 'cabeza': " + texto.substring(31, 37));
        System.out.println("Mostrar la palabra cabeza : (" + texto.substring(texto.indexOf("cabeza"), texto.indexOf("cabeza")+"cabeza".length())+ ")");
        System.out.println("Posición de la primera letra 'm':" + texto.indexOf('m'));
        System.out.println("La longitud de la cadena es: " + texto.length());

        LocalDate date = LocalDate.of(2031, 11, 26);
        System.out.println(date);
        //Segunda forma
        LocalDate date2 = LocalDate.of(2031, Month.NOVEMBER, 26);
        System.out.println("Segunda forma de mostrar la fecha: " +date2);
        //Tercera forma
        LocalDate date3 = LocalDate.parse("2031-11-26");
        System.out.println("Tercera forma de mostrar la fecha: " +date3);

        System.out.println(date.plusDays(2));
        System.out.println(date.plusMonths(3));
        System.out.println(date.plusYears(1));
        System.out.println(date.minusDays(2));
        System.out.println(date.minusMonths(3));
        System.out.println(date.minusYears(1));

        LocalDate date4 = LocalDate.of(2031, Month.NOVEMBER,26 );
        System.out.println(date2.isBefore(date4));
        System.out.println(date2.isAfter(date4));

        System.out.println(LocalDate.now());
        System.out.println(Period.between(date4,LocalDate.now()));

        System.out.println(Period.between(date4,LocalDate.now()).getYears());

        System.out.println(Period.between(date2, LocalDate.now()).getYears());
//        Primera forma de armar tiempos
        LocalTime horaInicio = LocalTime.of(12,0);
        System.out.println("horaInicio -> " + horaInicio);
        LocalTime horaFin = LocalTime.parse("12:00:00.001");
        System.out.println(horaFin);

        System.out.println(horaInicio.plusHours(1));
        System.out.println(horaInicio.minusMinutes(1));
        System.out.println(horaInicio.isBefore(horaFin));

*/

//        Ejercicio

        //Definir una fecha de fabricación y una fecha de expiración
        //Calcular los días, meses, años para que caduque

        //Definir una fecha de fabricación y una fecha de expiración
        //Calcular los días, meses, años para que caduque

        LocalDate fecha_fabric = LocalDate.of(2021, 8, 1);
        LocalDate fecha_expira = LocalDate.of(2022, 10, 5);

        System.out.println(Period.between(fecha_fabric, fecha_expira));//Sacar total
        System.out.println("Años: "+Period.between(fecha_fabric, fecha_expira).getYears());//Sólo años
        System.out.println("Meses: "+Period.between(fecha_fabric, fecha_expira).getMonths());//Sólo meses
        System.out.println("Días: "+Period.between(fecha_fabric, fecha_expira).getDays());//Sólo días








    }
}