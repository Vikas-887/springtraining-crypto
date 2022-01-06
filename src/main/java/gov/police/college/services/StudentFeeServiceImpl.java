package gov.police.college.services;

import java.util.List;

import org.springframework.stereotype.Service;

import gov.police.college.models.AcadmicSession;
import gov.police.college.models.StudentFee;

@Service
public class StudentFeeServiceImpl implements StudentFeeService{

    @Override
    public StudentFee submitFee(StudentFee studentFee) {
        // TODO Auto-generated method stub
        // validate studentFee object and save it to the database, and return saved data
        return null;
    }

    @Override
    public StudentFee feeDetails(Long feeId) {
        // TODO Auto-generated method stub
        // check database if feeId is present or not, if present return StudentFee, or else raise exception
        return null;
    }

    @Override
    public void updateStudentFee(StudentFee studentFee) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<StudentFee> feeDetailsofSession(List<AcadmicSession> session) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
