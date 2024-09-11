package funcionarios;

public class PessoaJuridica implements Funcionario {

	double valorBruto = 30000;
	double imposto = 10% valorBruto;
	@Override
	public long id() {
		System.out.println(0003);
		return 0;
	}
	@Override
	public void nome () {
		System.out.println("Sophia");
	}
	@Override
	public void telefone () {
		System.out.println("(15)99691-7455");
	}
	@Override
	public void matricula() {
		System.out.println(239);
	}
	@Override
	public void endereco () {
		System.out.println("Vila Rio Branco");
	}
	@Override
	public void calculoSalario () {
		System.out.println(valorBruto-imposto + "Ao mês");
	}
	@Override
	public void salario() {


	}
}


