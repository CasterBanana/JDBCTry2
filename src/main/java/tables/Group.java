package tables;

import java.sql.SQLException;

public class Group extends AbsTable{
    private final static String ID = "id int";
    private final static String NAME = "name varchar(255)";
    private final static String IDCURATOR = "id_curator int";

    public Group() {
        super("Group");
    }

    @Override
    public void create() throws SQLException {
        iDbExecutor.execute(String.format("CREATE TABLE %s(%s, %s, %s);", getTableName(),ID,NAME,IDCURATOR), false);
    }

    @Override
    public void insert() throws SQLException {
        iDbExecutor.execute(String.format("INSERT %s(%s, %s, %s)" +
                "VALUES (1, первая, 22)," +
                "(2, вторая, 33)," +
                " (3, третья,44)",getTableName(),ID,NAME,IDCURATOR), false);
    }

    @Override
    public void updateGroupCurator() throws SQLException {
        iDbExecutor.execute(String.format("UPDATE %s\n" +
                "set id_curator = 15\n" +
                "WHERE id = 1",getTableName()),false);
    }

    @Override
    public void curatorInGroups() throws SQLException {
        iDbExecutor.execute(String.format("select gr.id, gr.name, gr.id_curator, cr.fio\n" +
                "FROM %s as gr\n" +
                "JOIN Curator as cr\n" +
                "ON gr.id_curator = cr.id",getTableName()),false);
    }
}
