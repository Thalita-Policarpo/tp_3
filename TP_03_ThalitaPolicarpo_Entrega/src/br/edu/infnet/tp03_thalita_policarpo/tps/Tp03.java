package br.edu.infnet.tp03_thalita_policarpo.tps;

import java.io.EOFException;
import java.util.Scanner;

import br.edu.infnet.tp03_thalita_policarpo.auxiliar.Constante;
import br.edu.infnet.tp03_thalita_policarpo.dominio.Aluno;
import br.edu.infnet.tp03_thalita_policarpo.dominio.Professor;
import br.edu.infnet.tp03_thalita_policarpo.exceptions.InvalidFillmentException;

public class Tp03 {
	private static Aluno[] aluno;
	private static Professor[] professor;

	public static void main(String[] args) {
		aluno = new Aluno[Constante.TAMANHO];
		professor = new Professor[Constante.TAMANHO];

		Scanner sc = new Scanner(System.in);

		int ponteiroAluno = 0;
		int ponteiroProfessor = 0;
		String menu = "";

		try {
			do {

				System.out.println("Menu inicial");
				System.out.println("[1] Cadastrar Aluno");
				System.out.println("[2] Cadastrar Professor");
				System.out.println("[3] Consultar situacao de um docente / discente");
				System.out.println("[4]  Sair");

				System.out.println("Esolha uma opcao: ");
				menu = sc.next();
				
				switch (menu) {
				case"1":
					if(ponteiroAluno < Constante.TAMANHO) {
						aluno[ponteiroAluno] = new Aluno();
						aluno[ponteiroAluno].setCodigoPessoa(ponteiroAluno);
						sc.nextLine();
						
						System.out.println("\nDigite o nome completo: ");
						aluno[ponteiroAluno].setNome(sc.nextLine());
						
						System.out.println("Digite o CPF: ");
						aluno[ponteiroAluno].setCpf(sc.nextLine());
						
						System.out.println("Digite a discuplina: ");
						aluno[ponteiroAluno].setDisciplina(sc.nextLine());
						
						
					} else {
						throw new EOFException("Arquivo chegou no limite");
					};
					
					System.out.println(aluno[ponteiroAluno]);
					ponteiroAluno++;
					
					break;
				case"2":
					if(ponteiroProfessor < Constante.TAMANHO) {
						professor[ponteiroProfessor] = new Professor();
						professor[ponteiroProfessor].setCodigoPessoa(ponteiroProfessor);
						sc.nextLine();
						
						System.out.println("\nDigite o nome completo: ");
						professor[ponteiroProfessor].setNome(sc.nextLine());
						
						
						System.out.println("Digite o CPF: ");
						professor[ponteiroProfessor].setCpf(sc.nextLine());
						
						System.out.println("Digite a discuplina: ");
						professor[ponteiroProfessor].setMateria(sc.nextLine());
						
						System.out.println("Digite a discuplina: ");
						professor[ponteiroProfessor].setSalario(sc.nextDouble());
						
					} else {
						throw new EOFException("Arquivo chegou no limite");
					};
					System.out.println(professor[ponteiroProfessor]);
					ponteiroProfessor++;
					
					break;
				case"3":
					try {
						System.out.println("Consultar: digite [1] para docente ou [2] para Discente");
						
						int opcao = sc.nextInt();
						
						if (opcao == 1) {
							sc.nextLine();
							System.out.println("Digite o codigo do aluno: ");
							System.out.println(aluno[sc.nextInt()]);
							
							break;
							
						}else if (opcao == 2) {
							sc.nextLine();
							System.out.println("Digite o codigo do professor: ");
							System.out.println(professor[sc.nextInt()]);
							
							break;
						} else {
							throw new InvalidFillmentException("Preencha corretamente a informacao solicitada");
						}
					} catch (Exception e) {
						System.out.println(e.getMessage());
						break;
					}
					
					
				case"4":
					System.out.println("orbigado! ");
					break;
				default:
					break;
				}

			} while (!"4".equalsIgnoreCase(menu));
			sc.close();

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			System.out.println("encerrando processamento");
		}

	}
}
