package stepdefinitions.database;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.JdbcUtils;

import java.sql.*;
import java.util.List;

public class US_011_TC_001_DB {

    Statement statement;
    Connection connection;
    List<Object> columnList;

    @Given("user\\(doctor) connects to the database")
    public void user_doctor_connects_to_the_database() throws ClassNotFoundException, SQLException {

        Connection connection = JdbcUtils.connectToDatabase("157.230.48.97", "medunna_db_v2", "select_user", "Medunna_pass_@6");

    }
    @Given("crate a statement")
    public void crate_a_statement() throws SQLException {

        statement = JdbcUtils.createStatement();

//       ResultSet resultSet1 =  statement.executeQuery("SELECT * FROM public.appointment.physician_id");
//       int numberOfRow = resultSet1.getRow();
//       while (resultSet1.next()){
//           System.out.println(resultSet1.getInt(1)+"..." + g);
//       }





    }


        @Given("user \\(doctor) gets the column {string} from table {string}")
    public void user_doctor_gets_the_column_from_table(String column, String table) {

        String query = "SELECT " + column + " FROM " + table;

        JdbcUtils.executeQuery(query);







//
//        columnList = JdbcUtils.getColumnList("Physician", table);
//        System.out.println("column = " + column);

    }

    @Then("Verify the {string} column contains the expected data {string}")
    public void verify_the_column_contains_the_expected_data(String columnName, String physicianName) {

   //     Assert.assertTrue(columnList.contains(physicianName));




    }


    }
