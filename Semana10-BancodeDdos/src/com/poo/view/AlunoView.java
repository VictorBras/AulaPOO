package com.poo.view;

import java.util.Scanner;

import com.poo.controller.AlunoController;
import com.poo.model.Aluno;

public class AlunoView {

	//pede dados do aluno para gravar no banco
			public void create()
			{
				try
				{	
					Scanner sc = new Scanner(System.in);
					
					Aluno aluno = new Aluno();
					AlunoController controller = new AlunoController();
					
					System.out.println("Entre com a matricula:");
					aluno.setMatricula(sc.nextLine());
					
					System.out.println("Entre com o nome:");
					aluno.setNome(sc.nextLine());
					
					controller.create(aluno);

				}
				catch(Exception e)
				{
					System.out.println("Erro na tela de incluir aluno");
				}
			}
			
		
			public void readAll()
			{
				AlunoController controller = new AlunoController();
				
				System.out.println("Listagem de alunos");
				System.out.println("*******************");
				for(Aluno aluno:controller.readAll())
				{
					System.out.println("Matricula:" + aluno.getMatricula());
					System.out.println("Nome:" + aluno.getNome());
					System.out.println("-------------------------");
				}
				
			}	
			
			public void read() {
				Scanner scanner = new Scanner(System.in);
				AlunoController controller = new AlunoController();

				System.out.println("Insira a matricula do aluno: ");
				String matricula = scanner.nextLine();

				Aluno aluno = controller.read(matricula);

				System.out.println("Matricula:" + aluno.getMatricula());
				System.out.println("Nome:" + aluno.getNome());
				System.out.println("-------------------------");
			}
			
			public void update() {
				Scanner scanner = new Scanner(System.in);
				AlunoController controller = new AlunoController();

				System.out.println("Insira a matricula do aluno a ser atualizado: ");
				String matricula = scanner.nextLine();

				Aluno aluno = controller.read(matricula);

				System.out.println("Matricula:" + aluno.getMatricula());
				System.out.println("Nome:" + aluno.getNome());
				System.out.println("-------------------------");

				System.out.println("---- Novos Dados ----");
				System.out.println("Entre com novo o nome:");
				aluno.setNome(scanner.nextLine());

				controller.update(aluno);

				Aluno  alunoUpdated = controller.read(aluno.getMatricula());

				System.out.println("---- Dados atualizados ----");
				System.out.println("Matricula:" + alunoUpdated.getMatricula());
				System.out.println("Nome:" + alunoUpdated.getNome());
				System.out.println("-------------------------");
			}

			public void delete() {
				Scanner scanner = new Scanner(System.in);
				AlunoController controller = new AlunoController();

				System.out.println("Insira a matricula do aluno a ser excluído: ");
				String matricula = scanner.nextLine();

				Aluno aluno = controller.read(matricula);

				controller.delete(aluno);
				controller.read(matricula);
			}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlunoView crud = new AlunoView();
		crud.create();
		
		crud.read();
		crud.update();
		crud.delete();
		crud.readAll();
		
	}	

}
