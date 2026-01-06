package eapli.base.ClassManagement.DTO;

import eapli.base.ClassManagement.domain.Class;
import eapli.base.coursemanagement.domain.Course;
import eapli.base.teacherManagement.domain.Teacher;
import eapli.framework.representations.dto.DTO;
import lombok.Data;

import java.time.LocalTime;
import java.util.Calendar;

@DTO
@Data
public class ClassDTO {
    public Course course;
    public int code;
    public String desc;
    public Teacher teacherLecturing;
    public int duration;
    public Calendar startingDate;
    public Calendar finishingDate;
    public LocalTime startingTime;
    public int dayOfTheWeek;
    public LocalTime endingTime;

    public ClassDTO(Course course, int code, String desc, Teacher teacherLecturing, Calendar startingDate, /*Calendar finishingDate,*/ LocalTime startingTime, int dayOfTheWeek, LocalTime endingTime) {
        this.course = course;
        this.code = code;
        this.desc = desc;
        this.teacherLecturing = teacherLecturing;
        this.startingDate = startingDate;
        //this.finishingDate = finishingDate;
        this.startingTime = startingTime;
        this.dayOfTheWeek = dayOfTheWeek;
        this.endingTime = endingTime;
    }

    public Class toEntity() {
        return new Class( course, desc, teacherLecturing, startingDate,  /*finishingDate,*/ startingTime/*, dayOfTheWeek*/, endingTime);
    }
}