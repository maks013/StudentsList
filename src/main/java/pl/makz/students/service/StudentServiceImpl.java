package pl.makz.students.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.makz.students.domain.dto.CreateStudentDto;
import pl.makz.students.domain.dto.StudentDto;
import pl.makz.students.domain.dto.UpdateStudentDto;
import pl.makz.students.domain.entity.Student;
import pl.makz.students.domain.mapper.StudentListMapper;
import pl.makz.students.domain.mapper.StudentMapper;
import pl.makz.students.domain.repository.StudentRepository;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    private final StudentRepository studentRepository;
    private final StudentListMapper studentListMapper;
    private final StudentMapper studentMapper;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository, StudentListMapper studentListMapper, StudentMapper studentMapper) {
        this.studentRepository = studentRepository;
        this.studentListMapper = studentListMapper;
        this.studentMapper = studentMapper;
    }

    @Override
    public List<StudentDto> findAll() {
        List<Student> students = studentRepository.findAll();
        return studentListMapper.mapToDto(students);
    }

    @Override
    public void createStudent(CreateStudentDto createStudentDto) {
        Student student = studentMapper.mapToEntity(createStudentDto);
        studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long studentId) {

    }

    @Override
    public void updateStudent(Long studentId, UpdateStudentDto updateStudentDto) {

    }
}
