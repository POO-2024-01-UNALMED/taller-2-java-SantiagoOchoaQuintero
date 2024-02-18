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
    public int verificarIntegridad(){
        return Motor.registro;
    }


}
// clase asiento con metodo cambiar color
class Asiento{
    String color;
    int precio;
    static int registro;
    
    
    void cambiarColor(String color){
        this.color = color;
    }

}


public class App {
    public static void main(String[] args) throws Exception {
        Auto carro = new Auto();
        Asiento silla1 = new Asiento();
        Asiento silla2 = new Asiento();
        Asiento silla3 = new Asiento();
        Asiento silla4 = new Asiento();
        silla1.color = "Rojo";
        carro.asientos[0] = silla1;
        carro.asientos[1] = silla2;
        carro.asientos[2] = silla3;
        carro.asientos[3] = silla4;
        System.out.println(carro.verificarIntegridad());



    }
}
