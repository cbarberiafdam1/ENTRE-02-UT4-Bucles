import java.util.Scanner;
/**
 *   Clase de utilidades
 *   Incluye métodos estáticos
 *   
 *   @author - 
 */
public class Utilidades
{

   /**
     * Dado un número n (asumimos positivo)
     * devueve true si está en octal false en otro caso
     * Un nº está en octal si cada una de sus cifras
     * es un valor entre 0 y 7
     * 
     * (usa bucles while)
     */
    public static boolean estaEnOctal(int n) {
        if(n >= 0 && n <= 7){
            return true;
        }else{
            while(n >= 10){
                if((n % 10) < 0 && (n % 10) > 7){
                    return false;
                }else{
                    n = (n - (n % 10)) / 10;
                }
            }
            if(n < 0 && n > 7){
                return false;
            }else{
                return true;
            }
        }
    }

   /**
     * Dado un número n (asumimos positivo)
     * devuelve la cantidad de cifras que tiene
     * 
     * (usa bucles while)
     */
    public static int contarCifras(int n) {
        int contador = 1; 
        while(n >= 10){
            n = (n - (n % 10)) / 10;
            contador++;
        }
        return contador;
    }
}
