package com.durgasoft.validator;

import com.durgasoft.beans.Employee;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.io.IOException;
import java.util.Properties;

public class EmployeeValidator implements Validator {

    Resource resource;

    public void setResource(Resource resource) {

        this.resource = resource;
    }

    @Override
    public boolean supports(Class<?> clazz) {

        return Employee.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

        try {
            Employee employee = (Employee) target;
            Properties properties = PropertiesLoaderUtils.loadProperties(resource);
            if(employee.getEmployee_Id() == null || employee.getEmployee_Id().equals("")){
                errors.rejectValue("employee_Id" , "error.employee_Id.empty",properties.getProperty("error.employee_Id.empty"));

            }
            if(employee.getEmployee_Name() == null || employee.getEmployee_Name().equals("")){
                errors.rejectValue("employee_Name","error.employee_Name.empty",properties.getProperty("error.employee_Name.empty"));
            }
            if (employee.getEmployee_Age() == 0){
                errors.rejectValue("employee_Age","error.employee_Age.empty",properties.getProperty("error.employee_Age.empty"));
            }
            if(employee.getEmployee_Email() == null || employee.getEmployee_Email().equals("")){
                errors.rejectValue("employee_Email","error.employee_Email.empty",properties.getProperty("error.employee_Email.empty"));
            }
            if(employee.getEmployee_Mobile() == null || employee.getEmployee_Mobile().equals("error.employee_Mobile.empty")){
                errors.rejectValue("employee_Mobile","error.employee_Mobile.empty",properties.getProperty("error.employee_Mobile.empty"));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
