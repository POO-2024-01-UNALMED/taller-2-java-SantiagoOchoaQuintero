package test;
public class Auto {
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
