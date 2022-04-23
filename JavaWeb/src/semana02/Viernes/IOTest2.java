package semana02.Viernes;

import java.io.FileOutputStream;
import java.io.IOException;

/*
public class IOTest2 {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("C:\\magia.txt");
            String s = "Magia!!!";
            byte b[] = s.getBytes();
            fos.write(b);
            fos.close();
            System.out.println("Magia!!!");
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
*/

public class IOTest2{ //Magia con Runnable
    public static void main(String[] args) {
        Runnable rm = new Runnable() {
            @Override
            public void run() {
                try{
                    FileOutputStream fos = new FileOutputStream("C:\\magiaRunnable.txt");
                    String s = "Magia con Runnable!!!";
                    byte b[] = s.getBytes();
                    fos.write(b);
                    fos.close();
                    System.out.println("Magia con Runnable!!!");
                }catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
        };
        Thread magic = new Thread(rm);
        magic.start();
    }
}