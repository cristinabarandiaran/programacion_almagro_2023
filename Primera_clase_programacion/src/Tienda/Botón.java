package Tienda;

public class Botón {

    private String color;
    private String forma;
    private int tamaño;

    public Botón(String color, String forma, int tamaño) {
        this.color = color;
        this.forma = forma;
        this.tamaño = tamaño;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
}

