package ProjetoIntegrador;

import java.util.Scanner;

public class Login {

	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);

		String nome = null, senha, email = null, cnpj = null;
		String usuario;
		int op=0;

	
		while (op != 9) {

			System.out.println("Informe o tipo de usuário : (C)- Cliente ou (D)-Distribuidor");
			System.out.println("9 = fechar o programa");
			usuario = leia.nextLine();

			switch (usuario) {

			case "c":

				System.out.println("Informe o nome da empresa: ");
				nome = leia.nextLine();

				System.out.println("Informe o e-mail: ");
				email = leia.nextLine();

				System.out.println("Informe a senha: ");
				senha = leia.nextLine();

				System.out.println("Informe o CNPJ: ");
				cnpj = leia.nextLine();

				System.out.println(
						"==========================================================================================================");
				System.out.println("Nome: " + nome);
				System.out.println("e-mail: " + email);
				System.out.println("CNPJ: " + cnpj);
				System.out.println(
						"Enviamos uma verificação para o e-mail cadastrado, para cconcluir o cadastro, confirme a verificação.");
				System.out.println(
						"==========================================================================================================");
				break;

			case "d":

				System.out.println("Informe o nome da Distribuidora: ");
				nome = leia.nextLine();

				System.out.println("Informe o e-mail: ");
				email = leia.nextLine();

				System.out.println("Informe a senha: ");
				senha = leia.nextLine();

				System.out.println("Informe o CNPJ: ");
				cnpj = leia.nextLine();

				System.out.println(
						"==========================================================================================================");
				System.out.println("Nome: " + nome);
				System.out.println("e-mail: " + email);
				System.out.println("CNPJ: " + cnpj);
				System.out.println(
						"Enviamos uma verificação para o e-mail cadastrado, para cconcluir o cadastro, confirme a verificação.");
				System.out.println(
						"==========================================================================================================");
				
			
				
			

				

			}
		}

	}

}
