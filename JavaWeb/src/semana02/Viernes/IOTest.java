package semana02.Viernes;

import java.io.FileOutputStream;
import java.io.IOException;

/*
public class IOTest {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("C:\\hola.txt");
            fos.write(65);
            fos.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
*/

public class IOTest {// Con Runnable
    public static void main(String[] args) {
        Runnable t1 = new Runnable() {
            @Override
            public void run() {
                try{
                    FileOutputStream fos = new FileOutputStream("C:\\holaHilo.txt");
                    fos.write(65);
                    fos.close();
                }catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
        };
        Thread writeFile = new Thread(t1);
        writeFile.start();
    }
}