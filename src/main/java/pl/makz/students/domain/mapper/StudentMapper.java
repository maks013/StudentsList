package pl.makz.students.domain.mapper;

import org.springframework.stereotype.Component;
import pl.makz.students.domain.dto.CreateStudentDto;
import pl.makz.students.domain.dto.UpdateStudentDto;
import pl.makz.students.domain.entity.Student;

@Component
public class StudentMapper {
    public Student mapToEntity(CreateStudentDto createStudentDto) {
        Student student = new Student();

        student.setFirstName(createStudentDto.getFirstName());
        student.setLastName(createStudentDto.getLastName());
        student.setEmail(createStudentDto.getEmail());
        student.setIdNumber(createStudentDto.getIdNumber());
        student.setMajor(createStudentDto.getMajor());

        return student;
    }

    public Student mapToUpdate(Student student, UpdateStudentDto updateStudentDto) {
        student.setFirstName(updateStudentDto.getFirstName().isEmpty() ?
                student.getFirstName() : updateStudentDto.getFirstName());
        student.setLastName(updateStudentDto.getLastName().isEmpty() ?
                student.getLastName() : updateStudentDto.getLastName());
        student.setEmail(updateStudentDto.getEmail().isEmpty() ?
                student.getEmail() : updateStudentDto.getEmail());
        student.setIdNumber(updateStudentDto.getIdNumber() == 0 ?
                student.getIdNumber() : updateStudentDto.getIdNumber());
        student.setMajor(updateStudentDto.getMajor().isEmpty() ?
                student.getMajor() : updateStudentDto.getMajor());

        return student;
    }

}
