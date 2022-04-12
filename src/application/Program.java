package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		
		//Entrada de dados do departamento
		System.out.print("Nome do departamento: ");
		String name = entrada.nextLine();
		System.out.print("Dia do pagamento: ");
		int payDay = entrada.nextInt();
		entrada.nextLine();
		System.out.print("Email: ");
		String email = entrada.nextLine();
		System.out.print("Telefone: ");
		String phone = entrada.nextLine();
		
		
		Department dept = new Department(name, payDay, new Address(email, phone));
		
		//Entrada de dados dos funcion�rios
		
		System.out.print("Quantos funcion�rios tem o departamento? ");
		int n = entrada.nextInt();
		
		for(int i = 1; i<=n;i++) {
			
			System.out.println("Dados do funcion�rio "+i+":");
			System.out.print("Nome: ");
			entrada.nextLine();
			name = entrada.nextLine();
			System.out.print("Sal�rio: ");
			double sal = entrada.nextDouble();
			
			Employee employees = new Employee(name, sal); 
			dept.addEmployee(employees);
		}
		
		//Folha de pagamento
		
		showReport(dept);
		entrada.close();
		
	}
	
	private static void showReport(Department dept) {
		// MOSTRAR NA TELA OS DADOS DO RELAT�RIO
		System.out.println("FOLHA DE PAGAMENTO: ");
		System.out.println("Departamento "+dept.getName()+" = R$ "+dept.payRoll());
		System.out.println("Pagamento realizado no dia "+dept.getPayDay());
		System.out.println(dept);
		System.out.println("Para d�vidas favor entrar em contato: "+dept.getAddress().getEmail());
		
		}
}
