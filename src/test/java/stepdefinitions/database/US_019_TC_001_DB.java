package stepdefinitions.database;

import io.cucumber.java.en.*;
import utilities.JdbcUtils;

import java.util.List;


public class US_019_TC_001_DB {

    List<Object> allColumns;
    @Given("Admin connects to the database")
    public void admin_connects_to_the_database() {
        JdbcUtils.connectToDatabase("157.230.48.97", "medunna_db_v2", "select_user", "Medunna_pass_@6");
        JdbcUtils.createStatement();
    }
    @Given("Admin gets the column {string} from table {string}")
    public void admin_gets_the_column_from_table(String column, String table) {
        allColumns = JdbcUtils.getColumnList(column, table);

    }
    @Given("Admin verifies the all physicians")
    public void admin_verifies_the_all_physicians() {
        System.out.println("allColumns = " + allColumns);
    }
}
