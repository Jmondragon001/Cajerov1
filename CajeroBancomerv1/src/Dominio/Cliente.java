package Dominio;

public class Cliente {
	private Long numTarjeta;
	private String nombre;
	private String app;
	private String apm;
	private Long celular;
	private float saldo;
	
	//constructor vacio
	public Cliente() {
	}
	//constructor con argumentos
	public Cliente(Long numTarjeta, String nombre, String app, String apm, Long celular, float saldo) {
		this.numTarjeta = numTarjeta;
		this.nombre = nombre;
		this.app = app;
		this.apm = apm;
		this.celular = celular;
		this.saldo = saldo;
	}
	//metodo tostring
	@Override
	public String toString() {
		return "Cliente [numTarjeta=" + numTarjeta + ", nombre=" + nombre + ", app=" + app + ", apm=" + apm
				+ ", celular=" + celular + ", saldo=" + saldo + "]\n";
	}
	public Long getNumTarjeta() {
		return numTarjeta;
	}
	public void setNumTarjeta(Long numTarjeta) {
		this.numTarjeta = numTarjeta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApp() {
		return app;
	}
	public void setApp(String app) {
		this.app = app;
	}
	public String getApm() {
		return apm;
	}
	public void setApm(String apm) {
		this.apm = apm;
	}
	public Long getCelular() {
		return celular;
	}
	public void setCelular(Long celular) {
		this.celular = celular;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
	
	
	
	
	
	

}
