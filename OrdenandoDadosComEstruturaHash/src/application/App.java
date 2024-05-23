package application;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

import entidades.Pessoa;

public class App {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			System.out.println("---EX1---");
			ordenarHashSet();
			System.out.println("---EX2---");
			HashMap<String, Pessoa> listaPessoaOrdenada = lerEArmazenarDados();

			while (true) {
				System.out.println("Escolha uma opção:");
				System.out.println("1 - Exibir dados armazenados");
				System.out.println("2 - Buscar pessoa pelo CPF");
				System.out.println("3 - Sair");

				int opcao = sc.nextInt();
				sc.nextLine();

				switch (opcao) {
				case 1:
					System.out.println("Dados armazenados:");
					for (Map.Entry<String, Pessoa> entry : listaPessoaOrdenada.entrySet()) {
						System.out.println(entry.getValue());
					}
					break;
				case 2:
					System.out.println("Digite o CPF da pessoa que deseja buscar:");
					String cpf = sc.nextLine();
					Pessoa pessoa = listaPessoaOrdenada.get(cpf);
					if (pessoa != null) {
						System.out.println(pessoa);
					} else {
						System.out.println("Pessoa não encontrada.");
					}
					break;
				case 3:
					System.out.println("Saindo...");
					return;
				default:
					System.out.println("Opção inválida. Tente novamente.");
				}
			}
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e.getMessage());
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}

	public static HashMap<String, Pessoa> lerEArmazenarDados() {
		HashMap<String, Pessoa> listaPessoaOrdenada = new HashMap<>();

		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("Preencha CPF (ou 'sair' para terminar): ");
				String cpf = sc.nextLine();
				if (cpf.equalsIgnoreCase("sair")) {
					break;
				}
				System.out.println("Digite telefone:");
				String telefone = sc.nextLine();
				Pessoa pessoa = new Pessoa(cpf, telefone);
				listaPessoaOrdenada.put(cpf, pessoa);
			} catch (Exception e) {
				System.out.println("Erro ao ler os dados: " + e.getMessage());
			}
		}

		return listaPessoaOrdenada;
	}

	public static void ordenarHashSet() {
		HashSet<Integer> listaDeNumerosDaSorte = new HashSet<>();
		int[] numeros = { 1, 10, 50, 60, 10, 200, 300, 500, 700, 800, 900, 14, 33, 60, 55, 70, 80, 3, 100, 200, 25, 50,
				75, 100, 300, 1000, 11, 22, 33, 60, 70, 80, 100, 35, 10, 150, 75, 85, 95, 200 };
		for (int numero : numeros) {
			listaDeNumerosDaSorte.add(numero);
		}
		System.out.println("Devem ser sorteados: " + listaDeNumerosDaSorte.size() + " numeros da sorte");
	}
}
