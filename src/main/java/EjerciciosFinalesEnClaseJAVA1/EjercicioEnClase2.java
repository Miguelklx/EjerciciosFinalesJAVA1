package co.com.ps;

import java.util.Scanner;

public class EjercicioEnClase2 {
    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("ingrese tres numeros para calcular el promedio");
        System.out.println("ingrese primer dato");
        double numero1 = scanner.nextInt();

        System.out.println("ingrese segundo dato");
        double numero2 = scanner.nextInt();

        System.out.println("ingrese tercer dato");
        double numero3 = scanner.nextInt();


        double resultado =(numero1+numero2+numero3)/3;
        System.out.println("El promedio es:");
        System.out.println(resultado);



    }


}
