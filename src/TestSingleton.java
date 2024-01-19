import Utils.DataSource;

import java.sql.Connection;

public class TestSingleton {

    public static void main(String[] args) {
        A a1 = A.getInstance();

        A a2 = A.getInstance();

        System.out.println(a1);
        System.out.println(a2);


        Connection con1 = DataSource.getInstance().getCon();
        Connection con2 = DataSource.getInstance().getCon();
        System.out.println(con1);
        System.out.println(con2);
    }
}
