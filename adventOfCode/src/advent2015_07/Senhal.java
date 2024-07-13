package advent2015_07;

public class Senhal {
	private String nombre;
	private int valor;
	public Senhal() {}
	public Senhal(String nombre, String valor) {
		this.setNombre(nombre);
		this.setValor(valor);
	}
	public Senhal(String nombre, int valor) {
		this.setNombre(nombre);
		this.valor=valor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = Integer.parseInt(valor);
	}
	public String toString() {
		return nombre+"\t"+valor;
	}
}
