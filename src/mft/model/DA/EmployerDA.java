package mft.model.DA;

import mft.model.entity.Employer;
import mft.tools.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    public Employer edit(Employer employer) throws SQLException {
        preparedStatement = connection.prepareStatement(
                "update Employer set employerName=?, employerLastName=?, userEmployer=? where employerId =?");
        preparedStatement.setString(1, employer.getEmployerName());
        preparedStatement.setString(2, employer.getEmployerLastName());
        preparedStatement.setString(3, employer.getUserEmployer());
        preparedStatement.setInt(4, employer.getEmployerId());
        preparedStatement.execute();
        return employer;
    }

    public Employer remove(int id) throws SQLException {
        preparedStatement = connection.prepareStatement(" SELECT * from employer where employerId = ?");
        preparedStatement.setInt(1, id);
        preparedStatement.execute();
        return null;
    }

    public Employer findById(int id) throws SQLException {
        preparedStatement = connection.prepareStatement("select * from Employer where employerId = ?");
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        Employer employer = new Employer(
        resultSet.getInt("employerId"),
        resultSet.getString("employerName"),
        resultSet.getString("employerLastName"),
        resultSet.getString("userEmployer"));
        return employer;
    }

    public List<Employer> findAll() throws SQLException {
        preparedStatement = connection.prepareStatement("select * from Employer order by employerLastName,employerName");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Employer> employerList = new ArrayList<>();
        while (resultSet.next()){

        Employer employer = new Employer(
                resultSet.getInt("employerId"),
                resultSet.getString("employerName"),
                resultSet.getString("employerLastName"),
                resultSet.getString("userEmployer"));
        employerList.add(employer);
        }
        return employerList;
    }

    @Override
    public void close() throws Exception {
        connection.close();
        preparedStatement.close();
    }
}
