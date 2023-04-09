package pl.makz.students.domain.mapper

import pl.makz.students.domain.entity.Student
import spock.lang.Specification
import spock.lang.Subject

class StudentListMapperSpecification extends Specification {
    @Subject
    StudentListMapper studentListMapper = new StudentListMapper()

    def "should map list of students to list of student dto's"() {
        given:
        def students = new ArrayList<Student>()
        students.add(new Student(studentId: 1L, firstName: "jan", lastName: "nowak",
                email: "jan.nowak@przyklad.pl", idNumber: 123456, major: "informatyka"))
        students.add(new Student(studentId: 2L, firstName: "anna", lastName: "nowak",
                email: "anna.nowak@przyklad.pl", idNumber: 654321, major: "matematyka"))

        when:
        def studentDtos = studentListMapper.mapToDto(students)

        then:
        studentDtos.size() == 2
        studentDtos[0].studentId == 1L
        studentDtos[0].firstName == "jan"
        studentDtos[0].lastName == "nowak"
        studentDtos[0].email == "jan.nowak@przyklad.pl"
        studentDtos[0].idNumber == 123456
        studentDtos[0].major == "informatyka"
        studentDtos[1].studentId == 2L
        studentDtos[1].firstName == "anna"
        studentDtos[1].lastName == "nowak"
        studentDtos[1].email == "anna.nowak@przyklad.pl"
        studentDtos[1].idNumber == 654321
        studentDtos[1].major == "matematyka"
    }

    def "should return empty list when mapping empty list of students"() {
        given:
        def students = new ArrayList<Student>()

        when:
        def studentDtos = studentListMapper.mapToDto(students)

        then:
        studentDtos.isEmpty()
    }
}
