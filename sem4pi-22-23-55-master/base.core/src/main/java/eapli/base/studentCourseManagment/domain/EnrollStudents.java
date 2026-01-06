package eapli.base.studentCourseManagment.domain;

import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.coursemanagement.domain.Course;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.studentCourseManagment.repository.StudentCourseRepository;
import eapli.base.studentManagement.application.RegisterStudentController;
import eapli.base.studentManagement.domain.Student;
import eapli.base.studentCourseManagment.repositories.StudentRepository;
import eapli.base.teacherManagement.domain.TaxNumber;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.domain.model.*;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class EnrollStudents {

    private final TransactionalContext txCtx = PersistenceContext.repositories().newTransactionalContext();
    private final StudentCourseRepository studentCourseRepository = PersistenceContext.repositories().studentCourses(txCtx);
    private final StudentRepository studentRepository = PersistenceContext.repositories().studentUsers(txCtx);
    private final RegisterStudentController signupStudentController = new RegisterStudentController();
    private final ReadCSV readCSV = new ReadCSV();


    public void addListToDatabase(File file, Course course) throws IOException, ParseException {

        Iterable<Student> studentIter = studentRepository.findAll();
        ArrayList<Student> studentList = new ArrayList<>();
        ArrayList<String> studentMecanographicNumberList = new ArrayList<>();

        Iterable<StudentCourse> studentCourseIter = studentCourseRepository.findAll();
        ArrayList<String> studentCourseListString = new ArrayList<>();
        ArrayList<String> studentListCSV = readCSV.newStudentFromCSV(file);

        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");

        for (Student s : studentIter) {
            studentList.add(s);
        }

        for (Student s : studentList) {
            studentMecanographicNumberList.add(String.valueOf(s.mecanographicNumber()));
        }

        for (StudentCourse sc : studentCourseIter) {
            studentCourseListString.add(String.valueOf(sc.getStudent().mecanographicNumber()));
        }

        for (String studentCSV : studentListCSV) {

            String[] info = studentCSV.split(",");
            String mecanographicNumber = info[0];
            String createdOn = info[1];
            String birthDate = info[2];
            String email = info[3];
            String fullName = info[4];
            String password = info[5];
            String taxPayerNumber = info[7];

            Calendar createdOn1 = Calendar.getInstance();
            createdOn1.setTime(sdf.parse(createdOn));

            Date birthDate1 = new Date(birthDate);
            MecanographicNumber mn = new MecanographicNumber(mecanographicNumber);
            TaxNumber tn = new TaxNumber(taxPayerNumber);
            String[] nameSplit = fullName.split(" ");

            SystemUser systemUser = new SystemUserBuilder(new NilPasswordPolicy(), new PlainTextEncoder()).withEmail(email).withPassword(password).withName(nameSplit[0],nameSplit[1]).build();



            if (!studentMecanographicNumberList.contains(mecanographicNumber)) {
                studentList.add(signupStudentController.signUpAllStudents(systemUser, mecanographicNumber, birthDate1, taxPayerNumber));
            }

            if(!studentCourseListString.contains(mecanographicNumber)){
                Student student = findStudent(mecanographicNumber);
                StudentCourse studentCourse = new StudentCourse(student, course);

                txCtx.beginTransaction();
                studentCourseRepository.save(studentCourse);
                txCtx.commit();
            }
        }
    }

    public Student findStudent(String mecanographicNumber){
        Iterable<Student> studentIter = studentRepository.findAll();
        ArrayList<Student> studentList = new ArrayList<>();
        Student student = null;

        for (Student s : studentIter) {
            studentList.add(s);
        }

        for (Student s : studentList) {
            if(String.valueOf(s.mecanographicNumber()).equals(mecanographicNumber)){
                student = s;
            }
        }

        return student;
    }
}
