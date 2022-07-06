package repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import model.Aluno;

public class CieeRepositorio implements IRepositorio<Aluno>{

	Logger logger = Logger.getLogger(CieeRepositorio.class);
	
	public boolean salvar(Aluno modelo) {
		logger.info("--- Início do método Salvar ---");

		try {
			Connection connection = DBConnection.getInstance().getConnection();

			String insert = "INSERT INTO funcionario (nome, salario, data_cadastro) values (?, ?, ?)";
			PreparedStatement preparedStatement1 = connection.prepareStatement(insert);
			preparedStatement1.setString(1, modelo.getNome());
			preparedStatement1.setDouble(2, modelo.getSalario());
			preparedStatement1.setDate(3, java.sql.Date.valueOf(modelo.getDataCadastro()));
			logger.info("String insert do funcionário preparada: " + preparedStatement1);
			int resultado = preparedStatement1.executeUpdate();

			if (resultado > 0) {
				logger.info("Retorno maior que zero da execução do insert na tabela de funcionário: " + resultado);
				logger.info("--- Fim do método Salvar ---");
				return true;
			} else {
				logger.info("Retorno menor que zero da execução do insert na tabela de funcionário: " + resultado);
				logger.info("--- Fim do método Salvar ---");
				return false;

			}
		} catch (Exception e) {
			logger.error("Ocorreu um erro ao tentar salvar: " + e.getMessage());
			logger.error("--- Fim do método Salvar ---");
			return false;
		}
	}

	public boolean alterar(Funcionario modelo) {
		logger.info("--- Início do método Alterar ---");

		try {
			Connection connection = DBConnection.getInstance().getConnection();

			String insert = "update funcionario set nome = ?, salario = ? where id = ?";
			PreparedStatement preparedStatement1 = connection.prepareStatement(insert);
			preparedStatement1.setString(1, modelo.getNome());
			preparedStatement1.setDouble(2, modelo.getSalario());
			preparedStatement1.setInt(3, modelo.getId());
			logger.info("String update do funcionário preparada: " + preparedStatement1);
			int resultado = preparedStatement1.executeUpdate();

			if (resultado > 0) {
				logger.info("Retorno maior que zero da execução do update na tabela de funcionário: " + resultado);
				logger.info("--- Fim do método Alterar ---");
				return true;
			} else {
				logger.info("Retorno menor que zero da execução de update na tabela de funcionário: " + resultado);
				logger.info("--- Fim do método Alterar ---");
				return false;

			}
		} catch (Exception e) {
			logger.error("Ocorreu um erro ao tentar alterar: " + e.getMessage());
			logger.error("--- Fim do método Alterar ---");
			return false;
		}
	}

	public boolean excluir(Funcionario modelo) {
		logger.info("--- Início do método Excluir ---");

		try {
			Connection connection = DBConnection.getInstance().getConnection();

			String insert = "delete from funcionario where id = ?";
			PreparedStatement preparedStatement1 = connection.prepareStatement(insert);
			preparedStatement1.setInt(1, modelo.getId());
			logger.info("String delete do funcionário preparada: " + preparedStatement1);
			int resultado = preparedStatement1.executeUpdate();

			if (resultado > 0) {
				logger.info("Retorno maior que zero do delete na tabela de funcionário: " + resultado);
				logger.info("--- Fim do método Excluir ---");
				return true;
			} else {
				logger.info("Retorno menor que zero do delete na tabela de funcionário: " + resultado);
				logger.info("--- Fim do método Excluir ---");
				return false;

			}
		} catch (Exception e) {
			logger.error("Ocorreu um erro ao tentar excluir: " + e.getMessage());
			logger.error("--- Fim do método Excluir ---");
			return false;
		}
	}

	public boolean buscar(Funcionario modelo) {
		// TODO Auto-generated method stub
		return false;
	}

	public Funcionario buscar(int id) {
		logger.info("--- Início do método Buscar por Id ---");

		try {
			Connection connection = DBConnection.getInstance().getConnection();
	
			String consulta = "select * from funcionario "
							+ "where id = ?";
			Funcionario funcionario = new Funcionario();
	
			PreparedStatement preparedStatement = connection.prepareStatement(consulta);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			logger.info("Consulta executada: " + preparedStatement);
	
			while (resultSet.next()) {
				funcionario.setId(resultSet.getInt("id"));
				funcionario.setNome(resultSet.getString("nome"));
				funcionario.setSalario(resultSet.getDouble("salario"));
				funcionario.setDataCadastro(resultSet.getDate("data_cadastro").toLocalDate());
			}
	
			logger.info("--- Fim do método Buscar por Id ---");
	
			return funcionario;
		} catch (Exception e) {
			logger.error("Ocorreu um erro ao tentar buscar um funcionário: " + e.getMessage());
			logger.error("--- Fim do método Buscar por Id ---");
			return null;
		}
	}

	public List<Funcionario> buscarTodos() {
		logger.info("--- Início do método Buscar Todos ---");

		try {
			Connection connection = DBConnection.getInstance().getConnection();
	
			String consulta = "select * from funcionario";
			List<Funcionario> lista = new ArrayList<Funcionario>();
			Funcionario funcionario;
	
			PreparedStatement preparedStatement = connection.prepareStatement(consulta);
			ResultSet resultSet = preparedStatement.executeQuery();
			logger.info("Consulta executada: " + preparedStatement);
	
			while (resultSet.next()) {
				funcionario = new Funcionario();
				funcionario.setId(resultSet.getInt("id"));
				funcionario.setNome(resultSet.getString("nome"));
				funcionario.setSalario(resultSet.getDouble("salario"));
				funcionario.setDataCadastro(resultSet.getDate("data_cadastro").toLocalDate());
				lista.add(funcionario);
			}
			
			logger.info("Quantidade de registros pesquisados: " + lista.size());
			logger.info("--- Fim do método Buscar Todos ---");

			return lista;
		} catch (Exception e) {
			logger.error("Ocorreu um erro ao tentar executar o método buscar todos do funcionário: " + e.getMessage());
			logger.error("--- Fim do método Buscar Todos ---");
			return null;
		}

	}
}
