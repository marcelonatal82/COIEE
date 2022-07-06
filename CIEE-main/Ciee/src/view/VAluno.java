package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.FuncionarioController;
import model.Funcionario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;

public class VAluno extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtSalario;
	private JTextField txtNome;
	private JFormattedTextField txtData;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VAluno frame = new VAluno();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VAluno() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 459, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(contentPane);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Funcionario funcionario = new Funcionario();
				FuncionarioController funcionarioController = new FuncionarioController();
				
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate data = LocalDate.parse(txtData.getText(), formatter);
				
				funcionario.setId(Integer.valueOf(txtId.getText()));
				funcionario.setDataCadastro(data);
				funcionario.setNome(txtNome.getText());
				funcionario.setSalario(Double.valueOf(txtSalario.getText()));
				boolean resultado = funcionarioController.salvar(funcionario);
				if (resultado == true) {
					JOptionPane.showMessageDialog(null,
							"Dados gravados!",
					        "Processo concluído",
					        JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,
							"Houve um erro ao gravar os dados no banco de dados!",
					        "Impossível continuar",
					        JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton.setBounds(6, 243, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Fechar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(339, 243, 117, 29);
		contentPane.add(btnNewButton_1);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(6, 215, 450, 12);
		contentPane.add(horizontalStrut);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(6, 6, 438, 207);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Cadastro", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Id");
		lblNewLabel.setBounds(31, 10, 12, 16);
		panel.add(lblNewLabel);
		
		txtId = new JTextField();
		txtId.setBounds(55, 5, 130, 26);
		txtId.setColumns(10);
		panel.add(txtId);
		
		JLabel lblData = new JLabel("Data");
		lblData.setBounds(197, 10, 29, 16);
		panel.add(lblData);
		
		txtData = new JFormattedTextField();
		txtData.setBounds(234, 5, 81, 26);
		txtData.setText("__/__/____");
		panel.add(txtData);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(6, 41, 37, 16);
		panel.add(lblNewLabel_1);
		
		txtSalario = new JTextField();
		txtSalario.setBounds(244, 36, 130, 26);
		txtSalario.setColumns(10);
		panel.add(txtSalario);
		
		txtNome = new JTextField();
		txtNome.setBounds(55, 36, 130, 26);
		txtNome.setColumns(10);
		panel.add(txtNome);
		
		JLabel lblSalrio = new JLabel("Salário");
		lblSalrio.setBounds(197, 41, 42, 16);
		panel.add(lblSalrio);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Listagem", null, panel_1, null);
		
		JButton btnNewButton_2 = new JButton("Alterar");
		btnNewButton_2.setBounds(119, 243, 117, 29);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Excluir");
		btnNewButton_3.setBounds(229, 243, 117, 29);
		contentPane.add(btnNewButton_3);
	}
}
