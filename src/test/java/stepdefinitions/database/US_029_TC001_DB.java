package stepdefinitions.database;

import io.cucumber.java.en.*;
import utilities.JdbcUtils;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class US_029_TC001_DB {


    List<Object> namecolumnList;
    @Given("Admin gets the column {string} from {string} country table")
    public void admin_gets_the_column_from_country_table(String columnName, String tableName) {
        String query = "SELECT * FROM " + tableName;
        namecolumnList = JdbcUtils.getColumnData(query, columnName);
        System.out.println("namecolumnList = " + namecolumnList);

    }


    @Then("verify the name column  contains of the created {string} country")
    public void verifyTheNameColumnContainsOfTheCreatedCountry(String countryName) {
        assertTrue(namecolumnList.contains(countryName));
    }
}
