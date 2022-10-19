package tables;

import db.IDbExecutor;
import db.MySqlDbExecutor;

import java.sql.SQLException;

public class AbsTable implements ITable {
    private String tableName;
    protected IDbExecutor iDbExecutor;

    public IDbExecutor getiDbExecutor() {
        return iDbExecutor;
    }

    public String getTableName() {
        return tableName;
    }
    public AbsTable(String tableName){
        this.tableName = tableName;
        iDbExecutor = new MySqlDbExecutor();
    }

    @Override
    public void create() throws SQLException {
        iDbExecutor.execute(String.format("CREATE TABLE %s();",this.tableName), false);
    }

    @Override
    public void delete() throws SQLException {
        iDbExecutor.execute(String.format("DROP TABLE %s", this.tableName), false);
    }

    @Override
    public void insert() throws SQLException {
        iDbExecutor.execute(String.format("INSERT INTO %s", this.tableName),false);
    }

    @Override
    public void allInfStudents() throws SQLException {
        iDbExecutor.execute(String.format("Select %s", tableName),false);

    }

    @Override
    public void countStudent() throws SQLException {
        iDbExecutor.execute(String.format("Select %s", tableName),false);
    }

    @Override
    public void femaleStudents() throws SQLException {
        iDbExecutor.execute(String.format("Select %s", tableName),false);
    }

    @Override
    public void updateGroupCurator() throws SQLException {
        iDbExecutor.execute(String.format("Update %s",tableName),false);
    }

    @Override
    public void curatorInGroups() throws SQLException {
        iDbExecutor.execute(String.format("Select %s",tableName),false);
    }
}
