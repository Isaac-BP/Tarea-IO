import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        
        CopiaArchivo copyArchivo = new CopiaArchivo();
        Scanner scan = new Scanner(System.in);
        ClearPantalla clear = new ClearPantalla();
         


        int opcion = 0;
        String rutaEntrada = "" ;
        String rutaSalida = "";

        clear.clear();
        System.out.println(
                "Elige la accion a realizar: \n1- Copiar por lineas. \n2- Copiar por Bytes.");
        opcion = scan.nextInt();
        switch (opcion) {
            case 1:
                clear.clear();
                System.out.print("Introduce la ruta o nombre del archivo: ");
                rutaEntrada = scan.next();
                System.out.print("Introduce un nuevo nombre para el archivo: ");
                rutaSalida = scan.next();
                copyArchivo.CopiarLineas(rutaEntrada, rutaSalida);
                System.out.println("Archivo Copiado Correctamente!!!");
                break;
            case 2:
                clear.clear();
                System.out.print("Introduce la ruta o nombre del archivo: ");
                rutaEntrada = scan.next();
                System.out.print("Introduce un nuevo nombre para el archivo: ");
                rutaSalida = scan.next();
                copyArchivo.CopiarBytes(rutaEntrada, rutaSalida);
                System.out.println("Archivo Copiado Correctamente!!!");
                break;
            default:
                System.out.println("Opcion Invalida1");
        }

    }
}
