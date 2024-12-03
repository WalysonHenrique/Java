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
		String menu;

		menu = "1 - Cadastrar\n2 - Listar\n3 - Editar\n4 - Deletar\n0 - Sair";
		Integer opcao = 1;
		Produto objProduto = new Produto();

		while(opcao != 0){

		opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));	


		switch(opcao){
		case 1 :
			String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto:");
			String valorProdutoS = JOptionPane.showInputDialog("Digite o valor do produto");
			Float valorProduto = Float.valueOf(valorProdutoS);
			objProduto.inserirDados(nomeProduto, valorProduto);
			break;

		case 2 :
			produtos = objProduto.listarDados();
			String todosProdutos = "";
			for (Produto produto : produtos)
			todosProdutos += produto.listar() + "\n\n";
			JOptionPane.showMessageDialog(null, todosProdutos);
	
		break;
		case 3 :

		break;
		case 4 :
			Integer idProd = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID do produto a ser deletado:"));
			objProduto.deletarDados(idProd);
			JOptionPane.showMessageDialog(null, "Objeto deletado!" );
		break;
		case 0 :
			JOptionPane.showMessageDialog(null, "Saindo...");
		break;

		}
	}

		


		




		


		














	}
}