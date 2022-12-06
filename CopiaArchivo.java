import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CopiaArchivo {
    
    public void CopiarBytes( String archivoEntrada, String archivoSalida) throws IOException{
        FileInputStream in = null;
        FileOutputStream out = null;
        try{
            in = new FileInputStream(archivoEntrada);
            out = new FileOutputStream(archivoSalida);
            int c;

            while ((c = in.read()) != -1){
                out.write(c);
            }
        }
        finally{
            if (in != null){
                in.close();
            }
            if (in != null){
                out.close();
            }
        }

    }

    public void CopiarLineas( String inArchivo, String outArchivo) throws IOException{
        BufferedReader rutaEntrada = null;
        PrintWriter rutaSalida = null; 
        try {
            rutaEntrada = new BufferedReader(new FileReader(inArchivo));
            rutaSalida = new PrintWriter(new FileWriter(outArchivo));

            String S;
            while ((S = rutaEntrada.readLine()) != null) {
                rutaSalida.println(S);
            }
        } finally {
            if (rutaEntrada != null) {
                rutaEntrada.close();
            }
            if (rutaSalida != null) {
                rutaSalida.close();
            }
        }
    }
}
