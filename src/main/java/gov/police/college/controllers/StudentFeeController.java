package gov.police.college.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import gov.police.college.models.StudentFee;
import gov.police.college.services.StudentFeeService;

@Controller
public class StudentFeeController {

    @Autowired
    StudentFeeService studentFeeServiceImpl;
    @GetMapping("Hello")
    @ResponseBody
    public String hello() {
       return "Hello Hello Spring!";
    }
 

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
