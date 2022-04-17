package semana01.Viernes;

class Bike2{
    void run(){
        System.out.println("Running... ");
    }
}

public class Polimorfismo extends Bike2{
    @Override
    void run() {
        System.out.println("Running safely with 60 miles per hour");
    }

    public static void main(String[] args) {
        Bike2 bike2 = new Polimorfismo();
        bike2.run();
    }
}