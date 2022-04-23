package semana02.Viernes;

import java.io.FileInputStream;
import java.io.IOException;

public class IOTest4 {// Para leer cadena de caracteres
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\magia.txt");
            int i = 0;
            while ((i = fis.read())!=-1){
                System.out.print((char) i);
            }
            fis.close();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
