package controller;

import java.util.List;

import javax.swing.JOptionPane;

import model.Aluno;
import repositorio.CieeRepositorio;

public class CieeController implements IController<Aluno>{

	CieeRepositorio repositorio = new CieeRepositorio();
	
	public boolean salvar(Aluno modelo) {
		if (modelo.getNome().isEmpty()==false) {
			System.out.println(modelo.getNome());
			System.out.println("Pode salvar!!!");
			return repositorio.salvar(modelo);
		}else {
			JOptionPane.showMessageDialog(null,
					"Existem dados obrigatórios que não foram preenchidos",
			        "Impossível continuar",
			        JOptionPane.ERROR_MESSAGE);
			return false;
		}
	}

	public boolean alterar(Aluno modelo) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean excluir(Aluno modelo) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean buscar(Aluno modelo) {
		// TODO Auto-generated method stub
		return false;
	}

	public Aluno buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Aluno> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}
}
