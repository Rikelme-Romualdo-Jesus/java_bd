import java.sql.*;

public class Conexao {

private static String  URL = "jdbc:postgresql://ep-cool-field-b50a5h54-pooler.c-7.us-east-2.aws.neon.tech/neondb?sslmode=require&channel_binding=require";
private static String  USUARIO = "neondb_owner";
private static String  SENHA  =  "npg_Lbjh0k8HRsiY";

public static Connection getConnection () {
    try{

        return DriverManager.getConnection(URL,USUARIO,SENHA);
    } catch (SQLException e ) {
        throw new RuntimeException("ERRO AO CONECTAR", e);
    }   
}

 public void inserirPessoa(String nome, int idade)
 {
      try{
          Connection conecta = getConnection();
          Statement st = conecta.createStatement();
          st.executeUpdate("insert into pessoa (nome , idade ) values ('"+nome+"' , '"+idade+"')");
    } catch (SQLException e ) {
        throw new RuntimeException("nao conseguir adcionar ", e);
    }   
}
}
