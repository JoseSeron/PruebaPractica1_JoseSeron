
package pruebapractica_joseseron;

import java.util.Scanner;

/**
 *
 * @author Jose Seron
 */
public class PruebaPractica_JoseSeron {


    public static void main(String[] args) {
        
Scanner gabagool = new Scanner(System.in);
Scanner gabagoolString1 = new Scanner(System.in);
        int opcionPrincipal;
        int contadorMenuPrincipal = 0;

        do {
            System.out.println("Bienvenido a mi primera prueba práctica en Java, las opciones son las siguientes:");
            System.out.println("1. Repetir mi nombre.");
            System.out.println("2. SubMenu de mensajes.");
            System.out.println("3. Salir");

            opcionPrincipal = gabagool.nextInt();
        

            switch (opcionPrincipal) {
                case 1:
                    System.out.print("Ingrese su nombre: ");
                    String nombre = gabagoolString1.nextLine();
                    System.out.print("Cantidad de veces que se repetira el texto: ");
                    int cantidad = gabagool.nextInt();
  

                    for (int i = 0; i < cantidad; i++) {
                        System.out.println("Hola mi nombre es " + nombre + " y miren mi prueba!");
                    }
                    break;
                case 2:
                    int opcionSubMenu;

                    do {
                        System.out.println("Sub menu de mensajes:");
                        System.out.println("1. Bienvenida");
                        System.out.println("2. Despedida");
                        System.out.println("3. Salir del submenu");

                        opcionSubMenu = gabagool.nextInt();
        

                        switch (opcionSubMenu) {
                            case 1:
                                System.out.println("Mensaje de bienvenida: Hola! Bienvenido al submenu.");
                                break;
                            case 2:
                                System.out.println("Despedida: Hasta luego, gracias por usar mi programa.");
                                break;
                            case 3:
                                break; // Salir del submenú
                            default:
                                System.out.println("Opción invalida. Intente de nuevo.");
                        } //fin switch submenu
                    } while (opcionSubMenu != 3);
                    break;
                case 3:
                    break; // Salir del menú principal
                default:
                    System.out.println("Opcion invalida. Intente de nuevo.");
            }

            contadorMenuPrincipal++;

        } while (opcionPrincipal != 3);

        System.out.println("Adios, esta fue mi prueba.");
        System.out.println("El menu principal se repitio " + contadorMenuPrincipal + " veces.");
    } //fin main
} //fin clase