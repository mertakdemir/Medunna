package stepdefinitions.database;

import io.cucumber.java.en.*;
import utilities.JdbcUtils;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class US_020_TC_001_DB {

    List<Object> lastModifiedcolumnList;
    List<Object> idcolumnList;

    @Given("Admin gets the column {string} from {string} staff table")
    public void admin_gets_the_column_from_staff_table(String columnName, String tableName) {

        String query = "SELECT * FROM " + tableName;
        lastModifiedcolumnList = JdbcUtils.getColumnData(query, columnName);
        System.out.println("lastModifiedcolumnList = " + lastModifiedcolumnList);

    }
    @Then("verify staff created_by list contains {string}")
    public void verify_staff_created_by_list_contains(String modifiedBy) {
       assertTrue(lastModifiedcolumnList.contains(modifiedBy));
    }

    @Given("Admin gets the column id {string} from {string} staff table")
    public void admin_gets_the_column_id_from_staff_table(String columnName2, String tableName2) {
        String query = "SELECT * FROM " + tableName2;
        idcolumnList = JdbcUtils.getColumnData(query, columnName2);
        System.out.println("idcolumnList = " + idcolumnList);
    }



    @Then("verify staff created_by list contains existing user id {int}")
    public void verify_staff_created_by_list_contains_existing_user_id(Integer staffId) {
        assertTrue(idcolumnList.contains(staffId));
    }




}
