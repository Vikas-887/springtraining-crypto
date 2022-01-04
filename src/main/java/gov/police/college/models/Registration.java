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
    public Registration(String name, LocalDateTime dob, String course, String academicSession, String address,
            String mobileNumber, String fatherName) {
        this.name = name;
        this.dob = dob;
        this.course = course;
        this.academicSession = academicSession;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.fatherName = fatherName;
    }
    public String getName() {
        return name;
    }
    public String getFatherName() {
        return fatherName;
    }
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAcademicSession() {
        return academicSession;
    }
    public void setAcademicSession(String academicSession) {
        this.academicSession = academicSession;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public LocalDateTime getDob() {
        return dob;
    }
    public void setDob(LocalDateTime dob) {
        this.dob = dob;
    }
    public void setName(String name) {
        this.name = name;
    }

 

    
}
