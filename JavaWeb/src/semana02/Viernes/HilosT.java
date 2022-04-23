package semana02.Viernes;

public class HilosT extends Thread{
    @Override //Entra al state Runnable
    public void run() { //¿Qué quieres que haga?
        System.out.println("El hilo se está ejecutando");
    }

    /*
    start - Inicia la ejecución de un hilo, la JVM llama al método run() del hilo
    sleep - Detiene el hilo de manera temporal el número especificado
    join - Espera que el hilo muera para poder entrar
    getPriority - Regresa la prioridad del hilo
    setPriority - Establece la prioridad del hilo
    getName - Nombre del hilo
    currentThread - Referencia el hilo que se está ejecutando
    getId - Regresa el id del hilo
    Thread.State getState - Regresa el estado actual del hilo
    isAlive - Si el hilo está vivo

    public static void main(String[] args) {
        HilosT hilo = new HilosT(); //Entra al state New
        hilo.start(); //Inicializa el hilo
    }
    */
}

class HilosR implements Runnable{
    @Override
    public void run() {
        System.out.println("El hilo de runnable está corriendo");
    }

    public static void main(String[] args) {
        HilosR h = new HilosR();
        Thread t = new Thread(h);
        t.start();
    }
}