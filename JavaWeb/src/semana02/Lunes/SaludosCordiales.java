package semana02.Lunes;

abstract class Hola{
    void saludar(){
        //Cómo lo hace
        System.out.println("¿Cómo estás?, Te ves bien eh");
    }

    abstract void saludo();
}

interface Mostrar{
    //Qué hace
    void show();
    abstract void despide();
}

public class SaludosCordiales implements Mostrar{
    public void show(){
        System.out.println("Hola, ¿Cómo estás?, espero no del todo mal...");
    }

    public static void main(String[] args) {
        SaludosCordiales saludo1 = new SaludosCordiales();
        saludo1.show();
    }

    public void despide(){
        System.out.println("Gracias, no.");
    }

}
