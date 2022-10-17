package tables;

import java.sql.SQLException;

public class Students extends AbsTable{
    private final static String ID = "id int";
    private final static String FIO = "fio varchar(255)";
    private final static String SEX = "sex varchar(255)";
    private final static String ID_GROUP = "id_group int";

    public Students() {
        super("Student");
    }

    @Override
    public void create() throws SQLException {
        iDbExecutor.execute(String.format("CREATE TABLE %s(%s, %s, %s, %s);", getTableName(),ID,FIO,SEX,ID_GROUP), false);
    }

    @Override
    public void insert() throws SQLException {
        iDbExecutor.execute("INSERT Student (id, fio, sex, id_group))" +
                "VALUES (101, Перов Андрей Николаевич, male, 1)," +
                " (111, Борщ Сметан Николаевич, male, 1), " +
                "(202, Пепега Валентин Петрович, male, 1), " +
                "(222, Макарова Татьяна Алексеевна, female, 1), " +
                "(303, Пирогов Макар Константинович, male, 1), " +
                "(333, Арбузова Елена Васильевна, female, 2), " +
                "(404, Бодров Александр Алексеевич, male, 2),  " +
                "(444, Китаев Михаил Николаевич, male, 2), " +
                "(505, Алексаднров Андрей Николаевич, male, 2), " +
                "(555, Перова Надежда Николаевна, female, 3), " +
                "(606, Надеждина Елизавета Николаевна, female, 3), " +
                "(607, Простова Анастасия Андреевна, female, 3), " +
                "(707, Даркина Дарья Дмитриевна, female, 3), " +
                "(777, Дробинкина Анастасия Дмитриевна, female, 3), " +
                "(808, Валик Андрей Николаевич, male, 3)",false);
    }
}
