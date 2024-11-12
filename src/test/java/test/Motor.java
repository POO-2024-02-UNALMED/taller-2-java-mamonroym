package test;

public class Motor{
    Integer numeroCilindros;
    String tipo;
    Integer registro;
    public static void main(String[] args) {
    }

    // Método para cambiar el registro
    public void cambiarRegistro(int nuevoRegistro) {
        this.registro = nuevoRegistro;
    }

    public void asignarTipo(String nuevoTipo) {
        // Validación del tipo de motor permitido
        if (nuevoTipo.equals("electrico") || nuevoTipo.equals("gasolina")) {
            this.tipo = nuevoTipo;
        }
    }
}
