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
		
		//Entrada de dados dos funcionários
		
		System.out.print("Quantos funcionários tem o departamento? ");
		int n = entrada.nextInt();
		
		for(int i = 1; i<=n;i++) {
			
			System.out.println("Dados do funcionário "+i+":");
			System.out.print("Nome: ");
			entrada.nextLine();
			name = entrada.nextLine();
			System.out.print("Salário: ");
			double sal = entrada.nextDouble();
			
			Employee employees = new Employee(name, sal); 
			dept.addEmployee(employees);
		}
		
		//Folha de pagamento
		
		showReport(dept);
		entrada.close();
		
	}
	
	private static void showReport(Department dept) {
		// MOSTRAR NA TELA OS DADOS DO RELATÓRIO
		System.out.println("FOLHA DE PAGAMENTO: ");
		System.out.println("Departamento "+dept.getName()+" = R$ "+dept.payRoll());
		System.out.println("Pagamento realizado no dia "+dept.getPayDay());
		System.out.println(dept);
		System.out.println("Para dúvidas favor entrar em contato: "+dept.getAddress().getEmail());
		
		}
}
