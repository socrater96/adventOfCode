package advent2015_07;

public class Senhal {
    private String nombre;
    private int valor;
    private boolean tieneValor;

    public Senhal(String nombre) {
        this.nombre = nombre;
        this.tieneValor = false;
    }

    public Senhal(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
        this.tieneValor = true;
    }

    public String getNombre() {
        return nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
        this.tieneValor = true;
    }

    public boolean hasValue() {
        return tieneValor;
    }
    
}