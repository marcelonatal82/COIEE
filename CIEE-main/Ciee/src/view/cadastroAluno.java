package view;

import controller.CieeController;
import model.Aluno;

public class cadastroAluno {

	public static void main(String[] args) {
		
		CieeController CieeController = new CieeController();
		
		Aluno aluno = new Aluno();
		aluno.setId(1);
		aluno.setNome("Flávio");
		aluno.setSalario(2000);
		
		CieeController.salvar(aluno);
	}

}
