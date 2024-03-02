package co.com.ps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ciclos {

    public static void main(String[] args) {

        // CICLO mientras WHILE
        int contador = 0;

        while (contador  <= 10) {
            System.out.println(contador);
            contador = contador + 2;


        // ciclo FOR

            for (int i = 1; i < 5; i++) {
                System.out.println(i);

                //arreglo para saber el tamaño de el arreglo

            int[] arreglo = {1,2,3,5,6};
            for (int ai = 0; ai <arreglo.length; ai++) {
                System.out.println(ai);
            }


            }

            List<String> miLista;
            miLista = new ArrayList<>();
            miLista.add("hola1");
            miLista.add("hola2");
            miLista.add("hola3");
            miLista.add("hola4");

           miLista.stream().forEach(System.out::println);





        }





    }








}
