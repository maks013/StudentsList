package pl.makz.students.domain.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class CreateStudentDto implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private int idNumber;
    private String major;

    @Override
    public String toString() {
        return "CreateStudentDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", idNumber=" + idNumber +
                ", major='" + major + '\'' +
                '}';
    }
}
