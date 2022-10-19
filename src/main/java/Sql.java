import db.IDbExecutor;
import db.MySqlDbExecutor;
import tables.AbsTable;
import tables.Curator;
import tables.Group;
import tables.Students;

import java.sql.SQLException;


public class Sql extends MySqlDbExecutor {
    public static void main(String[] args) throws SQLException {
        IDbExecutor iDbExecutor = new MySqlDbExecutor();
        AbsTable student = new Students();
        AbsTable group = new Group();
        AbsTable curator = new Curator();

        try {
            student.create();
            student.insert();
            student.countStudent();
            student.femaleStudents();
            group.create();
            group.insert();
            curator.create();
            curator.insert();
            student.allInfStudents();
            group.updateGroupCurator();
            group.curatorInGroups();




        } finally {
            iDbExecutor.close();
        }

    }
}







