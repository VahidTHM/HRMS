package mft.model.BL;

import mft.model.DA.EmployerDA;
import mft.model.entity.Employer;

import java.util.List;

public class EmployerBL {
    public static Employer add(Employer employer) throws Exception {
        try (EmployerDA employerDA = new EmployerDA()){
            return employerDA.add(employer);
        }
    }

    public static Employer edit(Employer employer) throws Exception {
        try (EmployerDA employerDA = new EmployerDA()){
            return employerDA.edit(employer);
        }
    }

    public static Employer remove(int id) throws Exception {
        try (EmployerDA employerDA = new EmployerDA()){
            return employerDA.remove(id);
        }
    }

    public static Employer findById(int id) throws Exception {
        try (EmployerDA employerDA = new EmployerDA()){
            return employerDA.findById(id);
        }
    }

    public static List<Employer> findAll(Employer employer) throws Exception {
        try (EmployerDA employerDA = new EmployerDA()){
            return employerDA.findAll();
        }
    }
}
