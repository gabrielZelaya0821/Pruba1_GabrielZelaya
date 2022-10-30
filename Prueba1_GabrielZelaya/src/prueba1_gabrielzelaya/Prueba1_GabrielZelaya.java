package prueba1_gabrielzelaya;
import java.util.Scanner;
public class Prueba1_GabrielZelaya {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el número de la acción que desea ejecutar:");
        System.out.println("(1) Repetir mi nombre (2) Submenú de mensajes (3) Salir");
        int acumuladorMenu = 1;
        int menu = entrada.nextInt();
        
        while (menu != 3) {
            if (menu == 1) {
                System.out.println("¿Cuántas veces desea repetir el texto?");
                int repeticion = entrada.nextInt();
                String cadena = "¡Hola mi nombre es Gabriel Zelaya y miren mi prueba!";
                for (int i = 1;i <= repeticion; i++) {
                    System.out.println(cadena);
                }
            } else if (menu == 2) {
                System.out.println("Bienvenido al submenú");
                System.out.println("(1) Bienvenida (2) Despedida (3) Salir del submenú");
                int submenu = entrada.nextInt();
                while (submenu != 3) {
                    if (submenu == 1) {
                        System.out.println("Mucho gusto mi nombre es Gabriel");
                    } else if (submenu == 2) {
                        System.out.println("Hasta luego, gracias por usar mi programa");
                    } else {
                        System.out.println("Opcíon no válida, intente de nuevo");
                    }       
                    System.out.println("(1) Bienvenida (2) Despedida (3) Salir del submenú");
                    submenu = entrada.nextInt();
                }
                System.out.println("Saliendo del submenú");
            } else {
                System.out.println("Opción no es válida, intente de nuevo");
            }
            acumuladorMenu += 1;
            System.out.println("(1) Repetir mi nombre (2) Submenú de mensajes (3) Salir");
            menu = entrada.nextInt();
        }
        System.out.println("Adiós, esta fue mi prueba");
        System.out.println("El menú principal se repitió " + acumuladorMenu + " veces");        
    }
    
}
