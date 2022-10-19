package tables;

import java.sql.SQLException;

public interface ITable {
    void create() throws SQLException;
    void delete() throws SQLException;
    void insert() throws SQLException;
    void allInfStudents() throws SQLException;
    void countStudent() throws SQLException;
    void femaleStudents() throws SQLException;
    void updateGroupCurator() throws SQLException;
    void curatorInGroups() throws SQLException;
}

