package gov.police.college.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import gov.police.college.models.StudentFee;
import gov.police.college.services.StudentFeeService;

@Controller
public class StudentFeeController {

    @Autowired
    StudentFeeService studentFeeServiceImpl;
    public String payStudentFee(StudentFee studentFee){
        studentFeeServiceImpl.submitFee(studentFee);
        return "";
    }

    public String getFeeDetails(Long feeId){
        studentFeeServiceImpl.feeDetails(feeId);
        return "";
    }

    public String updateStudentFee(StudentFee studentFee){
        studentFeeServiceImpl.updateStudentFee(studentFee);
        return "";
    }
    
}
