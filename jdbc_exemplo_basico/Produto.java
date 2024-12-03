import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


class Produto {
	private int id;
	private String descricao;
	private float preco;

	public Produto(String descricao, float preco) {
		this.descricao = descricao;
		this.preco = preco;
	}

	public Produto(int id, String descricao, float preco) {
		this(descricao, preco);
		this.id = id;
	}

	public String getDescricao() {
		return (descricao);
	}

	public float getPreco() {
		return (preco);
	}

	public String listar() {
		return ("Id: " + id + "\nDescricao: " + descricao + "\nPreco: " + preco);
	}

	public Produto(){};

	public List<Produto> listarDados() {
		List<Produto> produtos = new ArrayList<>();
		Statement statement = null;
		ResultSet conjuntoDados = null;

		try (Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/padaria?" + "user=root&password=root&characterEncoding=UTF-8");) {
		    statement = conexao.createStatement();
    		conjuntoDados = statement.executeQuery("SELECT PROD_ID_PRODUTO, PROD_TX_DESCRICAO, PROD_VL_PRECO FROM PRODUTO;");

    		if (conjuntoDados != null)
    			while (conjuntoDados.next())
    				produtos.add(new Produto(conjuntoDados.getInt("PROD_ID_PRODUTO"), conjuntoDados.getString("PROD_TX_DESCRICAO"), conjuntoDados.getFloat("PROD_VL_PRECO")));
		} 
		catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}

		return (produtos);
	}


	public void inserirDados(String nomeProduto, float valorProduto) throws UnsupportedEncodingException {
		Statement statement = null;

		List<Produto> produtos = new ArrayList<>();
		produtos.add(new Produto(nomeProduto, valorProduto));

		try (Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/padaria?" + "user=root&password=root&characterEncoding=UTF-8");) {
		    statement = conexao.createStatement();
		    for (Produto produto : produtos)
		    	statement.execute("INSERT INTO PRODUTO (PROD_TX_DESCRICAO, PROD_VL_PRECO) VALUES ('" + new String(produto.getDescricao().getBytes("ISO-8859-1"), "UTF-8") + "', " + produto.getPreco() + ");");
		} 
		catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
	}






	public void deletarDados(Integer id) throws UnsupportedEncodingException {
		Statement statement = null;
		try(Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/padaria?" + "user=root&password=root&characterEncoding=UTF-8");){
			statement = conexao.createStatement();			
			statement.execute("delete from PRODUTO where PROD_ID_PRODUTO = " + id + ";");	
			}	
		catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
		
	}
}