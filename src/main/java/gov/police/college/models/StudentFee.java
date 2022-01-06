package gov.police.college.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class StudentFee {
    
    private Long feeId;
    private Double feeAmount;
    private LocalDate from;
    private LocalDate to;

    private Student student;
    private AcadmicSession acadmicSession;

    private LocalDateTime createdDt;
    private LocalDateTime updatedDt;
    private PaymentPartner paymentPartner;
    private PaymentStatus paymentStatus;
}
