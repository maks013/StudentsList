package pl.makz.students.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.makz.students.domain.dto.CreateStudentDto;
import pl.makz.students.domain.dto.StudentDto;
import pl.makz.students.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @CrossOrigin
    @GetMapping()
    public ResponseEntity<List<StudentDto>> getStudents() {
        List<StudentDto> studentDtos = studentService.findAll();
        return new ResponseEntity<>(studentDtos, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping("/add")
    public ResponseEntity<?> createStudent(@RequestBody CreateStudentDto createStudentDto) {
        studentService.createStudent(createStudentDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
