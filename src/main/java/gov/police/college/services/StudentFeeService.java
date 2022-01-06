package gov.police.college.services;

import java.util.List;

import gov.police.college.models.AcadmicSession;
import gov.police.college.models.StudentFee;

public interface StudentFeeService {
    /**
     * 
     * @param studentFee
     * @return
     */
    StudentFee submitFee(StudentFee studentFee);

    StudentFee feeDetails(Long feeId);

    void updateStudentFee(StudentFee studentFee);

    List<StudentFee> feeDetailsofSession(List<AcadmicSession> session);
}
