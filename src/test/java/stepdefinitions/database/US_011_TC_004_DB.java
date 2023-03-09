package stepdefinitions.database;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.JdbcUtils;

import java.util.List;

public class US_011_TC_004_DB {

    List<Object> columnList;

    @Given("user \\(doctor) gets the column {string} from table {string}")
    public void user_doctor_gets_the_column_from_table(String column, String table) {

        String query = "SELECT "+column+" FROM "+ table;
        JdbcUtils.executeQuery(query);




        columnList = JdbcUtils.getColumnList("Physician", table);
        System.out.println("column = " + column);

    }

    @Then("Verify the {string} column contains the expected data {string}")
    public void verify_the_column_contains_the_expected_data(String columnName, String physicianName) {

        Assert.assertTrue(columnList.contains(physicianName));




    }


    }
