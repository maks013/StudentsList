package pl.makz.students.domain.mapper;

import org.springframework.stereotype.Component;
import pl.makz.students.domain.dto.CreateStudentDto;
import pl.makz.students.domain.entity.Student;

@Component
public class StudentMapper {
    public Student mapToEntity(CreateStudentDto createStudentDto){
        Student student = new Student();

        student.setFirstName(createStudentDto.getFirstName());
        student.setLastName(createStudentDto.getLastName());
        student.setEmail(createStudentDto.getEmail());
        student.setIdNumber(createStudentDto.getIdNumber());
        student.setMajor(createStudentDto.getMajor());

        return student;
    }
}
