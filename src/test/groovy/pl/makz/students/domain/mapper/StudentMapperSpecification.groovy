package pl.makz.students.domain.mapper

import pl.makz.students.domain.dto.CreateStudentDto
import pl.makz.students.domain.dto.UpdateStudentDto
import pl.makz.students.domain.entity.Student
import spock.lang.Specification

class StudentMapperSpecification extends Specification {

    def "should map CreateStudentDto to Student"() {
        given:
        def mapper = new StudentMapper()
        def createStudentDto = new CreateStudentDto(
                firstName: "jan",
                lastName: "nowak",
                email: "jan.nowak@przyklad.pl",
                idNumber: 123456,
                major: "informatyka"
        )

        when:
        def result = mapper.mapToEntity(createStudentDto)

        then:
        result.firstName == "jan"
        result.lastName == "nowak"
        result.email == "jan.nowak@przyklad.pl"
        result.idNumber == 123456
        result.major == "informatyka"
    }

    def "should map UpdateStudentDto to Student"() {
        given:
        def mapper = new StudentMapper()
        def student = new Student(
                firstName: "marek",
                lastName: "nowak",
                email: "jan.nowak@przyklad.pl",
                idNumber: 123456,
                major: "informatyka"
        )
        def updateStudentDto = new UpdateStudentDto(
                studentId: 1,
                firstName: "jan",
                lastName: "",
                email: "",
                idNumber: 0,
                major: "informatyka stosowana"
        )

        when:
        mapper.mapToUpdate(student, updateStudentDto)

        then:
        student.firstName == "jan"
        student.lastName == "nowak"
        student.email == "jan.nowak@przyklad.pl"
        student.idNumber == 123456
        student.major == "informatyka stosowana"
    }
}
