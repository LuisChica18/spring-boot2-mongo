package com.example.springboot2mongo.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

public class StudentExistingDto {

    @NotNull(message = "id cannot be empty")
    private String id;
    @NotNull(message = "firstName cannot be empty")
    @Size(min = 2, max = 30,
            message = "firstName must be atleast of 2 letters and not more then 100 letters")
    private String firstName;
    @NotNull(message = "lastName cannot be empty")
    @Size(min = 2, max = 30,
            message = "lastName must be atleast of 2 letters and not more then 100 letters")
    private String lastName;
    @NotEmpty(message = "email cannot be empty")
    @Email
    private String email;
    private String contactNumber;
    private String courseName;
    private LocalDateTime created;
    private LocalDateTime modified;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }

}