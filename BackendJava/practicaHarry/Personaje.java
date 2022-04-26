package practicaHarry;

public class Personaje {

    public String house, gender, name, boggart, patronus;

    public Personaje (String casa, String genero, String nombre, String boggart, String patronus){
        this.house = casa;
        this.gender = genero;
        this.name = nombre;
        this.boggart = boggart;
        this.patronus = patronus;
    }

    public String getHouse() {  return house;  }
    public String getGender() {  return gender;  }
    public String getName() {  return name;  }
    public String getBoggart() {  return boggart;  }
    public String getPatronus() {  return patronus;  }

    public boolean setHouse (String house){
        if (!house.isEmpty()){
            this.house = house;
            return true;
        }else
            return false;
    }

    public boolean setGender (String gender){
        if (!gender.isEmpty()){
            this.gender = gender;
            return true;
        }else
            return false;
    }

    public boolean setName (String name){
        if (!name.isEmpty()){
            this.name = name;
            return true;
        }else
            return false;
    }

    public boolean setBoggart (String boggart){
        if (!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        }else
            return false;
    }

    public boolean setPatronus (String patronus){
        if (!patronus.isEmpty()){
            this.patronus = patronus;
            return true;
        }else
            return false;
    }

    public String showMessage(){
        return "Casa: "+house+"\nGénero: "+ gender +"\nNombre: "+ name +"\nBoggart: "+boggart+"\nPatronus: "+patronus;
    }

}