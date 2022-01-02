package gov.police.college.models;

import lombok.Data;

import java.time.LocalDateTime;


@Data
public class Registration {

    private String name;
    private LocalDateTime dob;
    private String course;
    private String academicSession;
    private String address;
    private String mobileNumber;
    private String fatherName;
}
