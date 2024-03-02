package co.com.ps;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class EjercicioEnClase5_5 {
    private static final Logger logger = Logger.getLogger(EjercicioEnClase5_5.class.getName());
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num3;
        try {
             num3 = scanner.nextInt();
        } catch (InputMismatchException e){
            logger.warning("digite solo numeros");


            System.out.println(e.getCause());
        }catch (RuntimeException exception) {
            logger.warning(exception.toString());
        }

        System.out.println("Continua");

    }
}

