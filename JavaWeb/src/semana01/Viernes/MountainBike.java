package semana01.Viernes;

public class MountainBike {
    public static void main(String[] args) {
        show();
    }

    public static void show(){
        Bike b = new Bike("azul",6);
        System.out.println(b.getColor());
        System.out.println(b.getVelocidad());
    }
}
