package mft.model.DA;

import mft.model.entity.Employer;
import mft.tools.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployerDA implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public EmployerDA() throws SQLException {
        connection = JDBC.getConnection();
    }

    public Employer add(Employer employer) throws SQLException {
        preparedStatement = connection.prepareStatement("select employer_seq.nextval id from duall");
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        employer.setEmployerId(resultSet.getInt("id"));

        preparedStatement = connection.prepareStatement("INSERT into Employer" +
                "(employerId, employerName, employerLastName, userEmployer) VALUES (?,?,?,?)");
        preparedStatement.setInt(1, employer.getEmployerId());
        preparedStatement.setString(2, employer.getEmployerName());
        preparedStatement.setString(3, employer.getEmployerLastName());
        preparedStatement.setString(4, employer.getUserEmployer());
        preparedStatement.execute();
        return employer;
    }




    @Override
    public void close() throws Exception {
        connection.close();
        preparedStatement.close();
    }
}
