package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
          System.out.print("Entre com o mome do departamento: ");
          String departmentName = sc.nextLine();
          
          System.out.print("Digite os Dados do Funcionario: ");
          System.out.print("Nome: ");
          String workerName = sc.nextLine();
		  
          System.out.print("Nivel: ");
          String workerLevel = sc.nextLine();
          
          System.out.print("Sal�rio Base: ");
          double baseSalary = sc.nextDouble();
          
		Worker worker  = new Worker(workerName, workerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
         System.out.print("Quantidade de contratos: ");
         int n = sc.nextInt();
         
         for(int a=1; a<=a; a++) {
        	 System.out.println("Entre com o contrato #" + a + " data: ");
        	 System.out.print("Data (DD/MM/YYYY): ");
        	 
         Date contractDate = sdf.parse(sc.next());	 
         
		
	     System.out.print("Valor por hora: ");
		 Double valuePerHour = sc.nextDouble();
		 
		 System.out.print("Dura��o (Horas): ");
		 int hours = sc.nextInt();
		 
		 HourContract contarct = new HourContract(contractDate, valuePerHour,hours);
            		
		 worker.addContracts(contarct);
         }  
		
		System.out.println();
		System.out.print("Entre com o m�s e ano, para calcular o sal�rio (MM/YYYY): ");
		
		String monthAndyear = sc.next();
		int month = Integer.parseInt(monthAndyear.substring(0, 2));
		int year = Integer.parseInt(monthAndyear.substring(3));
	
		System.out.println("Nome: " + worker.getName());
		System.out.println("Departamento: " + worker.getDepartment().getName());
		System.out.println("Sal�rio " + monthAndyear + ": " + String.format("%.2f", worker.income(year, month)));
		
		
		sc.close();
	}

}
