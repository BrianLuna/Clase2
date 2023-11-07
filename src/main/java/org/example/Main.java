package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        Persona persona = new Persona("Brian", "Luna");
//        Persona persona2 = new Persona("Juan", "Perez");
//
//        ArrayList<Persona> personas = new ArrayList<>();
//        System.out.println(personas.isEmpty());
//        System.out.println(personas.size());
//        personas.add(persona);
//        System.out.println(personas.size());
//        personas.add(persona2);
//        System.out.println(personas.size());
//        personas.add(persona2);
//        System.out.println(personas.size());
//        System.out.println(personas.isEmpty());
//
//        for(Persona p : personas){
//            System.out.println(p.getApellido());
//        }
//
//        personas.forEach((p) -> p.saludar());

//        HashSet<Persona> personas = new HashSet<>();
//        personas.add(persona);
//        System.out.println(personas.size());
//        personas.add(persona2);
//        System.out.println(personas.size());
//        personas.add(persona);
//        System.out.println(personas.size());



//        HashMap<Integer, Persona> personas = new HashMap<>();
//        personas.put(1, persona);
//        personas.put(2, persona2);


//        Suma otraLambdaSuma = (unNumero, otroNumero) -> {
//            System.out.println("Lambda 2: Voy a sumar " + unNumero + " y " + otroNumero);
//            return unNumero + otroNumero;
//        };

//        Suma lambdaSuma = (unNumero, otroNumero) -> {
//            System.out.println("Lambda 1: Voy a sumar " + unNumero + " y " + otroNumero);
//            return unNumero + otroNumero;
//        };
//
////        persona.suma(7, 12, otraLambdaSuma);
//
//
//
//        int n1 = 3;
//        int n2 = 5;
//        int n3 = 7;
//        int n4 = 5;
//
//        int resultadoSuma = lambdaSuma.sumar(n1, n2);
////        int otroResultadoSuma = otraLambdaSuma.sumar(n3, n4);
//
//        System.out.println(resultadoSuma);
////        System.out.println(otroResultadoSuma);


//        Suma lambdaSuma = (unNumero, otroNumero) -> {
//            System.out.println("Lambda 1: Voy a sumar " + unNumero + " y " + otroNumero);
//            return unNumero + otroNumero;
//        };

        ConvertidorAMayusculas lambdaConvertidora = strings -> {
            List<String> stringsMayusc = new ArrayList<>();

            for (String s : strings){
                stringsMayusc.add(s.toUpperCase());
            }

            return stringsMayusc;
        };

        List<String> listaPalabras = new ArrayList<>();
        listaPalabras.add("hola");
        listaPalabras.add("chau");
        listaPalabras.add("juan");
        listaPalabras.add("perez");

//        List<String> listaPalabras = Arrays.asList("hola", "chau", "juan");

        List<String> listaPalabrasMayusc = lambdaConvertidora.convertirAMayusculas(listaPalabras);

        for (String s : listaPalabras){
            System.out.println(s);
        }

        System.out.println();
        System.out.println();

        for (String s : listaPalabrasMayusc){
            System.out.println(s);
        }


    }
}