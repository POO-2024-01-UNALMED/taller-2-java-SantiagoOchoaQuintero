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
    int registro;
    Asiento asiento;
    int cantidadCreados;
    Asiento[] asientos;
    int x = 0;

    public int cantidadAsientos(){
        int cantidadSillas = 0;
        for(int g = 0; g<=asientos.length;g++){
            if(asientos[g] instanceof Object){
                cantidadSillas++;
            }
        }
        return cantidadSillas;
    }
    public String verificarIntegridad(){
        String y = "";
        if(this.motor.registro==this.registro){
            for(int i = 0; i<=asientos.length ; i++){
                if(asientos[i]!=null){
                    if (asientos[i].registro==this.registro) {
                        y = "Auto original";
                    }
                    else{
                        y = "Las piezas no son originales";
                    }
                }
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
    int registro;
    
    
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
