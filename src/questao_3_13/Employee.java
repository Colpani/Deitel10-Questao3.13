package questao_3_13;

public class Employee {

	//nome - string
	//sobrenome - string
	//salario mensal - double
	
	private String nome;
	private String sobrenome;
	private double salario;
	private int meses = 12;
	
	public Employee(String nome, String sobrenome, double salario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		if (salario >= 0)
			this.salario = salario;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSalario(double salario) {
		if (salario >= 0)
			this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public double getSalarioAnual() {
		return salario * meses;
	}
	
	
}
