import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

import java.io.UnsupportedEncodingException;

import java.util.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;

class Principal {
	public static void main(String[] args) throws UnsupportedEncodingException {
		Scanner objScanner = new Scanner(System.in);
		List<Produto> produtos = new ArrayList<>();

		String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto:");
		String valorProdutoS = JOptionPane.showInputDialog("Digite o valor do produto");

		Float valorProduto = Float.valueOf(valorProdutoS);


		Produto objProduto = new Produto();

		objProduto.inserirDados(nomeProduto, valorProduto);


		produtos = objProduto.listarDados();




		


		String todosProdutos = "";
		for (Produto produto : produtos)
			todosProdutos += produto.listar() + "\n\n";
		JOptionPane.showMessageDialog(null, todosProdutos);
	














	}
}