package pl.makz.students.domain.mapper;

import org.springframework.stereotype.Component;
import pl.makz.students.domain.dto.StudentDto;
import pl.makz.students.domain.entity.Student;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentListMapper {
    public List<StudentDto> mapToDto(List<Student> students){
        List<StudentDto> studentDtos = new ArrayList<>();

        for(Student student : students){
            StudentDto studentDto = new StudentDto();
            studentDto.setStudentId(student.getStudentId());
            studentDto.setFirstName(student.getFirstName());
            studentDto.setLastName(student.getLastName());
            studentDto.setEmail(student.getEmail());
            studentDto.setIdNumber(student.getIdNumber());
            studentDto.setMajor(student.getMajor());

            studentDtos.add(studentDto);
        }

        return studentDtos;
    }
}
