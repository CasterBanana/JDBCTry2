package tables;

import java.sql.SQLException;

public class Curator extends AbsTable{
    private final static String ID = "id int";
    private final static String FIO = "fio varchar(255)";

    public Curator() {
        super("Curator");
    }

    @Override
    public void create() throws SQLException {
        iDbExecutor.execute(String.format("CREATE TABLE %s(%s, %s);", getTableName(),ID,FIO), false);
    }

    @Override
    public void insert() throws SQLException {
        iDbExecutor.execute(String.format("INSERT %s(%s, %s) " +
                "VALUES (22, Погодин Михаил Алексеевич), " +
                "(33, Маринина Наталья Петровна), " +
                "(44, Ковалевский Анатолий Васильевич), " +
                "(15, Бравин Владлен Васильевич)",getTableName(),ID,FIO), false);
    }
}
