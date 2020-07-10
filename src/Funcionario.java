
public class Funcionario {
	private int numReg;
	private String nome;
	private String funcao;
	private double salario;

	public Funcionario(int numReg, String nome, String funcao, double salario) {
		super();
		this.numReg = numReg;
		this.nome = nome;
		this.funcao = funcao;
		this.salario = salario;
	}
	
	
	
	public int getNumReg() {
		return numReg;
	}
	public void setNumReg(int numReg) {
		this.numReg = numReg;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double calcularImposto() {
		if (salario <=1000) {
			return 0;
		}
		else if (salario <=2000) {
			return salario*5/100;
		}
		else if (salario <=4500) {
			return salario * 10/100;
		}
		else {
			return salario * 15/100;
		}
	}
}
