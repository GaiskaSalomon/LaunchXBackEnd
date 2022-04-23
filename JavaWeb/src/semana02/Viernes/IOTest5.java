package semana02.Viernes;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest5 {// Trabajando con un Buffer para escribir un archivo
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("C:\\magic.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            String s = "Hola viajer@s de \nInnovaccion virtual";
            byte[]b = s.getBytes();
            bos.write(b);
            bos.flush();

            bos.close();
            fos.close();

            System.out.println("Ready");
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
