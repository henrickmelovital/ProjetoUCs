
import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBD {

    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "banco_faculdade";
    private static String usuario = "root";
    private static String senha = "Alienx10@";

    public static Connection obterConexao() throws Exception {
        String url = String.format(
                "jdbc:mysql://%s:%s/%s",
                host,
                porta,
                db
        );
        return DriverManager.getConnection(url, usuario, senha);
    }
}
