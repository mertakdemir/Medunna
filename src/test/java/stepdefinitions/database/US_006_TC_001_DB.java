package stepdefinitions.database;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.JdbcUtils;

import java.util.List;

public class US_006_TC_001_DB {

    List<Object> columnList;
    @Given("User connects to the Medunna Database to be able to read the data")
    public void user_connects_to_the_medunna_database_to_be_able_to_read_the_data() {
        JdbcUtils.connectToDatabase("157.230.48.97", "medunna_db_v2", "select_user", "Medunna_pass_@6");
        JdbcUtils.createStatement();
    }
    @Given("user gets the id column {string} from {string} table")
    public void user_gets_the_id_column_from_table(String columns, String table) {
        columnList = JdbcUtils.getColumnList(columns, table);
        //System.out.println("columnList = " + columnList);
    }

    @Then("Verify the id column contains the expected data {string}")
    public void verifyTheIdColumnContainsTheExpectedData(String data) {
        Assert.assertTrue(columnList.toString().contains(data));
    }
    @Then("close the database connection")
    public void close_the_database_connection() {
        JdbcUtils.closeConnectionAndStatement();
    }


}
