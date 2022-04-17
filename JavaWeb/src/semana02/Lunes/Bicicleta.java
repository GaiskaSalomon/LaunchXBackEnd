package semana02.Lunes;

abstract class Mountain{
    Mountain(){
        System.out.println("Se ha creado una bicicleta de montaña");
    }
    abstract void cambiarVelocidad();
    void cambiarColor(){
        System.out.println("Cambiando color a rojo");
    }
}

class Magistroni extends Mountain{
    @Override
    void cambiarVelocidad() {
        System.out.println("Se deben desbloquear las perillas del manubrio primero");
    }
}

public class Bicicleta {
    void cambiarVelocidad(){
        System.out.println("Gira la perilla");
    }

    public static void main(String[] args) {
        Mountain bici1 = new Magistroni();
        bici1.cambiarVelocidad();
        bici1.cambiarColor();
    }
}
