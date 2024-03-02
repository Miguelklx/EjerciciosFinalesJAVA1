package co.com.ps;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EjercicioEnClase5 {

    private static final Logger logger = Logger.getLogger(EjercicioEnClase5.class.getName());
    public static void main(String[] args){
        System.out.println("Esto es un Sout:");

        logger.info("Esto es informacion");
        logger.severe("Esto es un fine");
        logger.warning("Esto es un warning");

        if (logger.isLoggable(Level.FINE)) {
            logger.fine("Este es un mensaje detallado");
        }
    }
}
