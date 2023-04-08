package pl.makz.students.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.makz.students.domain.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>, CrudRepository<Student, Long> {

    @Modifying
    @Query("DELETE FROM Student s WHERE  s.studentId = :studentId")
    void deleteById(@Param("studentId") Long studentId);

    @Query(value = "SELECT s FROM Student s WHERE s.studentId =  :studentId")
    Student findOneByStudentId(@Param("studentId") Long studentId);

}
