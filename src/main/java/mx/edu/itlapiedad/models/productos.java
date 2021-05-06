package mx.edu.itlapiedad.models;

public class productos {

	private int id;
	private String descripcion;
	private float precio;
	private  int codigo_barras;
	private int existencia;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getCodigo_barras() {
		return codigo_barras;
	}
	public void setCodigo_barras(int codigo_barras) {
		this.codigo_barras = codigo_barras;
	}
	public int getExistencia() {
		return existencia;
	}
	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}
	
}
