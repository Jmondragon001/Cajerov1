package Principal;

import java.util.Scanner;

import Dominio.Cliente;
import Logica.ImpGenerica;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// necesito variables
				Long numTarjeta;
				String nombreC;
				String appC;
				String apmC;
				Long celularC;
				float saldo = 0;
				// varaibale de tipo objeto
				Cliente cliente = null;// reserva de espacio de memoria

				Scanner lectura = null;
				// instancia de la clase que va en la logica

				int menuPrincipal = 0, menuCliente, subMenuCliente, menuTarj, menuBenef, subMenuBen, indice = 0;
				ImpGenerica impCliente = new ImpGenerica();
				// crear menu principal
				try {
					do {
						System.out.println("1---Alta de Cliente");
						System.out.println("2---Consultar saldo");
						System.out.println("3---Deposito en efectivo");
						System.out.println("4---Retiro en efectivo ");
						System.out.println("5---SALIR ");
						lectura = new Scanner(System.in);
						menuPrincipal = lectura.nextInt();

					
						

						switch (menuPrincipal) {
						case 1:
							try {
								System.out.println("\n Ingresa el numero de Tarjeta");
								lectura = new Scanner(System.in);
								numTarjeta = lectura.nextLong();
								
								System.out.println("\n Ingresa el nombre de cliente");
								lectura = new Scanner(System.in);
								nombreC = lectura.nextLine();
								
								System.out.println("\n Ingrese el apellido paterno");
								lectura = new Scanner(System.in);
								appC = lectura.nextLine();
								
								System.out.println("\n Ingrese el apellido materno");
								lectura = new Scanner(System.in);
								apmC = lectura.nextLine();
								
								System.out.println("\n Ingrese el numero celular");
								lectura = new Scanner(System.in);
								celularC = lectura.nextLong();
								
								System.out.println("\n Ingrese el Saldo de apertura");
								lectura = new Scanner(System.in);
								saldo = lectura.nextFloat();
								
								cliente = new Cliente(numTarjeta, nombreC, appC, apmC, celularC, saldo);
								impCliente.guardar(cliente);

								
								
								
							} catch (Exception e) {
							System.out.println("Error "+e.getMessage());
							break;
							}
								
							break;

						case 2:
							try {
								System.out.println("\n Ingresa el numero de Tarjeta");
								lectura = new Scanner(System.in);
								numTarjeta = lectura.nextLong();
								impCliente.buscar(numTarjeta, cliente);
								
								break;
								
							} catch (Exception e) {
								// TODO: handle exception
								System.out.println("Error"+e.getMessage());
							}
							break;
							
							
							
						case 3 :
							
							try {
								System.out.println("Ingrese su numero de Tarjeta ");
								lectura = new Scanner(System.in);
								numTarjeta = lectura.nextLong();
								impCliente.buscar(numTarjeta, cliente);
								System.out.println("\n Monto de deposito");
								lectura = new Scanner(System.in);
								saldo = lectura.nextFloat();
								impCliente.deposito(saldo, cliente);
								break;
							} catch (Exception e) {
								// TODO: handle exception
								System.out.println("Error"+e.getMessage());
							}
							break;
							
						case 4 :
							try {
								System.out.println("Ingrese su numero de Tarjeta ");
							lectura = new Scanner(System.in);
							numTarjeta = lectura.nextLong();
							impCliente.buscar(numTarjeta, cliente);
							System.out.println("\n Monto a Retirar");
							lectura = new Scanner(System.in);
							saldo = lectura.nextFloat();
							impCliente.retiro(saldo, cliente);
								break;
							} catch (Exception e) {
								// TODO: handle exception
								System.out.println("Error"+e.getMessage());
							}
							break;
							
						case 5:
							break;
						}
						
					}while(menuPrincipal<5);
					
				} catch (Exception e) {
					System.out.println("Error"+e.getMessage());
				}

				
			}
		}

