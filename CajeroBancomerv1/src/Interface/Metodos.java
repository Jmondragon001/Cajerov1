package Interface;

import Dominio.Cliente;

public interface Metodos  {
	public void guardar(Cliente cliente);
	public  Cliente buscar(Long numTarjeta, Cliente cliente);
	public void deposito(Float saldo, Cliente cliente);
	public void retiro(Float saldo, Cliente cliente);
	

	

}
