package co.com.ps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjercicioEnClase4 {

    public static void main(String[] args) {

        //crear un program que filtre las palabras que
        // tiene mas de 5 caracteres utilizando for o algo otro

        List<String> palabras = Arrays.asList("casa", "camarote", "salchica", "camisa", "mosco", "tortuga");
          palabras.stream().filter(palabra -> palabra.length() > 5).forEach(System.out::println);
        }




    }

