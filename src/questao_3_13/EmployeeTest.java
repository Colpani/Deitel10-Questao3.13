package questao_3_13;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Jana", "Montana", 2100.0);
		Employee employee2 = new Employee("Ramo", "Vonstok", 7200.65);

		System.out.printf("O salário anual de %s %s é de $%.2f%n", 
				employee1.getNome(), employee1.getSobrenome(), employee1.getSalarioAnual());
		System.out.printf("O salário anual de %s %s é de $%.2f%n", 
				employee2.getNome(), employee2.getSobrenome(), employee2.getSalarioAnual());
		
		double reajuste1 = employee1.getSalario() * 1.1;
		
		employee1.setSalario(reajuste1);
		employee2.setSalario(employee2.getSalario() * 1.1);
	
		System.out.printf("Após o aumento de 10%%, o salário anual de %s %s é de $%.2f%n", 
				employee1.getNome(), employee1.getSobrenome(), employee1.getSalarioAnual());
		System.out.printf("Após o aumento de 10%%, o salário anual de %s %s é de $%.2f%n", 
				employee2.getNome(), employee2.getSobrenome(), employee2.getSalarioAnual());
		
		
	}

}
