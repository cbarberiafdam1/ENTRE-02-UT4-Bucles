import java.util.Scanner;
/**
 * Modela el interfaz para interactuar con el usuario
 * @author - 
 */
public class IUTexto
{
    private Scanner teclado;
    private CalculadoraOctal calculadora;
    private PintorFiguras pintor;

    /**
     * Constructor  
     */
    public IUTexto(CalculadoraOctal calculadora, PintorFiguras pintor)
    {
        this.teclado = new Scanner(System.in);
        this.calculadora = calculadora;
        this.pintor = pintor;
    }

    /**
     * Controla la lógica de la aplicación
     */
    public void iniciar()
    {
        hacerSumasOctales();
        dibujarFiguras();

    }

    /**
     *  - borrar la pantalla
     *  - pedir al usuario un par de números
     *  - si los números no están en octal mostrar un mensaje
     *  - si los números no tienen el mismo número de cifras mostrar un mensaje
     *  - si son correctos calcular su suma octal y mostrar el resultado en pantalla
     *  - los pasos anteriores se repiten mientras el usuario quiera (pulsa 'S' o 's')
     *  
     */
    private void hacerSumasOctales(){
        char seguir = 's';
        while(seguir == 's' || seguir == 'S'){
            System.out.print("Teclee número 1: ");
            int n1 = this.teclado.nextInt();
            System.out.print("Teclee número 2: ");
            int n2 = this.teclado.nextInt();
            if(Utilidades.estaEnOctal(n1) && Utilidades.estaEnOctal(n2)){
                if(Utilidades.contarCifras(n1) == Utilidades.contarCifras(n2)){
                    System.out.println("--------------------------------------");
                    System.out.printf("%35d\n", n1);
                    System.out.printf("%35d\n", n2);
                    System.out.printf("%17s %17d","Suma octal: ",this.calculadora.sumarEnOctal(n1, n2));
                }else{
                    System.out.println("No tienen el mismo nº de cifras");
                }
            }else{
                System.out.println("Alguno de los números no está en octal");
            }
            System.out.println("\n\nQuiere hacer otra suma en octal? (S/s)");
            String cadena = this.teclado.next();
            seguir = cadena.charAt(0);
            System.out.print('\u000C');
        }
    }

    /**
       *  Pide al usuario un valor de altura, 
     *  valida que sea correcto (un valor entre 1 y 10)
     *  y muestra la figura en pantalla
     */

    private void dibujarFiguras(){
        System.out.println("Ahora dibujará una figura\n\n");
        int altura = 0;
        while(!(altura >= 1 && altura <= 10)){
            System.out.println("Altura de la figura? (1-10)");
            altura = this.teclado.nextInt();
            if(altura >= 1 && altura <= 10){
                pintor.dibujarFigura(altura);
            }else{
                System.out.print("Error, ");
            }
        }
    }
}
