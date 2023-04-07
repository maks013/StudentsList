package pl.makz.students.service;

import pl.makz.students.domain.dto.CreateStudentDto;
import pl.makz.students.domain.dto.StudentDto;
import pl.makz.students.domain.dto.UpdateStudentDto;

import java.util.List;

public interface StudentService {
    List<StudentDto> findAll();
    void createStudent(CreateStudentDto createStudentDto);
    void deleteStudent(Long studentId);
    void updateStudent(Long studentId, UpdateStudentDto updateStudentDto);
}
