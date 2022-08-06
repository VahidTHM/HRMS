package mft.model.entity;

public class Employer {
    private int employerId;
    private String employerName;
    private String employerLastName;
    private User userEmployer;

    public Employer(int employerId, String employerName, String employerLastName, User userEmployer) {
        this.employerId = employerId;
        this.employerName = employerName;
        this.employerLastName = employerLastName;
        this.userEmployer = userEmployer;
    }

    public Employer(String employerName, String employerLastName, User userEmployer) {
        this.employerName = employerName;
        this.employerLastName = employerLastName;
        this.userEmployer = userEmployer;
    }

    public Employer() {
    }

    public int getEmployerId() {
        return employerId;
    }

    public Employer setEmployerId(int employerId) {
        this.employerId = employerId;
        return this;
    }

    public String getEmployerName() {
        return employerName;
    }

    public Employer setEmployerName(String employerName) {
        this.employerName = employerName;
        return this;
    }

    public String getEmployerLastName() {
        return employerLastName;
    }

    public Employer setEmployerLastName(String employerLastName) {
        this.employerLastName = employerLastName;
        return this;
    }

    public User getUserEmployer() {
        return userEmployer;
    }

    public Employer setUserEmployer(User userEmployer) {
        this.userEmployer = userEmployer;
        return this;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "employerId=" + employerId +
                ", employerName='" + employerName + '\'' +
                ", employerLastName='" + employerLastName + '\'' +
                ", userEmployer=" + userEmployer +
                '}';
    }
}

