package gov.police.college.services;

import gov.police.college.models.Registration;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    /**
     * Do login with the data, return false if username or passord is false, else true
     * @return valid login
     */
    public boolean doLogin(String username, String password){
        if(username.equals("vikash") && password.equalsIgnoreCase("password")){
            return true;
        }
        return false;
    }

    /**
     * Perform user registration
     * @param registration
     * @return
     */
    public boolean registration(Registration registration){
        // save this to database
        return true;
    }
}
