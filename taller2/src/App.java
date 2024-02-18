package test;

class Motor{
    int numeroDeCilindros;
    String tipo;
    static int registro = 1;

    void cambiarRegistro(int registro){
        this.registro = registro;
    }
    void asignarTipo(String tipo){
        this.tipo = tipo;
    }
}


class Auto{
    String modelo;
    int precio;
    String marca;
    Motor motor;
    static int registro;
    int cantidadCreados;
    Asiento[] asientos = new Asiento[4];
    int x = 0;

    public int cantidadAsientos(){
        return  this.asientos.length;
    }
    public String verificarIntegridad(){
        String y = "";
        if(Motor.registro==this.registro){
            if(this.registro==Asiento.registro){
                y = "Auto original";
            }
        }
        else{
            y = "Las piezas no son originales";
        }

        return y;
    }


}
// clase asiento con metodo cambiar color
class Asiento{
    String color;
    int precio;
    static int registro;
    
    
    void cambiarColor(String color){

        if(color=="rojo" || color=="verde" || color=="amarillo" || color=="negro" || color=="blanco"){
            this.color = color;
        }
        
    }


}


public class App {
    public static void main(String[] args) throws Exception {
        
    }
}
