package funcionarios;

public class Horista implements Funcionario{


		double valorhora = 20;
		double quantidadeHoras = 6;
		@Override
		public long id() {
			System.out.println(0002);
			return 0;
		}
		@Override
		public void nome () {
			System.out.println("Lorena");
		}
		@Override
		public void telefone () {
			System.out.println("(15)99427-1272");
		}
		@Override
		public void matricula() {
			System.out.println(277);
		}
		@Override
		public void endereco () {
			System.out.println("Chapadinha");
		}
		@Override
		public void calculoSalario () {
			System.out.println(valorhora+quantidadeHoras + "por dia");
		}
		@Override
		public void salario() {
			
			
		}
	}

