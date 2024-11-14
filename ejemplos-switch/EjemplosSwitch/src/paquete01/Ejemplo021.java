/*
Ingrese la fecha de nacimiento:
    
Dia: 7
Mes: 2
Año: 1980

Salida


Usted ha nacido el 7 de FEBRERO de 1980
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Ingrese el número de día en el que naciste");
        int numeroDia = entrada.nextInt();
        
        System.out.println("Ingrese el numero de mes en el que nació");
        int numeroMes = entrada.nextInt();
        
        System.out.println("Ingrese el numero de año en el que nació");
        int numeroAño = entrada.nextInt();

        switch (numeroMes) {
            case 1:
                System.out.printf("Usted ha nacido el %d de ENERO de %d"
                        ,numeroDia, numeroAño);
                break;

            case 2:
                System.out.printf("Usted ha nacido el %d de FEBRERO de %d"
                        ,numeroDia, numeroAño);
                break;

            case 3:
                System.out.printf("Usted ha nacido el %d de MARZO de %d"
                        ,numeroDia, numeroAño);
                break;

            case 4:
                System.out.printf("Usted ha nacido el %d de ABRIL de %d"
                        ,numeroDia, numeroAño);
                break;

            case 5:
                System.out.printf("Usted ha nacido el %d de MAYO de %d"
                        ,numeroDia, numeroAño);
                break;

            case 6:
                System.out.printf("Usted ha nacido el %d de JUNIO de %d"
                        ,numeroDia, numeroAño);
                break;

            case 7:
                System.out.printf("Usted ha nacido el %d de JULIO de %d"
                        ,numeroDia, numeroAño);
                break;
            case 8:
                System.out.printf("Usted ha nacido el %d de AGOSTO de %d"
                        ,numeroDia, numeroAño);
                break;
            case 9:
                System.out.printf("Usted ha nacido el %d de SEPTIEMBRE de %d"
                        ,numeroDia, numeroAño);
                break;
            case 10:
                System.out.printf("Usted ha nacido el %d de OCTUBRE de %d"
                        ,numeroDia, numeroAño);
                break;
            case 11:
                System.out.printf("Usted ha nacido el %d de NOVIEMBRE de %d"
                        ,numeroDia, numeroAño);
                break;
            case 12:
                System.out.printf("Usted ha nacido el %d de DICIEMBRE de %d"
                        ,numeroDia, numeroAño);
                break;

            default:
                System.out.println("Opción incorrecta");
                break;
        }

    }
}
