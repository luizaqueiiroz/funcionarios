package funcionarios;

public class Jornada implements Funcionario {

	public static void main(String[] args) {
		

	
	}
	private int salariohora = 30;
	int horastrabalhatadas = 8;
		
		@Override
		public long id() {
		System.out.println(0001);
		return 0;
		}
		@Override
		public void nome () {
		System.out.println("Marcos");
		}
		@Override
		public void telefone () {
		System.out.println("(15)99334-5102");
		}
		@Override
		public void matricula() {
		System.out.println(388);
		}
		@Override
		public void endereco () {
		System.out.println("Pito Aceso");
		}
		@Override
		public void calculoSalario () {
		System.out.println(salariohora + horastrabalhatadas + "por dia");
		}
		@Override
		public void salario() {
			
			
		}
		}
