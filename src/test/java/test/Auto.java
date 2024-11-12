package test;

public class Auto{
    static int cantidadCreados;
    String modelo;
    Integer precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    Integer registro;
    public static void main(String[] args) {
    }

    public int cantidadAsientos() {
        int contador = 0;
    
        // Recorre el array de asientos
        for (Asiento asiento : asientos) {
            // Verifica si el asiento no es null
            if (asiento != null) {
                contador++;
            }
        }
        return contador;
    }

    public String verificarIntegridad() {
        if (!this.registro.equals(motor.registro)) {
            return "Las piezas no son originales";
        }

        for (Asiento asiento : asientos) {
            if (asiento != null && !this.registro.equals(asiento.registro)) {
                return "Las piezas no son originales";
            }
        }
        return "Auto original";
    }

    public Auto() {
        // Incrementa cada vez que se crea un nuevo Auto
        cantidadCreados++; 
    }
}

