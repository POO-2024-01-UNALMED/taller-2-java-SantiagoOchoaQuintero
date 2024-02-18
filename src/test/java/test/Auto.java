package test;
public class Auto {
	String modelo;
    int precio;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;
    Asiento[] asientos;
    int x = 0;

    public int cantidadAsientos(){
        int cantidadSillas = 0;
        for(int g = 0; g<asientos.length;g++){
            if(asientos[g] instanceof Asiento){
                cantidadSillas++;
            }
        }
        return cantidadSillas;
    }
    public String verificarIntegridad(){
        if(this.motor.registro == this.registro){
            for(int i = 0; i < asientos.length ; i++){
                if(asientos[i]!=null){
                    if (asientos[i].registro !=this.registro) {
                        return "Las piezas no son originales";
                    }
                }
            }
            return "Auto original";
        }
        else{
            return "Las piezas no son originales";
        }

    }


}
