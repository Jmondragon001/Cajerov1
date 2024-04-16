package Logica;

import java.util.ArrayList;
import java.util.List;

import Dominio.Cliente;

import Interface.Metodos;

public class ImpGenerica implements Metodos {
	// definir mi lista donde se van a guardar los registros
	List<Cliente>lista=new ArrayList<Cliente>();
	
	public void guardar(Cliente cliente) {
		try {
			boolean bandera=false;
			for (Cliente c : lista) {
				if (c.getNumTarjeta().equals(c.getNumTarjeta())) {
					System.out.println("ya existe");
					bandera=true;
					break;
				}
				
			}if (bandera==false) {
				lista.add(cliente);
			}
			
			
		} catch (Exception e) {
			System.out.println("Error "+e.getMessage());
		}
		// TODO Auto-generated method stub
		
		
		//añado los registros de mis clientes en la lista definida
	}

	@Override
	public Cliente buscar(Long numTarjeta, Cliente cliente) {
		// tuvimos que pasar el atributo a buscar con su tipo de variable
		// TODO Auto-generated method stub
		boolean bandera=false;
		//foreach para con variable tipo objeto el cual los registros de clientes 
		//se fuardan en se y  los busca en lista
		for (Cliente c : lista) {
			if(c.getNumTarjeta().equals(numTarjeta)) {
				//con el if comparamos si la variable de tipo obejto c.getNumtarjeta es igual aque se busca
				System.out.println("Bienvenido "+ c.getNombre()+"\n"+"Tarjeta "+c.getNumTarjeta()+"\n"+"Saldo Actual es "+c.getSaldo());
				bandera=true;
				
			}
		}
			if(bandera==false) {
				System.out.println("Esta Tarjeta no se encontro en el Sistema verifica tus datos");
				System.exit(0);
		}
		return cliente;
	}




	@Override
	public void retiro(Float saldo, Cliente cliente) {
		
			 for (int i = 0; i < lista.size(); i++) {
			        if (lista.get(i).getNumTarjeta().equals(cliente.getNumTarjeta())) {
			            Cliente clienteEnco = lista.get(i);
			            
			            Float saldoActual = clienteEnco.getSaldo();
			            Float nuevoSaldo = saldoActual - saldo;
			            if(saldo<saldoActual ) {
			            	clienteEnco.setSaldo(nuevoSaldo);
			            	lista.set(i, clienteEnco);
				            System.out.println("Retiro con éxito.\n Nuevo saldo: " + nuevoSaldo);
			            }else {
			            	System.out.println("No Tienes Suficiente dinero ");
			            }
			             
			            
			        }
			 }
	}
			            
	

	@Override
	public void deposito(Float saldo, Cliente cliente) {
		Float saldoActual;
		 Float nuevoSaldo;
		 for (int i = 0; i < lista.size(); i++) {
		        if (lista.get(i).getNumTarjeta().equals(cliente.getNumTarjeta())) {
		            Cliente clienteEnco = lista.get(i);
		            
		            saldoActual = clienteEnco.getSaldo();
		            nuevoSaldo = saldoActual + saldo;
		            
		            if(saldo>0 & saldo<10000) {
		            	clienteEnco.setSaldo(nuevoSaldo);
		            	lista.set(i, clienteEnco);
			            System.out.println("Saldo depositado con éxito. Nuevo saldo: " + nuevoSaldo);
		            }else {
		            	System.out.println("Pasa con un Acessor");
		            }
		             
		            
		        }
		    }
		}

	
	
	}

