package stepdefinitions.database;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.JdbcUtils;

import java.util.List;


public class US_002_TC_001_DB {

    @Given("user connects to the database")
    public void user_connects_to_the_database() {
          JdbcUtils.connectToDatabase("157.230.48.97", "medunna_db_v2", "select_user", "Medunna_pass_@6");
          JdbcUtils.createStatement();

    }
    @Given("user gets the column {string} from table {string}" )
    public void user_gets_the_column_from_table(String column, String table) {
        String query = "SELECT "+column+" FROM "+table+" Order By Id";
        JdbcUtils.executeQuery(query);
    }

    @Then("verify table {string} and column {string} contains data {string}")
    public void verify_table_and_column_contains_data(String table, String column, String data) {
        String query ="SELECT "+column+" FROM "+table;
        List<Object> columnData = JdbcUtils.getColumnData(query,column);
        System.out.println(columnData);
        Assert.assertTrue(columnData.contains(data));
    }
    @Then("close the connection")
    public void close_the_connection() {
        JdbcUtils.closeConnectionAndStatement();
    }

}
