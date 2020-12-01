import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        AdressBook adressBook = new AdressBook();
        WritterReader writterReader = new WritterReader();
        Scanner sc = new Scanner(System.in);
        File f = new File("myFile.txt");
        int entradaInicial;
        boolean flag = false;
        do {
            if (f.exists()) {
                adressBook = (AdressBook) writterReader.leerObjeto();
            }
            System.out.println("\n¡Bienvenido a tu AdressBook!" +
                    "\nPresiona 1 para ver la lista\nPresiona 2 para agregar contacto\nPresiona 3 para eliminar contacto" +
                    "\nPresiona 4 para salir");
            entradaInicial = Integer.parseInt(sc.nextLine());
            if(entradaInicial == 1){
                adressBook.list();
            }
            if( entradaInicial == 2){
                System.out.println("Ingresa el numero de telefono");
                String entradaTel = sc.nextLine();
                System.out.println("Ingresa el nombre");
                String entradaNom = sc.nextLine();
                adressBook.create(entradaTel,entradaNom);
            }
            if( entradaInicial == 3){
                System.out.println("Ingresa el numero de telefono a borrar");
                String entradaTel = sc.nextLine();
                adressBook.delete(entradaTel);
            }
            if( entradaInicial == 4){
                System.out.println("Saliendo del programa...");
                writterReader.escribirObjeto(adressBook);
                flag = true;
            }
        }while(flag == false);
    }
}
