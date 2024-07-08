package theory;

import javax.xml.transform.Result;
import java.sql.*;

public class JdbcTheory {
    public static void main(String[] args) throws SQLException {
        String connect = "jdbc:mysql://localhost:8080/mytest";
        Connection conn = DriverManager.getConnection(connect, "user", "password");// user e password opcionais
        PreparedStatement read = conn.prepareStatement("SELECT * FROM TESTE WHERE 1=1");

        PreparedStatement update = conn.prepareStatement("update coluna set valor from tabela where 1=1");
        String sql = "insert into tabela values(?,?)";
        PreparedStatement insert = conn.prepareStatement(sql);

        try (conn) {//lembrando que o try-with-resources fecha o serviço no finally implicito
            var j = new JdbcTheory();
            j.resultSet(read);
            j.criandoConexoes(update, insert);
            j.callable(conn);
            j.transact(conn);
        } catch (SQLException e) {

        }

    }
    void transact(Connection conn) throws SQLException{
        conn.setAutoCommit(Boolean.TRUE);// ao setar true ele da um commit na hora

        Savepoint sp = conn.setSavepoint("nomeopcional");// so da pra usar com autocommit false
        conn.rollback(sp);
        conn.commit();



    }

    void callable(Connection conn) throws SQLException {
        var callString = "{call sua_procedure(?,?)}";// call antes e entre {}
        CallableStatement call = conn.prepareCall(callString);

        call.setString("nomeTbmÉValido", "valor");// no callable tbm pode passar o nome do parametro alem do index
        call.setString(2, "valor");


        var output = "{?= call nossa_procedure()}";
        CallableStatement callOut = conn.prepareCall(output);
        callOut.registerOutParameter(1, Types.VARCHAR);// torna o ?= na string opcional
        callOut.execute();

        System.out.println(callOut.getInt("coluna"));



        conn.prepareCall(output, ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_UPDATABLE,ResultSet.TYPE_FORWARD_ONLY);// so precisa saber os validos, nao precisa entender

    }

    void resultSet(PreparedStatement read) throws SQLException {

        if (read.execute()) {
            ResultSet rs = read.executeQuery();
            while (rs.next()) {// o ponteiro do ResultSet começa com 0 -> cabeçalho, entao sempre chama o next para ir pra primera coluna
                Integer teste = rs.getInt("coluna");
                Integer teste2 = rs.getInt(1);// primeira coluna


            }
        }
    }

    void criandoConexoes(PreparedStatement update, PreparedStatement insert) throws SQLException {


        try (update; insert) {

            int up = update.executeUpdate();//retorna linhas modificadas

            insert.setInt(1, 1);// cuidado que no sql o index começa com 1
            insert.setObject(2, new NestedC());
            insert.executeUpdate();

        } catch (SQLException e) {//desnecessario pq ja esta declarada na assinatura


        }
    }
}
