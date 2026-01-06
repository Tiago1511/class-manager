package eapli.base.ClassManagement.domain;

import eapli.base.ClassManagement.DTO.ClassDTO;
import eapli.base.coursemanagement.domain.Course;
import eapli.base.teacherManagement.domain.Teacher;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.representations.dto.DTOable;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "CLASS")
public class Class implements AggregateRoot<Integer>, DTOable<ClassDTO> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int code;

    @Column
    private String description;

    @OneToOne
    private Course course;

    @Column
    private int dayOfWeek;

    @Column
    //@Temporal(TemporalType.TIME)
    private LocalTime startingTime;

    @Column
    //@Temporal(TemporalType.TIME)
    private LocalTime endingTime;

    /**
     * teacher lecturing the class
     */
    @OneToOne
    @JoinColumn(name = "teacher", referencedColumnName = "acronym")
    private Teacher teacherLecturing;


    @Column
    @Temporal(TemporalType.DATE)
    private Calendar startingDate;



    protected Class() {
    }

    public Class(Course course, String description, Teacher teacherLecturing, Calendar startingDate, /*Calendar finishingDate,*/ LocalTime startingTime/*, Integer dayOfWeek*/, LocalTime endingTime) {
        this.code = code;
        this.description = description;
        this.teacherLecturing = teacherLecturing;
        //this.finishingDate = finishingDate;
        this.course = course;
        this.startingDate = startingDate;
        this.startingTime = startingTime;
        this.endingTime = endingTime;
        //this.dayOfWeek = dayOfWeek;
    }


    @Override
    public boolean sameAs(Object other) {
        if (!(other instanceof eapli.base.ClassManagement.domain.Class)) {
            return false;
        }

        if (this == other) {
            return true;
        }

        final eapli.base.ClassManagement.domain.Class that = (eapli.base.ClassManagement.domain.Class) other;

        return identity().equals(that.identity()) && teacherLecturing.equals(that.teacherLecturing) && description.equals(that.description) &&  startingDate.equals(that.startingDate) /*&& finishingDate.equals(that.finishingDate)*/ && course.equals(that.course) && endingTime.equals(that.endingTime);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Class aClass = (Class) o;
        return course == aClass.course && code == aClass.code &&  Objects.equals(description, aClass.description) && Objects.equals(teacherLecturing, aClass.teacherLecturing) && Objects.equals(startingDate, aClass.startingDate) /*&& Objects.equals(finishingDate, aClass.finishingDate)*/&& Objects.equals(endingTime, aClass.endingTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, description, teacherLecturing, startingDate/*,finishingDate*/, startingTime, endingTime);
    }

    @Override
    public Integer identity() {
        return this.code;
    }


    /*como mudar data?
    public void changeDataTo(Calendar status) {
        if (data == null) {
            throw new IllegalArgumentException("");
        }
        this.data = data;
    }
    */

    public Calendar startingDate(){
        return this.startingDate;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public Course getCourse() {
        return course;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void setStartingTime(LocalTime startingTime) {
        this.startingTime = startingTime;
    }

    public void setEndingTime(LocalTime endingTime) {
        this.endingTime = endingTime;
    }

    public void setTeacherLecturing(Teacher teacherLecturing) {
        this.teacherLecturing = teacherLecturing;
    }


    public void setStartingDate(Calendar startingDate) {
        this.startingDate = startingDate;
    }

    public Teacher getTeacherLecturing() {
        return teacherLecturing;
    }

    public Calendar getStartingDate() {
        return startingDate;
    }

    public LocalTime getStartingTime(){
        return this.startingTime;
    }

    public LocalTime getEndingTime(){
        return this.endingTime;
    }

    public ClassDTO toDTO() {
        return new ClassDTO(course, code, description, teacherLecturing, startingDate/*, finishingDate*/, startingTime, dayOfWeek, endingTime);
    }

}


