package pl.makz.students.domain.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class StudentDto implements Serializable {
    private Long studentId;
    private String firstName;
    private String lastName;
    private String email;
    private int idNumber;
    private String major;
}
