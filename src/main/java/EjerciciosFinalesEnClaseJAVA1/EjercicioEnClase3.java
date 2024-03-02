package co.com.ps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjercicioEnClase3 {


    public static void main(String[] arg) {
        Scanner entrada = new Scanner(System.in);
        String nombre1, nombre2, nombre3, nombre4;

        System.out.print("Registra tu nombre:");
        nombre1 = entrada.nextLine();



        System.out.print("Registra tu nombre:");
        nombre2 = entrada.nextLine();



        System.out.print("Registra tu nombre:");
        nombre3 = entrada.nextLine();



        System.out.print("Registra tu nombre:");
        nombre4 = entrada.nextLine();


        List<String> estudiantesLista = new ArrayList<>();
        estudiantesLista.add(nombre1);
        estudiantesLista.add(nombre2);
        estudiantesLista.add(nombre3);
        estudiantesLista.add(nombre4);
        System.out.println("LISTA DE ESTUDIANTES UNIVERSITARIOS QUE SE REGISTRARON");
        estudiantesLista.stream().forEach(System.out::println);







    }


}
