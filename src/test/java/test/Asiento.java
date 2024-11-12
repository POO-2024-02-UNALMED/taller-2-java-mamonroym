package test;

public class Asiento {
    String color;
    Integer precio;
    Integer registro;
    public static void main(String[] args) {
    }

    // método para cambiar el color del Asiento si el color es permitido 
    public void cambiarColor(String nuevoColor) {
        if (nuevoColor.equals("rojo") || nuevoColor.equals("verde") || 
            nuevoColor.equals("amarillo") || nuevoColor.equals("negro") || 
            nuevoColor.equals("blanco")) {
            this.color = nuevoColor;
        } 
        else {
            System.out.println("Color no permitido. No se cambiara el color.");
        }
    }
}