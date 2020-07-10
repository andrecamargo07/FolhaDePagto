 
public class SistemaFolha {

	public static void main(String[] args) {
		Funcionario funcionarios[];
		funcionarios = new Funcionario[10];
		for (int i=0;i<=9;i++) {
			funcionarios[i] = new Funcionario(i,"Funcionario_"+i,"Funcao_"+i,(i+1)*1900/2.7);
		}
		for (int i=0;i<=9;i++) {
			System.out.printf(
					"Num Reg: %d\n"
					+"Nome: %s\n"
					+"Funcao: %s\n"
					+"Salario Bruto: R$ %.2f\n"
					+"Imposto: R$ %.2f\n"
					+"Salario Liquido: R$ %.2f\n"
					,funcionarios[i].getNumReg(),funcionarios[i].getNome(),funcionarios[i].getFuncao(),funcionarios[i].getSalario()
					,funcionarios[i].calcularImposto()
					,(funcionarios[i].getSalario() - funcionarios[i].calcularImposto())
					);
		}
	}

}
