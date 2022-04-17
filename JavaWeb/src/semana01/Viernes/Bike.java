package semana01.Viernes;

/*
    Overload: Sobrecarga
    Override: Redefine
    Overwrite: Sobreescribe
*/

public class Bike {
    private int velocidad;
    private String color, marca;

    public Bike(){  }

    public Bike(String color){  this.color = color;  }

    public Bike(String color, int velocidad){
        this. color = color;
        this.velocidad = velocidad;
    }

    public Bike(String color, String marca, int velocidad){
        this. color = color;
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public String getColor(){  return color;  }
    public String getMarca(){  return marca;  }
    public int getVelocidad(){  return velocidad;  }

}
