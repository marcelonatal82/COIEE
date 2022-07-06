package repositorio;

import java.util.List;

import model.ModeloAbstrato;

public interface IRepositorio <T extends ModeloAbstrato>{
	public abstract boolean salvar(T modelo);
	public abstract boolean alterar(T modelo);
	public abstract boolean excluir(T modelo);
	public abstract boolean buscar(T modelo);
	public abstract T buscar(int id);
	public abstract List<T> buscarTodos();
}
