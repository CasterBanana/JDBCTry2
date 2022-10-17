import db.IDbExecutor;
import db.MySqlDbExecutor;
import tables.AbsTable;
import tables.Students;

import java.sql.SQLException;


public class Sql extends MySqlDbExecutor {
    public static void main(String[] args) throws SQLException {
        IDbExecutor iDbExecutor = new MySqlDbExecutor();
        AbsTable student = new Students();

        student.create();

        try {
            student.create();


        } finally {
            iDbExecutor.close();
        }

    }
}







